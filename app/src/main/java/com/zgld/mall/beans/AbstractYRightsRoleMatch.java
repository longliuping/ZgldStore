package com.zgld.mall.beans;

/**
 * AbstractYRightsRoleMatch entity provides the base persistence definition of
 * the YRightsRoleMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYRightsRoleMatch implements java.io.Serializable {

	// Fields

	private Integer riRoleId;
	private Integer riSetId;
	private Integer roleSetId;
	private Integer accountActId;

	// Constructors

	/** default constructor */
	public AbstractYRightsRoleMatch() {
	}

	/** minimal constructor */
	public AbstractYRightsRoleMatch(Integer accountActId) {
		this.accountActId = accountActId;
	}

	/** full constructor */
	public AbstractYRightsRoleMatch(Integer riSetId, Integer roleSetId, Integer accountActId) {
		this.riSetId = riSetId;
		this.roleSetId = roleSetId;
		this.accountActId = accountActId;
	}

	// Property accessors

	public Integer getRiRoleId() {
		return this.riRoleId;
	}

	public void setRiRoleId(Integer riRoleId) {
		this.riRoleId = riRoleId;
	}

	public Integer getRiSetId() {
		return this.riSetId;
	}

	public void setRiSetId(Integer riSetId) {
		this.riSetId = riSetId;
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