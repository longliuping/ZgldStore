package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YMenuMatch entity. @author MyEclipse Persistence Tools
 */
public class YMenuMatch extends AbstractYMenuMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMenuMatch() {
	}

	/** minimal constructor */
	public YMenuMatch(String menuMatchTime) {
		super(menuMatchTime);
	}

	/** full constructor */
	public YMenuMatch(Integer meId, Integer accountId, Integer accountActId, Integer isDelete, String menuMatchTime) {
		super(meId, accountId, accountActId, isDelete, menuMatchTime);
	}

}
