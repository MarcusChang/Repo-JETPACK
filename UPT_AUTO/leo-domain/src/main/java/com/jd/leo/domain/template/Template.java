package com.jd.leo.domain.template;


import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-2-27
 * Time: 下午1:39
 */
public class Template {

    private Integer id;
    private String name;
    private String templateXml;
    private String thumbnail;
    private String xmlKey;
    private String creator;
    private Integer status;
    private Integer hasDel;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer depId;
    private Integer copy;

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
        this.name = name;
    }

    public String getTemplateXml() {
        return templateXml;
    }

    public void setTemplateXml(String templateXml) {
        this.templateXml = templateXml;
    }

    public String getXmlKey() {
        return xmlKey;
    }

    public void setXmlKey(String xmlKey) {
        this.xmlKey = xmlKey;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHasDel() {
        return hasDel;
    }

    public void setHasDel(Integer hasDel) {
        this.hasDel = hasDel;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getCopy() {
        return copy;
    }

    public void setCopy(Integer copy) {
        this.copy = copy;
    }
}
