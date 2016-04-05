package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YLinksClass entity. @author MyEclipse Persistence Tools
 */
public class YLinksClass extends AbstractYLinksClass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YLinksClass() {
	}

	/** minimal constructor */
	public YLinksClass(String liClassTime) {
		super(liClassTime);
	}

	/** full constructor */
	public YLinksClass(Integer liParentClassId, Integer liClassSetId, String liClassName, Integer liClassTotal, Integer unitSetId, Integer accountActId, Integer liClassOrder, Integer liClassTopOrder, Integer isDelete, String liClassTime) {
		super(liParentClassId, liClassSetId, liClassName, liClassTotal, unitSetId, accountActId, liClassOrder, liClassTopOrder, isDelete, liClassTime);
	}

}
