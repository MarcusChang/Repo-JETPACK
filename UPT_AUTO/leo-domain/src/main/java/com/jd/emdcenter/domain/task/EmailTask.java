package com.jd.emdcenter.domain.task;

import java.util.Date;

public class EmailTask {

	private Integer id;
	
	private String operator;
	
	private String subject;
	
	private String body;
	
	private String bodyKey;
	
	private Date taskDate;
	
	private Date expiredDate;
	
	private Integer sendNum;
	
	private Integer yn;
	
	private Integer priority;
	
	private Short status;
	
	private Integer mailCount;
	
	private Integer errorCount;
	
	private Date updateTtime;
	
	private Short mailType;
	
	private Integer EdmType;
	
	private Integer needSendNum;
	
	private Integer spamStates;
	
	private Integer recommend;
	
	private Long kid;
	
	private Long klid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBodyKey() {
		return bodyKey;
	}

	public void setBodyKey(String bodyKey) {
		this.bodyKey = bodyKey;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Integer getSendNum() {
		return sendNum;
	}

	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}

	public Integer getYn() {
		return yn;
	}

	public void setYn(Integer yn) {
		this.yn = yn;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getMailCount() {
		return mailCount;
	}

	public void setMailCount(Integer mailCount) {
		this.mailCount = mailCount;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public Date getUpdateTtime() {
		return updateTtime;
	}

	public void setUpdateTtime(Date updateTtime) {
		this.updateTtime = updateTtime;
	}

	public Short getMailType() {
		return mailType;
	}

	public void setMailType(Short mailType) {
		this.mailType = mailType;
	}

	public Integer getEdmType() {
		return EdmType;
	}

	public void setEdmType(Integer edmType) {
		EdmType = edmType;
	}

	public Integer getNeedSendNum() {
		return needSendNum;
	}

	public void setNeedSendNum(Integer needSendNum) {
		this.needSendNum = needSendNum;
	}

	public Integer getSpamStates() {
		return spamStates;
	}

	public void setSpamStates(Integer spamStates) {
		this.spamStates = spamStates;
	}

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public Long getKid() {
		return kid;
	}

	public void setKid(Long kid) {
		this.kid = kid;
	}

	public Long getKlid() {
		return klid;
	}

	public void setKlid(Long klid) {
		this.klid = klid;
	}
	
}
