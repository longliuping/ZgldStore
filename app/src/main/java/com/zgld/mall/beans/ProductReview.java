package com.zgld.mall.beans;

public class ProductReview {
	private String ReviewId;
	private String ProductId;
	private String UserId;
	private String ReviewText;
	private String UserName;
	private String UserEmail;
	private String ReviewDate;
	private String HeadImg;

	public String getReviewId() {
		return ReviewId;
	}

	public void setReviewId(String reviewId) {
		ReviewId = reviewId;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getReviewText() {
		return ReviewText;
	}

	public void setReviewText(String reviewText) {
		ReviewText = reviewText;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public String getReviewDate() {
		return ReviewDate;
	}

	public void setReviewDate(String reviewDate) {
		ReviewDate = reviewDate;
	}

	public String getHeadImg() {
		return HeadImg;
	}

	public void setHeadImg(String headImg) {
		HeadImg = headImg;
	}

}
