package com.zgld.mall.beans;

/**
 * PromoteSalesFee entity. @author MyEclipse Persistence Tools
 */
public class PromoteSalesFee extends AbstractPromoteSalesFee implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PromoteSalesFee() {
	}

	/** full constructor */
	public PromoteSalesFee(Double amount, Integer shipChargeFree, Integer serviceChargeFree, Integer packingChargeFree) {
		super(amount, shipChargeFree, serviceChargeFree, packingChargeFree);
	}

}
