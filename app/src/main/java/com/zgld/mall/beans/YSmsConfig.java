package com.zgld.mall.beans;

/**
 * YSmsConfig entity. @author MyEclipse Persistence Tools
 */
public class YSmsConfig extends AbstractYSmsConfig implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YSmsConfig() {
	}

	/** minimal constructor */
	public YSmsConfig(String smsConRegContent) {
		super(smsConRegContent);
	}

	/** full constructor */
	public YSmsConfig(String smsConHost, String smsConPort, String smsConUser, String smsConPassword, String smsConSender, String smsConRegTitle, String smsConRegContent) {
		super(smsConHost, smsConPort, smsConUser, smsConPassword, smsConSender, smsConRegTitle, smsConRegContent);
	}

}
