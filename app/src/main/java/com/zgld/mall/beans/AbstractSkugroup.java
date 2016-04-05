package com.zgld.mall.beans;

/**
 * AbstractSkugroup entity provides the base persistence definition of the
 * Skugroup entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSkugroup implements java.io.Serializable {

	// Fields

	private Integer skugroupId;
	private Integer shopId;
	private Integer productId;
	private String skugroupName;

	// Constructors

	/** default constructor */
	public AbstractSkugroup() {
	}

	/** full constructor */
	public AbstractSkugroup(Integer shopId, Integer productId, String skugroupName) {
		this.shopId = shopId;
		this.productId = productId;
		this.skugroupName = skugroupName;
	}

	// Property accessors

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

	public String getSkugroupName() {
		return this.skugroupName;
	}

	public void setSkugroupName(String skugroupName) {
		this.skugroupName = skugroupName;
	}

}