package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YSmsSend entity. @author MyEclipse Persistence Tools
 */
public class YSmsSend extends AbstractYSmsSend implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YSmsSend() {
	}

	/** minimal constructor */
	public YSmsSend(String smsSendTime) {
		super(smsSendTime);
	}

	/** full constructor */
	public YSmsSend(Integer accountActId, Integer unitSetId, Integer smsSendType, String smsSendTitle, String smsSendContent, Integer smsOrder, Integer smsTopOrder, Integer isDelete, String smsSendTime) {
		super(accountActId, unitSetId, smsSendType, smsSendTitle, smsSendContent, smsOrder, smsTopOrder, isDelete, smsSendTime);
	}

}
