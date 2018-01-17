package develop.odata.etl.model.ticketgo;
 

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import develop.odata.etl.model.ticketgo.response.TicketGoResponse;
import develop.odata.etl.model.ticketgo.type.TicketGoData;

@JacksonXmlRootElement(localName = "sendData")
public class TicketGoPostData {
	
	
	public TicketGoPostData() {
		super();
	}

	@JacksonXmlProperty(localName = "serialNo")
	private String serialNo;
	
	@JacksonXmlProperty(localName = "username")
	private String username ;

	@JacksonXmlProperty(localName = "password")
	private String password ;
	
	 
	@JacksonXmlProperty(localName = "from")
	@JacksonXmlCData
	private String from ="www.ticketgo.com.tw" ;
	
	@JacksonXmlProperty(localName = "functionName")
	private TicketFunction function;

	@JsonIgnore
	private Class<? extends TicketGoResponse<? extends TicketGoData>> resposeType;
	
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public TicketFunction getFunction() {
		return function;
	}

	public void setFunction(TicketFunction function) {
		this.function = function;
	}

	public Class<? extends TicketGoResponse<? extends TicketGoData>> getResposeType() {
		return resposeType;
	}

	public void setResposeType(Class<? extends TicketGoResponse<? extends TicketGoData>> resposeType) {
		this.resposeType = resposeType;
	}
	
	
	
	
	
	
}
