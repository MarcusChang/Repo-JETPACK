package com.jd.leo.domain.cate;

public class DepartmentCate {

	private Integer id;

	private Integer depId;

	private Integer level;

	private Integer cateId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getCateId() {
		return cateId;
	}

	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}

	@Override
	public String toString() {
		return "DepartmentCate [id=" + id + ", depId=" + depId + ", level="
				+ level + ", cateId=" + cateId + "]";
	}

}