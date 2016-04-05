package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * Hotkeywords entity. @author MyEclipse Persistence Tools
 */
public class Hotkeywords extends AbstractHotkeywords implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Hotkeywords() {
	}

	/** full constructor */
	public Hotkeywords(String keywords, String searchTime, String lasttime, Integer frequency, Integer userId) {
		super(keywords, searchTime, lasttime, frequency, userId);
	}

}
