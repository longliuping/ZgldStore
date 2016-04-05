package com.zgld.mall.beans;

/**
 * YMenuRoleMatch entity. @author MyEclipse Persistence Tools
 */
public class YMenuRoleMatch extends AbstractYMenuRoleMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMenuRoleMatch() {
	}

	/** minimal constructor */
	public YMenuRoleMatch(Integer accountActId) {
		super(accountActId);
	}

	/** full constructor */
	public YMenuRoleMatch(Integer meId, Integer roleSetId, Integer accountActId) {
		super(meId, roleSetId, accountActId);
	}

}
