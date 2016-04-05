package com.zgld.mall.beans;

/**
 * PhotoCategories entity. @author MyEclipse Persistence Tools
 */
public class PhotoCategories extends AbstractPhotoCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PhotoCategories() {
	}

	/** full constructor */
	public PhotoCategories(Integer shopId, String categoryName, Integer displaySequence) {
		super(shopId, categoryName, displaySequence);
	}

}
