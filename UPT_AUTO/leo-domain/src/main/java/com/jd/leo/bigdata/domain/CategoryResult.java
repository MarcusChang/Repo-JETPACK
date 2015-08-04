package com.jd.leo.bigdata.domain;

import java.util.Set;


/**
 * Created by cdsudan on 2015/4/23 0023 16:18 .
 * 抽取的类目信息组件
 */
public class CategoryResult implements Comparable<CategoryResult>{

	/**
     * 父类目id*
     */
    private Integer parentCateId;
	
    /**
     * 类目id*
     */
    private Integer cateId;
    /**
     * 类目名称*
     */
    private String cateName;

    private Set<CategoryResult> children;
    
    public CategoryResult() {
		super();
	}

	public CategoryResult(Integer cateId, String cateName) {
		super();
		this.cateId = cateId;
		this.cateName = cateName;
	}
	
	public CategoryResult(Integer parentCateId, Integer cateId, String cateName) {
		super();
		this.parentCateId = parentCateId;
		this.cateId = cateId;
		this.cateName = cateName;
	}

	public Integer getParentCateId() {
		return parentCateId;
	}

	public void setParentCateId(Integer parentCateId) {
		this.parentCateId = parentCateId;
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

	public Set<CategoryResult> getChildren() {
		return children;
	}

	public void setChildren(Set<CategoryResult> children) {
		this.children = children;
	}

	@Override
	public int compareTo(CategoryResult obj) {
		if (this == obj) {
			return 0;
		}
		
		if (this.parentCateId == obj.parentCateId || 
				(this.parentCateId != null && parentCateId.equals(obj.parentCateId))) {
			return this.cateId.compareTo(obj.cateId);
		} else {
			if (this.parentCateId == null) {
				return -1;
			} else {
				return this.parentCateId.compareTo(obj.parentCateId);
			}
		}
		
	}

}
