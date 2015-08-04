package com.jd.leo.domain.system;

import java.util.Date;

import com.jd.leo.domain.enums.TaskChannelEnum;

public class DepQuota {
    private Long id;

    private Long depId;

    private String depName;

    private Long usedQuota;

    private Long withholdQuota;

    private Long availableQuota;

    private Long quota;

    private TaskChannelEnum channelType;

    private Integer quotaYear;
    private Integer quotaMonth;

    private String creator;

    private Date gmtCreate;

    private String modifier;

    private Date gmtModified;

    private Byte hasDel;

    private Double usedPercent;

    private Double percentInAll;

    public Long getAvailableQuota() {
        return availableQuota;
    }

    public void setAvailableQuota(Long availableQuota) {
        this.availableQuota = availableQuota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Long getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Long usedQuota) {
        this.usedQuota = usedQuota;
    }

    public Long getWithholdQuota() {
        return withholdQuota;
    }

    public void setWithholdQuota(Long withholdQuota) {
        this.withholdQuota = withholdQuota;
    }

    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }


    public TaskChannelEnum getChannelType() {
        return channelType;
    }

    public void setChannelType(TaskChannelEnum channelType) {
        this.channelType = channelType;
    }

    public Integer getQuotaYear() {
        return quotaYear;
    }

    public void setQuotaYear(Integer quotaYear) {
        this.quotaYear = quotaYear;
    }

    public Integer getQuotaMonth() {
        return quotaMonth;
    }

    public void setQuotaMonth(Integer quotaMonth) {
        this.quotaMonth = quotaMonth;
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

    public Byte getHasDel() {
        return hasDel;
    }

    public void setHasDel(Byte hasDel) {
        this.hasDel = hasDel;
    }

    public Double getUsedPercent() {
        return usedPercent;
    }

    public void setUsedPercent(Double usedPercent) {
        this.usedPercent = usedPercent;
    }

    public Double getPercentInAll() {
        return percentInAll;
    }

    public void setPercentInAll(Double percentInAll) {
        this.percentInAll = percentInAll;
    }
}