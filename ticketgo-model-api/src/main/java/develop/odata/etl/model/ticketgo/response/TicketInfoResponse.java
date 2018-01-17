package develop.odata.etl.model.ticketgo.response;
 
 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import develop.odata.etl.model.ticketgo.type.TicketInfoTypeData; 
 
public class TicketInfoResponse extends TicketGoResponse<TicketInfoTypeData> { 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
    private TicketInfoTypeData[] record;

    @Override
	public TicketInfoTypeData[] getRecord() {
		return record;
	}

	@Override
	public void setRecord(TicketInfoTypeData... record) {
		this.record =record;
		
	}  
}
