package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YShippingPrice entity. @author MyEclipse Persistence Tools
 */
public class YShippingPrice extends AbstractYShippingPrice implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YShippingPrice() {
	}

	/** minimal constructor */
	public YShippingPrice(String shipPriceTime) {
		super(shipPriceTime);
	}

	/** full constructor */
	public YShippingPrice(Integer unitSetId, Integer accountActId, Integer shipId, Integer shipGoodsCount, Double shipPrice, Integer shipGoodsAddCount, Double shipGoodsAddPrice, String shipPriceTime) {
		super(unitSetId, accountActId, shipId, shipGoodsCount, shipPrice, shipGoodsAddCount, shipGoodsAddPrice, shipPriceTime);
	}

}
