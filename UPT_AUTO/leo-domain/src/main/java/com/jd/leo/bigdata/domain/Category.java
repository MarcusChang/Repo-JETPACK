package com.jd.leo.bigdata.domain;

/**
 * Created by cdsudan on 2015/4/22 0022 10:12 .
 */
public class Category {
	private int dimItemGenThirdCateId;
    private String dimItemGenThirdCateName;

    private int dimItemGenSecondCateId;
    private String dimItemGenSecondCateName;

    private int dimItemGenFirstCateId;
    private String dimItemGenFirstCateName;

    /**排序序号**/
    private int sortNum;

    public int getDimItemGenThirdCateId() {
        return dimItemGenThirdCateId;
    }

    public void setDimItemGenThirdCateId(int dimItemGenThirdCateId) {
        this.dimItemGenThirdCateId = dimItemGenThirdCateId;
    }

    public String getDimItemGenThirdCateName() {
        return dimItemGenThirdCateName;
    }

    public void setDimItemGenThirdCateName(String dimItemGenThirdCateName) {
        this.dimItemGenThirdCateName = dimItemGenThirdCateName;
    }

    public int getDimItemGenSecondCateId() {
        return dimItemGenSecondCateId;
    }

    public void setDimItemGenSecondCateId(int dimItemGenSecondCateId) {
        this.dimItemGenSecondCateId = dimItemGenSecondCateId;
    }

    public String getDimItemGenSecondCateName() {
        return dimItemGenSecondCateName;
    }

    public void setDimItemGenSecondCateName(String dimItemGenSecondCateName) {
        this.dimItemGenSecondCateName = dimItemGenSecondCateName;
    }

    public int getDimItemGenFirstCateId() {
        return dimItemGenFirstCateId;
    }

    public void setDimItemGenFirstCateId(int dimItemGenFirstCateId) {
        this.dimItemGenFirstCateId = dimItemGenFirstCateId;
    }

    public String getDimItemGenFirstCateName() {
        return dimItemGenFirstCateName;
    }

    public void setDimItemGenFirstCateName(String dimItemGenFirstCateName) {
        this.dimItemGenFirstCateName = dimItemGenFirstCateName;
    }

    public int getSortNum() {
        return sortNum;
    }

    public void setSortNum(int sortNum) {
        this.sortNum = sortNum;
    }

}
