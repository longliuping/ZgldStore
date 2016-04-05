package com.zgld.mall.beans;

/**
 * AbstractProductImages entity provides the base persistence definition of the
 * ProductImages entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProductImages implements java.io.Serializable {

	// Fields

	private Integer productImageId;
	private Integer productId;
	private String imageUrl;

	// Constructors

	/** default constructor */
	public AbstractProductImages() {
	}

	/** full constructor */
	public AbstractProductImages(Integer productId, String imageUrl) {
		this.productId = productId;
		this.imageUrl = imageUrl;
	}

	// Property accessors

	public Integer getProductImageId() {
		return this.productImageId;
	}

	public void setProductImageId(Integer productImageId) {
		this.productImageId = productImageId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}