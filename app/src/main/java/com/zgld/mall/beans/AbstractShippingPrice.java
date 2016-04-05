package com.zgld.mall.beans;

/**
 * AbstractShippingPrice entity provides the base persistence definition of the
 * ShippingPrice entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShippingPrice implements java.io.Serializable {

	// Fields

	private Integer shippPriceId;
	private Integer shippingId;
	private Integer shopId;
	private String name;
	private Integer addWeight;
	private Double price;
	private Double addPrice;
	private String description;
	private Integer displaySequence;

	// Constructors

	/** default constructor */
	public AbstractShippingPrice() {
	}

	/** full constructor */
	public AbstractShippingPrice(Integer shippingId, Integer shopId, String name, Integer addWeight, Double price, Double addPrice, String description, Integer displaySequence) {
		this.shippingId = shippingId;
		this.shopId = shopId;
		this.name = name;
		this.addWeight = addWeight;
		this.price = price;
		this.addPrice = addPrice;
		this.description = description;
		this.displaySequence = displaySequence;
	}

	// Property accessors

	public Integer getShippPriceId() {
		return this.shippPriceId;
	}

	public void setShippPriceId(Integer shippPriceId) {
		this.shippPriceId = shippPriceId;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAddWeight() {
		return this.addWeight;
	}

	public void setAddWeight(Integer addWeight) {
		this.addWeight = addWeight;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAddPrice() {
		return this.addPrice;
	}

	public void setAddPrice(Double addPrice) {
		this.addPrice = addPrice;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

}