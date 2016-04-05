package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYWorker entity provides the base persistence definition of the
 * YWorker entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYWorker implements java.io.Serializable {

	// Fields

	private Integer workerId;
	private Integer workerClassSetId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer accountId;
	private String workerTitle;
	private String accountRealName;
	private String accountName;
	private String accountPassword;
	private String workerIntro;
	private Integer workerOrder;
	private Integer workerTopOrder;
	private Integer isDelete;
	private String workerTime;

	// Constructors

	/** default constructor */
	public AbstractYWorker() {
	}

	/** minimal constructor */
	public AbstractYWorker(String workerTime) {
		this.workerTime = workerTime;
	}

	/** full constructor */
	public AbstractYWorker(Integer workerClassSetId, Integer unitSetId, Integer accountActId, Integer accountId, String workerTitle, String accountRealName, String accountName, String accountPassword, String workerIntro, Integer workerOrder, Integer workerTopOrder, Integer isDelete, String workerTime) {
		this.workerClassSetId = workerClassSetId;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.accountId = accountId;
		this.workerTitle = workerTitle;
		this.accountRealName = accountRealName;
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.workerIntro = workerIntro;
		this.workerOrder = workerOrder;
		this.workerTopOrder = workerTopOrder;
		this.isDelete = isDelete;
		this.workerTime = workerTime;
	}

	// Property accessors

	public Integer getWorkerId() {
		return this.workerId;
	}

	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
	}

	public Integer getWorkerClassSetId() {
		return this.workerClassSetId;
	}

	public void setWorkerClassSetId(Integer workerClassSetId) {
		this.workerClassSetId = workerClassSetId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getWorkerTitle() {
		return this.workerTitle;
	}

	public void setWorkerTitle(String workerTitle) {
		this.workerTitle = workerTitle;
	}

	public String getAccountRealName() {
		return this.accountRealName;
	}

	public void setAccountRealName(String accountRealName) {
		this.accountRealName = accountRealName;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getWorkerIntro() {
		return this.workerIntro;
	}

	public void setWorkerIntro(String workerIntro) {
		this.workerIntro = workerIntro;
	}

	public Integer getWorkerOrder() {
		return this.workerOrder;
	}

	public void setWorkerOrder(Integer workerOrder) {
		this.workerOrder = workerOrder;
	}

	public Integer getWorkerTopOrder() {
		return this.workerTopOrder;
	}

	public void setWorkerTopOrder(Integer workerTopOrder) {
		this.workerTopOrder = workerTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getWorkerTime() {
		return this.workerTime;
	}

	public void setWorkerTime(String workerTime) {
		this.workerTime = workerTime;
	}

}