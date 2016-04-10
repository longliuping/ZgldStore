package com.zgld.mall.beans;

/**
 * OrderItems entity. @author MyEclipse Persistence Tools
 */
public class OrderItems extends AbstractOrderItems implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrderItems() {
	}
	Products products;
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
}
