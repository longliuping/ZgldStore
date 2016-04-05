package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YArticleClass entity. @author MyEclipse Persistence Tools
 */
public class YArticleClass extends AbstractYArticleClass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticleClass() {
	}

	/** minimal constructor */
	public YArticleClass(String arClassTime) {
		super(arClassTime);
	}

	/** full constructor */
	public YArticleClass(Integer unitSetId, Integer accountActId, Integer arClassSetId, Integer arParentClassId, String arClassName, Integer arClassTotal, Integer arClassOrder, Integer arClassTopOrder, String arClassDefaultImg, String arClassHoverImg, String arClassVisitedImg, String arClassIntro, Integer isDelete, String arClassTime) {
		super(unitSetId, accountActId, arClassSetId, arParentClassId, arClassName, arClassTotal, arClassOrder, arClassTopOrder, arClassDefaultImg, arClassHoverImg, arClassVisitedImg, arClassIntro, isDelete, arClassTime);
	}

}
