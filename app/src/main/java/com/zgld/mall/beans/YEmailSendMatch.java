package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YEmailSendMatch entity. @author MyEclipse Persistence Tools
 */
public class YEmailSendMatch extends AbstractYEmailSendMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YEmailSendMatch() {
	}

	/** minimal constructor */
	public YEmailSendMatch(String emailScanTime) {
		super(emailScanTime);
	}

	/** full constructor */
	public YEmailSendMatch(Integer accountId, Integer emailSendId, Integer isScan, Integer isDelete, String emailScanTime) {
		super(accountId, emailSendId, isScan, isDelete, emailScanTime);
	}

}
