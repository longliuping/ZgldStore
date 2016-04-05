package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesProducts entity provides the base persistence definition
 * of the PromoteSalesProducts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSalesProducts implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Integer productId;
	private Integer type;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesProducts() {
	}

	/** full constructor */
	public AbstractPromoteSalesProducts(Integer productId, Integer type) {
		this.productId = productId;
		this.type = type;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}