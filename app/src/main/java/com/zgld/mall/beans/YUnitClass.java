package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YUnitClass entity. @author MyEclipse Persistence Tools
 */
public class YUnitClass extends AbstractYUnitClass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YUnitClass() {
	}

	/** minimal constructor */
	public YUnitClass(String unitClassTime) {
		super(unitClassTime);
	}

	/** full constructor */
	public YUnitClass(Integer unitClassSetId, Integer unitParentClassId, Integer accountActId, String unitClassName, Integer unitClassTotal, Integer unitClassOrder, Integer unitClassTopOrder, Integer isDelete, String unitClassTime) {
		super(unitClassSetId, unitParentClassId, accountActId, unitClassName, unitClassTotal, unitClassOrder, unitClassTopOrder, isDelete, unitClassTime);
	}

}
