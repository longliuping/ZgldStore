package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYGoodsClass entity provides the base persistence definition of the
 * YGoodsClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYGoodsClass implements java.io.Serializable {

	// Fields

	private Integer goClassId;
	private Integer goParentClassId;
	private Integer goClassSetId;
	private String goClassName;
	private String goClassIntro;
	private Integer goClassTotal;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer goClassOrder;
	private Integer goClassTopOrder;
	private String goClassDefaultImg;
	private String goClassHoverImg;
	private String goClassVisitedImg;
	private Integer isDelete;
	private String goClassTime;

	// Constructors

	/** default constructor */
	public AbstractYGoodsClass() {
	}

	/** minimal constructor */
	public AbstractYGoodsClass(String goClassTime) {
		this.goClassTime = goClassTime;
	}

	/** full constructor */
	public AbstractYGoodsClass(Integer goParentClassId, Integer goClassSetId, String goClassName, String goClassIntro, Integer goClassTotal, Integer unitSetId, Integer accountActId, Integer goClassOrder, Integer goClassTopOrder, String goClassDefaultImg, String goClassHoverImg, String goClassVisitedImg, Integer isDelete, String goClassTime) {
		this.goParentClassId = goParentClassId;
		this.goClassSetId = goClassSetId;
		this.goClassName = goClassName;
		this.goClassIntro = goClassIntro;
		this.goClassTotal = goClassTotal;
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.goClassOrder = goClassOrder;
		this.goClassTopOrder = goClassTopOrder;
		this.goClassDefaultImg = goClassDefaultImg;
		this.goClassHoverImg = goClassHoverImg;
		this.goClassVisitedImg = goClassVisitedImg;
		this.isDelete = isDelete;
		this.goClassTime = goClassTime;
	}

	// Property accessors

	public Integer getGoClassId() {
		return this.goClassId;
	}

	public void setGoClassId(Integer goClassId) {
		this.goClassId = goClassId;
	}

	public Integer getGoParentClassId() {
		return this.goParentClassId;
	}

	public void setGoParentClassId(Integer goParentClassId) {
		this.goParentClassId = goParentClassId;
	}

	public Integer getGoClassSetId() {
		return this.goClassSetId;
	}

	public void setGoClassSetId(Integer goClassSetId) {
		this.goClassSetId = goClassSetId;
	}

	public String getGoClassName() {
		return this.goClassName;
	}

	public void setGoClassName(String goClassName) {
		this.goClassName = goClassName;
	}

	public String getGoClassIntro() {
		return this.goClassIntro;
	}

	public void setGoClassIntro(String goClassIntro) {
		this.goClassIntro = goClassIntro;
	}

	public Integer getGoClassTotal() {
		return this.goClassTotal;
	}

	public void setGoClassTotal(Integer goClassTotal) {
		this.goClassTotal = goClassTotal;
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

	public Integer getGoClassOrder() {
		return this.goClassOrder;
	}

	public void setGoClassOrder(Integer goClassOrder) {
		this.goClassOrder = goClassOrder;
	}

	public Integer getGoClassTopOrder() {
		return this.goClassTopOrder;
	}

	public void setGoClassTopOrder(Integer goClassTopOrder) {
		this.goClassTopOrder = goClassTopOrder;
	}

	public String getGoClassDefaultImg() {
		return this.goClassDefaultImg;
	}

	public void setGoClassDefaultImg(String goClassDefaultImg) {
		this.goClassDefaultImg = goClassDefaultImg;
	}

	public String getGoClassHoverImg() {
		return this.goClassHoverImg;
	}

	public void setGoClassHoverImg(String goClassHoverImg) {
		this.goClassHoverImg = goClassHoverImg;
	}

	public String getGoClassVisitedImg() {
		return this.goClassVisitedImg;
	}

	public void setGoClassVisitedImg(String goClassVisitedImg) {
		this.goClassVisitedImg = goClassVisitedImg;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getGoClassTime() {
		return this.goClassTime;
	}

	public void setGoClassTime(String goClassTime) {
		this.goClassTime = goClassTime;
	}

}