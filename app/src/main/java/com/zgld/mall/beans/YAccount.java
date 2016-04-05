package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YAccount entity. @author MyEclipse Persistence Tools
 */
public class YAccount extends AbstractYAccount implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YAccount() {
	}

	/** minimal constructor */
	public YAccount(String accountRegisterTime) {
		super(accountRegisterTime);
	}

	/** full constructor */
	public YAccount(Integer roleSetId, Integer unitSetId, String accountName, String accountRealName, String accountPassword, Integer accountSex, String accountHead, String accountEmail, String accountMobile, Integer accountState, String accountIntro, String accountPlace, Integer accountLeavel, Integer isDelete, String accountRegisterTime) {
		super(roleSetId, unitSetId, accountName, accountRealName, accountPassword, accountSex, accountHead, accountEmail, accountMobile, accountState, accountIntro, accountPlace, accountLeavel, isDelete, accountRegisterTime);
	}
	Users userToken;
	public Users getUserToken() {
		return userToken;
	}

	public void setUserToken(Users userToken) {
		this.userToken = userToken;
	}
	
}
