package develop.odata.etl.convertor;
  
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import develop.odata.etl.model.ticketgo.ActiveList;
import develop.odata.etl.model.ticketgo.ActiveSetList;
import develop.odata.etl.model.ticketgo.AddTicketList; 
import develop.odata.etl.model.ticketgo.LocList;
import develop.odata.etl.model.ticketgo.StoreInfo;
import develop.odata.etl.model.ticketgo.StoreList;
import develop.odata.etl.model.ticketgo.TicketGoPostData;
import develop.odata.etl.model.ticketgo.TicketInfo;
import develop.odata.etl.model.ticketgo.TicketList;
import develop.odata.etl.model.ticketgo.TypeList;
import develop.odata.etl.model.ticketgo.response.ActiveResponse;
import develop.odata.etl.model.ticketgo.response.ActiveSetResponse;
import develop.odata.etl.model.ticketgo.response.StoreResponse;
import develop.odata.etl.model.ticketgo.response.TicketGoResponse;
import develop.odata.etl.model.ticketgo.response.TicketInfoResponse;
import develop.odata.etl.model.ticketgo.response.TicketResponse;
import develop.odata.etl.model.ticketgo.response.TypeResponse;
import develop.odata.etl.model.ticketgo.type.TicketGoData;

/***
 * /etc/hosts 新增以下DNS對應 (Mac : /private/etc/hosts)
 * 52.193.99.98  tms.ticketgo.com.tw
 ****/
public class TicketGoConvertorTest {
	 
	
	/** The rest template. */
	private RestTemplate restTemplate ;
    
    /** The xml mapper. */
    private    XmlMapper xmlMapper ;
    /** The jackson mapper. */
    private    ObjectMapper mapper ;
	
	/** The resource url. */
    private     String resourceUrl ="https://tms.ticketgo.com.tw/TKA/login/DHMC_DHMC/api.php";
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception { 
		restTemplate = new RestTemplate();
		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);		
		this.xmlMapper = new XmlMapper(module);
		this.xmlMapper.configure( ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true );
		mapper = new ObjectMapper();
		//切換到正式區
		resourceUrl ="http://tms.ticketgo.com.tw/TKA/login/DHMC_Maas/api.php";
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	 
	/**
	 * Builds the entity.Request組成核心邏輯
	 *
	 * @param objectForXml the object for xml
	 * @return the http entity
	 * @throws JsonProcessingException the json processing exception
	 */
	protected HttpEntity<MultiValueMap<String, String>> buildEntity(Object objectForXml) throws JsonProcessingException{
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);		
		final MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>(); 
		final String xmlData =xmlMapper.writeValueAsString(objectForXml);
		map.add("XMLData", xmlData);
		final HttpEntity<MultiValueMap<String, String>> result = 
				new HttpEntity<MultiValueMap<String, String>>(map, headers);
		return result;
	}
	
	/**
	 * Common get data.取回資料得核心邏輯
	 *
	 * @param sample the sample
	 * @return the ticket go response<? extends ticket go data>
	 * @throws JsonProcessingException the json processing exception
	 */
	protected TicketGoResponse<? extends TicketGoData> commonGetData(TicketGoPostData  sample) throws JsonProcessingException {
		final HttpEntity<MultiValueMap<String, String>> request = buildEntity(sample);

		final Class<? extends TicketGoResponse<? extends TicketGoData>> clazz = sample.getResposeType();
		
		ResponseEntity<? extends TicketGoResponse<? extends TicketGoData>> resonse = restTemplate.postForEntity(resourceUrl, request,
				clazz );
		ResponseEntity<String> resonse2 = restTemplate.postForEntity(resourceUrl, request,
				String.class );
		System.out.println(resonse2.getBody());;
		return resonse.getBody();
		
	}
	/**
	 * Pseudo common post data.//一般性假資料
	 *
	 * @return the ticket go post data
	 */
	private TicketGoPostData pseudoCommonPostData (){
		TicketGoPostData result = new TicketGoPostData();
		result.setSerialNo("0");
		result.setUsername("may");
		result.setPassword("may");
		
		//切換到正式區
		/**
		 * 要把hosts那組設定移除，不然會出現"帳號密碼錯誤，請check您輸入的資料"
		 * */
		result.setUsername("API");
		result.setPassword("1qaz2wsx");
		return result ;
	}
	
	/**
	 * 取得單一商品資料 .
	 *
	 * @throws Exception the exception
	 */
	@Test
	@Ignore
	public void testGetTicketInfo() throws Exception {
		
		final TicketGoPostData  sample = pseudoTicketInfo();

		TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);
	}
	

	/**
	 * 取得商品清單資料 .
	 *
	 * @throws Exception the exception
	 */
	@Test
