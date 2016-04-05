package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YWorkerClass entity. @author MyEclipse Persistence Tools
 */
public class YWorkerClass extends AbstractYWorkerClass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YWorkerClass() {
	}

	/** minimal constructor */
	public YWorkerClass(String workerClassTime) {
		super(workerClassTime);
	}

	/** full constructor */
	public YWorkerClass(Integer unitSetId, Integer accountActId, Integer workerParentClassId, Integer workerClassSetId, String workerClassName, Integer workerClassOrder, Integer workerClassTopOrder, Integer isDelete, String workerClassTime) {
		super(unitSetId, accountActId, workerParentClassId, workerClassSetId, workerClassName, workerClassOrder, workerClassTopOrder, isDelete, workerClassTime);
	}

}
