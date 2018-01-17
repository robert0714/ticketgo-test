package develop.api.endpoint;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.Permission;
import java.security.PermissionCollection;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {
	private static final String mEngine = "AES";
	private static final String mCrypto5 = "AES/CBC/PKCS5Padding";
	private static final String mCryptoN = "AES/CBC/NoPadding";
	private String mKey;
	private String mIv;

	public AES(String key, String iv) {
		mKey = key;
		mIv = iv;
	}

	public byte[] encrypt(String content) {
		try {
			SecretKeySpec sks = new SecretKeySpec(mKey.getBytes(Charset.forName("UTF-8")), "AES");
			IvParameterSpec ivs = new IvParameterSpec(mIv.getBytes(Charset.forName("UTF-8")));
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			removeCryptographyRestrictions();
			cipher.init(1, sks, ivs);
			byte[] byteContent = content.getBytes("UTF-8");
			return cipher.doFinal(byteContent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String decrypt(byte[] cryptograph) {
		try {
			SecretKeySpec sks = new SecretKeySpec(mKey.getBytes(Charset.forName("UTF-8")), "AES");
			IvParameterSpec ivs = new IvParameterSpec(mIv.getBytes(Charset.forName("UTF-8")));
			Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");

			cipher.init(2, sks, ivs);
			byte[] content = removePadding(cipher.doFinal(cryptograph));

			return new String(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public  String parseByte2HexStr(byte[] buf) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buf.length; i++) {
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}

	public  byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[(i / 2)] = ((byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16)));
		}
		return data;
	}

	public byte[] removePadding(byte[] paddedInput) {
		int numPadBytes = paddedInput[(paddedInput.length - 1)];
		int originalSize = paddedInput.length - numPadBytes;
		byte[] original = new byte[originalSize];
		System.arraycopy(paddedInput, 0, original, 0, originalSize);
		return original;
	}

	private  void removeCryptographyRestrictions() {
		if (!isRestrictedCryptography()) {
			return;
		}

		try {
			Class<?> jceSecurity = Class.forName("javax.crypto.JceSecurity");
			Class<?> cryptoPermissions = Class.forName("javax.crypto.CryptoPermissions");
			Class<?> cryptoAllPermission = Class.forName("javax.crypto.CryptoAllPermission");

			Field isRestrictedField = jceSecurity.getDeclaredField("isRestricted");
			isRestrictedField.setAccessible(true);
			Field modifiersField = Field.class.getDeclaredField("modifiers");
			modifiersField.setAccessible(true);
			modifiersField.setInt(isRestrictedField, isRestrictedField.getModifiers() & 0xFFFFFFEF);
			isRestrictedField.set(null, Boolean.valueOf(false));

			Field defaultPolicyField = jceSecurity.getDeclaredField("defaultPolicy");
			defaultPolicyField.setAccessible(true);
			PermissionCollection defaultPolicy = (PermissionCollection) defaultPolicyField.get(null);

			Field perms = cryptoPermissions.getDeclaredField("perms");
			perms.setAccessible(true);
			((Map) perms.get(defaultPolicy)).clear();

			Field instance = cryptoAllPermission.getDeclaredField("INSTANCE");
			instance.setAccessible(true);
			defaultPolicy.add((Permission) instance.get(null));
		} catch (Exception localException) {
		}
	}

	private static boolean isRestrictedCryptography() {
		return "Java(TM) SE Runtime Environment".equals(System.getProperty("java.runtime.name"));
	}
}
