package com.zgld.mall.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractYArticle entity provides the base persistence definition of the
 * YArticle entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYArticle implements java.io.Serializable {

	// Fields

	private Integer arId;
	private Integer unitSetId;
	private Integer accountActId;
	private Integer arClassSetId;
	private Integer arSpecialSetId;
	private Integer arSetId;
	private String arTitle;
	private String arImg;
	private Integer arAdminState;
	private Integer arState;
	private String arKeyWords;
	private Integer arHits;
	private Integer arRecommend;
	private Integer arShare;
	private String arFrom;
	private String arAuthor;
	private String arEditor;
	private Integer arEditNum;
	private String arEditTime;
	private Integer arOrder;
	private Integer arTopOrder;
	private String arContent;
	private String arFile;
	private Integer isDelete;
	private String arTime;

	// Constructors

	/** default constructor */
	public AbstractYArticle() {
	}

	/** minimal constructor */
	public AbstractYArticle(String arTime) {
		this.arTime = arTime;
	}

	/** full constructor */
	public AbstractYArticle(Integer unitSetId, Integer accountActId, Integer arClassSetId, Integer arSpecialSetId, Integer arSetId, String arTitle, String arImg, Integer arAdminState, Integer arState, String arKeyWords, Integer arHits, Integer arRecommend, Integer arShare, String arFrom, String arAuthor, String arEditor, Integer arEditNum, String arEditTime, Integer arOrder, Integer arTopOrder, String arContent, String arFile, Integer isDelete, String arTime) {
		this.unitSetId = unitSetId;
		this.accountActId = accountActId;
		this.arClassSetId = arClassSetId;
		this.arSpecialSetId = arSpecialSetId;
		this.arSetId = arSetId;
		this.arTitle = arTitle;
		this.arImg = arImg;
		this.arAdminState = arAdminState;
		this.arState = arState;
		this.arKeyWords = arKeyWords;
		this.arHits = arHits;
		this.arRecommend = arRecommend;
		this.arShare = arShare;
		this.arFrom = arFrom;
		this.arAuthor = arAuthor;
		this.arEditor = arEditor;
		this.arEditNum = arEditNum;
		this.arEditTime = arEditTime;
		this.arOrder = arOrder;
		this.arTopOrder = arTopOrder;
		this.arContent = arContent;
		this.arFile = arFile;
		this.isDelete = isDelete;
		this.arTime = arTime;
	}

	// Property accessors

	public Integer getArId() {
		return this.arId;
	}

	public void setArId(Integer arId) {
		this.arId = arId;
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

	public Integer getArSpecialSetId() {
		return this.arSpecialSetId;
	}

	public void setArSpecialSetId(Integer arSpecialSetId) {
		this.arSpecialSetId = arSpecialSetId;
	}

	public Integer getArSetId() {
		return this.arSetId;
	}

	public void setArSetId(Integer arSetId) {
		this.arSetId = arSetId;
	}

	public String getArTitle() {
		return this.arTitle;
	}

	public void setArTitle(String arTitle) {
		this.arTitle = arTitle;
	}

	public String getArImg() {
		return this.arImg;
	}

	public void setArImg(String arImg) {
		this.arImg = arImg;
	}

	public Integer getArAdminState() {
		return this.arAdminState;
	}

	public void setArAdminState(Integer arAdminState) {
		this.arAdminState = arAdminState;
	}

	public Integer getArState() {
		return this.arState;
	}

	public void setArState(Integer arState) {
		this.arState = arState;
	}

	public String getArKeyWords() {
		return this.arKeyWords;
	}

	public void setArKeyWords(String arKeyWords) {
		this.arKeyWords = arKeyWords;
	}

	public Integer getArHits() {
		return this.arHits;
	}

	public void setArHits(Integer arHits) {
		this.arHits = arHits;
	}

	public Integer getArRecommend() {
		return this.arRecommend;
	}

	public void setArRecommend(Integer arRecommend) {
		this.arRecommend = arRecommend;
	}

	public Integer getArShare() {
		return this.arShare;
	}

	public void setArShare(Integer arShare) {
		this.arShare = arShare;
	}

	public String getArFrom() {
		return this.arFrom;
	}

	public void setArFrom(String arFrom) {
		this.arFrom = arFrom;
	}

	public String getArAuthor() {
		return this.arAuthor;
	}

	public void setArAuthor(String arAuthor) {
		this.arAuthor = arAuthor;
	}

	public String getArEditor() {
		return this.arEditor;
	}

	public void setArEditor(String arEditor) {
		this.arEditor = arEditor;
	}

	public Integer getArEditNum() {
		return this.arEditNum;
	}

	public void setArEditNum(Integer arEditNum) {
		this.arEditNum = arEditNum;
	}

	public String getArEditTime() {
		return this.arEditTime;
	}

	public void setArEditTime(String arEditTime) {
		this.arEditTime = arEditTime;
	}

	public Integer getArOrder() {
		return this.arOrder;
	}

	public void setArOrder(Integer arOrder) {
		this.arOrder = arOrder;
	}

	public Integer getArTopOrder() {
		return this.arTopOrder;
	}

	public void setArTopOrder(Integer arTopOrder) {
		this.arTopOrder = arTopOrder;
	}

	public String getArContent() {
		return this.arContent;
	}

	public void setArContent(String arContent) {
		this.arContent = arContent;
	}

	public String getArFile() {
		return this.arFile;
	}

	public void setArFile(String arFile) {
		this.arFile = arFile;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getArTime() {
		return this.arTime;
	}

	public void setArTime(String arTime) {
		this.arTime = arTime;
	}

}