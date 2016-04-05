package com.zgld.mall.beans;

/**
 * RelatedProducts entity. @author MyEclipse Persistence Tools
 */
public class RelatedProducts extends AbstractRelatedProducts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RelatedProducts() {
	}

	/** full constructor */
	public RelatedProducts(Integer productId, Integer relatedProductId) {
		super(productId, relatedProductId);
	}

}
