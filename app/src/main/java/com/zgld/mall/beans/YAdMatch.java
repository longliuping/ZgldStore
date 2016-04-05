package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YAdMatch entity. @author MyEclipse Persistence Tools
 */
public class YAdMatch extends AbstractYAdMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YAdMatch() {
	}

	/** minimal constructor */
	public YAdMatch(String adMatchTime) {
		super(adMatchTime);
	}

	/** full constructor */
	public YAdMatch(Integer adId, Integer adPositionSetId, Integer isDelete, String adMatchTime) {
		super(adId, adPositionSetId, isDelete, adMatchTime);
	}

}
