package com.zgld.mall.beans;

/**
 * AbstractYFunConfig entity provides the base persistence definition of the
 * YFunConfig entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFunConfig implements java.io.Serializable {

	// Fields

	private Integer sysFunId;
	private Integer sysFunIsCache;
	private Integer sysFunCacheTime;
	private Integer sysFunIsArticlePages;
	private Integer sysFunArticlePagesLength;
	private Integer sysFunIsFileUpload;
	private Integer sysFunFileUploadKiloByte;
	private Integer sysFunIsAppApi;
	private Integer sysFunIsMsg;
	private Integer sysFunIsComment;
	private Integer sysFunIsWebApply;
	private Integer sysFunIsUnitWebApply;
	private Integer sysFunIsRecursive;

	// Constructors

	/** default constructor */
	public AbstractYFunConfig() {
	}

	/** full constructor */
	public AbstractYFunConfig(Integer sysFunIsCache, Integer sysFunCacheTime, Integer sysFunIsArticlePages, Integer sysFunArticlePagesLength, Integer sysFunIsFileUpload, Integer sysFunFileUploadKiloByte, Integer sysFunIsAppApi, Integer sysFunIsMsg, Integer sysFunIsComment, Integer sysFunIsWebApply, Integer sysFunIsUnitWebApply, Integer sysFunIsRecursive) {
		this.sysFunIsCache = sysFunIsCache;
		this.sysFunCacheTime = sysFunCacheTime;
		this.sysFunIsArticlePages = sysFunIsArticlePages;
		this.sysFunArticlePagesLength = sysFunArticlePagesLength;
		this.sysFunIsFileUpload = sysFunIsFileUpload;
		this.sysFunFileUploadKiloByte = sysFunFileUploadKiloByte;
		this.sysFunIsAppApi = sysFunIsAppApi;
		this.sysFunIsMsg = sysFunIsMsg;
		this.sysFunIsComment = sysFunIsComment;
		this.sysFunIsWebApply = sysFunIsWebApply;
		this.sysFunIsUnitWebApply = sysFunIsUnitWebApply;
		this.sysFunIsRecursive = sysFunIsRecursive;
	}

	// Property accessors

	public Integer getSysFunId() {
		return this.sysFunId;
	}

	public void setSysFunId(Integer sysFunId) {
		this.sysFunId = sysFunId;
	}

	public Integer getSysFunIsCache() {
		return this.sysFunIsCache;
	}

	public void setSysFunIsCache(Integer sysFunIsCache) {
		this.sysFunIsCache = sysFunIsCache;
	}

	public Integer getSysFunCacheTime() {
		return this.sysFunCacheTime;
	}

	public void setSysFunCacheTime(Integer sysFunCacheTime) {
		this.sysFunCacheTime = sysFunCacheTime;
	}

	public Integer getSysFunIsArticlePages() {
		return this.sysFunIsArticlePages;
	}

	public void setSysFunIsArticlePages(Integer sysFunIsArticlePages) {
		this.sysFunIsArticlePages = sysFunIsArticlePages;
	}

	public Integer getSysFunArticlePagesLength() {
		return this.sysFunArticlePagesLength;
	}

	public void setSysFunArticlePagesLength(Integer sysFunArticlePagesLength) {
		this.sysFunArticlePagesLength = sysFunArticlePagesLength;
	}

	public Integer getSysFunIsFileUpload() {
		return this.sysFunIsFileUpload;
	}

	public void setSysFunIsFileUpload(Integer sysFunIsFileUpload) {
		this.sysFunIsFileUpload = sysFunIsFileUpload;
	}

	public Integer getSysFunFileUploadKiloByte() {
		return this.sysFunFileUploadKiloByte;
	}

	public void setSysFunFileUploadKiloByte(Integer sysFunFileUploadKiloByte) {
		this.sysFunFileUploadKiloByte = sysFunFileUploadKiloByte;
	}

	public Integer getSysFunIsAppApi() {
		return this.sysFunIsAppApi;
	}

	public void setSysFunIsAppApi(Integer sysFunIsAppApi) {
		this.sysFunIsAppApi = sysFunIsAppApi;
	}

	public Integer getSysFunIsMsg() {
		return this.sysFunIsMsg;
	}

	public void setSysFunIsMsg(Integer sysFunIsMsg) {
		this.sysFunIsMsg = sysFunIsMsg;
	}

	public Integer getSysFunIsComment() {
		return this.sysFunIsComment;
	}

	public void setSysFunIsComment(Integer sysFunIsComment) {
		this.sysFunIsComment = sysFunIsComment;
	}

	public Integer getSysFunIsWebApply() {
		return this.sysFunIsWebApply;
	}

	public void setSysFunIsWebApply(Integer sysFunIsWebApply) {
		this.sysFunIsWebApply = sysFunIsWebApply;
	}

	public Integer getSysFunIsUnitWebApply() {
		return this.sysFunIsUnitWebApply;
	}

	public void setSysFunIsUnitWebApply(Integer sysFunIsUnitWebApply) {
		this.sysFunIsUnitWebApply = sysFunIsUnitWebApply;
	}

	public Integer getSysFunIsRecursive() {
		return this.sysFunIsRecursive;
	}

	public void setSysFunIsRecursive(Integer sysFunIsRecursive) {
		this.sysFunIsRecursive = sysFunIsRecursive;
	}

}