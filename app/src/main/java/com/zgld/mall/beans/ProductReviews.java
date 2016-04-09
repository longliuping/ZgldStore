package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * ProductReviews entity. @author MyEclipse Persistence Tools
 */
public class ProductReviews extends AbstractProductReviews implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProductReviews() {
	}

	/** full constructor */
	public ProductReviews(Integer shopId, Integer productId, Integer userId, String reviewText, String userName, String userEmail, String reviewDate) {
		super(shopId, productId, userId, reviewText, userName, userEmail, reviewDate);
	}
	YAccount userInfo;
	public YAccount getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(YAccount userInfo) {
		this.userInfo = userInfo;
	}
}
