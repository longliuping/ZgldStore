package com.zgld.mall.beans;

/**
 * AbstractPhotoCategories entity provides the base persistence definition of
 * the PhotoCategories entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPhotoCategories implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private Integer shopId;
	private String categoryName;
	private Integer displaySequence;

	// Constructors

	/** default constructor */
	public AbstractPhotoCategories() {
	}

	/** full constructor */
	public AbstractPhotoCategories(Integer shopId, String categoryName, Integer displaySequence) {
		this.shopId = shopId;
		this.categoryName = categoryName;
		this.displaySequence = displaySequence;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

}