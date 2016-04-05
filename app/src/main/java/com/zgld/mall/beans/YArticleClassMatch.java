package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YArticleClassMatch entity. @author MyEclipse Persistence Tools
 */
public class YArticleClassMatch extends AbstractYArticleClassMatch implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticleClassMatch() {
	}

	/** minimal constructor */
	public YArticleClassMatch(String arClassMatchTime) {
		super(arClassMatchTime);
	}

	/** full constructor */
	public YArticleClassMatch(Integer arClassSetId, Integer unitSetId, String arClassMatchTime) {
		super(arClassSetId, unitSetId, arClassMatchTime);
	}

}
