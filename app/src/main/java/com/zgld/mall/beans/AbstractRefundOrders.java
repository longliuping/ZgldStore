package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractRefundOrders entity provides the base persistence definition of the
 * RefundOrders entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRefundOrders implements java.io.Serializable {

	// Fields

	private Integer refundId;
	private Integer orderId;
	private Integer isOrderRefund;
	private Double totalBalance;
	private String remark;
	private String cellPhone;
	private String addedDate;

	// Constructors

	/** default constructor */
	public AbstractRefundOrders() {
	}

	/** full constructor */
	public AbstractRefundOrders(Integer orderId, Integer isOrderRefund, Double totalBalance, String remark, String cellPhone, String addedDate) {
		this.orderId = orderId;
		this.isOrderRefund = isOrderRefund;
		this.totalBalance = totalBalance;
		this.remark = remark;
		this.cellPhone = cellPhone;
		this.addedDate = addedDate;
	}

	// Property accessors

	public Integer getRefundId() {
		return this.refundId;
	}

	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getIsOrderRefund() {
		return this.isOrderRefund;
	}

	public void setIsOrderRefund(Integer isOrderRefund) {
		this.isOrderRefund = isOrderRefund;
	}

	public Double getTotalBalance() {
		return this.totalBalance;
	}

	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}

}