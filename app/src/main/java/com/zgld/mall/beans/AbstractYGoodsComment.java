package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGoodsComment entity provides the base persistence definition of the
 * YGoodsComment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoodsComment implements java.io.Serializable {

	// Fields

	private Integer goCommentId;
	private Integer goId;
	private Integer goCommentType;
	private String goCommentContent;
	private Integer goCommentState;
	private Integer accountActId;
	private Integer accountId;
	private String goReplyContent;
	private String goCommentTime;

	// Constructors

	/** default constructor */
	public AbstractYGoodsComment() {
	}

	/** minimal constructor */
	public AbstractYGoodsComment(String goCommentTime) {
		this.goCommentTime = goCommentTime;
	}

	/** full constructor */
	public AbstractYGoodsComment(Integer goId, Integer goCommentType, String goCommentContent, Integer goCommentState, Integer accountActId, Integer accountId, String goReplyContent, String goCommentTime) {
		this.goId = goId;
		this.goCommentType = goCommentType;
		this.goCommentContent = goCommentContent;
		this.goCommentState = goCommentState;
		this.accountActId = accountActId;
		this.accountId = accountId;
		this.goReplyContent = goReplyContent;
		this.goCommentTime = goCommentTime;
	}

	// Property accessors

	public Integer getGoCommentId() {
		return this.goCommentId;
	}

	public void setGoCommentId(Integer goCommentId) {
		this.goCommentId = goCommentId;
	}

	public Integer getGoId() {
		return this.goId;
	}

	public void setGoId(Integer goId) {
		this.goId = goId;
	}

	public Integer getGoCommentType() {
		return this.goCommentType;
	}

	public void setGoCommentType(Integer goCommentType) {
		this.goCommentType = goCommentType;
	}

	public String getGoCommentContent() {
		return this.goCommentContent;
	}

	public void setGoCommentContent(String goCommentContent) {
		this.goCommentContent = goCommentContent;
	}

	public Integer getGoCommentState() {
		return this.goCommentState;
	}

	public void setGoCommentState(Integer goCommentState) {
		this.goCommentState = goCommentState;
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

	public String getGoReplyContent() {
		return this.goReplyContent;
	}

	public void setGoReplyContent(String goReplyContent) {
		this.goReplyContent = goReplyContent;
	}

	public String getGoCommentTime() {
		return this.goCommentTime;
	}

	public void setGoCommentTime(String goCommentTime) {
		this.goCommentTime = goCommentTime;
	}

}