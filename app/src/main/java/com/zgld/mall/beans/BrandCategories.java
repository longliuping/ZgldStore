package com.zgld.mall.beans;

/**
 * BrandCategories entity. @author MyEclipse Persistence Tools
 */
public class BrandCategories extends AbstractBrandCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BrandCategories() {
	}

	/** full constructor */
	public BrandCategories(String brandName, String logo, String companyUrl, Integer displaySequence, String description) {
		super(brandName, logo, companyUrl, displaySequence, description);
	}

}
