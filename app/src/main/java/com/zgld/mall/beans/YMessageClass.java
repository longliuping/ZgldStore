package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YMessageClass entity. @author MyEclipse Persistence Tools
 */
public class YMessageClass extends AbstractYMessageClass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YMessageClass() {
	}

	/** minimal constructor */
	public YMessageClass(String msgClassTime) {
		super(msgClassTime);
	}

	/** full constructor */
	public YMessageClass(Integer unitSetId, Integer accountActId, Integer msgClassSetId, Integer msgParentClassId, String msgClassName, Integer msgClassTotal, Integer msgClassOrder, Integer msgClassTopOrder, String msgClassDefaultImg, String msgClassHoverImg, String msgClassVisitedImg, String msgClassIntro, Integer isDelete, String msgClassTime) {
		super(unitSetId, accountActId, msgClassSetId, msgParentClassId, msgClassName, msgClassTotal, msgClassOrder, msgClassTopOrder, msgClassDefaultImg, msgClassHoverImg, msgClassVisitedImg, msgClassIntro, isDelete, msgClassTime);
	}

}
