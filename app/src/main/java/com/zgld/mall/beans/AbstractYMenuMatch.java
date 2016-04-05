package com.zgld.mall.beans;

import java.sql.Date;

/**
 * AbstractYMenuMatch entity provides the base persistence definition of the
 * YMenuMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYMenuMatch implements java.io.Serializable {

	// Fields

	private Integer menuMatchId;
	private Integer meId;
	private Integer accountId;
	private Integer accountActId;
	private Integer isDelete;
	private String menuMatchTime;

	// Constructors

	/** default constructor */
	public AbstractYMenuMatch() {
	}

	/** minimal constructor */
	public AbstractYMenuMatch(String menuMatchTime) {
		this.menuMatchTime = menuMatchTime;
	}

	/** full constructor */
	public AbstractYMenuMatch(Integer meId, Integer accountId, Integer accountActId, Integer isDelete, String menuMatchTime) {
		this.meId = meId;
		this.accountId = accountId;
		this.accountActId = accountActId;
		this.isDelete = isDelete;
		this.menuMatchTime = menuMatchTime;
	}

	// Property accessors

	public Integer getMenuMatchId() {
		return this.menuMatchId;
	}

	public void setMenuMatchId(Integer menuMatchId) {
		this.menuMatchId = menuMatchId;
	}

	public Integer getMeId() {
		return this.meId;
	}

	public void setMeId(Integer meId) {
		this.meId = meId;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getAccountActId() {
		return this.accountActId;
	}

	public void setAccountActId(Integer accountActId) {
		this.accountActId = accountActId;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getMenuMatchTime() {
		return this.menuMatchTime;
	}

	public void setMenuMatchTime(String menuMatchTime) {
		this.menuMatchTime = menuMatchTime;
	}

}