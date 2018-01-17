package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

 

/** 
 * 活動查詢
 * The Class ActiveList.
 */
public class ActiveList extends TicketFunction{
	
	
	/**
	 * Instantiates a new ActiveList.
	 */
	public ActiveList() {
		super();
		setName("getActiveList");
	}
 
	 
	/** The store no. */
	@JacksonXmlProperty(localName = "storeNo")
	private Integer storeNo ;
 
	/** The price ID. */
	@JacksonXmlProperty(localName = "priceID")
	private String priceID ;
	
	/** The get entity product. */
	@JacksonXmlProperty(localName = "getEntityProduct")
	private String getEntityProduct ;

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
	 * Gets the price ID.
	 *
	 * @return the price ID
	 */
	public String getPriceID() {
		return priceID;
	}

	/**
	 * Sets the price ID.
	 *
	 * @param priceID the new price ID
	 */
	public void setPriceID(String priceID) {
		this.priceID = priceID;
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
