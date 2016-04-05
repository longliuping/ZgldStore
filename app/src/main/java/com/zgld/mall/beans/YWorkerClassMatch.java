package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YWorkerClassMatch entity. @author MyEclipse Persistence Tools
 */
public class YWorkerClassMatch extends AbstractYWorkerClassMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YWorkerClassMatch() {
	}

	/** minimal constructor */
	public YWorkerClassMatch(String workerClassMatchTime) {
		super(workerClassMatchTime);
	}

	/** full constructor */
	public YWorkerClassMatch(Integer workerClassSetId, Integer unitSetId, String workerClassMatchTime) {
		super(workerClassSetId, unitSetId, workerClassMatchTime);
	}

}
