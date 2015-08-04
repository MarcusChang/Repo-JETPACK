package com.jd.leo.domain.system;

import java.util.Date;

import com.jd.leo.domain.enums.TaskChannelEnum;

public class TestGroup {
    private Long id;

    private String groupName;

    private String testInfo;

    private TaskChannelEnum channelType;

    private String creator;

    private Date gmtCreate;

    private String modifier;

    private Date gmtModified;

    private Boolean hasDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getTestInfo() {
        return testInfo;
    }

    public void setTestInfo(String testInfo) {
        this.testInfo = testInfo == null ? null : testInfo.trim();
    }

    public TaskChannelEnum getChannelType() {
        return channelType;
    }

    public void setChannelType(TaskChannelEnum channelType) {
        this.channelType = channelType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getHasDel() {
        return hasDel;
    }

    public void setHasDel(Boolean hasDel) {
        this.hasDel = hasDel;
    }
}