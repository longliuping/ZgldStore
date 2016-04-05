package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesDiscount entity provides the base persistence definition
 * of the PromoteSalesDiscount entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSalesDiscount implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Double amount;
	private Double discountValue;
	private Integer valueType;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesDiscount() {
	}

	/** full constructor */
	public AbstractPromoteSalesDiscount(Double amount, Double discountValue, Integer valueType) {
		this.amount = amount;
		this.discountValue = discountValue;
		this.valueType = valueType;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Integer getValueType() {
		return this.valueType;
	}

	public void setValueType(Integer valueType) {
		this.valueType = valueType;
	}

}