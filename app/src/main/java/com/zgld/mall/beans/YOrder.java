package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YOrder entity. @author MyEclipse Persistence Tools
 */
public class YOrder extends AbstractYOrder implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YOrder() {
	}

	/** minimal constructor */
	public YOrder(String orderTime) {
		super(orderTime);
	}

	/** full constructor */
	public YOrder(Integer addressId, String orderTitle, String orderPay, Integer accountActId, String orderNumber, Integer goodsCount, Double goodsPrice, Double shipPrice, Integer orderState, String orderTime) {
		super(addressId, orderTitle, orderPay, accountActId, orderNumber, goodsCount, goodsPrice, shipPrice, orderState, orderTime);
	}

}
