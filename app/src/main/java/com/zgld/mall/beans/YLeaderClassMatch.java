package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YLeaderClassMatch entity. @author MyEclipse Persistence Tools
 */
public class YLeaderClassMatch extends AbstractYLeaderClassMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YLeaderClassMatch() {
	}

	/** minimal constructor */
	public YLeaderClassMatch(String leaderClassMatchTime) {
		super(leaderClassMatchTime);
	}

	/** full constructor */
	public YLeaderClassMatch(Integer leaderClassSetId, Integer unitSetId, String leaderClassMatchTime) {
		super(leaderClassSetId, unitSetId, leaderClassMatchTime);
	}

}
