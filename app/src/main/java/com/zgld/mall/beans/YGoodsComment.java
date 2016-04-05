package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YGoodsComment entity. @author MyEclipse Persistence Tools
 */
public class YGoodsComment extends AbstractYGoodsComment implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YGoodsComment() {
	}

	/** minimal constructor */
	public YGoodsComment(String goCommentTime) {
		super(goCommentTime);
	}

	/** full constructor */
	public YGoodsComment(Integer goId, Integer goCommentType, String goCommentContent, Integer goCommentState, Integer accountActId, Integer accountId, String goReplyContent, String goCommentTime) {
		super(goId, goCommentType, goCommentContent, goCommentState, accountActId, accountId, goReplyContent, goCommentTime);
	}

}
