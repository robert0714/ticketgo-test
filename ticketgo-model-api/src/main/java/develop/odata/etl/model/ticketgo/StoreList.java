package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
/**
 * 商店列表查詢
 * 
 * The Class StoreList.
 */
public class StoreList extends TicketFunction{
	
	
	/**
	 * Instantiates a new StoreList.
	 */
	public StoreList() {
		super();
		setName("getStoreList");
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
