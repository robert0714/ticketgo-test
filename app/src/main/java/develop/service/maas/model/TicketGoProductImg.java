package develop.service.maas.model;
 
 
public class TicketGoProductImg {

	public enum TicketGoImgType {
		NORMAL, SMALL
	}
 
	private Integer id;

	private String url;

	private TicketGoImgType type;

	public TicketGoProductImg() {
		super();
	}

	public TicketGoProductImg(String url, TicketGoImgType type) {
		super();
		this.url = url;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public TicketGoImgType getType() {
		return type;
	}

	public void setType(TicketGoImgType type) {
		this.type = type;
	}

}
