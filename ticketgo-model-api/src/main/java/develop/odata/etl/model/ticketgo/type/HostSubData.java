package develop.odata.etl.model.ticketgo.type;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class HostSubData {
	@JacksonXmlProperty(localName = "HostTicketNo")
	private Integer hostTicketNo;
	 
	@JacksonXmlProperty(localName = "HostTicketID")
	private Integer hostTicketID;

	public Integer getHostTicketNo() {
		return hostTicketNo;
	}

	public void setHostTicketNo(Integer hostTicketNo) {
		this.hostTicketNo = hostTicketNo;
	}

	public Integer getHostTicketID() {
		return hostTicketID;
	}

	public void setHostTicketID(Integer hostTicketID) {
		this.hostTicketID = hostTicketID;
	}
	 
}
