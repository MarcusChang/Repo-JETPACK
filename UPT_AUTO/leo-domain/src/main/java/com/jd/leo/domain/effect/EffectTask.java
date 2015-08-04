package com.jd.leo.domain.effect;

import java.util.Date;

public class EffectTask {

	private Integer taskId;
	// 部门ID
	private Integer depId;
	// 发送时间
	private Date gmtBegin;
	// 结束时间
	private Date gmtFinish;
	// 发送总量
	private Integer sentNum;
	// 发送成功量
	private Integer sentSuccessNum;
	// 打开曝光
	private Integer openNum;
	// 点击
	private Integer clickNum;
	// 独立点击
	private Integer singleClickNum;
	// PV
	private Integer pvNum;
	// UV
	private Integer uvNum;
	// 购买人数
	private Integer buyUserNum;
	// 首次购买人数
	private Integer firstBuyUserNum;
	// 订单量
	private Integer orderNum;
	// 订单量
	private Number amount;
	
	/* 联合查询，不放入数据库 */
	// 任务名称
	private String taskName;
	// 部门名
	private String depName;
	// 邮件类型
	private String mailType;
	// 邮件标题
	private String mailTitle;
	
	/* 计算的百分比 */
	// 发送成功率
	private String sentPercent;
	// 打开率
	private String openPercent;
	// 点击率
	private String clickPercent;
	// 独立点击率
	private String singleClickPercent;
	// 复购人数
	private Integer multiBuyUserNum;
	// 总订单量转化率
	private String orderTrans;
	// 总销售额转化率
	private String amountTrans;
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	public Date getGmtBegin() {
		return gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
	}
	public Date getGmtFinish() {
		return gmtFinish;
	}
	public void setGmtFinish(Date gmtFinish) {
		this.gmtFinish = gmtFinish;
	}
	public Integer getSentNum() {
		return sentNum;
	}
	public void setSentNum(Integer sentNum) {
		this.sentNum = sentNum;
	}
	public Integer getSentSuccessNum() {
		return sentSuccessNum;
	}
	public void setSentSuccessNum(Integer sentSuccessNum) {
		this.sentSuccessNum = sentSuccessNum;
	}
	public Integer getOpenNum() {
		return openNum;
	}
	public void setOpenNum(Integer openNum) {
		this.openNum = openNum;
	}
	public Integer getClickNum() {
		return clickNum;
	}
	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}
	public Integer getSingleClickNum() {
		return singleClickNum;
	}
	public void setSingleClickNum(Integer singleClickNum) {
		this.singleClickNum = singleClickNum;
	}
	public Integer getPvNum() {
		return pvNum;
	}
	public void setPvNum(Integer pvNum) {
		this.pvNum = pvNum;
	}
	public Integer getUvNum() {
		return uvNum;
	}
	public void setUvNum(Integer uvNum) {
		this.uvNum = uvNum;
	}
	public Integer getBuyUserNum() {
		return buyUserNum;
	}
	public void setBuyUserNum(Integer buyUserNum) {
		this.buyUserNum = buyUserNum;
	}
	public Integer getFirstBuyUserNum() {
		return firstBuyUserNum;
	}
	public void setFirstBuyUserNum(Integer firstBuyUserNum) {
		this.firstBuyUserNum = firstBuyUserNum;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Number getAmount() {
		return amount;
	}
	public void setAmount(Number amount) {
		this.amount = amount;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getMailType() {
		return mailType;
	}
	public void setMailType(String mailType) {
		this.mailType = mailType;
	}
	public String getMailTitle() {
		return mailTitle;
	}
	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}
	
	public String getSentPercent() {
		return sentPercent;
	}
	public void setSentPercent(String sentPercent) {
		this.sentPercent = sentPercent;
	}
	public String getOpenPercent() {
		return openPercent;
	}
	public void setOpenPercent(String openPercent) {
		this.openPercent = openPercent;
	}
	public String getClickPercent() {
		return clickPercent;
	}
	public void setClickPercent(String clickPercent) {
		this.clickPercent = clickPercent;
	}
	public String getSingleClickPercent() {
		return singleClickPercent;
	}
	public void setSingleClickPercent(String singleClickPercent) {
		this.singleClickPercent = singleClickPercent;
	}
	public Integer getMultiBuyUserNum() {
		return multiBuyUserNum;
	}
	public void setMultiBuyUserNum(Integer multiBuyUserNum) {
		this.multiBuyUserNum = multiBuyUserNum;
	}
	public String getOrderTrans() {
		return orderTrans;
	}
	public void setOrderTrans(String orderTrans) {
		this.orderTrans = orderTrans;
	}
	public String getAmountTrans() {
		return amountTrans;
	}
	public void setAmountTrans(String amountTrans) {
		this.amountTrans = amountTrans;
	}

}
