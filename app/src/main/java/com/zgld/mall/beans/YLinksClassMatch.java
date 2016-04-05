package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YLinksClassMatch entity. @author MyEclipse Persistence Tools
 */
public class YLinksClassMatch extends AbstractYLinksClassMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YLinksClassMatch() {
	}

	/** minimal constructor */
	public YLinksClassMatch(String liClassMatchTime) {
		super(liClassMatchTime);
	}

	/** full constructor */
	public YLinksClassMatch(Integer liClassSetId, Integer unitSetId, String liClassMatchTime) {
		super(liClassSetId, unitSetId, liClassMatchTime);
	}

}
