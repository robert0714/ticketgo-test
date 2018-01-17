package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

 
/**+
 * 取得單一商品資料
 * The Class TicketInfo.
 */
public class TicketInfo extends TicketFunction{
	
	
	/**
	 * Instantiates a new ticket info.
	 */
	public TicketInfo() {
		super();
		setName("getTicketInfo");
	}
 
	
	/** The ticket no. */
	@JacksonXmlProperty(localName = "ticketNo")
	private Integer ticketNo ;

	/** The price ID. */
	@JacksonXmlProperty(localName = "priceID")
	private Integer priceID ;
	
	 
	/** The get entity product. */
	@JacksonXmlProperty(localName = "getEntityProduct")
	private String getEntityProduct ;


	 

	/**
	 * Gets the ticket no.
	 *
	 * @return the ticket no
	 */
	public Integer getTicketNo() {
		return ticketNo;
	}


	/**
	 * Sets the ticket no.
	 *
	 * @param ticketNo the new ticket no
	 */
	public void setTicketNo(Integer ticketNo) {
		this.ticketNo = ticketNo;
	}


	/**
	 * Gets the price ID.
	 *
	 * @return the price ID
	 */
	public Integer getPriceID() {
		return priceID;
	}


	/**
	 * Sets the price ID.
	 *
	 * @param priceID the new price ID
	 */
	public void setPriceID(Integer priceID) {
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
