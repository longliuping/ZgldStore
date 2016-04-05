package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YCart entity. @author MyEclipse Persistence Tools
 */
public class YCart extends AbstractYCart implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YCart() {
	}

	/** minimal constructor */
	public YCart(String cartTime) {
		super(cartTime);
	}

	/** full constructor */
	public YCart(Integer goId, Integer shipId, Integer accountActId, Integer goodsCount, Double goodsPrice, String cartTime) {
		super(goId, shipId, accountActId, goodsCount, goodsPrice, cartTime);
	}

}
