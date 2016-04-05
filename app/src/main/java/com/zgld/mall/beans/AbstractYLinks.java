package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYLinks entity provides the base persistence definition of the YLinks
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYLinks implements java.io.Serializable {

	// Fields

	private Integer liId;
	private Integer liClassSetId;
	private Integer liState;
	private Integer unitSetId;
	private Integer accountActId;
	private String liTitle;
	private String liUrl;
	private String liImg;
	private Integer liOrder;
	private Integer liTopOrder;
	private Integer isDelete;
	private String liTime;

	// Constructors

	/** default constructor */
	public AbstractYLinks() {
	}

	/** minimal constructor */
	public AbstractYLinks(String liTime) {
		this.liTime = liTime;
	}

	/** full constructor */
	public AbstractYLinks(Integer liClassSetId, Integer liState, Integer unitSetId, Integer accountActId, String liTitle, String liUrl, String liImg, Integer liOrder, Integer liTopOrder, Integer isDelete, String liTime) {
		this.liClassSetId = liClassSetId;
		this.liState = liState;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.liTitle = liTitle;
		this.liUrl = liUrl;
		this.liImg = liImg;
		this.liOrder = liOrder;
		this.liTopOrder = liTopOrder;
		this.isDelete = isDelete;
		this.liTime = liTime;
	}

	// Property accessors

	public Integer getLiId() {
		return this.liId;
	}

	public void setLiId(Integer liId) {
		this.liId = liId;
	}

	public Integer getLiClassSetId() {
		return this.liClassSetId;
	}

	public void setLiClassSetId(Integer liClassSetId) {
		this.liClassSetId = liClassSetId;
	}

	public Integer getLiState() {
		return this.liState;
	}

	public void setLiState(Integer liState) {
		this.liState = liState;
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

	public String getLiTitle() {
		return this.liTitle;
	}

	public void setLiTitle(String liTitle) {
		this.liTitle = liTitle;
	}

	public String getLiUrl() {
		return this.liUrl;
	}

	public void setLiUrl(String liUrl) {
		this.liUrl = liUrl;
	}

	public String getLiImg() {
		return this.liImg;
	}

	public void setLiImg(String liImg) {
		this.liImg = liImg;
	}

	public Integer getLiOrder() {
		return this.liOrder;
	}

	public void setLiOrder(Integer liOrder) {
		this.liOrder = liOrder;
	}

	public Integer getLiTopOrder() {
		return this.liTopOrder;
	}

	public void setLiTopOrder(Integer liTopOrder) {
		this.liTopOrder = liTopOrder;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getLiTime() {
		return this.liTime;
	}

	public void setLiTime(String liTime) {
		this.liTime = liTime;
	}

}