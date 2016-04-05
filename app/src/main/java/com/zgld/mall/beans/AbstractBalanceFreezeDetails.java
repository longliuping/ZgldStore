package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractBalanceFreezeDetails entity provides the base persistence definition
 * of the BalanceFreezeDetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBalanceFreezeDetails implements java.io.Serializable {

	// Fields

	private Integer balanceFreezeId;
	private String freezeTime;
	private Double amount;
	private Integer userId;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractBalanceFreezeDetails() {
	}

	/** full constructor */
	public AbstractBalanceFreezeDetails(String freezeTime, Double amount, Integer userId, String remark) {
		this.freezeTime = freezeTime;
		this.amount = amount;
		this.userId = userId;
		this.remark = remark;
	}

	// Property accessors

	public Integer getBalanceFreezeId() {
		return this.balanceFreezeId;
	}

	public void setBalanceFreezeId(Integer balanceFreezeId) {
		this.balanceFreezeId = balanceFreezeId;
	}

	public String getFreezeTime() {
		return this.freezeTime;
	}

	public void setFreezeTime(String freezeTime) {
		this.freezeTime = freezeTime;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}