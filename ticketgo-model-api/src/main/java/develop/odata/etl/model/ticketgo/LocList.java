package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

  
/** 
 * 分區查詢
 * The Class LocList.
 */
public class LocList extends TicketFunction{
	
	
	/**
	 * Instantiates a new LocList.
	 */
	public LocList() {
		super();
		setName("getLocList");
	}
 
	 
	/** The main loc. 大分區代號 :◎不指定大分區代號，則 回傳大分區列表 ◎指定大分區代號，則回傳小分區列表*/
	@JacksonXmlProperty(localName = "mainLoc")
	private Integer mainLoc ;
  
	
	/** The get entity product. */
	@JacksonXmlProperty(localName = "getEntityProduct")
	private String getEntityProduct ;

	 

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
	
	
}
