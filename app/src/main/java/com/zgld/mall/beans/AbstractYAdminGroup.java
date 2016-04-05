package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAdminGroup entity provides the base persistence definition of the
 * YAdminGroup entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAdminGroup implements java.io.Serializable {

	// Fields

	private Integer adminGroupId;
	private Integer adminParentGroupId;
	private Integer adminGroupSetId;
	private String adminGroupName;
	private Integer accountActId;
	private Integer isDelete;
	private String adminGroupTime;

	// Constructors

	/** default constructor */
	public AbstractYAdminGroup() {
	}

	/** minimal constructor */
	public AbstractYAdminGroup(String adminGroupTime) {
		this.adminGroupTime = adminGroupTime;
	}

	/** full constructor */
	public AbstractYAdminGroup(Integer adminParentGroupId, Integer adminGroupSetId, String adminGroupName, Integer accountActId, Integer isDelete, String adminGroupTime) {
		this.adminParentGroupId = adminParentGroupId;
		this.adminGroupSetId = adminGroupSetId;
		this.adminGroupName = adminGroupName;
		this.accountActId = accountActId;
		this.isDelete = isDelete;
		this.adminGroupTime = adminGroupTime;
	}

	// Property accessors

	public Integer getAdminGroupId() {
		return this.adminGroupId;
	}

	public void setAdminGroupId(Integer adminGroupId) {
		this.adminGroupId = adminGroupId;
	}

	public Integer getAdminParentGroupId() {
		return this.adminParentGroupId;
	}

	public void setAdminParentGroupId(Integer adminParentGroupId) {
		this.adminParentGroupId = adminParentGroupId;
	}

	public Integer getAdminGroupSetId() {
		return this.adminGroupSetId;
	}

	public void setAdminGroupSetId(Integer adminGroupSetId) {
		this.adminGroupSetId = adminGroupSetId;
	}

	public String getAdminGroupName() {
		return this.adminGroupName;
	}

	public void setAdminGroupName(String adminGroupName) {
		this.adminGroupName = adminGroupName;
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

	public String getAdminGroupTime() {
		return this.adminGroupTime;
	}

	public void setAdminGroupTime(String adminGroupTime) {
		this.adminGroupTime = adminGroupTime;
	}

}