package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAccount entity provides the base persistence definition of the
 * YAccount entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAccount implements java.io.Serializable {

	// Fields

	private Integer accountId;
	private Integer roleSetId;
	private Integer unitSetId;
	private String accountName;
	private String accountRealName;
	private String accountPassword;
	private Integer accountSex;
	private String accountHead;
	private String accountEmail;
	private String accountMobile;
	private Integer accountState;
	private String accountIntro;
	private String accountPlace;
	private Integer accountLeavel;
	private Integer isDelete;
	private String accountRegisterTime;

	// Constructors

	/** default constructor */
	public AbstractYAccount() {
	}

	/** minimal constructor */
	public AbstractYAccount(String accountRegisterTime) {
		this.accountRegisterTime = accountRegisterTime;
	}

	/** full constructor */
	public AbstractYAccount(Integer roleSetId, Integer unitSetId, String accountName, String accountRealName, String accountPassword, Integer accountSex, String accountHead, String accountEmail, String accountMobile, Integer accountState, String accountIntro, String accountPlace, Integer accountLeavel, Integer isDelete, String accountRegisterTime) {
		this.roleSetId = roleSetId;
		this.unitSetId = unitSetId;
		this.accountName = accountName;
		this.accountRealName = accountRealName;
		this.accountPassword = accountPassword;
		this.accountSex = accountSex;
		this.accountHead = accountHead;
		this.accountEmail = accountEmail;
		this.accountMobile = accountMobile;
		this.accountState = accountState;
		this.accountIntro = accountIntro;
		this.accountPlace = accountPlace;
		this.accountLeavel = accountLeavel;
		this.isDelete = isDelete;
		this.accountRegisterTime = accountRegisterTime;
	}

	// Property accessors

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getRoleSetId() {
		return this.roleSetId;
	}

	public void setRoleSetId(Integer roleSetId) {
		this.roleSetId = roleSetId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountRealName() {
		return this.accountRealName;
	}

	public void setAccountRealName(String accountRealName) {
		this.accountRealName = accountRealName;
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public Integer getAccountSex() {
		return this.accountSex;
	}

	public void setAccountSex(Integer accountSex) {
		this.accountSex = accountSex;
	}

	public String getAccountHead() {
		return this.accountHead;
	}

	public void setAccountHead(String accountHead) {
		this.accountHead = accountHead;
	}

	public String getAccountEmail() {
		return this.accountEmail;
	}

	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}

	public String getAccountMobile() {
		return this.accountMobile;
	}

	public void setAccountMobile(String accountMobile) {
		this.accountMobile = accountMobile;
	}

	public Integer getAccountState() {
		return this.accountState;
	}

	public void setAccountState(Integer accountState) {
		this.accountState = accountState;
	}

	public String getAccountIntro() {
		return this.accountIntro;
	}

	public void setAccountIntro(String accountIntro) {
		this.accountIntro = accountIntro;
	}

	public String getAccountPlace() {
		return this.accountPlace;
	}

	public void setAccountPlace(String accountPlace) {
		this.accountPlace = accountPlace;
	}

	public Integer getAccountLeavel() {
		return this.accountLeavel;
	}

	public void setAccountLeavel(Integer accountLeavel) {
		this.accountLeavel = accountLeavel;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAccountRegisterTime() {
		return this.accountRegisterTime;
	}

	public void setAccountRegisterTime(String accountRegisterTime) {
		this.accountRegisterTime = accountRegisterTime;
	}

}