package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YFriend entity. @author MyEclipse Persistence Tools
 */
public class YFriend extends AbstractYFriend implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFriend() {
	}

	/** minimal constructor */
	public YFriend(String friendTime) {
		super(friendTime);
	}

	/** full constructor */
	public YFriend(Integer accountActId, Integer accountId, String friendName, Integer friendState, Integer friendOrder, Integer friendTopOrder, Integer isDelete, String friendTime) {
		super(accountActId, accountId, friendName, friendState, friendOrder, friendTopOrder, isDelete, friendTime);
	}

}
