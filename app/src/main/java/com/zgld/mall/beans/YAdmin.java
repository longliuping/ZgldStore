package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YAdmin entity. @author MyEclipse Persistence Tools
 */
public class YAdmin extends AbstractYAdmin implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YAdmin() {
	}

	/** minimal constructor */
	public YAdmin(String adminTime) {
		super(adminTime);
	}

	/** full constructor */
	public YAdmin(Integer accountId, Integer unitSetId, Integer adminGroupSetId, Integer roleSetId, String adminName, String adminPassword, Integer adminSex, Integer adminState, String adminRealName, String adminEmail, String adminMobile, String adminIntro, String adminIdCard, String adminIdImg, Integer accountActId, Integer isDelete, String adminTime) {
		super(accountId, unitSetId, adminGroupSetId, roleSetId, adminName, adminPassword, adminSex, adminState, adminRealName, adminEmail, adminMobile, adminIntro, adminIdCard, adminIdImg, accountActId, isDelete, adminTime);
	}

}
