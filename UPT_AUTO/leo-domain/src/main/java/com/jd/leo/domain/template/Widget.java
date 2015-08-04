package com.jd.leo.domain.template;

import com.jd.leo.domain.enums.WidgetTypeEnum;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-2-27
 * Time: 下午1:41
 */
public class Widget {

    private Integer id;
    private String name;
    private String description;
    private WidgetTypeEnum type;
    private String html;
    private String content;
    private String htmlKey;
    private String thumbnail;
    private String creator;
    private Integer hasDel;
    private Date gmtCreate;
    private Date gmtModified;
    private String widgetTypeDes;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WidgetTypeEnum getType() {
        return type;
    }

    public void setType(WidgetTypeEnum type) {
        this.type = type;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtmlKey() {
        return htmlKey;
    }

    public void setHtmlKey(String htmlKey) {
        this.htmlKey = htmlKey;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

    public String getWidgetTypeDes() {
        return widgetTypeDes;
    }

    public void setWidgetTypeDes(String widgetTypeDes) {
        this.widgetTypeDes = widgetTypeDes;
    }
}
