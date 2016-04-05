package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYMessageClassMatch entity provides the base persistence definition of
 * the YMessageClassMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMessageClassMatch implements java.io.Serializable {

	// Fields

	private Integer msgClassMatchId;
	private Integer msgClassSetId;
	private Integer unitSetId;
	private String msgClassMatchTime;

	// Constructors

	/** default constructor */
	public AbstractYMessageClassMatch() {
	}

	/** minimal constructor */
	public AbstractYMessageClassMatch(String msgClassMatchTime) {
		this.msgClassMatchTime = msgClassMatchTime;
	}

	/** full constructor */
	public AbstractYMessageClassMatch(Integer msgClassSetId, Integer unitSetId, String msgClassMatchTime) {
		this.msgClassSetId = msgClassSetId;
		this.unitSetId = unitSetId;
		this.msgClassMatchTime = msgClassMatchTime;
	}

	// Property accessors

	public Integer getMsgClassMatchId() {
		return this.msgClassMatchId;
	}

	public void setMsgClassMatchId(Integer msgClassMatchId) {
		this.msgClassMatchId = msgClassMatchId;
	}

	public Integer getMsgClassSetId() {
		return this.msgClassSetId;
	}

	public void setMsgClassSetId(Integer msgClassSetId) {
		this.msgClassSetId = msgClassSetId;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public String getMsgClassMatchTime() {
		return this.msgClassMatchTime;
	}

	public void setMsgClassMatchTime(String msgClassMatchTime) {
		this.msgClassMatchTime = msgClassMatchTime;
	}

}