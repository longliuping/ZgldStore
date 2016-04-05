package com.zgld.mall.beans;

/**
 * AbstractYMsgAccount entity provides the base persistence definition of the
 * YMsgAccount entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMsgAccount implements java.io.Serializable {

	// Fields

	private Integer msgAccountId;
	private String corpId;
	private String pwd;
	private String corpName;
	private String linkMan;
	private String tel;
	private String mobile;
	private String email;
	private String memo;

	// Constructors

	/** default constructor */
	public AbstractYMsgAccount() {
	}

	/** minimal constructor */
	public AbstractYMsgAccount(String memo) {
		this.memo = memo;
	}

	/** full constructor */
	public AbstractYMsgAccount(String corpId, String pwd, String corpName, String linkMan, String tel, String mobile, String email, String memo) {
		this.corpId = corpId;
		this.pwd = pwd;
		this.corpName = corpName;
		this.linkMan = linkMan;
		this.tel = tel;
		this.mobile = mobile;
		this.email = email;
		this.memo = memo;
	}

	// Property accessors

	public Integer getMsgAccountId() {
		return this.msgAccountId;
	}

	public void setMsgAccountId(Integer msgAccountId) {
		this.msgAccountId = msgAccountId;
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getLinkMan() {
		return this.linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}