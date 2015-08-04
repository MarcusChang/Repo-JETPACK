package com.jd.leo.domain.task;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-1-15
 * Time: 上午9:20
 */
public class Task {

    private Integer id;

    private String name;

    private Integer depId;

    private String  depName;

    private String creator;

    private String checker;

    private Integer ceilingNum;

    private Integer filteredNum;

    private Integer sentNum;

    private Date gmtPlan;

    private Date gmtExpire;

    private String gmtPlanStr;

    private String gmtExpireStr;

    public String getGmtExpireStr() {
        return gmtExpireStr;
    }

    public void setGmtExpireStr(String gmtExpireStr) {
        this.gmtExpireStr = gmtExpireStr;
    }

    private String gmtFinishStr;

    private Date gmtBegin;

    private Date gmtFinish;

    private Integer status;

    private Date gmtCheck;

    private String channel;

    private String sender;

    private String type;

    private String typeDescribe;

    public String getTypeDescribe() {
        return typeDescribe;
    }

    public void setTypeDescribe(String typeDescribe) {
        this.typeDescribe = typeDescribe;
    }

    private Integer priority;

    private Date gmtCreate;

    private Integer hasDel;

    private Date gmtModified;

    private Integer contentId;

    private String attachCrowd;

    private String modifier;

    private Boolean hasStat;

    /**
     * 存放测试邮件发送地址
     */
    private String emails;

    private String taskCrowdIds;

    /**
     * 是否通过
     */
    private Integer isPass;

    /**
     * 审批意见
     */
    private String auditAdvice;

    /**
     * 过滤任务Id
     */
    private String filterTaskIds;

    public String getFilterTaskIds() {
        return filterTaskIds;
    }

    public void setFilterTaskIds(String filterTaskIds) {
        this.filterTaskIds = filterTaskIds;
    }

    public String getCrowdNames() {
        return crowdNames;
    }

    public void setCrowdNames(String crowdNames) {
        this.crowdNames = crowdNames;
    }

    private String crowdNames;

    public String getAuditAdvice() {
        return auditAdvice;
    }

