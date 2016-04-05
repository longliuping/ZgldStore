package com.zgld.mall.beans;

/**
 * AbstractSku entity provides the base persistence definition of the Sku
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSku implements java.io.Serializable {

	// Fields

	private Integer sku;
	private Integer skugroupId;
	private Integer shopId;
	private Integer productId;
	private Integer stock;
	private Double price;
	private String attributeNames;
	private String attributeValues;

	// Constructors

	/** default constructor */
	public AbstractSku() {
	}

	/** full constructor */
	public AbstractSku(Integer skugroupId, Integer shopId, Integer productId, Integer stock, Double price, String attributeNames, String attributeValues) {
		this.skugroupId = skugroupId;
		this.shopId = shopId;
		this.productId = productId;
		this.stock = stock;
		this.price = price;
		this.attributeNames = attributeNames;
		this.attributeValues = attributeValues;
	}

	// Property accessors

	public Integer getSku() {
		return this.sku;
	}

	public void setSku(Integer sku) {
		this.sku = sku;
	}

	public Integer getSkugroupId() {
		return this.skugroupId;
	}

	public void setSkugroupId(Integer skugroupId) {
		this.skugroupId = skugroupId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAttributeNames() {
		return this.attributeNames;
	}

	public void setAttributeNames(String attributeNames) {
		this.attributeNames = attributeNames;
	}

	public String getAttributeValues() {
		return this.attributeValues;
	}

	public void setAttributeValues(String attributeValues) {
		this.attributeValues = attributeValues;
	}

}