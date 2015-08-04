package com.jd.leo.bigdata.domain;

import java.util.Set;

/**
 * Created by cdsudan on 2015/4/22 0022 10:04 .
 */
public class CityResult implements Comparable<CityResult> {

	private Integer id;
	
	private String name;

	private Set<CityResult> children;
	
	public CityResult() {
		super();
	}

	public CityResult(String name) {
		super();
		this.name = name;
	}

	public CityResult(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	public Set<CityResult> getChildren() {
		return children;
	}

	public void setChildren(Set<CityResult> children) {
		this.children = children;
	}

	@Override
	public int compareTo(CityResult obj) {
		if (this == obj) {
			return 0;
		}

		if (this.id == obj.id) {
			return this.name.compareTo(obj.name);
		} else {
			if (this.id == null) {
				return -1;
			} else if (obj.id == null) {
				return 1;
			}

			int res = this.id.compareTo(obj.id);

			if (res == 0) {
				return this.name.compareTo(obj.name);
			} else {
				return res;
			}
		}
	}

}
