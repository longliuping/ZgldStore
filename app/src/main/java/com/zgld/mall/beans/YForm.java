package com.zgld.mall.beans;

import java.sql.Timestamp;

/**
 * YForm entity. @author MyEclipse Persistence Tools
 */
public class YForm extends AbstractYForm implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public YForm() {
	}

	/** minimal constructor */
	public YForm(String formTime) {
		super(formTime);
	}

	/** full constructor */
	public YForm(Integer classSetId, String tableName, String formName, Integer accountActId, Integer isDelete, String formTime) {
		super(classSetId, tableName, formName, accountActId, isDelete, formTime);
	}

}
