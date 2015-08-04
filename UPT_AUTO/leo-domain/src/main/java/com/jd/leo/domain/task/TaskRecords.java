package com.jd.leo.domain.task;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-1-15
 * Time: 上午9:29
 */
public class TaskRecords {
    private Long id;

    private Long taskId;

    private String operatorInfo;

    private String operator;

    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(String operatorInfo) {
        this.operatorInfo = operatorInfo == null ? null : operatorInfo.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
