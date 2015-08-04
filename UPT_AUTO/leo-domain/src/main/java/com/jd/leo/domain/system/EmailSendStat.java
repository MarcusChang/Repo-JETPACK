package com.jd.leo.domain.system;


public class EmailSendStat {
	private Integer sentSuccessNum;

	private Integer waitSendNum;
	
	private Integer total;

	public Integer getSentSuccessNum() {
		return sentSuccessNum;
	}

	public void setSentSuccessNum(Integer sentSuccessNum) {
		this.sentSuccessNum = sentSuccessNum;
	}

	public Integer getWaitSendNum() {
		return waitSendNum;
	}

	public void setWaitSendNum(Integer waitSendNum) {
		this.waitSendNum = waitSendNum;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}