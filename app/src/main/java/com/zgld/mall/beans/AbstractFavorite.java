package com.zgld.mall.beans;

/**
 * AbstractFavorite entity provides the base persistence definition of the
 * Favorite entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFavorite implements java.io.Serializable {

	// Fields

	private Integer favoriteId;
	private Integer shopId;
	private Integer productId;
	private Integer userId;
	private String tags;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractFavorite() {
	}

	/** full constructor */
	public AbstractFavorite(Integer shopId, Integer productId, Integer userId, String tags, String remark) {
		this.shopId = shopId;
		this.productId = productId;
		this.userId = userId;
		this.tags = tags;
		this.remark = remark;
	}

	// Property accessors

	public Integer getFavoriteId() {
		return this.favoriteId;
	}

	public void setFavoriteId(Integer favoriteId) {
		this.favoriteId = favoriteId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}