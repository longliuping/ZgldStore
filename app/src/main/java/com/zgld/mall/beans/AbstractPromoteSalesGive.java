package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesGive entity provides the base persistence definition of
 * the PromoteSalesGive entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSalesGive implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Integer buyQuantity;
	private Integer giveQuantity;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesGive() {
	}

	/** full constructor */
	public AbstractPromoteSalesGive(Integer buyQuantity, Integer giveQuantity) {
		this.buyQuantity = buyQuantity;
		this.giveQuantity = giveQuantity;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getBuyQuantity() {
		return this.buyQuantity;
	}

	public void setBuyQuantity(Integer buyQuantity) {
		this.buyQuantity = buyQuantity;
	}

	public Integer getGiveQuantity() {
		return this.giveQuantity;
	}

	public void setGiveQuantity(Integer giveQuantity) {
		this.giveQuantity = giveQuantity;
	}

}