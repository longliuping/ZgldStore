package com.zgld.mall.beans;

/**
 * UserRanks entity. @author MyEclipse Persistence Tools
 */
public class UserRanks extends AbstractUserRanks implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserRanks() {
	}

	/** full constructor */
	public UserRanks(Integer userId, String name, String description, Integer point, Integer numberOfMemberRanks) {
		super(userId, name, description, point, numberOfMemberRanks);
	}

}
