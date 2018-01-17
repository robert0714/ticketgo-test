package develop.odata.etl.model.ticketgo.type;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeData implements TicketGoData {
	@JacksonXmlProperty(localName = "MTypeNo")
	private Integer mainTypeNo;
	 
	@JacksonXmlProperty(localName = "MTypeName")
	private String mainTypeName;
	
	@JacksonXmlProperty(localName = "SubData") 
    @JacksonXmlElementWrapper(useWrapping = false) 
	private TypeSubData[] subData;
	
	public Integer getMainTypeNo() {
		return mainTypeNo;
	}

	public void setMainTypeNo(Integer mainTypeNo) {
		this.mainTypeNo = mainTypeNo;
	}

	public String getMainTypeName() {
		return mainTypeName;
	}

	public void setMainTypeName(String mainTypeName) {
		this.mainTypeName = mainTypeName;
	}
	public TypeSubData[] getSubData() {
		return subData;
	}

	public void setSubData(TypeSubData[] subData) {
		this.subData = subData;
	}

	
	
}
