package com.jd.leo.domain.effect;

import java.util.Date;

public class EffectTime {

	private Long id;
	// 统计日期
	private String statDate;
	// 任务ID
	private Integer taskId;
	// 部门ID
	private Integer depId;
	// 来源类型
	private Integer sourceType;
	// 发送总量
	private Integer sentNum;
	// 发送成功量
	private Integer sentSuccessNum;
	// 总共上一次发送总量
	private Integer sentTotalNum;
	// 总共发送成功量
	private Integer sentTotalSuccessNum;

	/**
	 * 因邮箱不存在发送邮件失败数量
	 */
	private Integer sentFailedCountNotexist;

	/**
	 * 因黑名单发送邮件失败数量
	 */
	private Integer sentFailedCountBlacklist;

	/**
	 * 因发送报错发送邮件失败数量
	 */
	private Integer sentFailedCountError;

	// 打开曝光
	private Integer openNum;
	// 点击
	private Integer clickNum;
	// 独立点击
	private Integer uniqClickNum;
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
	private Double amount;
	// 年-月
	private String yearMonth;
	// 年-周
	private String yearWeek;
	
	/* 联合查询，不放入数据库 */
	// 部门名
	private String depName;
	// 任务名称
	private String taskName;
	// 发送时间
	private Date gmtBegin;
	// 邮件类型
	private String mailType;
	// 邮件标题
	private String mailTitle;

	/* 计算的百分比 */
	// 订单量
	private Long amountLong;
	// 发送成功率
	private String sentPercent;
	// 打开率
	private String openPercent;
	// 点击率
	private String clickPercent;
	// 独立点击率
	private String uniqClickPercent;
	// 复购人数
	private Integer repeatBuyUserNum;
	// 总订单量转化率
	private String orderTrans;
	// 总销售额转化率
	private String amountTrans;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatDate() {
		return statDate;
	}
	public void setStatDate(String statDate) {
		this.statDate = statDate;
	}
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
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getGmtBegin() {
		return gmtBegin;
	}
	public void setGmtBegin(Date gmtBegin) {
		this.gmtBegin = gmtBegin;
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
	public Integer getSourceType() {
		return sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
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
	public Integer getSentTotalNum() {
		return sentTotalNum;
	}
	public void setSentTotalNum(Integer sentTotalNum) {
		this.sentTotalNum = sentTotalNum;
	}
	public Integer getSentTotalSuccessNum() {
		return sentTotalSuccessNum;
	}
	public void setSentTotalSuccessNum(Integer sentTotalSuccessNum) {
		this.sentTotalSuccessNum = sentTotalSuccessNum;
	}
	public Integer getUniqClickNum() {
		return uniqClickNum;
	}
	public void setUniqClickNum(Integer uniqClickNum) {
		this.uniqClickNum = uniqClickNum;
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public String getYearWeek() {
		return yearWeek;
	}
	public void setYearWeek(String yearWeek) {
		this.yearWeek = yearWeek;
	}
	public Long getAmountLong() {
		return amountLong;
	}
	public void setAmountLong(Long amountLong) {
		this.amountLong = amountLong;
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
	public String getUniqClickPercent() {
		return uniqClickPercent;
	}
	public void setUniqClickPercent(String uniqClickPercent) {
		this.uniqClickPercent = uniqClickPercent;
	}
	public Integer getRepeatBuyUserNum() {
		return repeatBuyUserNum;
	}
	public void setRepeatBuyUserNum(Integer repeatBuyUserNum) {
		this.repeatBuyUserNum = repeatBuyUserNum;
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

	public Integer getSentFailedCountError()
	{
		return sentFailedCountError;
	}

	public void setSentFailedCountError(Integer sentFailedCountError)
	{
		this.sentFailedCountError = sentFailedCountError;
	}

	public Integer getSentFailedCountNotexist()
	{
		return sentFailedCountNotexist;
	}

	public void setSentFailedCountNotexist(Integer sentFailedCountNotexist)
	{
		this.sentFailedCountNotexist = sentFailedCountNotexist;
	}

	public Integer getSentFailedCountBlacklist()
	{
		return sentFailedCountBlacklist;
	}

	public void setSentFailedCountBlacklist(Integer sentFailedCountBlacklist)
	{
		this.sentFailedCountBlacklist = sentFailedCountBlacklist;
	}

}
