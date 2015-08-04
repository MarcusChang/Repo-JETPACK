package com.jd.leo.domain.enums;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-3-2
 * Time: 下午3:51
 */
public enum WidgetTypeEnum {

//    HEAD(0, "head", "头部控件"),
//    TAIL(1, "tail", "尾部控件"),
//    TEXT(2, "text", "文本控件"),
    IMAGE(3, "image", "图片"),
    COMMODITY(4, "commodity", "商品"),
    COMMON(5, "common", "通用");

    private Integer index;
    private String type;
    private String description;

    private WidgetTypeEnum(Integer index, String type, String description) {
        this.index = index;
        this.type = type;
        this.description = description;
    }

    public static String getDescription(String type) {
        for (WidgetTypeEnum widgetTypeEnum : WidgetTypeEnum.values()) {
            if (widgetTypeEnum.type.equals(type)) {
                return widgetTypeEnum.description;
            }
        }
        return null;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
