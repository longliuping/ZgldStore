package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYRightsMatch entity provides the base persistence definition of the
 * YRightsMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYRightsMatch implements java.io.Serializable {

	// Fields

	private Integer rightsMatchId;
	private Integer riSetId;
	private Integer accountId;
	private Integer accountActId;
	private Integer isDelete;
	private String rightsMatchTime;

	// Constructors

	/** default constructor */
	public AbstractYRightsMatch() {
	}

	/** minimal constructor */
	public AbstractYRightsMatch(String rightsMatchTime) {
		this.rightsMatchTime = rightsMatchTime;
	}

	/** full constructor */
	public AbstractYRightsMatch(Integer riSetId, Integer accountId, Integer accountActId, Integer isDelete, String rightsMatchTime) {
		this.riSetId = riSetId;
		this.accountId = accountId;
		this.accountActId = accountActId;
		this.isDelete = isDelete;
		this.rightsMatchTime = rightsMatchTime;
	}

	// Property accessors

	public Integer getRightsMatchId() {
		return this.rightsMatchId;
	}

	public void setRightsMatchId(Integer rightsMatchId) {
		this.rightsMatchId = rightsMatchId;
	}

	public Integer getRiSetId() {
		return this.riSetId;
	}

	public void setRiSetId(Integer riSetId) {
		this.riSetId = riSetId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	public String getRightsMatchTime() {
		return this.rightsMatchTime;
	}

	public void setRightsMatchTime(String rightsMatchTime) {
		this.rightsMatchTime = rightsMatchTime;
	}

}