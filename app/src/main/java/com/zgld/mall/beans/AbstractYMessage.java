package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYMessage entity provides the base persistence definition of the
 * YMessage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMessage implements java.io.Serializable {

	// Fields

	private Integer msgId;
	private Integer msgClassSetId;
	private Integer accountId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer msgState;
	private Integer msgAdminState;
	private Integer msgIsOpen;
	private Integer msgIsNoName;
	private String msgTitle;
	private String msgContent;
	private Integer msgReplyState;
	private Integer msgScanState;
	private String msgTime;
	private String msgReContent;
	private Integer msgOrder;
	private Integer msgTopOrder;
	private Integer isDelete;
	private String msgReTime;

	// Constructors

	/** default constructor */
	public AbstractYMessage() {
	}

	/** minimal constructor */
	public AbstractYMessage(String msgReTime) {
		this.msgReTime = msgReTime;
	}

	/** full constructor */
	public AbstractYMessage(Integer msgClassSetId, Integer accountId, Integer unitSetId, Integer accountActId, Integer msgState, Integer msgAdminState, Integer msgIsOpen, Integer msgIsNoName, String msgTitle, String msgContent, Integer msgReplyState, Integer msgScanState, String msgTime, String msgReContent, Integer msgOrder, Integer msgTopOrder, Integer isDelete, String msgReTime) {
		this.msgClassSetId = msgClassSetId;
		this.accountId = accountId;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.msgState = msgState;
		this.msgAdminState = msgAdminState;
		this.msgIsOpen = msgIsOpen;
		this.msgIsNoName = msgIsNoName;
		this.msgTitle = msgTitle;
		this.msgContent = msgContent;
		this.msgReplyState = msgReplyState;
		this.msgScanState = msgScanState;
		this.msgTime = msgTime;
		this.msgReContent = msgReContent;
		this.msgOrder = msgOrder;
		this.msgTopOrder = msgTopOrder;
		this.isDelete = isDelete;
		this.msgReTime = msgReTime;
	}

	// Property accessors

	public Integer getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public Integer getMsgClassSetId() {
		return this.msgClassSetId;
	}

	public void setMsgClassSetId(Integer msgClassSetId) {
		this.msgClassSetId = msgClassSetId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	public Integer getMsgState() {
		return this.msgState;
	}

	public void setMsgState(Integer msgState) {
		this.msgState = msgState;
	}

	public Integer getMsgAdminState() {
		return this.msgAdminState;
	}

	public void setMsgAdminState(Integer msgAdminState) {
		this.msgAdminState = msgAdminState;
	}

	public Integer getMsgIsOpen() {
		return this.msgIsOpen;
	}

	public void setMsgIsOpen(Integer msgIsOpen) {
		this.msgIsOpen = msgIsOpen;
	}

	public Integer getMsgIsNoName() {
		return this.msgIsNoName;
	}

	public void setMsgIsNoName(Integer msgIsNoName) {
		this.msgIsNoName = msgIsNoName;
	}

	public String getMsgTitle() {
		return this.msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public String getMsgContent() {
		return this.msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Integer getMsgReplyState() {
		return this.msgReplyState;
	}

	public void setMsgReplyState(Integer msgReplyState) {
		this.msgReplyState = msgReplyState;
	}

	public Integer getMsgScanState() {
		return this.msgScanState;
	}

	public void setMsgScanState(Integer msgScanState) {
		this.msgScanState = msgScanState;
	}

	public String getMsgTime() {
		return this.msgTime;
	}

	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgReContent() {
		return this.msgReContent;
	}

	public void setMsgReContent(String msgReContent) {
		this.msgReContent = msgReContent;
	}

	public Integer getMsgOrder() {
		return this.msgOrder;
	}

	public void setMsgOrder(Integer msgOrder) {
		this.msgOrder = msgOrder;
	}

	public Integer getMsgTopOrder() {
		return this.msgTopOrder;
	}

	public void setMsgTopOrder(Integer msgTopOrder) {
		this.msgTopOrder = msgTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getMsgReTime() {
		return this.msgReTime;
	}

	public void setMsgReTime(String msgReTime) {
		this.msgReTime = msgReTime;
	}

}