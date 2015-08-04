package com.jd.leo.bigdata.domain;

/**
 * Created by cdsudan on 2015/4/22 0022 10:04 .
 */
public class City {

    public int getDimCountyId() {
        return dimCountyId;
    }

    public void setDimCountyId(int dimCountyId) {
        this.dimCountyId = dimCountyId;
    }

    public String getDimCountyName() {
        return dimCountyName;
    }

    public void setDimCountyName(String dimCountyName) {
        this.dimCountyName = dimCountyName;
    }

    public int getDimCityId() {
        return dimCityId;
    }

    public void setDimCityId(int dimCityId) {
        this.dimCityId = dimCityId;
    }

    public String getDimCityName() {
        return dimCityName;
    }

    public void setDimCityName(String dimCityName) {
        this.dimCityName = dimCityName;
    }

    public int getDimProvinceId() {
        return dimProvinceId;
    }

    public void setDimProvinceId(int dimProvinceId) {
        this.dimProvinceId = dimProvinceId;
    }

    public String getDimProvinceName() {
        return dimProvinceName;
    }

    public void setDimProvinceName(String dimProvinceName) {
        this.dimProvinceName = dimProvinceName;
    }

    public String getDimSubdName() {
        return dimSubdName;
    }

    public void setDimSubdName(String dimSubdName) {
        this.dimSubdName = dimSubdName;
    }

    public String getDimRegion() {
        return dimRegion;
    }

    public void setDimRegion(String dimRegion) {
        this.dimRegion = dimRegion;
    }

    public String getDimCityAdmLevel() {
        return dimCityAdmLevel;
    }

    public void setDimCityAdmLevel(String dimCityAdmLevel) {
        this.dimCityAdmLevel = dimCityAdmLevel;
    }

    public String getDimCountyAdmLevel() {
        return dimCountyAdmLevel;
    }

    public void setDimCountyAdmLevel(String dimCountyAdmLevel) {
        this.dimCountyAdmLevel = dimCountyAdmLevel;
    }

    public String getDimJxkhLevel() {
        return dimJxkhLevel;
    }

    public void setDimJxkhLevel(String dimJxkhLevel) {
        this.dimJxkhLevel = dimJxkhLevel;
    }


    private int dimCountyId;
    private String dimCountyName;
    private int dimCityId;
    private String dimCityName;
    private int dimProvinceId;
    private String dimProvinceName;

    /**机构名**/
    private String dimSubdName;
    /**区域**/
    private String dimRegion;
    /**城市行政级别**/
    private String dimCityAdmLevel;
    /**区县行政类别**/
    private String dimCountyAdmLevel;
    /**绩效考核城市级别**/
    private String dimJxkhLevel;
}
