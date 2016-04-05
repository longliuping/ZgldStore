package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGroupChat entity provides the base persistence definition of the
 * YGroupChat entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGroupChat implements java.io.Serializable {

	// Fields

	private Integer chatId;
	private Integer chatGroupId;
	private Integer accountActId;
	private String chatGroupInfo;
	private Integer isDelete;
	private String chatGoupTime;

	// Constructors

	/** default constructor */
	public AbstractYGroupChat() {
	}

	/** minimal constructor */
	public AbstractYGroupChat(String chatGoupTime) {
		this.chatGoupTime = chatGoupTime;
	}

	/** full constructor */
	public AbstractYGroupChat(Integer chatGroupId, Integer accountActId, String chatGroupInfo, Integer isDelete, String chatGoupTime) {
		this.chatGroupId = chatGroupId;
		this.accountActId = accountActId;
		this.chatGroupInfo = chatGroupInfo;
		this.isDelete = isDelete;
		this.chatGoupTime = chatGoupTime;
	}

	// Property accessors

	public Integer getChatId() {
		return this.chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public Integer getChatGroupId() {
		return this.chatGroupId;
	}

	public void setChatGroupId(Integer chatGroupId) {
		this.chatGroupId = chatGroupId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public String getChatGroupInfo() {
		return this.chatGroupInfo;
	}

	public void setChatGroupInfo(String chatGroupInfo) {
		this.chatGroupInfo = chatGroupInfo;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getChatGoupTime() {
		return this.chatGoupTime;
	}

	public void setChatGoupTime(String chatGoupTime) {
		this.chatGoupTime = chatGoupTime;
	}

}