package develop.odata.etl.model.ticketgo;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 * 分類查詢 The Class TypeList.
 */
public class TypeList extends TicketFunction {

	/**
	 * Instantiates a new TypeList.
	 */
	public TypeList() {
		super();
		setName("getTypeList");
	}

	/**
	 * The main type.大分類代號 :◎不指定大分類代號，則 回傳大分類列表 ◎指定大分類代號，則回傳小分類列表
	 */
	@JacksonXmlProperty(localName = "mainType")
	private Integer mainType;

	/** The get entity product. */
	@JacksonXmlProperty(localName = "getEntityProduct")
	private String getEntityProduct;

	
	/**
	 * Gets the gets the entity product.
	 *
	 * @return the gets the entity product
	 */
	public String getGetEntityProduct() {
		return getEntityProduct;
	}

	/**
	 * Sets the gets the entity product.
	 *
	 * @param getEntityProduct
	 *            the new gets the entity product
	 */
	public void setGetEntityProduct(String getEntityProduct) {
		this.getEntityProduct = getEntityProduct;
	}

	/**
	 * Gets the main type.
	 *
	 * @return the main type
	 */
	public Integer getMainType() {
		return mainType;
	}

	/**
	 * Sets the main type.
	 *
	 * @param maintType
	 *            the new main type
	 */
	public void setMainType(Integer maintType) {
		this.mainType = maintType;
	}
 
	

}
