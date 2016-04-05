package com.zgld.mall.beans;

/**
 * YMsgAccount entity. @author MyEclipse Persistence Tools
 */
public class YMsgAccount extends AbstractYMsgAccount implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMsgAccount() {
	}

	/** minimal constructor */
	public YMsgAccount(String memo) {
		super(memo);
	}

	/** full constructor */
	public YMsgAccount(String corpId, String pwd, String corpName, String linkMan, String tel, String mobile, String email, String memo) {
		super(corpId, pwd, corpName, linkMan, tel, mobile, email, memo);
	}

}
