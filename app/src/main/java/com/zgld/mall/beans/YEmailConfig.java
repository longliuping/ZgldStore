package com.zgld.mall.beans;

/**
 * YEmailConfig entity. @author MyEclipse Persistence Tools
 */
public class YEmailConfig extends AbstractYEmailConfig implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YEmailConfig() {
	}

	/** minimal constructor */
	public YEmailConfig(String emailConRegContent) {
		super(emailConRegContent);
	}

	/** full constructor */
	public YEmailConfig(String emailConHost, String emailConPort, String emailConEmail, String emailConUser, String emailConPassword, String emailConSender, String emailConRegTitle, String emailConRegContent) {
		super(emailConHost, emailConPort, emailConEmail, emailConUser, emailConPassword, emailConSender, emailConRegTitle, emailConRegContent);
	}

}
