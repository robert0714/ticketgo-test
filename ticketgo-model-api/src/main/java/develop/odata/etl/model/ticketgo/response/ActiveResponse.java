package develop.odata.etl.model.ticketgo.response;
 
 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
 
import develop.odata.etl.model.ticketgo.type.ActiveTypeData; 
 
public class ActiveResponse extends TicketGoResponse<ActiveTypeData> { 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
    private ActiveTypeData[] record;

    @Override
	public ActiveTypeData[] getRecord() {
		return record;
	}

	@Override
	public void setRecord(ActiveTypeData... record) {
		this.record =record;
		
	}  
}
