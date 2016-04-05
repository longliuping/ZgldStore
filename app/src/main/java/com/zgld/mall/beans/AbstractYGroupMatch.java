package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGroupMatch entity provides the base persistence definition of the
 * YGroupMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGroupMatch implements java.io.Serializable {

	// Fields

	private Integer matchId;
	private Integer chatGroupId;
	private Integer accountId;
	private Integer isAdmin;
	private Integer isDelete;
	private String matchTime;

	// Constructors

	/** default constructor */
	public AbstractYGroupMatch() {
	}

	/** minimal constructor */
	public AbstractYGroupMatch(String matchTime) {
		this.matchTime = matchTime;
	}

	/** full constructor */
	public AbstractYGroupMatch(Integer chatGroupId, Integer accountId, Integer isAdmin, Integer isDelete, String matchTime) {
		this.chatGroupId = chatGroupId;
		this.accountId = accountId;
		this.isAdmin = isAdmin;
		this.isDelete = isDelete;
		this.matchTime = matchTime;
	}

	// Property accessors

	public Integer getMatchId() {
		return this.matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public Integer getChatGroupId() {
		return this.chatGroupId;
	}

	public void setChatGroupId(Integer chatGroupId) {
		this.chatGroupId = chatGroupId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getMatchTime() {
		return this.matchTime;
	}

	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

}