package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYRole entity provides the base persistence definition of the YRole
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYRole implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private Integer roleSetId;
	private String roleName;
	private Integer accountActId;
	private Integer isDelete;
	private String roleTime;

	// Constructors

	/** default constructor */
	public AbstractYRole() {
	}

	/** minimal constructor */
	public AbstractYRole(String roleTime) {
		this.roleTime = roleTime;
	}

	/** full constructor */
	public AbstractYRole(Integer roleSetId, String roleName, Integer accountActId, Integer isDelete, String roleTime) {
		this.roleSetId = roleSetId;
		this.roleName = roleName;
		this.accountActId = accountActId;
		this.isDelete = isDelete;
		this.roleTime = roleTime;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRoleSetId() {
		return this.roleSetId;
	}

	public void setRoleSetId(Integer roleSetId) {
		this.roleSetId = roleSetId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public String getRoleTime() {
		return this.roleTime;
	}

	public void setRoleTime(String roleTime) {
		this.roleTime = roleTime;
	}

}