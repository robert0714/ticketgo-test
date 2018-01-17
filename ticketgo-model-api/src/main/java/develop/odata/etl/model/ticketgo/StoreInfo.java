package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
/** 
 * 商店資料查詢,要先用getStoreList去查詢storeNo
 * The Class StoreInfo.
 */
public class StoreInfo extends TicketFunction{
	
	
	/**
	 * Instantiates a new StoreList.
	 */
	public StoreInfo() {
		super();
		setName("getStoreInfo");
	}
 
	
	/** The store no.要先用getStoreList去查詢storeNo */
	@JacksonXmlProperty(localName = "storeNo")
	private Integer storeNo ;
	
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
