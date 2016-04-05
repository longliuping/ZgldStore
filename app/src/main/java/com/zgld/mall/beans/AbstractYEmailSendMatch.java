package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYEmailSendMatch entity provides the base persistence definition of
 * the YEmailSendMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYEmailSendMatch implements java.io.Serializable {

	// Fields

	private Integer emailSendMatchId;
	private Integer accountId;
	private Integer emailSendId;
	private Integer isScan;
	private Integer isDelete;
	private String emailScanTime;

	// Constructors

	/** default constructor */
	public AbstractYEmailSendMatch() {
	}

	/** minimal constructor */
	public AbstractYEmailSendMatch(String emailScanTime) {
		this.emailScanTime = emailScanTime;
	}

	/** full constructor */
	public AbstractYEmailSendMatch(Integer accountId, Integer emailSendId, Integer isScan, Integer isDelete, String emailScanTime) {
		this.accountId = accountId;
		this.emailSendId = emailSendId;
		this.isScan = isScan;
		this.isDelete = isDelete;
		this.emailScanTime = emailScanTime;
	}

	// Property accessors

	public Integer getEmailSendMatchId() {
		return this.emailSendMatchId;
	}

	public void setEmailSendMatchId(Integer emailSendMatchId) {
		this.emailSendMatchId = emailSendMatchId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getEmailSendId() {
		return this.emailSendId;
	}

	public void setEmailSendId(Integer emailSendId) {
		this.emailSendId = emailSendId;
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

	public String getEmailScanTime() {
		return this.emailScanTime;
	}

	public void setEmailScanTime(String emailScanTime) {
		this.emailScanTime = emailScanTime;
	}

}