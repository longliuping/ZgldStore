package com.zgld.mall.beans;

/**
 * YCartMatch entity. @author MyEclipse Persistence Tools
 */
public class YCartMatch extends AbstractYCartMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YCartMatch() {
	}

	/** full constructor */
	public YCartMatch(Integer cartId, Integer goId, Integer accountActId, Integer combineValueId, Integer goodsCount, Double goodsPrice) {
		super(cartId, goId, accountActId, combineValueId, goodsCount, goodsPrice);
	}

}
