package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YArticle entity. @author MyEclipse Persistence Tools
 */
public class YArticle extends AbstractYArticle implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticle() {
	}

	/** minimal constructor */
	public YArticle(String arTime) {
		super(arTime);
	}

	/** full constructor */
	public YArticle(Integer unitSetId, Integer accountActId, Integer arClassSetId, Integer arSpecialSetId, Integer arSetId, String arTitle, String arImg, Integer arAdminState, Integer arState, String arKeyWords, Integer arHits, Integer arRecommend, Integer arShare, String arFrom, String arAuthor, String arEditor, Integer arEditNum, String arEditTime, Integer arOrder, Integer arTopOrder, String arContent, String arFile, Integer isDelete, String arTime) {
		super(unitSetId, accountActId, arClassSetId, arSpecialSetId, arSetId, arTitle, arImg, arAdminState, arState, arKeyWords, arHits, arRecommend, arShare, arFrom, arAuthor, arEditor, arEditNum, arEditTime, arOrder, arTopOrder, arContent, arFile, isDelete, arTime);
	}

}
