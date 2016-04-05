package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYOrderSend entity provides the base persistence definition of the
 * YOrderSend entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYOrderSend implements java.io.Serializable {

	// Fields

	private Integer sendId;
	private Integer shipId;
	private String shipNumber;
	private Integer orderId;
	private Integer accountActId;
	private String sendInfo;
	private String sendTime;

	// Constructors

	/** default constructor */
	public AbstractYOrderSend() {
	}

	/** minimal constructor */
	public AbstractYOrderSend(String sendTime) {
		this.sendTime = sendTime;
	}

	/** full constructor */
	public AbstractYOrderSend(Integer shipId, String shipNumber, Integer orderId, Integer accountActId, String sendInfo, String sendTime) {
		this.shipId = shipId;
		this.shipNumber = shipNumber;
		this.orderId = orderId;
		this.accountActId = accountActId;
		this.sendInfo = sendInfo;
		this.sendTime = sendTime;
	}

	// Property accessors

	public Integer getSendId() {
		return this.sendId;
	}

	public void setSendId(Integer sendId) {
		this.sendId = sendId;
	}

	public Integer getShipId() {
		return this.shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public String getShipNumber() {
		return this.shipNumber;
	}

	public void setShipNumber(String shipNumber) {
		this.shipNumber = shipNumber;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getSendInfo() {
		return this.sendInfo;
	}

	public void setSendInfo(String sendInfo) {
		this.sendInfo = sendInfo;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

}