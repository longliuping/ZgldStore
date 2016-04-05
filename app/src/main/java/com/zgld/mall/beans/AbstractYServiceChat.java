package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYServiceChat entity provides the base persistence definition of the
 * YServiceChat entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYServiceChat implements java.io.Serializable {

	// Fields

	private Integer chatId;
	private Integer accountId;
	private String connectionId;
	private String chatInfo;
	private Integer isDelete;
	private String chatTime;

	// Constructors

	/** default constructor */
	public AbstractYServiceChat() {
	}

	/** minimal constructor */
	public AbstractYServiceChat(String chatTime) {
		this.chatTime = chatTime;
	}

	/** full constructor */
	public AbstractYServiceChat(Integer accountId, String connectionId, String chatInfo, Integer isDelete, String chatTime) {
		this.accountId = accountId;
		this.connectionId = connectionId;
		this.chatInfo = chatInfo;
		this.isDelete = isDelete;
		this.chatTime = chatTime;
	}

	// Property accessors

	public Integer getChatId() {
		return this.chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getConnectionId() {
		return this.connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}

	public String getChatInfo() {
		return this.chatInfo;
	}

	public void setChatInfo(String chatInfo) {
		this.chatInfo = chatInfo;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getChatTime() {
		return this.chatTime;
	}

	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}

}