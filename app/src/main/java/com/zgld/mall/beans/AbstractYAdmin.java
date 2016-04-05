package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAdmin entity provides the base persistence definition of the YAdmin
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAdmin implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private Integer accountId;
	private Integer unitSetId;
	private Integer adminGroupSetId;
	private Integer roleSetId;
	private String adminName;
	private String adminPassword;
	private Integer adminSex;
	private Integer adminState;
	private String adminRealName;
	private String adminEmail;
	private String adminMobile;
	private String adminIntro;
	private String adminIdCard;
	private String adminIdImg;
	private Integer accountActId;
	private Integer isDelete;
	private String adminTime;

	// Constructors

	/** default constructor */
	public AbstractYAdmin() {
	}

	/** minimal constructor */
	public AbstractYAdmin(String adminTime) {
		this.adminTime = adminTime;
	}

	/** full constructor */
	public AbstractYAdmin(Integer accountId, Integer unitSetId, Integer adminGroupSetId, Integer roleSetId, String adminName, String adminPassword, Integer adminSex, Integer adminState, String adminRealName, String adminEmail, String adminMobile, String adminIntro, String adminIdCard, String adminIdImg, Integer accountActId, Integer isDelete, String adminTime) {
		this.accountId = accountId;
		this.unitSetId = unitSetId;
		this.adminGroupSetId = adminGroupSetId;
		this.roleSetId = roleSetId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminSex = adminSex;
		this.adminState = adminState;
		this.adminRealName = adminRealName;
		this.adminEmail = adminEmail;
		this.adminMobile = adminMobile;
		this.adminIntro = adminIntro;
		this.adminIdCard = adminIdCard;
		this.adminIdImg = adminIdImg;
		this.accountActId = accountActId;
		this.isDelete = isDelete;
		this.adminTime = adminTime;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAdminGroupSetId() {
		return this.adminGroupSetId;
	}

	public void setAdminGroupSetId(Integer adminGroupSetId) {
		this.adminGroupSetId = adminGroupSetId;
	}

	public Integer getRoleSetId() {
		return this.roleSetId;
	}

	public void setRoleSetId(Integer roleSetId) {
		this.roleSetId = roleSetId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public Integer getAdminSex() {
		return this.adminSex;
	}

	public void setAdminSex(Integer adminSex) {
		this.adminSex = adminSex;
	}

	public Integer getAdminState() {
		return this.adminState;
	}

	public void setAdminState(Integer adminState) {
		this.adminState = adminState;
	}

	public String getAdminRealName() {
		return this.adminRealName;
	}

	public void setAdminRealName(String adminRealName) {
		this.adminRealName = adminRealName;
	}

	public String getAdminEmail() {
		return this.adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminMobile() {
		return this.adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

	public String getAdminIntro() {
		return this.adminIntro;
	}

	public void setAdminIntro(String adminIntro) {
		this.adminIntro = adminIntro;
	}

	public String getAdminIdCard() {
		return this.adminIdCard;
	}

	public void setAdminIdCard(String adminIdCard) {
		this.adminIdCard = adminIdCard;
	}

	public String getAdminIdImg() {
		return this.adminIdImg;
	}

	public void setAdminIdImg(String adminIdImg) {
		this.adminIdImg = adminIdImg;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAdminTime() {
		return this.adminTime;
	}

	public void setAdminTime(String adminTime) {
		this.adminTime = adminTime;
	}

}