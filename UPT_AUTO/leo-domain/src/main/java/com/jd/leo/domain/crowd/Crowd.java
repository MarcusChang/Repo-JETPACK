package com.jd.leo.domain.crowd;

import org.apache.commons.lang.StringUtils;

import java.util.Date;

public class Crowd {
    private Integer id;

    private String name;

    private Integer depId;

    private String depName;

    private String crowdPath;

    private String uploadCol;

    private String targetCol;

    private String source;

    private Date gmtModified;

    private Short hasDel;

    private String condition;

    private String states;

    private String oldStates;

    private String statesDescribe;

    private String creator;

    public String getOldStates() {
        return oldStates;
    }

    public void setOldStates(String oldStates) {
        this.oldStates = oldStates;
    }

    private Date gmtCreate;

    private String modifier;

    private int crowdNum;

    private String gmtCreateStr;

    private String gmtModifyStr;

    private Integer isSelf;

    private Integer isUse;

    private String filterId;

    private String crowdMd5;

    private Date gmtExec;

    public String getGmtModifyStr() {
        return gmtModifyStr;
    }

    public void setGmtModifyStr(String gmtModifyStr) {
        this.gmtModifyStr = gmtModifyStr;
    }

    public Date getGmtExec() {
        return gmtExec;
    }

    public void setGmtExec(Date gmtExec) {
        this.gmtExec = gmtExec;
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public String getCrowdMd5() {
        return crowdMd5;
    }

    public void setCrowdMd5(String crowdMd5) {
        this.crowdMd5 = crowdMd5;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getGmtCreateStr() {
        return gmtCreateStr;
    }

    public void setGmtCreateStr(String gmtCreateStr) {
        this.gmtCreateStr = gmtCreateStr;
    }

    public int getCrowdNum() {
        return crowdNum;
    }

    public void setCrowdNum(int crowdNum) {
        this.crowdNum = crowdNum;
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
        this.name = name == null ? null : name.trim();
    }

    public String getCrowdPath() {
        return crowdPath;
    }

    public void setCrowdPath(String crowdPath) {
        this.crowdPath = crowdPath == null ? null : crowdPath.trim();
    }

    public String getUploadCol() {
        return uploadCol;
    }

    public Integer getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Integer isSelf) {
        this.isSelf = isSelf;
    }

    public void setUploadCol(String uploadCol) {
        this.uploadCol = uploadCol == null ? null : uploadCol.trim();
    }

    public String getTargetCol() {
        return targetCol;
    }

    public void setTargetCol(String targetCol) {
        this.targetCol = targetCol == null ? null : targetCol.trim();
    }

    public String getSource() {
        return source;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Short getHasDel() {
        return hasDel;
    }

    public void setHasDel(Short hasDel) {
        this.hasDel = hasDel;
    }

    public String getCondition() {
        return condition;
    }

    public String getStatesDescribe() {
        return statesDescribe;
    }

    public void setStatesDescribe(String statesDescribe) {
        this.statesDescribe = statesDescribe;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states == null ? null : states.trim();
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



    @Override
    public String toString() {
        return "Crowd{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depName='" + depId + '\'' +
                ", crowdPath='" + crowdPath + '\'' +
                ", creator='" + creator + '\'' +
                ", uploadCol='" + uploadCol + '\'' +
                ", targetCol=" + targetCol +
                ", gmtCreate=" + gmtCreate +
                ", hasDel=" + hasDel +
                ", gmtModified=" + gmtModified +
                ", source=" + source +
                ", states='" + states + '\'' +
                ", modifier='" + modifier + '\'' +
                ", condition=" + condition +

                '}';
    }

}