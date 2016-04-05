package com.zgld.mall.beans;

/**
 * PromoteSalesDiscount entity. @author MyEclipse Persistence Tools
 */
public class PromoteSalesDiscount extends AbstractPromoteSalesDiscount implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PromoteSalesDiscount() {
	}

	/** full constructor */
	public PromoteSalesDiscount(Double amount, Double discountValue, Integer valueType) {
		super(amount, discountValue, valueType);
	}

}
