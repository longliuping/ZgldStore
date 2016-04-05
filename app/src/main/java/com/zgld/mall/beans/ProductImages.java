package com.zgld.mall.beans;

/**
 * ProductImages entity. @author MyEclipse Persistence Tools
 */
public class ProductImages extends AbstractProductImages implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProductImages() {
	}

	/** full constructor */
	public ProductImages(Integer productId, String imageUrl) {
		super(productId, imageUrl);
	}

}
