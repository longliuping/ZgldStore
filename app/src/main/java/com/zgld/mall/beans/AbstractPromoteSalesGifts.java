package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesGifts entity provides the base persistence definition of
 * the PromoteSalesGifts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSalesGifts implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Integer giftId;
	private Integer giftPrice;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesGifts() {
	}

	/** full constructor */
	public AbstractPromoteSalesGifts(Integer giftId, Integer giftPrice) {
		this.giftId = giftId;
		this.giftPrice = giftPrice;
	}

	// Property accessors

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getGiftId() {
		return this.giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public Integer getGiftPrice() {
		return this.giftPrice;
	}

	public void setGiftPrice(Integer giftPrice) {
		this.giftPrice = giftPrice;
	}

}