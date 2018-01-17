package develop.service.maas.model;
 
 
public class TicketGoType {
 
	private Integer id;

	private String name;
 
	private Integer no;
 
	private TicketGoType parent;

	public TicketGoType() {
		super();
	}

	public TicketGoType(String name, Integer no, TicketGoType parent) {
		super();
		this.name = name;
		this.no = no;
		this.parent = parent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TicketGoType getParent() {
		return parent;
	}

	public void setParent(TicketGoType parent) {
		this.parent = parent;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

}
