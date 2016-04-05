package com.zgld.mall.beans;

/**
 * Favorite entity. @author MyEclipse Persistence Tools
 */
public class Favorite extends AbstractFavorite implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Favorite() {
	}

	/** full constructor */
	public Favorite(Integer shopId, Integer productId, Integer userId, String tags, String remark) {
		super(shopId, productId, userId, tags, remark);
	}

}
