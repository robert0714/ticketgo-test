package develop.odata.etl.model.ticketgo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
/**+
 * 組合商品查詢,要先用getActiveList去查詢ActiveNo
 * The Class TicketInfo.
 */
public class ActiveSetList extends TicketFunction{
	
	
	/**
	 * Instantiates a new ActiveSetList.
	 */
	public ActiveSetList() {
		super();
		setName("getActiveSetList");
	}
 
	 
	/** The active no. */
	@JacksonXmlProperty(localName = "activeNo")
	private Integer activeNo ;
 
	/** The set no. */
	@JacksonXmlProperty(localName = "setNo")
	private String setNo ;

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
	
	  
	
	
}
