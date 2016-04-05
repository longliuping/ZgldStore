package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYShipping entity provides the base persistence definition of the
 * YShipping entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYShipping implements java.io.Serializable {

	// Fields

	private Integer shipId;
	private Integer unitSetId;
	private Integer accountActId;
	private String shipName;
	private String shipGoodsPlace;
	private Integer shipSendInTime;
	private String shipTime;

	// Constructors

	/** default constructor */
	public AbstractYShipping() {
	}

	/** minimal constructor */
	public AbstractYShipping(String shipTime) {
		this.shipTime = shipTime;
	}

	/** full constructor */
	public AbstractYShipping(Integer unitSetId, Integer accountActId, String shipName, String shipGoodsPlace, Integer shipSendInTime, String shipTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.shipName = shipName;
		this.shipGoodsPlace = shipGoodsPlace;
		this.shipSendInTime = shipSendInTime;
		this.shipTime = shipTime;
	}

	// Property accessors

	public Integer getShipId() {
		return this.shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
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

	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipGoodsPlace() {
		return this.shipGoodsPlace;
	}

	public void setShipGoodsPlace(String shipGoodsPlace) {
		this.shipGoodsPlace = shipGoodsPlace;
	}

	public Integer getShipSendInTime() {
		return this.shipSendInTime;
	}

	public void setShipSendInTime(Integer shipSendInTime) {
		this.shipSendInTime = shipSendInTime;
	}

	public String getShipTime() {
		return this.shipTime;
	}

	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}

}