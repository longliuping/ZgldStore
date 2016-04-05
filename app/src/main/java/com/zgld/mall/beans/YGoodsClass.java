package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YGoodsClass entity. @author MyEclipse Persistence Tools
 */
public class YGoodsClass extends AbstractYGoodsClass implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YGoodsClass() {
	}

	/** minimal constructor */
	public YGoodsClass(String goClassTime) {
		super(goClassTime);
	}

	/** full constructor */
	public YGoodsClass(Integer goParentClassId, Integer goClassSetId, String goClassName, String goClassIntro, Integer goClassTotal, Integer unitSetId, Integer accountActId, Integer goClassOrder, Integer goClassTopOrder, String goClassDefaultImg, String goClassHoverImg, String goClassVisitedImg, Integer isDelete, String goClassTime) {
		super(goParentClassId, goClassSetId, goClassName, goClassIntro, goClassTotal, unitSetId, accountActId, goClassOrder, goClassTopOrder, goClassDefaultImg, goClassHoverImg, goClassVisitedImg, isDelete, goClassTime);
	}

}
