package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YFriendChat entity. @author MyEclipse Persistence Tools
 */
public class YFriendChat extends AbstractYFriendChat implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YFriendChat() {
	}

	/** minimal constructor */
	public YFriendChat(String chatTime) {
		super(chatTime);
	}

	/** full constructor */
	public YFriendChat(Integer friendId, Integer accountActId, String chatInfo, Integer isDelete, String chatTime) {
		super(friendId, accountActId, chatInfo, isDelete, chatTime);
	}

}
