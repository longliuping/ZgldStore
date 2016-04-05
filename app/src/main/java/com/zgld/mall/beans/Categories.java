package com.zgld.mall.beans;

/**
 * Categories entity. @author MyEclipse Persistence Tools
 */
public class Categories extends AbstractCategories implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Categories() {
	}

	/** full constructor */
	public Categories(Integer parentCategoryId, String name, Integer displaysequence, String iconUrl, String indexChar, String title, String metaDescription, String metaKeywords, String description, Integer depth) {
		super(parentCategoryId, name, displaysequence, iconUrl, indexChar, title, metaDescription, metaKeywords, description, depth);
	}

}
