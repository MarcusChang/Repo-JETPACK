package com.jd.leo.domain.task;

public class TaskAttach {
	private Long id;
	
	private Integer taskId;
	
	private String address;
	
	private Boolean hasDel;
	
	private Boolean hasSent;
	
	private Integer testGroupId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getHasDel() {
		return hasDel;
	}

	public void setHasDel(Boolean hasDel) {
		this.hasDel = hasDel;
	}

	public Boolean getHasSent() {
		return hasSent;
	}

	public void setHasSent(Boolean hasSent) {
		this.hasSent = hasSent;
	}

	public Integer getTestGroupId() {
		return testGroupId;
	}

	public void setTestGroupId(Integer testGroupId) {
		this.testGroupId = testGroupId;
	}
	
}
