package com.zgld.mall.beans;

import java.util.List;

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
	List<Sku> listSkus;
	public List<Sku> getListSkus() {
		return listSkus;
	}

	public void setListSkus(List<Sku> listSkus) {
		this.listSkus = listSkus;
	}
}
