package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractUsers entity provides the base persistence definition of the Users
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsers implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Integer userAccountStatus;
	private String appUserToken;
	private String userBankCard;
	private String lastActivity;
	private Integer deleted;
	private Integer userType;

	// Constructors

	/** default constructor */
	public AbstractUsers() {
	}

	/** full constructor */
	public AbstractUsers(Integer userAccountStatus, String appUserToken, String userBankCard, String lastActivity, Integer deleted, Integer userType) {
		this.userAccountStatus = userAccountStatus;
		this.appUserToken = appUserToken;
		this.userBankCard = userBankCard;
		this.lastActivity = lastActivity;
		this.deleted = deleted;
		this.userType = userType;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserAccountStatus() {
		return this.userAccountStatus;
	}

	public void setUserAccountStatus(Integer userAccountStatus) {
		this.userAccountStatus = userAccountStatus;
	}

	public String getAppUserToken() {
		return this.appUserToken;
	}

	public void setAppUserToken(String appUserToken) {
		this.appUserToken = appUserToken;
	}

	public String getUserBankCard() {
		return this.userBankCard;
	}

	public void setUserBankCard(String userBankCard) {
		this.userBankCard = userBankCard;
	}

	public String getLastActivity() {
		return this.lastActivity;
	}

	public void setLastActivity(String lastActivity) {
		this.lastActivity = lastActivity;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

}