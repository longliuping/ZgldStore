package com.zgld.mall.beans;

/**
 * AbstractYFilesMatch entity provides the base persistence definition of the
 * YFilesMatch entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractYFilesMatch implements java.io.Serializable {

	// Fields

	private Integer fiMatchId;
	private Integer fiId;
	private Integer primaryKey;
	private String tableEnName;
	private String tableCnName;
	private Integer isDelete;

	// Constructors

	/** default constructor */
	public AbstractYFilesMatch() {
	}

	/** full constructor */
	public AbstractYFilesMatch(Integer fiId, Integer primaryKey, String tableEnName, String tableCnName, Integer isDelete) {
		this.fiId = fiId;
		this.primaryKey = primaryKey;
		this.tableEnName = tableEnName;
		this.tableCnName = tableCnName;
		this.isDelete = isDelete;
	}

	// Property accessors

	public Integer getFiMatchId() {
		return this.fiMatchId;
	}

	public void setFiMatchId(Integer fiMatchId) {
		this.fiMatchId = fiMatchId;
	}

	public Integer getFiId() {
		return this.fiId;
	}

	public void setFiId(Integer fiId) {
		this.fiId = fiId;
	}

	public Integer getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getTableEnName() {
		return this.tableEnName;
	}

	public void setTableEnName(String tableEnName) {
		this.tableEnName = tableEnName;
	}

	public String getTableCnName() {
		return this.tableCnName;
	}

	public void setTableCnName(String tableCnName) {
		this.tableCnName = tableCnName;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}