    public void setAuditAdvice(String auditAdvice) {
        this.auditAdvice = auditAdvice;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public String getCrowdIds() {
        return crowdIds;
    }

    public void setCrowdIds(String crowdIds) {
        this.crowdIds = crowdIds;
    }

    public String getCellingNums() {
        return cellingNums;
    }

    public void setCellingNums(String cellingNums) {
        this.cellingNums = cellingNums;
    }

    private String crowdIds;

    private String cellingNums;

    private String crowdStates;
    /**
     * 是否可以审核标志位
     */
    private int isAudit;
    /**
     * 是否是自己创建任务的标志位
     */
    private int isSelf;

    /**
     * 存放任务对应部门剩余配额量
     */
    private long remain;

    /**
     * 用于记住在任务编辑时记住任务占用配额,用于保存更新时配额回滚
     */
    private Integer cellingNumForEdit;

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    /**
     * 邮件名称
     */
    private String contentTitle;


    public Integer getOrignContentId() {
        return orignContentId;
    }

    public void setOrignContentId(Integer orignContentId) {
        this.orignContentId = orignContentId;
    }

    /**
     * 原始模板id
     */

    private Integer orignContentId;


    public int getIsChannelMgr() {
        return isChannelMgr;
    }

    public void setIsChannelMgr(int isChannelMgr) {
        this.isChannelMgr = isChannelMgr;
    }

    /**
     * 标识是否是渠道管理员
     */

    private int isChannelMgr;

    public Integer getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(Integer oldStatus) {
        this.oldStatus = oldStatus;
    }

    /**
     * 更新时用于判断

     */
    private Integer oldStatus;

    public Integer getIsSaveAsTpl() {
        return isSaveAsTpl;
    }

    public void setIsSaveAsTpl(Integer isSaveAsTpl) {
        this.isSaveAsTpl = isSaveAsTpl;
    }

    /**
     * 是否另存为模板
     */

    private Integer isSaveAsTpl;

    /**
     * 附加人群测试组id
     */
    private List<String> attaches;

    /**
     * 附加测试人邮箱
     */
    private String testGroupStrs;

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * 页面筛选人群上线数之和
     */

    private Integer totalNum;

    /**
     * 测试发送测试组
     */
    private List<String> testers;

    public List<String> getTesters() {
        return testers;
    }

    public void setTesters(List<String> testers) {
        this.testers = testers;
    }

    public List<String> getAttaches() {
        return attaches;
    }

    public void setAttaches(List<String> attaches) {
        this.attaches = attaches;
    }

    public String getTestGroupStrs() {
        return testGroupStrs;
    }

    public void setTestGroupStrs(String testGroupStrs) {
        this.testGroupStrs = testGroupStrs;
    }

    public Integer getCellingNumForEdit() {
        return cellingNumForEdit;
    }

    public void setCellingNumForEdit(Integer cellingNumForEdit) {
        this.cellingNumForEdit = cellingNumForEdit;
    }

    public long getRemain() {
        return remain;
    }

    public void setRemain(long remain) {
        this.remain = remain;
    }

    public String getCrowdStates() {
        return crowdStates;
    }

    public void setCrowdStates(String crowdStates) {
        this.crowdStates = crowdStates;
    }


    public String getTaskCrowdIds() {
        return taskCrowdIds;
    }

    public void setTaskCrowdIds(String taskCrowdIds) {
        this.taskCrowdIds = taskCrowdIds;
    }

    public String getGmtPlanStr() {
        return gmtPlanStr;
    }

    public void setGmtPlanStr(String gmtPlanStr) {
        this.gmtPlanStr = gmtPlanStr;
    }



    public String getGmtFinishStr() {
        return gmtFinishStr;
    }

    public void setGmtFinishStr(String gmtFinishStr) {
        this.gmtFinishStr = gmtFinishStr;
    }



    public String getName() {
        return name;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(int isAudit) {
        this.isAudit = isAudit;
    }

    public int getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(int isSelf) {
        this.isSelf = isSelf;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Integer getCeilingNum() {
        return ceilingNum;
    }

    public void setCeilingNum(Integer ceilingNum) {
        this.ceilingNum = ceilingNum;
    }

    public Integer getFilteredNum() {
        return filteredNum;
    }

    public void setFilteredNum(Integer filteredNum) {
        this.filteredNum = filteredNum;
    }

    public Integer getSentNum() {
        return sentNum;
    }

    public void setSentNum(Integer sentNum) {
        this.sentNum = sentNum;
    }

    public Date getGmtPlan() {
        return gmtPlan;
    }

    public void setGmtPlan(Date gmtPlan) {
        this.gmtPlan = gmtPlan;
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

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Date getGmtCheck() {
        return gmtCheck;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setGmtCheck(Date gmtCheck) {
        this.gmtCheck = gmtCheck;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Integer getHasDel() {
        return hasDel;
    }

    public void setHasDel(Integer hasDel) {
        this.hasDel = hasDel;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getAttachCrowd() {
        return attachCrowd;
    }

    public void setAttachCrowd(String attachCrowd) {
        this.attachCrowd = attachCrowd;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public Date getGmtExpire() {
        return gmtExpire;
    }

    public void setGmtExpire(Date gmtExpire) {
        this.gmtExpire = gmtExpire;
    }

    public Boolean getHasStat() {
        return hasStat;
    }

    public void setHasStat(Boolean hasStat) {
        this.hasStat = hasStat;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depart='" + depId + '\'' +
                ", creator='" + creator + '\'' +
                ", checker='" + checker + '\'' +
                ", ceilingNum=" + ceilingNum +
                ", filteredNum=" + filteredNum +
                ", sentNum=" + sentNum +
                ", gmtPlan=" + gmtPlan +
                ", gmtBegin=" + gmtBegin +
                ", gmtFinish=" + gmtFinish +
                ", status='" + status + '\'' +
                ", gmtCheck=" + gmtCheck +
                ", channel='" + channel + '\'' +
                ", sender='" + sender + '\'' +
                ", type='" + type + '\'' +
                ", priority='" + priority + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", hasDel=" + hasDel +
                ", gmtModified=" + gmtModified +
                ", contentId=" + contentId +
                ", attachCrowd='" + attachCrowd + '\'' +
                ", modifier='" + modifier + '\'' +

                '}';
    }
}
