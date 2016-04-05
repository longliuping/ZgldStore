package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YNoticeMatchAccount entity. @author MyEclipse Persistence Tools
 */
public class YNoticeMatchAccount extends AbstractYNoticeMatchAccount implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YNoticeMatchAccount() {
	}

	/** minimal constructor */
	public YNoticeMatchAccount(String noticeMatchTime) {
		super(noticeMatchTime);
	}

	/** full constructor */
	public YNoticeMatchAccount(Integer noId, Integer accountId, Integer noMatchState, Integer isDelete, String noticeMatchTime) {
		super(noId, accountId, noMatchState, isDelete, noticeMatchTime);
	}

}
