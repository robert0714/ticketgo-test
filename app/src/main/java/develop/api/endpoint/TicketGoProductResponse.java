package develop.api.endpoint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import develop.service.maas.model.TicketGoProduct;

@JsonInclude(JsonInclude.Include.NON_EMPTY) 
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties(ignoreUnknown = true,value={"hibernateLazyInitializer", "handler"})
public class TicketGoProductResponse extends TicketGoProduct{

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
