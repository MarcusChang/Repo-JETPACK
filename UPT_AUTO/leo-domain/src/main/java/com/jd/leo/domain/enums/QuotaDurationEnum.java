package com.jd.leo.domain.enums;

import org.apache.commons.lang.time.DateUtils;

/**
 * Created by luotao on 2015/1/23.
 * 配额持续时间类型，月，年
 */
public enum  QuotaDurationEnum {
    Unknown(0, "未知"),
    Month(1, "按月"),
    Year(2, "按年");
    private Integer index;
    private String description;
    public static Integer Year_Default_Quota_Month=0;
    private QuotaDurationEnum(Integer index, String description) {
        this.index = index;
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIndex() {

        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
