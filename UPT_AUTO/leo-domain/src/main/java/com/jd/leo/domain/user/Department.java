package com.jd.leo.domain.user;

/**
 * 部门信息表
 * @author cdsudan
 *
 */
public class Department {
	
    private Integer id;

    private String name;

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
        this.name = name == null ? null : name.trim();
    }
}