package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YAdminGroup entity. @author MyEclipse Persistence Tools
 */
public class YAdminGroup extends AbstractYAdminGroup implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YAdminGroup() {
	}

	/** minimal constructor */
	public YAdminGroup(String adminGroupTime) {
		super(adminGroupTime);
	}

	/** full constructor */
	public YAdminGroup(Integer adminParentGroupId, Integer adminGroupSetId, String adminGroupName, Integer accountActId, Integer isDelete, String adminGroupTime) {
		super(adminParentGroupId, adminGroupSetId, adminGroupName, accountActId, isDelete, adminGroupTime);
	}

}