//	@Ignore
	public void testGetTicketList ( ) throws  Exception {
		
		final TicketGoPostData sample = pseudoTicketList ();
		
		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		  
		System.out.println(result);
		TicketGoData[] records=result.getRecord();
		System.out.println(records.length);;
		for(TicketGoData unit : records) {
			System.out.println(unit.getClass().getName());
			String json = mapper.writeValueAsString(unit);
			System.out.println(json);
		}
		System.out.println("----------------------------------------");
		String json = mapper.writeValueAsString(records);
		System.out.println(json);
	}
	
	/**
	 * 分類查詢查詢 .
	 *
	 * @throws Exception the exception
	 */
	@Test
	@Ignore
	public void testGetTypeList ( ) throws  Exception {
		final TicketGoPostData sample = pseudoTypeList ();

		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);
		 
	}
	
	/**
	 * 分區查詢查詢 .
	 *
	 * @throws Exception the exception
	 */
	@Test
	@Ignore
	public void testGetLocList ( ) throws  Exception {
		final TicketGoPostData sample = pseudoLocList ();		

		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);
		 
	}
	
	/**
	 * Test get active list.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@Ignore
	public void testGetActiveList ( ) throws  Exception {
		final TicketGoPostData sample = pseudoActiveList ();
		
		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);
		
	}
	
	/**
	 * Test get active set list.
	 *
	 * @throws Exception the exception
	 */
	@Test
	@Ignore
	public void testGetActiveSetList ( ) throws  Exception {
		final TicketGoPostData sample = pseudoActiveSetList ();
		
		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);
		 
	}
	
	/**
	 * Test get store list.
	 *
	 * @throws Exception the exception
	 */
	@Test
 	@Ignore
	public void testGetStoreList ( ) throws  Exception {
		final TicketGoPostData sample = pseudoStoreList ();
		
		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);
		 
	}
	
	
	/**
	 * Test get store info.
	 *
	 * @throws Exception the exception
	 */
	@Test
 	@Ignore
	public void testGetStoreInfo ( ) throws  Exception {
		final TicketGoPostData sample = pseudoStoreInfo ();

		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);		 
	}
	
	
	/**
	 * Test get add ticket list.
	 *
	 * @throws Exception the exception
	 */
	@Test
  	@Ignore
	public void testGetAddTicketList ( ) throws  Exception {
		final TicketGoPostData sample = pseudoAddTicketList ();
		
		final TicketGoResponse<? extends TicketGoData> result = commonGetData(sample);
		
		System.out.println(result);	

	}
	
	/**
	 * Termplate.
	 *
	 * @param sample the sample
	 */
	protected void termplate(TicketGoPostData sample ) {
		sample.getFunction().getClass();
	}
	
	
	/**
	 * 票卷加購商品列表查詢  假資料.
	 *
	 * @return StoreList go post data
	 */
	TicketGoPostData pseudoAddTicketList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		AddTicketList function =new AddTicketList(); 
		function.setHostPriceID(1);
		function.setHostTicketNo(3616);
		result.setFunction(function);
		result.setResposeType(TicketResponse.class);
		return result ;
	}
	
	/**
	 * 票卷商品列表查詢  假資料.
	 *
	 * @return StoreList go post data
	 */
	TicketGoPostData pseudoTicketList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		TicketList function =new TicketList(); 
		function.setGetEntityProduct("N");
		result.setFunction(function);
		result.setResposeType(TicketResponse.class);
		return result ;
	}
	
	/**
	 * 商店資料查詢  假資料.
	 *
	 * @return StoreList go post data
	 */
	TicketGoPostData pseudoStoreInfo(){
		TicketGoPostData result =  pseudoCommonPostData ();
		StoreInfo function =new StoreInfo(); 
	 
//		//要先用getStoreList去查詢storeNo
		function.setStoreNo(533) ;
		result.setFunction(function);
		result.setResposeType(StoreResponse.class);
		
		return result ;
	}
	
	/**
	 * 商店列表查詢 假資料.
	 *
	 * @return StoreList go post data
	 */
	TicketGoPostData pseudoStoreList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		StoreList function =new StoreList(); 
	 
//		//要先用getActiveList去查詢ActiveNo
//		function.setActiveNo(3665);;
		result.setFunction(function);
		result.setResposeType(StoreResponse.class);
		return result ;
	}
	
	/**
	 * 組合商品查詢查詢 假資料.
	 *
	 * @return ActiveSetList go post data
	 */
	TicketGoPostData pseudoActiveSetList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		ActiveSetList function =new ActiveSetList(); 
	 
		//要先用getActiveList去查詢ActiveNo
		function.setActiveNo(3665);;
		result.setFunction(function);
		result.setResposeType(ActiveSetResponse.class);
		return result ;
	}
	
	/**
	 * 活動查詢查詢 假資料.
	 *
	 * @return ActiveList go post data
	 */
	TicketGoPostData pseudoActiveList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		ActiveList function =new ActiveList(); 
	 
		function.setGetEntityProduct("Y");
		result.setFunction(function);
		result.setResposeType(ActiveResponse.class);
		return result ;
	}
	
	/**
	 * 分區查詢 假資料.
	 *
	 * @return the ticket go post data
	 */
	TicketGoPostData pseudoLocList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		LocList function =new LocList();
//		function.setMainLoc(1);;
	 
		function.setGetEntityProduct("Y");
		result.setFunction(function);
		result.setResposeType(TypeResponse.class);
		return result ;
	}
	
	/**
	 * 分類查詢 假資料.
	 *
	 * @return the ticket go post data
	 */
	TicketGoPostData pseudoTypeList(){
		TicketGoPostData result =  pseudoCommonPostData ();
		TypeList function =new TypeList();
//		function.setMainType(1);;
	 
		function.setGetEntityProduct("Y");
		result.setFunction(function);
		result.setResposeType(TypeResponse.class);
		return result ;
	}
 
	/**
	 * 取得單一商品資料 假資料.
	 *
	 * @return the ticket go post data
	 */
	TicketGoPostData pseudoTicketInfo (){
		TicketGoPostData result =  pseudoCommonPostData ();
		TicketInfo function =new TicketInfo();
		function.setTicketNo(4624);
		function.setPriceID(0);
		function.setGetEntityProduct("Y");
		result.setResposeType(TicketInfoResponse.class);
		result.setFunction(function);
		return result ;
	}
	
	
}
