package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYFriend entity provides the base persistence definition of the
 * YFriend entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFriend implements java.io.Serializable {

	// Fields

	private Integer friendId;
	private Integer accountActId;
	private Integer accountId;
	private String friendName;
	private Integer friendState;
	private Integer friendOrder;
	private Integer friendTopOrder;
	private Integer isDelete;
	private String friendTime;

	// Constructors

	/** default constructor */
	public AbstractYFriend() {
	}

	/** minimal constructor */
	public AbstractYFriend(String friendTime) {
		this.friendTime = friendTime;
	}

	/** full constructor */
	public AbstractYFriend(Integer accountActId, Integer accountId, String friendName, Integer friendState, Integer friendOrder, Integer friendTopOrder, Integer isDelete, String friendTime) {
		this.accountActId = accountActId;
		this.accountId = accountId;
		this.friendName = friendName;
		this.friendState = friendState;
		this.friendOrder = friendOrder;
		this.friendTopOrder = friendTopOrder;
		this.isDelete = isDelete;
		this.friendTime = friendTime;
	}

	// Property accessors

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

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getFriendName() {
		return this.friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public Integer getFriendState() {
		return this.friendState;
	}

	public void setFriendState(Integer friendState) {
		this.friendState = friendState;
	}

	public Integer getFriendOrder() {
		return this.friendOrder;
	}

	public void setFriendOrder(Integer friendOrder) {
		this.friendOrder = friendOrder;
	}

	public Integer getFriendTopOrder() {
		return this.friendTopOrder;
	}

	public void setFriendTopOrder(Integer friendTopOrder) {
		this.friendTopOrder = friendTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getFriendTime() {
		return this.friendTime;
	}

	public void setFriendTime(String friendTime) {
		this.friendTime = friendTime;
	}

}