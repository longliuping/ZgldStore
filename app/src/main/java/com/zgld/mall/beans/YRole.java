package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YRole entity. @author MyEclipse Persistence Tools
 */
public class YRole extends AbstractYRole implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YRole() {
	}

	/** minimal constructor */
	public YRole(String roleTime) {
		super(roleTime);
	}

	/** full constructor */
	public YRole(Integer roleSetId, String roleName, Integer accountActId, Integer isDelete, String roleTime) {
		super(roleSetId, roleName, accountActId, isDelete, roleTime);
	}

}
