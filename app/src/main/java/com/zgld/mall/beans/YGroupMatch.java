package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YGroupMatch entity. @author MyEclipse Persistence Tools
 */
public class YGroupMatch extends AbstractYGroupMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YGroupMatch() {
	}

	/** minimal constructor */
	public YGroupMatch(String matchTime) {
		super(matchTime);
	}

	/** full constructor */
	public YGroupMatch(Integer chatGroupId, Integer accountId, Integer isAdmin, Integer isDelete, String matchTime) {
		super(chatGroupId, accountId, isAdmin, isDelete, matchTime);
	}

}
