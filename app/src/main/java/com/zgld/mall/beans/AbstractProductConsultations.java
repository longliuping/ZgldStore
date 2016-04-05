package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractProductConsultations entity provides the base persistence definition
 * of the ProductConsultations entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProductConsultations implements java.io.Serializable {

	// Fields

	private Integer consultationId;
	private Integer shopId;
	private Integer productId;
	private Integer userId;
	private String userName;
	private String userEmail;
	private String consultationText;
	private String consultationDate;
	private String replyText;
	private String replyDate;
	private String replyUserId;

	// Constructors

	/** default constructor */
	public AbstractProductConsultations() {
	}

	/** full constructor */
	public AbstractProductConsultations(Integer shopId, Integer productId, Integer userId, String userName, String userEmail, String consultationText, String consultationDate, String replyText, String replyDate, String replyUserId) {
		this.shopId = shopId;
		this.productId = productId;
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.consultationText = consultationText;
		this.consultationDate = consultationDate;
		this.replyText = replyText;
		this.replyDate = replyDate;
		this.replyUserId = replyUserId;
	}

	// Property accessors

	public Integer getConsultationId() {
		return this.consultationId;
	}

	public void setConsultationId(Integer consultationId) {
		this.consultationId = consultationId;
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

	public String getConsultationText() {
		return this.consultationText;
	}

	public void setConsultationText(String consultationText) {
		this.consultationText = consultationText;
	}

	public String getConsultationDate() {
		return this.consultationDate;
	}

	public void setConsultationDate(String consultationDate) {
		this.consultationDate = consultationDate;
	}

	public String getReplyText() {
		return this.replyText;
	}

	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}

	public String getReplyDate() {
		return this.replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public String getReplyUserId() {
		return this.replyUserId;
	}

	public void setReplyUserId(String replyUserId) {
		this.replyUserId = replyUserId;
	}

}