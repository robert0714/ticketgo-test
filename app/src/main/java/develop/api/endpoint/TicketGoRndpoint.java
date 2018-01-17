package develop.api.endpoint;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper; 

import develop.api.RestBaseEndpoint;
import develop.odata.etl.model.ticketgo.type.TicketTypeData;
import develop.service.sale.model.Point; 

/**
 * 配合大賀票卷開發的API
 */
@RestController
@RequestMapping(value = "/ticketGo")
public class TicketGoRndpoint extends RestBaseEndpoint {
	private final String hashKey ="H7tIy0CTqJVGE6eBULLdCz0iK5BMQfEJ";
	private final String hashIV = "ZQzsQzq7iiqA3Hmv" ;
	/** The log. */
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	  /** The jackson mapper. */
    private    ObjectMapper mapper  =new ObjectMapper();

	@RequestMapping(method = RequestMethod.GET, value = "/order")
	@ResponseStatus(HttpStatus.OK)
	public void ordersin(
			@RequestParam(name = "ProductsID",required=true) String productId, 
			@RequestParam(name = "Qtys",required=true) String qtys, 
			@RequestParam(name = "MORDER_ID",required=true)String morderId,
			@RequestParam(name = "RID",required=true)String rid,
			@RequestParam(name = "TORDER_ID",required=true)String torderId)  {
		log.info("ProductsID: {}",productId);
		log.info("Qtys: {}",qtys);
		log.info("MORDER_ID: {}",morderId);
		log.info("RID: {}",rid);
		log.info("TORDER_ID: {}",torderId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/cancelOrder")
	@ResponseStatus(HttpStatus.OK)
	public void cancelOrder(@RequestParam(name = "ProductsID",required=true) String productId, 
			@RequestParam(name = "Qtys",required=true) String qtys, 
			@RequestParam(name = "MORDER_ID",required=true)String morderId,
			@RequestParam(name = "RID",required=true)String rid,
			@RequestParam(name = "TORDER_ID",required=true)String torderId) {
		log.info("ProductsID: {}",productId);
		log.info("Qtys: {}",qtys);
		log.info("MORDER_ID: {}",morderId);
		log.info("RID: {}",rid);
		log.info("TORDER_ID: {}",torderId);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/listProducts")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<TicketGoProductResponse> listAll( )   {
		 
		Integer userId = 1;

		String result = "[{\"ticketNo\":4028,\"ticketName\":\"大賀票券TEST\",\"storeNo\":108,\"storeName\":\"大賀業務\",\"storeTel\":\"(02)6608-9875\",\"storeAddress\":\"台北市中山區中山北路二段115巷47號2樓\",\"storeLongitude\":121.525038,\"storeLatitude\":25.0609169,\"publisherName\":\"大賀行銷(股)公司\",\"publisherCEO\":\"林志達\",\"publisherUniformNo\":28822837,\"mainTypeNo\":1,\"mainTypeName\":\"住宿券\",\"smallTypeNo\":3,\"smallTypeName\":\"平日雙人房住宿券\",\"mainLocNo\":173,\"mainLocName\":\"北部\",\"smallLocNo\":254,\"smallLocName\":\"台北市\",\"originalPrice\":1,\"limitDate\":\"至2019-03-17止，逾期須補差價使用\",\"content\":\"此為TEST專用 \",\"qty\":\"不限\",\"price\":1,\"cost\":1.0,\"priceID\":0,\"minimumQty\":1,\"priceName\":\"一般價\",\"startDate\":\"2016-06-01\",\"endDate\":\"2099-12-31\",\"virtualTicket\":\"N\",\"virtualTicketOnly\":\"N\",\"dataTotalCount\":2,\"isEntityProduct\":\"N\"},{\"ticketNo\":4264,\"ticketName\":\"大賀溫泉電子票券TEST\",\"storeNo\":839,\"storeName\":\"大賀店家測試用\",\"storeTel\":\"0266089876\",\"storeAddress\":\"台北市內湖區內湖路一段136號2樓\",\"storeLongitude\":121.5640074,\"storeLatitude\":25.0827591,\"publisherName\":\"大賀行銷(股)公司\",\"publisherCEO\":\"林志達\",\"publisherUniformNo\":28822837,\"mainTypeNo\":1,\"mainTypeName\":\"住宿券\",\"smallTypeNo\":3,\"smallTypeName\":\"平日雙人房住宿券\",\"mainLocNo\":173,\"mainLocName\":\"北部\",\"smallLocNo\":254,\"smallLocName\":\"台北市\",\"originalPrice\":1,\"limitDate\":\"至2019-03-17止，逾期須補差價使用\",\"content\":\"此為TEST專用 \",\"qty\":\"不限\",\"price\":1,\"cost\":1.0,\"priceID\":0,\"minimumQty\":1,\"priceName\":\"一般價\",\"startDate\":\"2017-02-10\",\"endDate\":\"2020-12-30\",\"virtualTicket\":\"Y\",\"virtualTicketOnly\":\"Y\",\"dataTotalCount\":2,\"isEntityProduct\":\"N\"}]";
		TicketTypeData[] data = null;
		try {
			data = mapper.readValue(result, TicketTypeData[].class);
		} catch (IOException e) {
			log.error(e.getMessage(),e);;
			
		}
		List<TicketGoProductResponse> list = new ArrayList<>();
		if (ArrayUtils.isNotEmpty(data)) {
			for (TicketTypeData unit : data) {
				TicketGoProductResponse tmp = convert(unit, userId);
				list.add(tmp);
			}
		}
		return list;
	}
	
	private TicketGoProductResponse convert(TicketTypeData src,Integer userId) {
		String encrypted = encryptByAES(userId.toString() );
		String template ="https://umaji.ticketgo.com.tw/index.php?RID=MaaSUmaji&Click_ID=%s";
		String url = String.format(template, encrypted);
		final TicketGoProductResponse result =new TicketGoProductResponse(); 
		result.setStoreTel(src.getStoreTel());
		Point point =new Point();
		point.setLat(new BigDecimal(src.getStoreLatitude()));
		point.setLon(new BigDecimal(src.getStoreLongitude()));		
		result.setPoint(point);
		result.setStoreName(src.getStoreName());
		result.setStoreAddress(src.getStoreAddress());
		result.setStoreNo(src.getStoreNo());
		result.setmLocName(src.getMainLocName());
		result.setmLocNo(String.valueOf(src.getMainLocNo()));
		result.setUrl(url);
		return result ; 
	}
	protected String encryptByAES(String content ) { 
		AES crypto = new AES(hashKey, hashIV);
		byte[] encryptResult = crypto.encrypt(content);
		return  crypto.parseByte2HexStr(encryptResult);
	}
	protected String decryptByAES(String content) { 
		AES crypto = new AES(hashKey, hashIV); 
		return  crypto.decrypt(crypto.hexStringToByteArray(content));
	}
}
