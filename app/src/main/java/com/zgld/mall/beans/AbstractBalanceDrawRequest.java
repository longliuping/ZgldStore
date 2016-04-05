package com.zgld.mall.beans;

import java.util.Date;

/**
 * AbstractBalanceDrawRequest entity provides the base persistence definition of
 * the BalanceDrawRequest entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBalanceDrawRequest implements java.io.Serializable {

	// Fields

	private Integer balanceDrawId;
	private String requestTime;
	private Double amount;
	private Integer userId;
	private Integer requestStatus;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractBalanceDrawRequest() {
	}

	/** full constructor */
	public AbstractBalanceDrawRequest(String requestTime, Double amount, Integer userId, Integer requestStatus, String remark) {
		this.requestTime = requestTime;
		this.amount = amount;
		this.userId = userId;
		this.requestStatus = requestStatus;
		this.remark = remark;
	}

	// Property accessors

	public Integer getBalanceDrawId() {
		return this.balanceDrawId;
	}

	public void setBalanceDrawId(Integer balanceDrawId) {
		this.balanceDrawId = balanceDrawId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRequestStatus() {
		return this.requestStatus;
	}

	public void setRequestStatus(Integer requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}