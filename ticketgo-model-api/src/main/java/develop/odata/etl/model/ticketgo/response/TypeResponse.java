package develop.odata.etl.model.ticketgo.response;
 
 
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import develop.odata.etl.model.ticketgo.type.TicketInfoTypeData;
import develop.odata.etl.model.ticketgo.type.TypeData; 
 
public class TypeResponse extends TicketGoResponse<TypeData> { 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
    private TypeData[] record;

    @Override
	public TypeData[] getRecord() {
		return record;
	}

	@Override
	public void setRecord(TypeData... record) {
		this.record =record;
		
	}  
}
