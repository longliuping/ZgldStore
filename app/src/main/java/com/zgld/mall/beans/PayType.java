package com.zgld.mall.beans;

/**
 * PayType entity. @author MyEclipse Persistence Tools
 */
public class PayType extends AbstractPayType implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PayType() {
	}

	/** full constructor */
	public PayType(String payTypeName, String payTypeLogo) {
		super(payTypeName, payTypeLogo);
	}

}
