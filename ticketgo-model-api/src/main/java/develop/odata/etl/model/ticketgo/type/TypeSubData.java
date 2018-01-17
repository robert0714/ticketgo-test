package develop.odata.etl.model.ticketgo.type;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TypeSubData {
	@JacksonXmlProperty(localName = "STypeNo")
	private Integer sTypeNo;
	@JacksonXmlProperty(localName = "STypeName")
	private String sTypeName;
	public Integer getsTypeNo() {
		return sTypeNo;
	}
	public void setsTypeNo(Integer sTypeNo) {
		this.sTypeNo = sTypeNo;
	}
	public String getsTypeName() {
		return sTypeName;
	}
	public void setsTypeName(String sTypeName) {
		this.sTypeName = sTypeName;
	}
}
