package com.zgld.mall.beans;

/**
 * AbstractYMenuRoleMatch entity provides the base persistence definition of the
 * YMenuRoleMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMenuRoleMatch implements java.io.Serializable {

	// Fields

	private Integer meRoleId;
	private Integer meId;
	private Integer roleSetId;
	private Integer accountActId;

	// Constructors

	/** default constructor */
	public AbstractYMenuRoleMatch() {
	}

	/** minimal constructor */
	public AbstractYMenuRoleMatch(Integer accountActId) {
		this.accountActId = accountActId;
	}

	/** full constructor */
	public AbstractYMenuRoleMatch(Integer meId, Integer roleSetId, Integer accountActId) {
		this.meId = meId;
		this.roleSetId = roleSetId;
		this.accountActId = accountActId;
	}

	// Property accessors

	public Integer getMeRoleId() {
		return this.meRoleId;
	}

	public void setMeRoleId(Integer meRoleId) {
		this.meRoleId = meRoleId;
	}

	public Integer getMeId() {
		return this.meId;
	}

	public void setMeId(Integer meId) {
		this.meId = meId;
	}

	public Integer getRoleSetId() {
		return this.roleSetId;
	}

	public void setRoleSetId(Integer roleSetId) {
		this.roleSetId = roleSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

}