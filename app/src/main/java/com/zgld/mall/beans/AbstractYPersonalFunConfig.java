package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYPersonalFunConfig entity provides the base persistence definition of
 * the YPersonalFunConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYPersonalFunConfig implements java.io.Serializable {

	// Fields

	private Integer personalId;
	private Integer unitSetId;
	private Integer accountId;
	private Integer personalIsMessage;
	private Integer personalIsNotice;
	private Integer personalIsComment;
	private Integer personalIsEmail;
	private Integer isDelete;
	private String personalTime;

	// Constructors

	/** default constructor */
	public AbstractYPersonalFunConfig() {
	}

	/** minimal constructor */
	public AbstractYPersonalFunConfig(String personalTime) {
		this.personalTime = personalTime;
	}

	/** full constructor */
	public AbstractYPersonalFunConfig(Integer unitSetId, Integer accountId, Integer personalIsMessage, Integer personalIsNotice, Integer personalIsComment, Integer personalIsEmail, Integer isDelete, String personalTime) {
		this.unitSetId = unitSetId;
		this.accountId = accountId;
		this.personalIsMessage = personalIsMessage;
		this.personalIsNotice = personalIsNotice;
		this.personalIsComment = personalIsComment;
		this.personalIsEmail = personalIsEmail;
		this.isDelete = isDelete;
		this.personalTime = personalTime;
	}

	// Property accessors

	public Integer getPersonalId() {
		return this.personalId;
	}

	public void setPersonalId(Integer personalId) {
		this.personalId = personalId;
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

	public Integer getPersonalIsMessage() {
		return this.personalIsMessage;
	}

	public void setPersonalIsMessage(Integer personalIsMessage) {
		this.personalIsMessage = personalIsMessage;
	}

	public Integer getPersonalIsNotice() {
		return this.personalIsNotice;
	}

	public void setPersonalIsNotice(Integer personalIsNotice) {
		this.personalIsNotice = personalIsNotice;
	}

	public Integer getPersonalIsComment() {
		return this.personalIsComment;
	}

	public void setPersonalIsComment(Integer personalIsComment) {
		this.personalIsComment = personalIsComment;
	}

	public Integer getPersonalIsEmail() {
		return this.personalIsEmail;
	}

	public void setPersonalIsEmail(Integer personalIsEmail) {
		this.personalIsEmail = personalIsEmail;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getPersonalTime() {
		return this.personalTime;
	}

	public void setPersonalTime(String personalTime) {
		this.personalTime = personalTime;
	}

}