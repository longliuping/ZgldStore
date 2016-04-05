package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYSmsSendMatch entity provides the base persistence definition of the
 * YSmsSendMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYSmsSendMatch implements java.io.Serializable {

	// Fields

	private Integer smsSendMatchId;
	private Integer accountId;
	private Integer smsSendId;
	private Integer isScan;
	private Integer isDelete;
	private String smsScanTime;

	// Constructors

	/** default constructor */
	public AbstractYSmsSendMatch() {
	}

	/** minimal constructor */
	public AbstractYSmsSendMatch(String smsScanTime) {
		this.smsScanTime = smsScanTime;
	}

	/** full constructor */
	public AbstractYSmsSendMatch(Integer accountId, Integer smsSendId, Integer isScan, Integer isDelete, String smsScanTime) {
		this.accountId = accountId;
		this.smsSendId = smsSendId;
		this.isScan = isScan;
		this.isDelete = isDelete;
		this.smsScanTime = smsScanTime;
	}

	// Property accessors

	public Integer getSmsSendMatchId() {
		return this.smsSendMatchId;
	}

	public void setSmsSendMatchId(Integer smsSendMatchId) {
		this.smsSendMatchId = smsSendMatchId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getSmsSendId() {
		return this.smsSendId;
	}

	public void setSmsSendId(Integer smsSendId) {
		this.smsSendId = smsSendId;
	}

	public Integer getIsScan() {
		return this.isScan;
	}

	public void setIsScan(Integer isScan) {
		this.isScan = isScan;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getSmsScanTime() {
		return this.smsScanTime;
	}

	public void setSmsScanTime(String smsScanTime) {
		this.smsScanTime = smsScanTime;
	}

}