package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * OrderLeaveWords entity. @author MyEclipse Persistence Tools
 */
public class OrderLeaveWords extends AbstractOrderLeaveWords implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public OrderLeaveWords() {
	}

	/** full constructor */
	public OrderLeaveWords(Integer orderId, String publishContent, Integer userId, String publishDate, Integer isAgentVisited, Integer isMemberVisited, Integer isadminVisited) {
		super(orderId, publishContent, userId, publishDate, isAgentVisited, isMemberVisited, isadminVisited);
	}

}
