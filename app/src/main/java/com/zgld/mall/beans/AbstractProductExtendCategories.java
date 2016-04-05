package com.zgld.mall.beans;

/**
 * AbstractProductExtendCategories entity provides the base persistence
 * definition of the ProductExtendCategories entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractProductExtendCategories implements java.io.Serializable {

	// Fields

	private Integer matchId;
	private Integer categoryId;
	private Integer productId;

	// Constructors

	/** default constructor */
	public AbstractProductExtendCategories() {
	}

	/** full constructor */
	public AbstractProductExtendCategories(Integer categoryId, Integer productId) {
		this.categoryId = categoryId;
		this.productId = productId;
	}

	// Property accessors

	public Integer getMatchId() {
		return this.matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}