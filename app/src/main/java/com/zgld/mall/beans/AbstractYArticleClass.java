package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYArticleClass entity provides the base persistence definition of the
 * YArticleClass entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYArticleClass implements java.io.Serializable {

	// Fields

	private Integer arClassId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer arClassSetId;
	private Integer arParentClassId;
	private String arClassName;
	private Integer arClassTotal;
	private Integer arClassOrder;
	private Integer arClassTopOrder;
	private String arClassDefaultImg;
	private String arClassHoverImg;
	private String arClassVisitedImg;
	private String arClassIntro;
	private Integer isDelete;
	private String arClassTime;

	// Constructors

	/** default constructor */
	public AbstractYArticleClass() {
	}

	/** minimal constructor */
	public AbstractYArticleClass(String arClassTime) {
		this.arClassTime = arClassTime;
	}

	/** full constructor */
	public AbstractYArticleClass(Integer unitSetId, Integer accountActId, Integer arClassSetId, Integer arParentClassId, String arClassName, Integer arClassTotal, Integer arClassOrder, Integer arClassTopOrder, String arClassDefaultImg, String arClassHoverImg, String arClassVisitedImg, String arClassIntro, Integer isDelete, String arClassTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.arClassSetId = arClassSetId;
		this.arParentClassId = arParentClassId;
		this.arClassName = arClassName;
		this.arClassTotal = arClassTotal;
		this.arClassOrder = arClassOrder;
		this.arClassTopOrder = arClassTopOrder;
		this.arClassDefaultImg = arClassDefaultImg;
		this.arClassHoverImg = arClassHoverImg;
		this.arClassVisitedImg = arClassVisitedImg;
		this.arClassIntro = arClassIntro;
		this.isDelete = isDelete;
		this.arClassTime = arClassTime;
	}

	// Property accessors

	public Integer getArClassId() {
		return this.arClassId;
	}

	public void setArClassId(Integer arClassId) {
		this.arClassId = arClassId;
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

	public Integer getArClassSetId() {
		return this.arClassSetId;
	}

	public void setArClassSetId(Integer arClassSetId) {
		this.arClassSetId = arClassSetId;
	}

	public Integer getArParentClassId() {
		return this.arParentClassId;
	}

	public void setArParentClassId(Integer arParentClassId) {
		this.arParentClassId = arParentClassId;
	}

	public String getArClassName() {
		return this.arClassName;
	}

	public void setArClassName(String arClassName) {
		this.arClassName = arClassName;
	}

	public Integer getArClassTotal() {
		return this.arClassTotal;
	}

	public void setArClassTotal(Integer arClassTotal) {
		this.arClassTotal = arClassTotal;
	}

	public Integer getArClassOrder() {
		return this.arClassOrder;
	}

	public void setArClassOrder(Integer arClassOrder) {
		this.arClassOrder = arClassOrder;
	}

	public Integer getArClassTopOrder() {
		return this.arClassTopOrder;
	}

	public void setArClassTopOrder(Integer arClassTopOrder) {
		this.arClassTopOrder = arClassTopOrder;
	}

	public String getArClassDefaultImg() {
		return this.arClassDefaultImg;
	}

	public void setArClassDefaultImg(String arClassDefaultImg) {
		this.arClassDefaultImg = arClassDefaultImg;
	}

	public String getArClassHoverImg() {
		return this.arClassHoverImg;
	}

	public void setArClassHoverImg(String arClassHoverImg) {
		this.arClassHoverImg = arClassHoverImg;
	}

	public String getArClassVisitedImg() {
		return this.arClassVisitedImg;
	}

	public void setArClassVisitedImg(String arClassVisitedImg) {
		this.arClassVisitedImg = arClassVisitedImg;
	}

	public String getArClassIntro() {
		return this.arClassIntro;
	}

	public void setArClassIntro(String arClassIntro) {
		this.arClassIntro = arClassIntro;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getArClassTime() {
		return this.arClassTime;
	}

	public void setArClassTime(String arClassTime) {
		this.arClassTime = arClassTime;
	}

}