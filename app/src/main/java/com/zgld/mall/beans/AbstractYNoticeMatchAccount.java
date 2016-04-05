package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYNoticeMatchAccount entity provides the base persistence definition
 * of the YNoticeMatchAccount entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYNoticeMatchAccount implements java.io.Serializable {

	// Fields

	private Integer noMatchId;
	private Integer noId;
	private Integer accountId;
	private Integer noMatchState;
	private Integer isDelete;
	private String noticeMatchTime;

	// Constructors

	/** default constructor */
	public AbstractYNoticeMatchAccount() {
	}

	/** minimal constructor */
	public AbstractYNoticeMatchAccount(String noticeMatchTime) {
		this.noticeMatchTime = noticeMatchTime;
	}

	/** full constructor */
	public AbstractYNoticeMatchAccount(Integer noId, Integer accountId, Integer noMatchState, Integer isDelete, String noticeMatchTime) {
		this.noId = noId;
		this.accountId = accountId;
		this.noMatchState = noMatchState;
		this.isDelete = isDelete;
		this.noticeMatchTime = noticeMatchTime;
	}

	// Property accessors

	public Integer getNoMatchId() {
		return this.noMatchId;
	}

	public void setNoMatchId(Integer noMatchId) {
		this.noMatchId = noMatchId;
	}

	public Integer getNoId() {
		return this.noId;
	}

	public void setNoId(Integer noId) {
		this.noId = noId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getNoMatchState() {
		return this.noMatchState;
	}

	public void setNoMatchState(Integer noMatchState) {
		this.noMatchState = noMatchState;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getNoticeMatchTime() {
		return this.noticeMatchTime;
	}

	public void setNoticeMatchTime(String noticeMatchTime) {
		this.noticeMatchTime = noticeMatchTime;
	}

}