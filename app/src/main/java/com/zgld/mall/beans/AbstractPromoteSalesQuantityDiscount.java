package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesQuantityDiscount entity provides the base persistence
 * definition of the PromoteSalesQuantityDiscount entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractPromoteSalesQuantityDiscount implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Integer quantity;
	private Integer discountValue;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesQuantityDiscount() {
	}

	/** full constructor */
	public AbstractPromoteSalesQuantityDiscount(Integer quantity, Integer discountValue) {
		this.quantity = quantity;
		this.discountValue = discountValue;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Integer discountValue) {
		this.discountValue = discountValue;
	}

}