package develop.odata.etl.model.ticketgo.response;
 
 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import develop.odata.etl.model.ticketgo.type.ActiveSetTypeData; 
 
public class ActiveSetResponse extends TicketGoResponse<ActiveSetTypeData> { 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
    private ActiveSetTypeData[] record;

    @Override
	public ActiveSetTypeData[] getRecord() {
		return record;
	}

	@Override
	public void setRecord(ActiveSetTypeData... record) {
		this.record =record;
		
	}  
}
