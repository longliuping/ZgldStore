package com.zgld.mall.beans;

/**
 * YWxpayConfig entity. @author MyEclipse Persistence Tools
 */
public class YWxpayConfig extends AbstractYWxpayConfig implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YWxpayConfig() {
	}

	/** full constructor */
	public YWxpayConfig(String appId, String mchId, String mchKey, String appSecret, String sslcertPath, String sslcertPassword, String ip, String proxyUrl, String notifyUrl, Integer reportLevel, Integer logLevel) {
		super(appId, mchId, mchKey, appSecret, sslcertPath, sslcertPassword, ip, proxyUrl, notifyUrl, reportLevel, logLevel);
	}

}
