package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractProductReviews entity provides the base persistence definition of the
 * ProductReviews entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProductReviews implements java.io.Serializable {

	// Fields

	private Integer reviewId;
	private Integer shopId;
	private Integer productId;
	private Integer userId;
	private String reviewText;
	private String userName;
	private String userEmail;
	private String reviewDate;

	// Constructors

	/** default constructor */
	public AbstractProductReviews() {
	}

	/** full constructor */
	public AbstractProductReviews(Integer shopId, Integer productId, Integer userId, String reviewText, String userName, String userEmail, String reviewDate) {
		this.shopId = shopId;
		this.productId = productId;
		this.userId = userId;
		this.reviewText = reviewText;
		this.userName = userName;
		this.userEmail = userEmail;
		this.reviewDate = reviewDate;
	}

	// Property accessors

	public Integer getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
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

	public String getReviewText() {
		return this.reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

}