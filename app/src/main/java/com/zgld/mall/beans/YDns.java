package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YDns entity. @author MyEclipse Persistence Tools
 */
public class YDns extends AbstractYDns implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YDns() {
	}

	/** minimal constructor */
	public YDns(String dnsTime) {
		super(dnsTime);
	}

	/** full constructor */
	public YDns(Integer accountActId, Integer unitSetId, Integer dnsType, String dnsName, Integer isState, Integer isDelete, String dnsTime) {
		super(accountActId, unitSetId, dnsType, dnsName, isState, isDelete, dnsTime);
	}

}
