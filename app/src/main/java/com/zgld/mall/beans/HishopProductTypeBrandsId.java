package com.zgld.mall.beans;

/**
 * HishopProductTypeBrandsId entity. @author MyEclipse Persistence Tools
 */
public class HishopProductTypeBrandsId extends
		AbstractHishopProductTypeBrandsId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopProductTypeBrandsId() {
	}

	/** full constructor */
	public HishopProductTypeBrandsId(HishopProductTypes hishopProductTypes,
			HishopBrandCategories hishopBrandCategories) {
		super(hishopProductTypes, hishopBrandCategories);
	}

}
