package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YSmsSendMatch entity. @author MyEclipse Persistence Tools
 */
public class YSmsSendMatch extends AbstractYSmsSendMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YSmsSendMatch() {
	}

	/** minimal constructor */
	public YSmsSendMatch(String smsScanTime) {
		super(smsScanTime);
	}

	/** full constructor */
	public YSmsSendMatch(Integer accountId, Integer smsSendId, Integer isScan, Integer isDelete, String smsScanTime) {
		super(accountId, smsSendId, isScan, isDelete, smsScanTime);
	}

}
