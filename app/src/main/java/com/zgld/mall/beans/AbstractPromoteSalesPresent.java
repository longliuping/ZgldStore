package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesPresent entity provides the base persistence definition
 * of the PromoteSalesPresent entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSalesPresent implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Integer amount;
	private Integer presenteCount;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesPresent() {
	}

	/** full constructor */
	public AbstractPromoteSalesPresent(Integer amount, Integer presenteCount) {
		this.amount = amount;
		this.presenteCount = presenteCount;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getPresenteCount() {
		return this.presenteCount;
	}

	public void setPresenteCount(Integer presenteCount) {
		this.presenteCount = presenteCount;
	}

}