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

	/** minimal constructor */
	public YShop(String shopTime) {
		super(shopTime);
	}

	/** full constructor */
	public YShop(String shopKeyWords, String shopX, String shopY, Integer areaId, String shopAddress, String shopContact, String shopMobile, String shopCell, String shopIdCard, String shopIdCardImg, String shopLicenseImg, Integer userId, Integer shopIsOpen, Integer shopIsVerify, String shopTime) {
		super(shopKeyWords, shopX, shopY, areaId, shopAddress, shopContact, shopMobile, shopCell, shopIdCard, shopIdCardImg, shopLicenseImg, userId, shopIsOpen, shopIsVerify, shopTime);
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
