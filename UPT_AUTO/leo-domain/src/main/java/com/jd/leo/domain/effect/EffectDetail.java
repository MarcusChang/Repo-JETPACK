package com.jd.leo.domain.effect;

/**
 * Created by Administrator on 2015/5/11.
 */
public class EffectDetail {

    private Long id;

    private String statDate;

    private Long kid;

    private Long klid;

    private Integer sourceType;

    private Integer sent;

    private Integer sentSuccess;

    private Integer opens;

    private Integer click;

    private Integer uniqClick;

    private Integer pv;

    private Integer uv;

    private Integer buy;

    private Integer firstBuy;

    private Integer orders;

    private Double amount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public Long getKlid() {
        return klid;
    }

    public void setKlid(Long klid) {
        this.klid = klid;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getSent() {
        return sent;
    }

    public void setSent(Integer sent) {
        this.sent = sent;
    }

    public Integer getSentSuccess() {
        return sentSuccess;
    }

    public void setSentSuccess(Integer sentSuccess) {
        this.sentSuccess = sentSuccess;
    }

    public Integer getOpens() {
        return opens;
    }

    public void setOpens(Integer opens) {
        this.opens = opens;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Integer getUniqClick() {
        return uniqClick;
    }

    public void setUniqClick(Integer uniqClick) {
        this.uniqClick = uniqClick;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getBuy() {
        return buy;
    }

    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    public Integer getFirstBuy() {
        return firstBuy;
    }

    public void setFirstBuy(Integer firstBuy) {
        this.firstBuy = firstBuy;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
