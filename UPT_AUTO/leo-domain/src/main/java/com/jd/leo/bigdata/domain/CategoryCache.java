package com.jd.leo.bigdata.domain;


/**
 * Created by cdsudan on 2015/4/23 0023 16:18 .
 * 抽取的类目信息组件
 */
public class CategoryCache {

    /**
     * 类目id*
     */
    private Integer cateId;
    /**
     * 类目名称*
     */
    private String cateName;
    /**
     * 父id*
     */
    private Integer parentId;
    /**
     * 父name*
     */
    private String parentName;
    /**
     * 父name*
     */
    private Integer grantParentId;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getGrantParentId() {
		return grantParentId;
	}

	public void setGrantParentId(Integer grantParentId) {
		this.grantParentId = grantParentId;
	}

	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null!=obj && obj instanceof CategoryCache) {
            final CategoryCache u = (CategoryCache) obj;
            return this.cateName.equals(u.getCateName()) && this.cateId.equals(u.getCateId()) && this.parentId.equals(u.getParentId());
        }
        return super.equals(obj);
    }
}
