package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYUnitMatchAccount entity provides the base persistence definition of
 * the YUnitMatchAccount entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYUnitMatchAccount implements java.io.Serializable {

	// Fields

	private Integer unitMatchId;
	private Integer unitSetId;
	private Integer accountId;
	private Integer unitMatchState;
	private Integer isDelete;
	private String unitMatchTime;

	// Constructors

	/** default constructor */
	public AbstractYUnitMatchAccount() {
	}

	/** minimal constructor */
	public AbstractYUnitMatchAccount(String unitMatchTime) {
		this.unitMatchTime = unitMatchTime;
	}

	/** full constructor */
	public AbstractYUnitMatchAccount(Integer unitSetId, Integer accountId, Integer unitMatchState, Integer isDelete, String unitMatchTime) {
		this.unitSetId = unitSetId;
		this.accountId = accountId;
		this.unitMatchState = unitMatchState;
		this.isDelete = isDelete;
		this.unitMatchTime = unitMatchTime;
	}

	// Property accessors

	public Integer getUnitMatchId() {
		return this.unitMatchId;
	}

	public void setUnitMatchId(Integer unitMatchId) {
		this.unitMatchId = unitMatchId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getUnitMatchState() {
		return this.unitMatchState;
	}

	public void setUnitMatchState(Integer unitMatchState) {
		this.unitMatchState = unitMatchState;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getUnitMatchTime() {
		return this.unitMatchTime;
	}

	public void setUnitMatchTime(String unitMatchTime) {
		this.unitMatchTime = unitMatchTime;
	}

}