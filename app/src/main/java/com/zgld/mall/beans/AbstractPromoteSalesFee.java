package com.zgld.mall.beans;

/**
 * AbstractPromoteSalesFee entity provides the base persistence definition of
 * the PromoteSalesFee entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPromoteSalesFee implements java.io.Serializable {

	// Fields

	private Integer activityId;
	private Double amount;
	private Integer shipChargeFree;
	private Integer serviceChargeFree;
	private Integer packingChargeFree;

	// Constructors

	/** default constructor */
	public AbstractPromoteSalesFee() {
	}

	/** full constructor */
	public AbstractPromoteSalesFee(Double amount, Integer shipChargeFree, Integer serviceChargeFree, Integer packingChargeFree) {
		this.amount = amount;
		this.shipChargeFree = shipChargeFree;
		this.serviceChargeFree = serviceChargeFree;
		this.packingChargeFree = packingChargeFree;
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

	public Integer getShipChargeFree() {
		return this.shipChargeFree;
	}

	public void setShipChargeFree(Integer shipChargeFree) {
		this.shipChargeFree = shipChargeFree;
	}

	public Integer getServiceChargeFree() {
		return this.serviceChargeFree;
	}

	public void setServiceChargeFree(Integer serviceChargeFree) {
		this.serviceChargeFree = serviceChargeFree;
	}

	public Integer getPackingChargeFree() {
		return this.packingChargeFree;
	}

	public void setPackingChargeFree(Integer packingChargeFree) {
		this.packingChargeFree = packingChargeFree;
	}

}