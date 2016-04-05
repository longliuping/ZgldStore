package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYOrder entity provides the base persistence definition of the YOrder
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYOrder implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Integer addressId;
	private String orderTitle;
	private String orderPay;
	private Integer accountActId;
	private String orderNumber;
	private Integer goodsCount;
	private Double goodsPrice;
	private Double shipPrice;
	private Integer orderState;
	private String orderTime;

	// Constructors

	/** default constructor */
	public AbstractYOrder() {
	}

	/** minimal constructor */
	public AbstractYOrder(String orderTime) {
		this.orderTime = orderTime;
	}

	/** full constructor */
	public AbstractYOrder(Integer addressId, String orderTitle, String orderPay, Integer accountActId, String orderNumber, Integer goodsCount, Double goodsPrice, Double shipPrice, Integer orderState, String orderTime) {
		this.addressId = addressId;
		this.orderTitle = orderTitle;
		this.orderPay = orderPay;
		this.accountActId = accountActId;
		this.orderNumber = orderNumber;
		this.goodsCount = goodsCount;
		this.goodsPrice = goodsPrice;
		this.shipPrice = shipPrice;
		this.orderState = orderState;
		this.orderTime = orderTime;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOrderPay() {
		return this.orderPay;
	}

	public void setOrderPay(String orderPay) {
		this.orderPay = orderPay;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getGoodsCount() {
		return this.goodsCount;
	}

	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Double getShipPrice() {
		return this.shipPrice;
	}

	public void setShipPrice(Double shipPrice) {
		this.shipPrice = shipPrice;
	}

	public Integer getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public String getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

}