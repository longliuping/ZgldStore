package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YArticleSpecialMatch entity. @author MyEclipse Persistence Tools
 */
public class YArticleSpecialMatch extends AbstractYArticleSpecialMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticleSpecialMatch() {
	}

	/** minimal constructor */
	public YArticleSpecialMatch(String arSpecialMatchTime) {
		super(arSpecialMatchTime);
	}

	/** full constructor */
	public YArticleSpecialMatch(Integer arSpecialSetId, Integer unitSetId, String arSpecialMatchTime) {
		super(arSpecialSetId, unitSetId, arSpecialMatchTime);
	}

}
