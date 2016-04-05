package com.zgld.mall.beans;

/**
 * Sku entity. @author MyEclipse Persistence Tools
 */
public class Sku extends AbstractSku implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sku() {
	}

	/** full constructor */
	public Sku(Integer skugroupId, Integer shopId, Integer productId, Integer stock, Double price, String attributeNames, String attributeValues) {
		super(skugroupId, shopId, productId, stock, price, attributeNames, attributeValues);
	}

}
