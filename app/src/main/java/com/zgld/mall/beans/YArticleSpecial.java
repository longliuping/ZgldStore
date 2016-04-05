package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YArticleSpecial entity. @author MyEclipse Persistence Tools
 */
public class YArticleSpecial extends AbstractYArticleSpecial implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticleSpecial() {
	}

	/** minimal constructor */
	public YArticleSpecial(String arSpecialTime) {
		super(arSpecialTime);
	}

	/** full constructor */
	public YArticleSpecial(Integer unitSetId, Integer accountActId, Integer arSpecialSetId, Integer arParentSpecialId, String arSpecialName, Integer arSpecialTotal, Integer arSpecialOrder, Integer arSpecialTopOrder, Integer isDelete, String arSpecialTime) {
		super(unitSetId, accountActId, arSpecialSetId, arParentSpecialId, arSpecialName, arSpecialTotal, arSpecialOrder, arSpecialTopOrder, isDelete, arSpecialTime);
	}

}
