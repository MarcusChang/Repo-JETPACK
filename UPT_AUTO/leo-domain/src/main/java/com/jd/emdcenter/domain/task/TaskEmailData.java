package com.jd.emdcenter.domain.task;

import java.util.Date;

public class TaskEmailData {
	
	private Long sysNo;

	private String mailAddress;

	private Short status;

	private Date createDate;

	private Integer taskId;

	private String type;

	private Date updateTime;

	private String relaceField;

	private Short flag;

	private String encryptField;

	private String cityName;

	private String senderIp;

	private Integer retryCount;

	private Integer retryType;

	private String mailIp;

	private String products;
	
	private String pin;

	public Long getSysNo() {
		return sysNo;
	}

	public void setSysNo(Long sysNo) {
		this.sysNo = sysNo;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRelaceField() {
		return relaceField;
	}

	public void setRelaceField(String relaceField) {
		this.relaceField = relaceField;
	}

	public Short getFlag() {
		return flag;
	}

	public void setFlag(Short flag) {
		this.flag = flag;
	}

	public String getEncryptField() {
		return encryptField;
	}

	public void setEncryptField(String encryptField) {
		this.encryptField = encryptField;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getSenderIp() {
		return senderIp;
	}

	public void setSenderIp(String senderIp) {
		this.senderIp = senderIp;
	}

	public Integer getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
	}

	public Integer getRetryType() {
		return retryType;
	}

	public void setRetryType(Integer retryType) {
		this.retryType = retryType;
	}

	public String getMailIp() {
		return mailIp;
	}

	public void setMailIp(String mailIp) {
		this.mailIp = mailIp;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
