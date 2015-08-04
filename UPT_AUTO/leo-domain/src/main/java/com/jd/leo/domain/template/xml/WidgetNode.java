package com.jd.leo.domain.template.xml;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-2-27
 * Time: 下午3:24
 */
public class WidgetNode {

    private Integer widgetId;
    private String widgetContent;
    private StyleNode styleNode;

    public Integer getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(Integer widgetId) {
        this.widgetId = widgetId;
    }

    public String getWidgetContent() {
        return widgetContent;
    }

    public void setWidgetContent(String widgetContent) {
        this.widgetContent = widgetContent;
    }

    public StyleNode getStyleNode() {
        return styleNode;
    }

    public void setStyleNode(StyleNode styleNode) {
        this.styleNode = styleNode;
    }
}
