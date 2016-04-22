package com.zgld.mall.beans;

import java.sql.Date;
import java.util.List;

/**
 * YShop entity. @author MyEclipse Persistence Tools
 */
public class YShop extends AbstractYShop implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YShop() {
	}
	Products products;
	List<Products> listProducts;
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public List<Products> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Products> listProducts) {
		this.listProducts = listProducts;
	}
}
