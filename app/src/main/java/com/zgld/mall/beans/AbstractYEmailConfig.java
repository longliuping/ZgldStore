package com.zgld.mall.beans;

/**
 * AbstractYEmailConfig entity provides the base persistence definition of the
 * YEmailConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYEmailConfig implements java.io.Serializable {

	// Fields

	private Integer emailConId;
	private String emailConHost;
	private String emailConPort;
	private String emailConEmail;
	private String emailConUser;
	private String emailConPassword;
	private String emailConSender;
	private String emailConRegTitle;
	private String emailConRegContent;

	// Constructors

	/** default constructor */
	public AbstractYEmailConfig() {
	}

	/** minimal constructor */
	public AbstractYEmailConfig(String emailConRegContent) {
		this.emailConRegContent = emailConRegContent;
	}

	/** full constructor */
	public AbstractYEmailConfig(String emailConHost, String emailConPort, String emailConEmail, String emailConUser, String emailConPassword, String emailConSender, String emailConRegTitle, String emailConRegContent) {
		this.emailConHost = emailConHost;
		this.emailConPort = emailConPort;
		this.emailConEmail = emailConEmail;
		this.emailConUser = emailConUser;
		this.emailConPassword = emailConPassword;
		this.emailConSender = emailConSender;
		this.emailConRegTitle = emailConRegTitle;
		this.emailConRegContent = emailConRegContent;
	}

	// Property accessors

	public Integer getEmailConId() {
		return this.emailConId;
	}

	public void setEmailConId(Integer emailConId) {
		this.emailConId = emailConId;
	}

	public String getEmailConHost() {
		return this.emailConHost;
	}

	public void setEmailConHost(String emailConHost) {
		this.emailConHost = emailConHost;
	}

	public String getEmailConPort() {
		return this.emailConPort;
	}

	public void setEmailConPort(String emailConPort) {
		this.emailConPort = emailConPort;
	}

	public String getEmailConEmail() {
		return this.emailConEmail;
	}

	public void setEmailConEmail(String emailConEmail) {
		this.emailConEmail = emailConEmail;
	}

	public String getEmailConUser() {
		return this.emailConUser;
	}

	public void setEmailConUser(String emailConUser) {
		this.emailConUser = emailConUser;
	}

	public String getEmailConPassword() {
		return this.emailConPassword;
	}

	public void setEmailConPassword(String emailConPassword) {
		this.emailConPassword = emailConPassword;
	}

	public String getEmailConSender() {
		return this.emailConSender;
	}

	public void setEmailConSender(String emailConSender) {
		this.emailConSender = emailConSender;
	}

	public String getEmailConRegTitle() {
		return this.emailConRegTitle;
	}

	public void setEmailConRegTitle(String emailConRegTitle) {
		this.emailConRegTitle = emailConRegTitle;
	}

	public String getEmailConRegContent() {
		return this.emailConRegContent;
	}

	public void setEmailConRegContent(String emailConRegContent) {
		this.emailConRegContent = emailConRegContent;
	}

}