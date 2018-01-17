package develop.odata.etl.model.ticketgo.type;

 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude; 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
@JsonInclude(JsonInclude.Include.NON_EMPTY) 
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketTypeData implements TicketGoData {
	/*** 商品代號 ***/
	@JacksonXmlProperty(localName = "TicketNo")
	private Integer ticketNo;
	/*** 商品名稱 ***/
	@JacksonXmlProperty(localName = "TicketName")
	private String ticketName;
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
	/*** 商店介紹 ***/
	@JacksonXmlProperty(localName = "StoreIntegerro")
	private String storeIntegerro;
	/*** 發行人 ***/
	@JacksonXmlProperty(localName = "PublisherName")
	private String publisherName;
	/*** 負責人 ***/
	@JacksonXmlProperty(localName = "PublisherCEO")
	private String publisherCEO;
	/*** 統一編號 ***/
	@JacksonXmlProperty(localName = "PublisherUniformNo")
	private Integer publisherUniformNo;
	/*** 大分類代號 ***/
	@JacksonXmlProperty(localName = "MTypeNo")
	private Integer mainTypeNo;
	/*** 大分類名稱 ***/
	@JacksonXmlProperty(localName = "MTypeName")
	private String mainTypeName;
	/*** 小分類代號 ***/
	@JacksonXmlProperty(localName = "STypeNo")
	private Integer smallTypeNo;
	/*** 小分類名稱 ***/
	@JacksonXmlProperty(localName = "STypeName")
	private String smallTypeName;
	/*** 大地區代號 ***/
	@JacksonXmlProperty(localName = "MLocNo")
	private Integer mainLocNo;
	/*** 大地區名稱 ***/
	@JacksonXmlProperty(localName = "MLocName")
	private String mainLocName;
	/*** 小地區代號 ***/
	@JacksonXmlProperty(localName = "SLocNo")
	private Integer smallLocNo;
	/*** 小地區名稱 ***/
	@JacksonXmlProperty(localName = "SLocName")
	private String smallLocName;
	/*** 原價 ***/
	@JacksonXmlProperty(localName = "OriginalPrice")
	private Integer originalPrice;
	/*** 使用期限(以文字表示) ***/
	@JacksonXmlProperty(localName = "LimitDate")
	private String limitDate;
	/*** 商品特色 ***/
	@JacksonXmlProperty(localName = "Slogan")
	private String slogan;
	/*** 商品簡介 ***/
	@JacksonXmlProperty(localName = "Integerroduction")
	private String introduction;
	/*** 商品內容 ***/
	@JacksonXmlProperty(localName = "Content")
	private String content;
	/*** 數字 （庫存量） 或 文字（不限） ***/
	@JacksonXmlProperty(localName = "Qty")
	private String qty;
	/*** 售價(單價，非整套) ***/
	@JacksonXmlProperty(localName = "Price")
	private Integer price;
	/*** 請款價(單價，非整套) ***/
	@JacksonXmlProperty(localName = "Cost")
	private Float cost;
	/*** 價格代號(同商品可能因活動而有不同價格代號) ***/
	@JacksonXmlProperty(localName = "PriceID")
	private Integer priceID;
	/*** 最小訂購量 ***/
	@JacksonXmlProperty(localName = "MinimumQty")
	private Integer minimumQty;
	/*** 價格名稱 ***/
	@JacksonXmlProperty(localName = "PriceName")
	private String priceName;
	/*** 活動起始日 或 不限 ***/
	@JacksonXmlProperty(localName = "StartDate")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String startDate;
	/*** 活動結束日 或 不限 ***/
	@JacksonXmlProperty(localName = "EndDate")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String endDate;
	
	/*** 是否為電子票，Y=是 ***/
	@JacksonXmlProperty(localName = "VirtualTicket")
	private String virtualTicket;
	
	/*** 是否只賣電子票，Y=是  ***/
	@JacksonXmlProperty(localName = "VirtualTicketOnly")
	private String virtualTicketOnly;
	
	/*** 商品組合碼(同活動、相同組合碼商品必須一起購買) ***/
	@JacksonXmlProperty(localName = "SetNo")
	private String setNo;
	/*** (Ibon) 代收代號 ***/
	@JacksonXmlProperty(localName = "AgentTicketCode")
	private String agentTicketCode;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicString_1")
	private String picString1;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicString_2")
	private String picString2;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicString_3")
	private String picString3;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicString_4")
	private String picString4;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicString_5")
	private String picString5;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicString_6")
	private String picString6;
	/*** 票券總數量 ***/
	@JacksonXmlProperty(localName = "DataTotalCount")
	private Integer dataTotalCount;
	/*** 是否為實體商品 Y 或 N ***/
	@JacksonXmlProperty(localName = "IsEntityProduct")
	private String isEntityProduct;
	public Integer getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(Integer ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
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
	public String getStoreIntegerro() {
		return storeIntegerro;
	}
	public void setStoreIntegerro(String storeIntegerro) {
		this.storeIntegerro = storeIntegerro;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherCEO() {
		return publisherCEO;
	}
	public void setPublisherCEO(String publisherCEO) {
		this.publisherCEO = publisherCEO;
	}
	public Integer getPublisherUniformNo() {
		return publisherUniformNo;
	}
	public void setPublisherUniformNo(Integer publisherUniformNo) {
		this.publisherUniformNo = publisherUniformNo;
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
	public Integer getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Integer originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getLimitDate() {
		return limitDate;
	}
	public void setLimitDate(String limitDate) {
		this.limitDate = limitDate;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
	public Integer getPriceID() {
		return priceID;
	}
	public void setPriceID(Integer priceID) {
		this.priceID = priceID;
	}
	public Integer getMinimumQty() {
		return minimumQty;
	}
	public void setMinimumQty(Integer minimumQty) {
		this.minimumQty = minimumQty;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	 
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getSetNo() {
		return setNo;
	}
	public void setSetNo(String setNo) {
		this.setNo = setNo;
	}
	public String getAgentTicketCode() {
		return agentTicketCode;
	}
	public void setAgentTicketCode(String agentTicketCode) {
		this.agentTicketCode = agentTicketCode;
	}
	public String getPicString1() {
		return picString1;
	}
	public void setPicString1(String picString1) {
		this.picString1 = picString1;
	}
	public String getPicString2() {
		return picString2;
	}
	public void setPicString2(String picString2) {
		this.picString2 = picString2;
	}
	public String getPicString3() {
		return picString3;
	}
	public void setPicString3(String picString3) {
		this.picString3 = picString3;
	}
	public String getPicString4() {
		return picString4;
	}
	public void setPicString4(String picString4) {
		this.picString4 = picString4;
	}
	public String getPicString5() {
		return picString5;
	}
	public void setPicString5(String picString5) {
		this.picString5 = picString5;
	}
	public String getPicString6() {
		return picString6;
	}
	public void setPicString6(String picString6) {
		this.picString6 = picString6;
	}
	public Integer getDataTotalCount() {
		return dataTotalCount;
	}
	public void setDataTotalCount(Integer dataTotalCount) {
		this.dataTotalCount = dataTotalCount;
	}
	public String getIsEntityProduct() {
		return isEntityProduct;
	}
	public void setIsEntityProduct(String isEntityProduct) {
		this.isEntityProduct = isEntityProduct;
	}
	public String getVirtualTicket() {
		return virtualTicket;
	}
	public void setVirtualTicket(String virtualTicket) {
		this.virtualTicket = virtualTicket;
	}
	public String getVirtualTicketOnly() {
		return virtualTicketOnly;
	}
	public void setVirtualTicketOnly(String virtualTicketOnly) {
		this.virtualTicketOnly = virtualTicketOnly;
	}

}
