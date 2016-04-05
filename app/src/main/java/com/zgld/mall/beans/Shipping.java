package com.zgld.mall.beans;

/**
 * Shipping entity. @author MyEclipse Persistence Tools
 */
public class Shipping extends AbstractShipping implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Shipping() {
	}

	/** full constructor */
	public Shipping(Integer shopId, Integer isDefault, Integer displaySequence, String expressCompanyName, String expressCompanyAbb) {
		super(shopId, isDefault, displaySequence, expressCompanyName, expressCompanyAbb);
	}

}
