package com.zgld.mall.beans;

/**
 * ShippingPrice entity. @author MyEclipse Persistence Tools
 */
public class ShippingPrice extends AbstractShippingPrice implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShippingPrice() {
	}

	/** full constructor */
	public ShippingPrice(Integer shippingId, Integer shopId, String name, Integer addWeight, Double price, Double addPrice, String description, Integer displaySequence) {
		super(shippingId, shopId, name, addWeight, price, addPrice, description, displaySequence);
	}

}
