package com.zgld.mall.beans;

/**
 * YRightsRoleMatch entity. @author MyEclipse Persistence Tools
 */
public class YRightsRoleMatch extends AbstractYRightsRoleMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YRightsRoleMatch() {
	}

	/** minimal constructor */
	public YRightsRoleMatch(Integer accountActId) {
		super(accountActId);
	}

	/** full constructor */
	public YRightsRoleMatch(Integer riSetId, Integer roleSetId, Integer accountActId) {
		super(riSetId, roleSetId, accountActId);
	}

}
