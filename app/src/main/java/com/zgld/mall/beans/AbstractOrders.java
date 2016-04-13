package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractOrders entity provides the base persistence definition of the Orders
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrders implements java.io.Serializable {
	// Fields

	private Integer orderId;
	private Integer shopId;
	private Integer userId;
	private Double freight;
	private Integer shippingId;
	private String shipOrderNumber;
	private Integer shippingStatus;
	private Integer refundStatus;
	private Integer paymentStatus;
	private Double orderTotalPrice;
	private Integer orderPoint;
	private Double otherCost;
	private Double orderRealPrice;
	private String remark;
	private String orderDate;
	private String mobile;
	private String shipTo;
	private String address;
	private String zipcode;
	private Integer payTypeId;// 支付类型
	private String payTradeNo;// 支付交易号
	private String payDateTime;// 交易付款时间
	private Double payTotalFee;//  交易付款金额
	private String buyerId;// 买家用户ID(支付宝ID)
	private String buyerAccount;// 买家账号(支付宝账号)
	private String refundDateTime;// 退款时间
	private Double refundTotalFee;//  退款交易金额

	// Constructors

	/** default constructor */
	public AbstractOrders() {
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getFreight() {
		return this.freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	public String getShipOrderNumber() {
		return this.shipOrderNumber;
	}

	public void setShipOrderNumber(String shipOrderNumber) {
		this.shipOrderNumber = shipOrderNumber;
	}

	public Integer getShippingStatus() {
		return this.shippingStatus;
	}

	public void setShippingStatus(Integer shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	public Integer getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Integer getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Double getOrderTotalPrice() {
		return this.orderTotalPrice;
	}

	public void setOrderTotalPrice(Double orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public Integer getOrderPoint() {
		return this.orderPoint;
	}

	public void setOrderPoint(Integer orderPoint) {
		this.orderPoint = orderPoint;
	}

	public Double getOtherCost() {
		return this.otherCost;
	}

	public void setOtherCost(Double otherCost) {
		this.otherCost = otherCost;
	}

	public Double getOrderRealPrice() {
		return this.orderRealPrice;
	}

	public void setOrderRealPrice(Double orderRealPrice) {
		this.orderRealPrice = orderRealPrice;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getPayTypeId() {
		return payTypeId;
	}

	public void setPayTypeId(Integer payTypeId) {
		this.payTypeId = payTypeId;
	}

	public String getPayTradeNo() {
		return payTradeNo;
	}

	public void setPayTradeNo(String payTradeNo) {
		this.payTradeNo = payTradeNo;
	}

	public String getPayDateTime() {
		return payDateTime;
	}

	public void setPayDateTime(String payDateTime) {
		this.payDateTime = payDateTime;
	}

	public Double getPayTotalFee() {
		return payTotalFee;
	}

	public void setPayTotalFee(Double payTotalFee) {
		this.payTotalFee = payTotalFee;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerAccount() {
		return buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	public String getRefundDateTime() {
		return refundDateTime;
	}

	public void setRefundDateTime(String refundDateTime) {
		this.refundDateTime = refundDateTime;
	}

	public Double getRefundTotalFee() {
		return refundTotalFee;
	}

	public void setRefundTotalFee(Double refundTotalFee) {
		this.refundTotalFee = refundTotalFee;
	}

}