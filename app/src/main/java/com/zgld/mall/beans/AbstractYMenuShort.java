package com.zgld.mall.beans;

/**
 * AbstractYMenuShort entity provides the base persistence definition of the
 * YMenuShort entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMenuShort implements java.io.Serializable {

	// Fields

	private Integer meShortId;
	private Integer meId;
	private Integer accountId;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public AbstractYMenuShort() {
	}

	/** full constructor */
	public AbstractYMenuShort(Integer meId, Integer accountId, Integer isDelete) {
		this.meId = meId;
		this.accountId = accountId;
		this.isDelete = isDelete;
	}

	// Property accessors

	public Integer getMeShortId() {
		return this.meShortId;
	}

	public void setMeShortId(Integer meShortId) {
		this.meShortId = meShortId;
	}

	public Integer getMeId() {
		return this.meId;
	}

	public void setMeId(Integer meId) {
		this.meId = meId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}