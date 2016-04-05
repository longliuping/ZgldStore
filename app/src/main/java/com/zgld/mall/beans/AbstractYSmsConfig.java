package com.zgld.mall.beans;

/**
 * AbstractYSmsConfig entity provides the base persistence definition of the
 * YSmsConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYSmsConfig implements java.io.Serializable {

	// Fields

	private Integer smsConId;
	private String smsConHost;
	private String smsConPort;
	private String smsConUser;
	private String smsConPassword;
	private String smsConSender;
	private String smsConRegTitle;
	private String smsConRegContent;

	// Constructors

	/** default constructor */
	public AbstractYSmsConfig() {
	}

	/** minimal constructor */
	public AbstractYSmsConfig(String smsConRegContent) {
		this.smsConRegContent = smsConRegContent;
	}

	/** full constructor */
	public AbstractYSmsConfig(String smsConHost, String smsConPort, String smsConUser, String smsConPassword, String smsConSender, String smsConRegTitle, String smsConRegContent) {
		this.smsConHost = smsConHost;
		this.smsConPort = smsConPort;
		this.smsConUser = smsConUser;
		this.smsConPassword = smsConPassword;
		this.smsConSender = smsConSender;
		this.smsConRegTitle = smsConRegTitle;
		this.smsConRegContent = smsConRegContent;
	}

	// Property accessors

	public Integer getSmsConId() {
		return this.smsConId;
	}

	public void setSmsConId(Integer smsConId) {
		this.smsConId = smsConId;
	}

	public String getSmsConHost() {
		return this.smsConHost;
	}

	public void setSmsConHost(String smsConHost) {
		this.smsConHost = smsConHost;
	}

	public String getSmsConPort() {
		return this.smsConPort;
	}

	public void setSmsConPort(String smsConPort) {
		this.smsConPort = smsConPort;
	}

	public String getSmsConUser() {
		return this.smsConUser;
	}

	public void setSmsConUser(String smsConUser) {
		this.smsConUser = smsConUser;
	}

	public String getSmsConPassword() {
		return this.smsConPassword;
	}

	public void setSmsConPassword(String smsConPassword) {
		this.smsConPassword = smsConPassword;
	}

	public String getSmsConSender() {
		return this.smsConSender;
	}

	public void setSmsConSender(String smsConSender) {
		this.smsConSender = smsConSender;
	}

	public String getSmsConRegTitle() {
		return this.smsConRegTitle;
	}

	public void setSmsConRegTitle(String smsConRegTitle) {
		this.smsConRegTitle = smsConRegTitle;
	}

	public String getSmsConRegContent() {
		return this.smsConRegContent;
	}

	public void setSmsConRegContent(String smsConRegContent) {
		this.smsConRegContent = smsConRegContent;
	}

}