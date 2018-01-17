package develop.odata.etl.model.ticketgo.type;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreTypeData implements TicketGoData {
	/*** 商店代號 ***/
	@JacksonXmlProperty(localName = "StoreNo")
	private Integer storeNo;
	/*** 商店名稱 ***/
	@JacksonXmlProperty(localName = "StoreName")
	private String storeName;
	/*** 商店電話 ***/
	@JacksonXmlProperty(localName = "StoreTel")
	private String storeTel;
	/*** 商店地址 ***/
	@JacksonXmlProperty(localName = "StoreAddress")
	private String storeAddress;
	/*** 商店經度 ***/
	@JacksonXmlProperty(localName = "StoreLongitude")
	private Double storeLongitude;
	/*** 商店緯度 ***/
	@JacksonXmlProperty(localName = "StoreLatitude")
	private Double storeLatitude;
	/*** 商店簡介 ***/
	@JacksonXmlProperty(localName = "Integerroduction")
	private String introduction;
	/*** (Ibon) 商店營業時間 ***/
	@JacksonXmlProperty(localName = "BusinessHours")
	private String businessHours;
	/*** (Ibon) 其他說明 ***/
	@JacksonXmlProperty(localName = "OtherHelp")
	private String otherHelp;
	/*** (Ibon) Y 或 N(是否為主打商品) ***/
	@JacksonXmlProperty(localName = "MainIssue")
	private String mainIssue;
	/*** 大分類代號 ***/
	@JacksonXmlProperty(localName = "MTypeNo")
	private Integer mainTypeNo;
	/*** 大分類名稱 ***/
	@JacksonXmlProperty(localName = "MTypeName")
	private String mainTypeName;
	/*** 小分區代號 ***/
	@JacksonXmlProperty(localName = "STypeNo")
	private Integer smallTypeNo;
	/*** 小分區代號 ***/
	@JacksonXmlProperty(localName = "STypeName")
	private String smallTypeName;
	/*** 大分區代號 ***/
	@JacksonXmlProperty(localName = "MLocNo")
	private Integer mainLocNo;
	/*** 大分區名稱 ***/
	@JacksonXmlProperty(localName = "MLocName")
	private String mainLocName;
	/*** 小分區代號 ***/
	@JacksonXmlProperty(localName = "SLocNo")
	private Integer smallLocNo;
	/*** 小分區名稱 ***/
	@JacksonXmlProperty(localName = "SLocName")
	private String smallLocName;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicUrl_1")
	private String picUrl1;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicUrl_2")
	private String picUrl2;
	/*** 圖片網址(小圖) ***/
	@JacksonXmlProperty(localName = "PicUrl_S")
	private String picUrlS;
	public Integer getStoreNo() {
		return storeNo;
	}
	public void setStoreNo(Integer storeNo) {
		this.storeNo = storeNo;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public Double getStoreLongitude() {
		return storeLongitude;
	}
	public void setStoreLongitude(Double storeLongitude) {
		this.storeLongitude = storeLongitude;
	}
	public Double getStoreLatitude() {
		return storeLatitude;
	}
	public void setStoreLatitude(Double storeLatitude) {
		this.storeLatitude = storeLatitude;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getOtherHelp() {
		return otherHelp;
	}
	public void setOtherHelp(String otherHelp) {
		this.otherHelp = otherHelp;
	}
	public String getMainIssue() {
		return mainIssue;
	}
	public void setMainIssue(String mainIssue) {
		this.mainIssue = mainIssue;
	}
	public Integer getMainTypeNo() {
		return mainTypeNo;
	}
	public void setMainTypeNo(Integer mainTypeNo) {
		this.mainTypeNo = mainTypeNo;
	}
	public String getMainTypeName() {
		return mainTypeName;
	}
	public void setMainTypeName(String mainTypeName) {
		this.mainTypeName = mainTypeName;
	}
	public Integer getSmallTypeNo() {
		return smallTypeNo;
	}
	public void setSmallTypeNo(Integer smallTypeNo) {
		this.smallTypeNo = smallTypeNo;
	}
	public String getSmallTypeName() {
		return smallTypeName;
	}
	public void setSmallTypeName(String smallTypeName) {
		this.smallTypeName = smallTypeName;
	}
	public Integer getMainLocNo() {
		return mainLocNo;
	}
	public void setMainLocNo(Integer mainLocNo) {
		this.mainLocNo = mainLocNo;
	}
	public String getMainLocName() {
		return mainLocName;
	}
	public void setMainLocName(String mainLocName) {
		this.mainLocName = mainLocName;
	}
	public Integer getSmallLocNo() {
		return smallLocNo;
	}
	public void setSmallLocNo(Integer smallLocNo) {
		this.smallLocNo = smallLocNo;
	}
	public String getSmallLocName() {
		return smallLocName;
	}
	public void setSmallLocName(String smallLocName) {
		this.smallLocName = smallLocName;
	}
	public String getPicUrl1() {
		return picUrl1;
	}
	public void setPicUrl1(String picUrl1) {
		this.picUrl1 = picUrl1;
	}
	public String getPicUrl2() {
		return picUrl2;
	}
	public void setPicUrl2(String picUrl2) {
		this.picUrl2 = picUrl2;
	}
	public String getPicUrlS() {
		return picUrlS;
	}
	public void setPicUrlS(String picUrlS) {
		this.picUrlS = picUrlS;
	}

}
