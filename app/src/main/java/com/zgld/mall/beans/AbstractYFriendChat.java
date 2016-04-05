package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYFriendChat entity provides the base persistence definition of the
 * YFriendChat entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFriendChat implements java.io.Serializable {

	// Fields

	private Integer chatId;
	private Integer friendId;
	private Integer accountActId;
	private String chatInfo;
	private Integer isDelete;
	private String chatTime;

	// Constructors

	/** default constructor */
	public AbstractYFriendChat() {
	}

	/** minimal constructor */
	public AbstractYFriendChat(String chatTime) {
		this.chatTime = chatTime;
	}

	/** full constructor */
	public AbstractYFriendChat(Integer friendId, Integer accountActId, String chatInfo, Integer isDelete, String chatTime) {
		this.friendId = friendId;
		this.accountActId = accountActId;
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

	public Integer getFriendId() {
		return this.friendId;
	}

	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
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