package com.zgld.mall.beans;

import java.sql.Date;

/**
 * YSearchLabel entity. @author MyEclipse Persistence Tools
 */
public class YSearchLabel extends AbstractYSearchLabel implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YSearchLabel() {
	}

	/** minimal constructor */
	public YSearchLabel(String labelTime) {
		super(labelTime);
	}

	/** full constructor */
	public YSearchLabel(Integer accountActId, String labelTitle, Integer labelHits, Integer isShow, String labelTime) {
		super(accountActId, labelTitle, labelHits, isShow, labelTime);
	}

}
