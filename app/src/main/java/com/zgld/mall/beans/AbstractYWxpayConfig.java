package com.zgld.mall.beans;

/**
 * AbstractYWxpayConfig entity provides the base persistence definition of the
 * YWxpayConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYWxpayConfig implements java.io.Serializable {

	// Fields

	private Integer wxpayConId;
	private String appId;
	private String mchId;
	private String mchKey;
	private String appSecret;
	private String sslcertPath;
	private String sslcertPassword;
	private String ip;
	private String proxyUrl;
	private String notifyUrl;
	private Integer reportLevel;
	private Integer logLevel;

	// Constructors

	/** default constructor */
	public AbstractYWxpayConfig() {
	}

	/** full constructor */
	public AbstractYWxpayConfig(String appId, String mchId, String mchKey, String appSecret, String sslcertPath, String sslcertPassword, String ip, String proxyUrl, String notifyUrl, Integer reportLevel, Integer logLevel) {
		this.appId = appId;
		this.mchId = mchId;
		this.mchKey = mchKey;
		this.appSecret = appSecret;
		this.sslcertPath = sslcertPath;
		this.sslcertPassword = sslcertPassword;
		this.ip = ip;
		this.proxyUrl = proxyUrl;
		this.notifyUrl = notifyUrl;
		this.reportLevel = reportLevel;
		this.logLevel = logLevel;
	}

	// Property accessors

	public Integer getWxpayConId() {
		return this.wxpayConId;
	}

	public void setWxpayConId(Integer wxpayConId) {
		this.wxpayConId = wxpayConId;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMchId() {
		return this.mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getMchKey() {
		return this.mchKey;
	}

	public void setMchKey(String mchKey) {
		this.mchKey = mchKey;
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public String getSslcertPath() {
		return this.sslcertPath;
	}

	public void setSslcertPath(String sslcertPath) {
		this.sslcertPath = sslcertPath;
	}

	public String getSslcertPassword() {
		return this.sslcertPassword;
	}

	public void setSslcertPassword(String sslcertPassword) {
		this.sslcertPassword = sslcertPassword;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getProxyUrl() {
		return this.proxyUrl;
	}

	public void setProxyUrl(String proxyUrl) {
		this.proxyUrl = proxyUrl;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public Integer getReportLevel() {
		return this.reportLevel;
	}

	public void setReportLevel(Integer reportLevel) {
		this.reportLevel = reportLevel;
	}

	public Integer getLogLevel() {
		return this.logLevel;
	}

	public void setLogLevel(Integer logLevel) {
		this.logLevel = logLevel;
	}

}