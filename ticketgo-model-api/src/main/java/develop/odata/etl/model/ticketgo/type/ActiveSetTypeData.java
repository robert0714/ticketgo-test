package develop.odata.etl.model.ticketgo.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActiveSetTypeData implements TicketGoData {
	/*** 組合商品名稱 ***/
	@JacksonXmlProperty(localName = "TicketName")
	private String ticketName;
	/*** 售價(整套) ***/
	@JacksonXmlProperty(localName = "Price")
	private Integer price;
	/*** 圖片網址 ***/
	@JacksonXmlProperty(localName = "PicUrl_1")
	private String picUrl1;
	/*** 組合商品代號 ***/
	@JacksonXmlProperty(localName = "SetNo")
	private String setNo;
	/*** 是否為實體商品 Y 或 N ***/
	@JacksonXmlProperty(localName = "IsEntityProduct")
	private String isEntityProduct;
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPicUrl1() {
		return picUrl1;
	}
	public void setPicUrl1(String picUrl1) {
		this.picUrl1 = picUrl1;
	}
	public String getSetNo() {
		return setNo;
	}
	public void setSetNo(String setNo) {
		this.setNo = setNo;
	}
	public String getIsEntityProduct() {
		return isEntityProduct;
	}
	public void setIsEntityProduct(String isEntityProduct) {
		this.isEntityProduct = isEntityProduct;
	}

}
