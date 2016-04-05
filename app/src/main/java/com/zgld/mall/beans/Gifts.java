package com.zgld.mall.beans;

/**
 * Gifts entity. @author MyEclipse Persistence Tools
 */
public class Gifts extends AbstractGifts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Gifts() {
	}

	/** full constructor */
	public Gifts(Integer shopId, String name, String shortDescription, String unit, Integer weight, String longDescription, String title, String metaDescription, String metaKeywords, String thumbnailsUrl, String inFocusImageUrl, Double costPrice, Double marketPrice, Integer enabled, Double salePrice, Integer stock, Integer needPoint) {
		super(shopId, name, shortDescription, unit, weight, longDescription, title, metaDescription, metaKeywords, thumbnailsUrl, inFocusImageUrl, costPrice, marketPrice, enabled, salePrice, stock, needPoint);
	}

}
