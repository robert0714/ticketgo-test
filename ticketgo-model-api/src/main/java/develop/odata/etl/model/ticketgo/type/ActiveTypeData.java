package develop.odata.etl.model.ticketgo.type;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActiveTypeData implements TicketGoData {
	/*** 活動代號 ***/
	@JacksonXmlProperty(localName = "ActiveNo")
	private Integer activeNo;
	/*** 活動名稱 ***/
	@JacksonXmlProperty(localName = "ActiveName")
	private String activeName;
	/*** 活動起始日 或 不限 ***/
	@JacksonXmlProperty(localName = "StartDate")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String startDate;
	/*** 活動結束日 或 不限 ***/
	@JacksonXmlProperty(localName = "EndDate")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String endDate;
	public Integer getActiveNo() {
		return activeNo;
	}
	public void setActiveNo(Integer activeNo) {
		this.activeNo = activeNo;
	}
	public String getActiveName() {
		return activeName;
	}
	public void setActiveName(String activeName) {
		this.activeName = activeName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
