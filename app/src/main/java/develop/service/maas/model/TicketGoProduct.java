package develop.service.maas.model;
 

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import develop.service.basic.model.Record;
import develop.service.sale.model.Point;
 
public class TicketGoProduct extends Record {

	 
	private Integer id;

	private Integer ticketNo;
	private String ticketName;

	private Integer storeNo;

	private String storeName;

	private String storeTel;

	private String storeAddress;
 
	private Point point;

	private String storeIntro;

	private String publisherName;

	private String publisherCEO;

	private String publisherUniformNo;
 
	private String Introduction;

	private String businessHours;

	private String otherHelp;

	private String mainIssue;
 
	private TicketGoType type;

	private String mLocNo;

	private String mLocName;

	private String sLocNo;
	private String sLocName;

	/**
	 * 原價
	 */
	private BigDecimal originalPrice;

	private Date limitDate;

	private String slogan;

	private String virtualTicket;
	private String virtualTicketOnly;
 
	private String content;

	private Integer qty;

	/**
	 * 商品價格
	 */
	private BigDecimal price;
	private BigDecimal cost;
	private Integer priceId;
	private Integer minimumQty;
	private String priceName;
	private Date startDate;
	private Date endDate;
	private String setNo;
	private String agentTicketCode;
	private Integer dataTotalCount;
	private String isEntityProduct;

	 
	private List<TicketGoProductImg> imgs;

	public TicketGoProduct() {
		super();
	}

	public TicketGoProduct(Integer storeNo, String storeName, String storeTel, String storeAddress, Point point,
			String introduction, String businessHours, String otherHelp, String mainIssue, TicketGoType type,
			String mLocNo, String mLocName, String sLocNo, String sLocName, List<TicketGoProductImg> imgs) {
		super();
		this.storeNo = storeNo;
		this.storeName = storeName;
		this.storeTel = storeTel;
		this.storeAddress = storeAddress;
		this.point = point;
		Introduction = introduction;
		this.businessHours = businessHours;
		this.otherHelp = otherHelp;
		this.mainIssue = mainIssue;
		this.type = type;
		this.mLocNo = mLocNo;
		this.mLocName = mLocName;
		this.sLocNo = sLocNo;
		this.sLocName = sLocName;
		this.imgs = imgs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getIntroduction() {
		return Introduction;
	}

	public void setIntroduction(String introduction) {
		Introduction = introduction;
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

	public TicketGoType getType() {
		return type;
	}

	public void setType(TicketGoType type) {
		this.type = type;
	}

	public String getmLocNo() {
		return mLocNo;
	}

	public void setmLocNo(String mLocNo) {
		this.mLocNo = mLocNo;
	}

	public String getmLocName() {
		return mLocName;
	}

	public void setmLocName(String mLocName) {
		this.mLocName = mLocName;
	}

	public String getsLocNo() {
		return sLocNo;
	}

	public void setsLocNo(String sLocNo) {
		this.sLocNo = sLocNo;
	}

	public String getsLocName() {
		return sLocName;
	}

	public void setsLocName(String sLocName) {
		this.sLocName = sLocName;
	}

	public List<TicketGoProductImg> getImgs() {
		return imgs;
	}

	public void setImgs(List<TicketGoProductImg> imgs) {
		this.imgs = imgs;
	}

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

	public String getStoreIntro() {
		return storeIntro;
	}

	public void setStoreIntro(String storeIntro) {
		this.storeIntro = storeIntro;
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

	public String getPublisherUniformNo() {
		return publisherUniformNo;
	}

	public void setPublisherUniformNo(String publisherUniformNo) {
		this.publisherUniformNo = publisherUniformNo;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Date getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(Date limitDate) {
		this.limitDate = limitDate;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Integer getPriceId() {
		return priceId;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
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

}
