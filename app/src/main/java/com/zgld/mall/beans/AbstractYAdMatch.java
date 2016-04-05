package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAdMatch entity provides the base persistence definition of the
 * YAdMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAdMatch implements java.io.Serializable {

	// Fields

	private Integer adMatchId;
	private Integer adId;
	private Integer adPositionSetId;
	private Integer isDelete;
	private String adMatchTime;

	// Constructors

	/** default constructor */
	public AbstractYAdMatch() {
	}

	/** minimal constructor */
	public AbstractYAdMatch(String adMatchTime) {
		this.adMatchTime = adMatchTime;
	}

	/** full constructor */
	public AbstractYAdMatch(Integer adId, Integer adPositionSetId, Integer isDelete, String adMatchTime) {
		this.adId = adId;
		this.adPositionSetId = adPositionSetId;
		this.isDelete = isDelete;
		this.adMatchTime = adMatchTime;
	}

	// Property accessors

	public Integer getAdMatchId() {
		return this.adMatchId;
	}

	public void setAdMatchId(Integer adMatchId) {
		this.adMatchId = adMatchId;
	}

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public Integer getAdPositionSetId() {
		return this.adPositionSetId;
	}

	public void setAdPositionSetId(Integer adPositionSetId) {
		this.adPositionSetId = adPositionSetId;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAdMatchTime() {
		return this.adMatchTime;
	}

	public void setAdMatchTime(String adMatchTime) {
		this.adMatchTime = adMatchTime;
	}

}