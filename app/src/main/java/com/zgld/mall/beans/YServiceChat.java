package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YServiceChat entity. @author MyEclipse Persistence Tools
 */
public class YServiceChat extends AbstractYServiceChat implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YServiceChat() {
	}

	/** minimal constructor */
	public YServiceChat(String chatTime) {
		super(chatTime);
	}

	/** full constructor */
	public YServiceChat(Integer accountId, String connectionId, String chatInfo, Integer isDelete, String chatTime) {
		super(accountId, connectionId, chatInfo, isDelete, chatTime);
	}

}
