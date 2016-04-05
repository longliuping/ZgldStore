package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YArticleComment entity. @author MyEclipse Persistence Tools
 */
public class YArticleComment extends AbstractYArticleComment implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YArticleComment() {
	}

	/** minimal constructor */
	public YArticleComment(String arCommentTime) {
		super(arCommentTime);
	}

	/** full constructor */
	public YArticleComment(Integer arId, Integer unitSetId, Integer accountActId, String arCommentContent, Integer arCommentOrder, Integer arCommentTopOrder, Integer isDelete, String arCommentTime) {
		super(arId, unitSetId, accountActId, arCommentContent, arCommentOrder, arCommentTopOrder, isDelete, arCommentTime);
	}

}
