package develop.odata.etl.model.ticketgo.response;
 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import develop.odata.etl.model.ticketgo.type.TicketGoData;

@JacksonXmlRootElement(localName = "Request")
@JsonInclude(JsonInclude.Include.NON_EMPTY) 
@JsonIgnoreProperties(ignoreUnknown = true)
abstract public class TicketGoResponse <D extends TicketGoData> {
	@JacksonXmlProperty(localName = "RequestCode")
	private String code;
	
	@JacksonXmlProperty(localName = "Message")
	private String message ;
 
	   
    @JacksonXmlElementWrapper(localName = "Record",useWrapping = true)
    @JacksonXmlProperty(localName = "Data")
   private D[] record;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	abstract public D[] getRecord();

	abstract  public void setRecord(D ... record) ;
 
	 
}
