package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYCart entity provides the base persistence definition of the YCart
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYCart implements java.io.Serializable {

	// Fields

	private Integer cartId;
	private Integer goId;
	private Integer shipId;
	private Integer accountActId;
	private Integer goodsCount;
	private Double goodsPrice;
	private String cartTime;

	// Constructors

	/** default constructor */
	public AbstractYCart() {
	}

	/** minimal constructor */
	public AbstractYCart(String cartTime) {
		this.cartTime = cartTime;
	}

	/** full constructor */
	public AbstractYCart(Integer goId, Integer shipId, Integer accountActId, Integer goodsCount, Double goodsPrice, String cartTime) {
		this.goId = goId;
		this.shipId = shipId;
		this.accountActId = accountActId;
		this.goodsCount = goodsCount;
		this.goodsPrice = goodsPrice;
		this.cartTime = cartTime;
	}

	// Property accessors

	public Integer getCartId() {
		return this.cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public Integer getShipId() {
		return this.shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
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

	public String getCartTime() {
		return this.cartTime;
	}

	public void setCartTime(String cartTime) {
		this.cartTime = cartTime;
	}

}