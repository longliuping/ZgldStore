package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YUnit entity. @author MyEclipse Persistence Tools
 */
public class YUnit extends AbstractYUnit implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YUnit() {
	}

	/** minimal constructor */
	public YUnit(String unitTime) {
		super(unitTime);
	}

	/** full constructor */
	public YUnit(Integer areaId, Integer unitSetId, Integer unitClassSetId, Integer accountActId, Integer unitParentId, String unitTitle, String unitTel, String unitContact, String unitMobile, String unitEmail, String unitQq, String unitAddress, String unitImg, String unitY, String unitX, String unitIntro, Integer unitOrder, Integer unitTopOrder, Integer isDelete, Integer unitState, String unitTime) {
		super(areaId, unitSetId, unitClassSetId, accountActId, unitParentId, unitTitle, unitTel, unitContact, unitMobile, unitEmail, unitQq, unitAddress, unitImg, unitY, unitX, unitIntro, unitOrder, unitTopOrder, isDelete, unitState, unitTime);
	}

}
