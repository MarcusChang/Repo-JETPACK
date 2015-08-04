package com.jd.leo.domain.dep;

import java.util.Date;

public class Department {

    private Integer id;

    private String name;

    private String creator;

    private Date gmtCreate;

    private String modifier;

    private Date gmtModified;
    
    private String gmtCreateStr;

    private String gmtModifiedStr;
    
    private String item_first_cate_cd_str;
    
    private String item_second_cate_cd_str;
    
    private String item_third_cate_cd_str;
    
    /**是否删除**/
	private Boolean hasDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getGmtCreateStr() {
        return gmtCreateStr;
    }

    public void setGmtCreateStr(String gmtCreateStr) {
        this.gmtCreateStr = gmtCreateStr;
    }

    public String getGmtModifiedStr() {
        return gmtModifiedStr;
    }

    public void setGmtModifiedStr(String gmtModifiedStr) {
        this.gmtModifiedStr = gmtModifiedStr;
    }
    
    public Boolean getHasDel() {
		return hasDel;
	}

	public void setHasDel(Boolean hasDel) {
		this.hasDel = hasDel;
	}

	public String getItem_first_cate_cd_str() {
		return item_first_cate_cd_str;
	}

	public void setItem_first_cate_cd_str(String item_first_cate_cd_str) {
		this.item_first_cate_cd_str = item_first_cate_cd_str;
	}

	public String getItem_second_cate_cd_str() {
		return item_second_cate_cd_str;
	}

	public void setItem_second_cate_cd_str(String item_second_cate_cd_str) {
		this.item_second_cate_cd_str = item_second_cate_cd_str;
	}

	public String getItem_third_cate_cd_str() {
		return item_third_cate_cd_str;
	}

	public void setItem_third_cate_cd_str(String item_third_cate_cd_str) {
		this.item_third_cate_cd_str = item_third_cate_cd_str;
	}

	@Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + ", creator="
                + creator + ", gmtCreate=" + gmtCreate + ", modifier="
                + modifier + ", gmtModified=" + gmtModified + "]";
    }

}