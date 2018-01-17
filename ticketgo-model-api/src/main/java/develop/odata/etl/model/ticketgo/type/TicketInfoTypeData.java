package develop.odata.etl.model.ticketgo.type;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TicketInfoTypeData extends TicketTypeData implements TicketGoData {
	 
	
	@JacksonXmlProperty(localName = "SubData") 
    @JacksonXmlElementWrapper(useWrapping = false) 
	private HostSubData[] subData;

 

	public HostSubData[] getSubData() {
		return subData;
	}


	public void setSubData(HostSubData[] subData) {
		this.subData = subData;
	}
	
}
