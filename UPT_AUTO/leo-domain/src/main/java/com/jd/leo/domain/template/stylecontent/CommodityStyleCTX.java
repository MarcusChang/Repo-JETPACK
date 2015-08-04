package com.jd.leo.domain.template.stylecontent;

import com.jd.leo.domain.template.Commodity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-3-5
 * Time: 下午2:52
 */
public class CommodityStyleCTX extends StyleCTX{

    private List<Commodity> commodityList;

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }
}
