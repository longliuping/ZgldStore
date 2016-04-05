package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYAdPosition entity provides the base persistence definition of the
 * YAdPosition entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYAdPosition implements java.io.Serializable {

	// Fields

	private Integer adPositionId;
	private Integer adPositionSetId;
	private String adPositionName;
	private String adPositionIntro;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer adPositionOrder;
	private Integer adPositionTopOrder;
	private Integer isDelete;
	private String adPositionTime;

	// Constructors

	/** default constructor */
	public AbstractYAdPosition() {
	}

	/** minimal constructor */
	public AbstractYAdPosition(String adPositionTime) {
		this.adPositionTime = adPositionTime;
	}

	/** full constructor */
	public AbstractYAdPosition(Integer adPositionSetId, String adPositionName, String adPositionIntro, Integer unitSetId, Integer accountActId, Integer adPositionOrder, Integer adPositionTopOrder, Integer isDelete, String adPositionTime) {
		this.adPositionSetId = adPositionSetId;
		this.adPositionName = adPositionName;
		this.adPositionIntro = adPositionIntro;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.adPositionOrder = adPositionOrder;
		this.adPositionTopOrder = adPositionTopOrder;
		this.isDelete = isDelete;
		this.adPositionTime = adPositionTime;
	}

	// Property accessors

	public Integer getAdPositionId() {
		return this.adPositionId;
	}

	public void setAdPositionId(Integer adPositionId) {
		this.adPositionId = adPositionId;
	}

	public Integer getAdPositionSetId() {
		return this.adPositionSetId;
	}

	public void setAdPositionSetId(Integer adPositionSetId) {
		this.adPositionSetId = adPositionSetId;
	}

	public String getAdPositionName() {
		return this.adPositionName;
	}

	public void setAdPositionName(String adPositionName) {
		this.adPositionName = adPositionName;
	}

	public String getAdPositionIntro() {
		return this.adPositionIntro;
	}

	public void setAdPositionIntro(String adPositionIntro) {
		this.adPositionIntro = adPositionIntro;
	}

	public Integer getUnitSetId() {
		return this.unitSetId;
	}

	public void setUnitSetId(Integer unitSetId) {
		this.unitSetId = unitSetId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getAdPositionOrder() {
		return this.adPositionOrder;
	}

	public void setAdPositionOrder(Integer adPositionOrder) {
		this.adPositionOrder = adPositionOrder;
	}

	public Integer getAdPositionTopOrder() {
		return this.adPositionTopOrder;
	}

	public void setAdPositionTopOrder(Integer adPositionTopOrder) {
		this.adPositionTopOrder = adPositionTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getAdPositionTime() {
		return this.adPositionTime;
	}

	public void setAdPositionTime(String adPositionTime) {
		this.adPositionTime = adPositionTime;
	}

}