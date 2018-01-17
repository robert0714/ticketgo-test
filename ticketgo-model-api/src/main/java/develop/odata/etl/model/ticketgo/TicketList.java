package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
/** 
 * 票卷商品列表查詢
 * The Class TicketList.
 */
public class TicketList extends TicketFunction{
	
	
	/**
	 * Instantiates a new TicketList.
	 */
	public TicketList() {
		super();
		setName("getTicketList");
	}
 

	/** The main type. */
	@JacksonXmlProperty(localName = "mainType")
	private Integer mainType ;
  
	/** The subt type. */
	@JacksonXmlProperty(localName = "subType")
	private Integer subtType ;
  
	
	/** The main loc. */
	@JacksonXmlProperty(localName = "mainLoc")
	private Integer mainLoc ;
  
	/** The sub loc. */
	@JacksonXmlProperty(localName = "subLoc")
	private Integer subLoc ;
	
	/** The active no. */
	@JacksonXmlProperty(localName = "activeNo")
	private Integer activeNo ;
	
	/** The store no. */
	@JacksonXmlProperty(localName = "storeNo")
	private Integer storeNo ;
	
	
	/** The off set. */
	@JacksonXmlProperty(localName = "offSet")
	private Integer offSet ;
	
	
	/** The limit. */
	@JacksonXmlProperty(localName = "limit")
	private Integer limit ;
	
	/** The order. */
	@JacksonXmlProperty(localName = "order")
	private String order ;
	
	
	/** The keyword. */
	@JacksonXmlProperty(localName = "keyword")
	private String keyword ;
	
	/** The set no. */
	@JacksonXmlProperty(localName = "setNo")
	private String setNo ;
	
	/** The get entity product. */
	@JacksonXmlProperty(localName = "getEntityProduct")
	private String getEntityProduct ;

	/**
	 * Gets the main type.
	 *
	 * @return the main type
	 */
	public Integer getMainType() {
		return mainType;
	}

	/**
	 * Sets the main type.
	 *
	 * @param mainType the new main type
	 */
	public void setMainType(Integer mainType) {
		this.mainType = mainType;
	}

	/**
	 * Gets the subt type.
	 *
	 * @return the subt type
	 */
	public Integer getSubtType() {
		return subtType;
	}

	/**
	 * Sets the subt type.
	 *
	 * @param subtType the new subt type
	 */
	public void setSubtType(Integer subtType) {
		this.subtType = subtType;
	}

	/**
	 * Gets the main loc.
	 *
	 * @return the main loc
	 */
	public Integer getMainLoc() {
		return mainLoc;
	}

	/**
	 * Sets the main loc.
	 *
	 * @param mainLoc the new main loc
	 */
	public void setMainLoc(Integer mainLoc) {
		this.mainLoc = mainLoc;
	}

	/**
	 * Gets the sub loc.
	 *
	 * @return the sub loc
	 */
	public Integer getSubLoc() {
		return subLoc;
	}

	/**
	 * Sets the sub loc.
	 *
	 * @param subLoc the new sub loc
	 */
	public void setSubLoc(Integer subLoc) {
		this.subLoc = subLoc;
	}

	/**
	 * Gets the active no.
	 *
	 * @return the active no
	 */
	public Integer getActiveNo() {
		return activeNo;
	}

	/**
	 * Sets the active no.
	 *
	 * @param activeNo the new active no
	 */
	public void setActiveNo(Integer activeNo) {
		this.activeNo = activeNo;
	}

	/**
	 * Gets the store no.
	 *
	 * @return the store no
	 */
	public Integer getStoreNo() {
		return storeNo;
	}

	/**
	 * Sets the store no.
	 *
	 * @param storeNo the new store no
	 */
	public void setStoreNo(Integer storeNo) {
		this.storeNo = storeNo;
	}

	/**
	 * Gets the off set.
	 *
	 * @return the off set
	 */
	public Integer getOffSet() {
		return offSet;
	}

	/**
	 * Sets the off set.
	 *
	 * @param offSet the new off set
	 */
	public void setOffSet(Integer offSet) {
		this.offSet = offSet;
	}

	/**
	 * Gets the limit.
	 *
	 * @return the limit
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * Sets the limit.
	 *
	 * @param limit the new limit
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	public void setOrder(String order) {
		this.order = order;
	}

	/**
	 * Gets the keyword.
	 *
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * Sets the keyword.
	 *
	 * @param keyword the new keyword
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * Gets the sets the no.
	 *
	 * @return the sets the no
	 */
	public String getSetNo() {
		return setNo;
	}

	/**
	 * Sets the sets the no.
	 *
	 * @param setNo the new sets the no
	 */
	public void setSetNo(String setNo) {
		this.setNo = setNo;
	}

	/**
	 * Gets the gets the entity product.
	 *
	 * @return the gets the entity product
	 */
	public String getGetEntityProduct() {
		return getEntityProduct;
	}

	/**
	 * Sets the gets the entity product.
	 *
	 * @param getEntityProduct the new gets the entity product
	 */
	public void setGetEntityProduct(String getEntityProduct) {
		this.getEntityProduct = getEntityProduct;
	}
	
	
}
