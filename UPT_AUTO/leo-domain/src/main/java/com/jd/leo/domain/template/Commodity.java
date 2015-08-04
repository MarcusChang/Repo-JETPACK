package com.jd.leo.domain.template;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-2-27
 * Time: 下午1:55
 */
public class Commodity {

    private String sku;
    private String name;
    private String picUrl;
    private Double marketPrice;
    private Double promotePrice;
    private Double promoteLabel;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(Double promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Double getPromoteLabel() {
        return promoteLabel;
    }

    public void setPromoteLabel(Double promoteLabel) {
        this.promoteLabel = promoteLabel;
    }
}
