package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractOrdersRebate entity provides the base persistence definition of the
 * OrdersRebate entity. @author MyEclipse Persistence Tools
 */

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractOrdersRebate entity provides the base persistence definition of the
 * OrdersRebate entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrdersRebate implements java.io.Serializable {

	// Fields

	private Integer rebateId;
	private Integer orderId;
	private Integer userId;
	private Integer shopId;
	private Double income;
	private String rebateDate;
	private String remark;
	private Integer rebateState;
	private Integer rebateRelationId;
	private Integer incomeType;
	// Constructors

	/** default constructor */
	public AbstractOrdersRebate() {
	}

	// Property accessors

	public Integer getRebateId() {
		return this.rebateId;
	}

	public void setRebateId(Integer rebateId) {
		this.rebateId = rebateId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Double getIncome() {
		return this.income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public String getRebateDate() {
		return this.rebateDate;
	}

	public void setRebateDate(String rebateDate) {
		this.rebateDate = rebateDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getRebateState() {
		return this.rebateState;
	}

	public void setRebateState(Integer rebateState) {
		this.rebateState = rebateState;
	}

	public Integer getRebateRelationId() {
		return rebateRelationId;
	}

	public void setRebateRelationId(Integer rebateRelationId) {
		this.rebateRelationId = rebateRelationId;
	}

	public Integer getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(Integer incomeType) {
		this.incomeType = incomeType;
	}

}