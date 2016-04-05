package com.zgld.mall.beans;

/**
 * Skugroup entity. @author MyEclipse Persistence Tools
 */
public class Skugroup extends AbstractSkugroup implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Skugroup() {
	}

	/** full constructor */
	public Skugroup(Integer shopId, Integer productId, String skugroupName) {
		super(shopId, productId, skugroupName);
	}

}
