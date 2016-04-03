package com.zgld.mall.beans;

/**
 * AspnetUsersInRolesId entity. @author MyEclipse Persistence Tools
 */
public class AspnetUsersInRolesId extends AbstractAspnetUsersInRolesId
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetUsersInRolesId() {
	}

	/** full constructor */
	public AspnetUsersInRolesId(AspnetUsers aspnetUsers, AspnetRoles aspnetRoles) {
		super(aspnetUsers, aspnetRoles);
	}

}
