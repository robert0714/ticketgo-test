package develop.odata.etl.model.ticketgo.response;
 
 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
import develop.odata.etl.model.ticketgo.type.TicketTypeData; 
 
public class TicketResponse extends TicketGoResponse<TicketTypeData> { 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
    private TicketTypeData[] record;

    @Override
	public TicketTypeData[] getRecord() {
		return record;
	}

	@Override
	public void setRecord(TicketTypeData... record) {
		this.record =record;
		
	}  
}
