package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYLeader entity provides the base persistence definition of the
 * YLeader entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYLeader implements java.io.Serializable {

	// Fields

	private Integer leaderId;
	private Integer leaderClassSetId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer accountId;
	private String leaderTitle;
	private String accountRealName;
	private String accountName;
	private String accountPassword;
	private String leaderIntro;
	private Integer leaderOrder;
	private Integer leaderTopOrder;
	private Integer isDelete;
	private String leaderTime;

	// Constructors

	/** default constructor */
	public AbstractYLeader() {
	}

	/** minimal constructor */
	public AbstractYLeader(String leaderTime) {
		this.leaderTime = leaderTime;
	}

	/** full constructor */
	public AbstractYLeader(Integer leaderClassSetId, Integer unitSetId, Integer accountActId, Integer accountId, String leaderTitle, String accountRealName, String accountName, String accountPassword, String leaderIntro, Integer leaderOrder, Integer leaderTopOrder, Integer isDelete, String leaderTime) {
		this.leaderClassSetId = leaderClassSetId;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.accountId = accountId;
		this.leaderTitle = leaderTitle;
		this.accountRealName = accountRealName;
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.leaderIntro = leaderIntro;
		this.leaderOrder = leaderOrder;
		this.leaderTopOrder = leaderTopOrder;
		this.isDelete = isDelete;
		this.leaderTime = leaderTime;
	}

	// Property accessors

	public Integer getLeaderId() {
		return this.leaderId;
	}

	public void setLeaderId(Integer leaderId) {
		this.leaderId = leaderId;
	}

	public Integer getLeaderClassSetId() {
		return this.leaderClassSetId;
	}

	public void setLeaderClassSetId(Integer leaderClassSetId) {
		this.leaderClassSetId = leaderClassSetId;
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

	public String getLeaderTitle() {
		return this.leaderTitle;
	}

	public void setLeaderTitle(String leaderTitle) {
		this.leaderTitle = leaderTitle;
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

	public String getLeaderIntro() {
		return this.leaderIntro;
	}

	public void setLeaderIntro(String leaderIntro) {
		this.leaderIntro = leaderIntro;
	}

	public Integer getLeaderOrder() {
		return this.leaderOrder;
	}

	public void setLeaderOrder(Integer leaderOrder) {
		this.leaderOrder = leaderOrder;
	}

	public Integer getLeaderTopOrder() {
		return this.leaderTopOrder;
	}

	public void setLeaderTopOrder(Integer leaderTopOrder) {
		this.leaderTopOrder = leaderTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getLeaderTime() {
		return this.leaderTime;
	}

	public void setLeaderTime(String leaderTime) {
		this.leaderTime = leaderTime;
	}

}