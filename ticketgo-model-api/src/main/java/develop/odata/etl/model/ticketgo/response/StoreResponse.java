package develop.odata.etl.model.ticketgo.response;
 
 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import develop.odata.etl.model.ticketgo.type.StoreTypeData; 
 
public class StoreResponse extends TicketGoResponse<StoreTypeData> { 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
    private StoreTypeData[] record;

    @Override
	public StoreTypeData[] getRecord() {
		return record;
	}

	@Override
	public void setRecord(StoreTypeData... record) {
		this.record =record;
		
	}  
}
