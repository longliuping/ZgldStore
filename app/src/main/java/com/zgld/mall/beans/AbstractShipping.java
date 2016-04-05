package com.zgld.mall.beans;

/**
 * AbstractShipping entity provides the base persistence definition of the
 * Shipping entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShipping implements java.io.Serializable {

	// Fields

	private Integer shippingId;
	private Integer shopId;
	private Integer isDefault;
	private Integer displaySequence;
	private String expressCompanyName;
	private String expressCompanyAbb;

	// Constructors

	/** default constructor */
	public AbstractShipping() {
	}

	/** full constructor */
	public AbstractShipping(Integer shopId, Integer isDefault, Integer displaySequence, String expressCompanyName, String expressCompanyAbb) {
		this.shopId = shopId;
		this.isDefault = isDefault;
		this.displaySequence = displaySequence;
		this.expressCompanyName = expressCompanyName;
		this.expressCompanyAbb = expressCompanyAbb;
	}

	// Property accessors

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

	public Integer getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getExpressCompanyName() {
		return this.expressCompanyName;
	}

	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}

	public String getExpressCompanyAbb() {
		return this.expressCompanyAbb;
	}

	public void setExpressCompanyAbb(String expressCompanyAbb) {
		this.expressCompanyAbb = expressCompanyAbb;
	}

}