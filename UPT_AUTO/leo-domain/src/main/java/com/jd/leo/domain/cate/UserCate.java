package com.jd.leo.domain.cate;

public class UserCate {

	private Integer id;

	private String erp;

	private Integer level;

	private Integer cateId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getErp() {
		return erp;
	}

	public void setErp(String erp) {
		this.erp = erp;
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
		return "UserCate [id=" + id + ", erp=" + erp + ", level=" + level
				+ ", cateId=" + cateId + "]";
	}

}