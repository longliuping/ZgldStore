package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYShippingPrice entity provides the base persistence definition of the
 * YShippingPrice entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYShippingPrice implements java.io.Serializable {

	// Fields

	private Integer shipPriceId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer shipId;
	private Integer shipGoodsCount;
	private Double shipPrice;
	private Integer shipGoodsAddCount;
	private Double shipGoodsAddPrice;
	private String shipPriceTime;

	// Constructors

	/** default constructor */
	public AbstractYShippingPrice() {
	}

	/** minimal constructor */
	public AbstractYShippingPrice(String shipPriceTime) {
		this.shipPriceTime = shipPriceTime;
	}

	/** full constructor */
	public AbstractYShippingPrice(Integer unitSetId, Integer accountActId, Integer shipId, Integer shipGoodsCount, Double shipPrice, Integer shipGoodsAddCount, Double shipGoodsAddPrice, String shipPriceTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.shipId = shipId;
		this.shipGoodsCount = shipGoodsCount;
		this.shipPrice = shipPrice;
		this.shipGoodsAddCount = shipGoodsAddCount;
		this.shipGoodsAddPrice = shipGoodsAddPrice;
		this.shipPriceTime = shipPriceTime;
	}

	// Property accessors

	public Integer getShipPriceId() {
		return this.shipPriceId;
	}

	public void setShipPriceId(Integer shipPriceId) {
		this.shipPriceId = shipPriceId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getShipId() {
		return this.shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public Integer getShipGoodsCount() {
		return this.shipGoodsCount;
	}

	public void setShipGoodsCount(Integer shipGoodsCount) {
		this.shipGoodsCount = shipGoodsCount;
	}

	public Double getShipPrice() {
		return this.shipPrice;
	}

	public void setShipPrice(Double shipPrice) {
		this.shipPrice = shipPrice;
	}

	public Integer getShipGoodsAddCount() {
		return this.shipGoodsAddCount;
	}

	public void setShipGoodsAddCount(Integer shipGoodsAddCount) {
		this.shipGoodsAddCount = shipGoodsAddCount;
	}

	public Double getShipGoodsAddPrice() {
		return this.shipGoodsAddPrice;
	}

	public void setShipGoodsAddPrice(Double shipGoodsAddPrice) {
		this.shipGoodsAddPrice = shipGoodsAddPrice;
	}

	public String getShipPriceTime() {
		return this.shipPriceTime;
	}

	public void setShipPriceTime(String shipPriceTime) {
		this.shipPriceTime = shipPriceTime;
	}

}