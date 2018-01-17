package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
/**
 * 加價商品列表查詢 The Class AddTicketList.
 */
public class AddTicketList extends TicketFunction {

	/**
	 * Instantiates a new AddTicketList.
	 */
	public AddTicketList() {
		super();
		setName("getAddTicketList");
	}

	/** The host ticket no. */
	@JacksonXmlProperty(localName = "hostTicketNo")
	private Integer hostTicketNo;

	/** The host price ID. */
	@JacksonXmlProperty(localName = "hostPriceID")
	private Integer hostPriceID;

	/** The get entity product. */
	@JacksonXmlProperty(localName = "getEntityProduct")
	private String getEntityProduct;

	/**
	 * Gets the host ticket no.
	 *
	 * @return the host ticket no
	 */
	public Integer getHostTicketNo() {
		return hostTicketNo;
	}

	/**
	 * Sets the host ticket no.
	 *
	 * @param hostTicketNo the new host ticket no
	 */
	public void setHostTicketNo(Integer hostTicketNo) {
		this.hostTicketNo = hostTicketNo;
	}

	/**
	 * Gets the host price ID.
	 *
	 * @return the host price ID
	 */
	public Integer getHostPriceID() {
		return hostPriceID;
	}

	/**
	 * Sets the host price ID.
	 *
	 * @param hostPriceID the new host price ID
	 */
	public void setHostPriceID(Integer hostPriceID) {
		this.hostPriceID = hostPriceID;
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
