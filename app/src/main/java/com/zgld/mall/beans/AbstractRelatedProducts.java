package com.zgld.mall.beans;

/**
 * AbstractRelatedProducts entity provides the base persistence definition of
 * the RelatedProducts entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRelatedProducts implements java.io.Serializable {

	// Fields

	private Integer matchId;
	private Integer productId;
	private Integer relatedProductId;

	// Constructors

	/** default constructor */
	public AbstractRelatedProducts() {
	}

	/** full constructor */
	public AbstractRelatedProducts(Integer productId, Integer relatedProductId) {
		this.productId = productId;
		this.relatedProductId = relatedProductId;
	}

	// Property accessors

	public Integer getMatchId() {
		return this.matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getRelatedProductId() {
		return this.relatedProductId;
	}

	public void setRelatedProductId(Integer relatedProductId) {
		this.relatedProductId = relatedProductId;
	}

}