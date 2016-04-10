package com.zgld.mall.beans;

/**
 * OrderItems entity. @author MyEclipse Persistence Tools
 */
public class OrderItems extends AbstractOrderItems implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrderItems() {
	}

	/** full constructor */
	public OrderItems(Integer orderId, Integer productId, Integer sku, Integer quantity, Double listPrice, Double cellPrice, String remark) {
		super(orderId, productId, sku, quantity, listPrice, cellPrice, remark);
	}

}
