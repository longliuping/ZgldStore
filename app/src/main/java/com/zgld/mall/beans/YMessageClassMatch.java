package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YMessageClassMatch entity. @author MyEclipse Persistence Tools
 */
public class YMessageClassMatch extends AbstractYMessageClassMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMessageClassMatch() {
	}

	/** minimal constructor */
	public YMessageClassMatch(String msgClassMatchTime) {
		super(msgClassMatchTime);
	}

	/** full constructor */
	public YMessageClassMatch(Integer msgClassSetId, Integer unitSetId, String msgClassMatchTime) {
		super(msgClassSetId, unitSetId, msgClassMatchTime);
	}

}
