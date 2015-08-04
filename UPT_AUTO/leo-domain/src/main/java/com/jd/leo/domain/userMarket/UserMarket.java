package com.jd.leo.domain.userMarket;

/**
 * Created by cdsudan on 2015/4/21 0021 13:55 .
 * 用户超市结果数据对象
 */
public class UserMarket {

    /**mongodb数据id**/
    private String uuid;

    /**类目ID 一二三级**/
    private String[] item_first_cate_cd;
    private String[] item_second_cate_cd;
    private String[] item_third_cate_cd;

    private String item_first_cate_cd_str;
    private String item_second_cate_cd_str;
    private String item_third_cate_cd_str;
    /**用户级别**/
    private String[] user_lv_desc;
    private String user_lv_desc_str;
    /**城市区域**/
    private String[] dim_region;
    private String dim_region_str;
    /**城市行政级别**/
    private String[] dim_city_adm_level;
    private String dim_city_adm_level_str;
    /**城市线级**/
    private String[] dim_jxkh_level;
    private String dim_jxkh_level_str;
    /**常用收货省市**/
    private String[] dim_province_name;
    private String[] dim_city_name;

    private String dim_province_name_str;
    private String dim_city_name_str;
    /**最近登录距今**/
    private Integer login_max_day;
    private Integer login_min_day;

    /**首次购买距今**/
    private Integer first_buy_max_day;
    private Integer first_buy_min_day;

    /**最近购买距今**/
    private Integer last_buy_max_day;
    private Integer last_buy_min_day;

    /**有效父单量**/
    private Integer valid_par_ord_num_max;
    private Integer valid_par_ord_num_min;

    /**有效订单金额**/
    private Integer valid_sale_amt_max;
    private Integer valid_sale_amt_min;

    /**7日浏览未购买**/
    private String browse_nobuy_user;
    /**30日加入购物车未购买**/
    private String addtocart_nobuy_user;
    /**7日搜索未购买**/
    private String search_nobuy_user;
    
    public String[] getItem_first_cate_cd() {
        return item_first_cate_cd;
    }

    public void setItem_first_cate_cd(String[] item_first_cate_cd) {
        this.item_first_cate_cd = item_first_cate_cd;
    }

    public String[] getItem_second_cate_cd() {
        return item_second_cate_cd;
    }

    public void setItem_second_cate_cd(String[] item_second_cate_cd) {
        this.item_second_cate_cd = item_second_cate_cd;
    }

    public String[] getItem_third_cate_cd() {
        return item_third_cate_cd;
    }

    public void setItem_third_cate_cd(String[] item_third_cate_cd) {
        this.item_third_cate_cd = item_third_cate_cd;
    }

    public String[] getUser_lv_desc() {
        return user_lv_desc;
    }

    public void setUser_lv_desc(String[] user_lv_desc) {
        this.user_lv_desc = user_lv_desc;
    }

    public String[] getDim_region() {
        return dim_region;
    }

    public void setDim_region(String[] dim_region) {
        this.dim_region = dim_region;
    }

    public String[] getDim_city_adm_level() {
        return dim_city_adm_level;
    }

    public void setDim_city_adm_level(String[] dim_city_adm_level) {
        this.dim_city_adm_level = dim_city_adm_level;
    }

    public String[] getDim_jxkh_level() {
        return dim_jxkh_level;
    }

    public void setDim_jxkh_level(String[] dim_jxkh_level) {
        this.dim_jxkh_level = dim_jxkh_level;
    }

    public String[] getDim_province_name() {
        return dim_province_name;
    }

    public void setDim_province_name(String[] dim_province_name) {
        this.dim_province_name = dim_province_name;
    }

    public String[] getDim_city_name() {
        return dim_city_name;
    }

    public void setDim_city_name(String[] dim_city_name) {
        this.dim_city_name = dim_city_name;
    }

    public Integer getLogin_max_day() {
        return login_max_day;
    }

    public void setLogin_max_day(Integer login_max_day) {
        this.login_max_day = login_max_day;
    }

    public Integer getLogin_min_day() {
        return login_min_day;
    }

    public void setLogin_min_day(Integer login_min_day) {
        this.login_min_day = login_min_day;
    }

    public Integer getFirst_buy_max_day() {
        return first_buy_max_day;
    }

    public void setFirst_buy_max_day(Integer first_buy_max_day) {
        this.first_buy_max_day = first_buy_max_day;
    }

    public Integer getFirst_buy_min_day() {
        return first_buy_min_day;
    }

    public void setFirst_buy_min_day(Integer first_buy_min_day) {
        this.first_buy_min_day = first_buy_min_day;
    }

    public Integer getLast_buy_max_day() {
        return last_buy_max_day;
    }

    public void setLast_buy_max_day(Integer last_buy_max_day) {
        this.last_buy_max_day = last_buy_max_day;
    }

    public Integer getLast_buy_min_day() {
        return last_buy_min_day;
    }

    public void setLast_buy_min_day(Integer last_buy_min_day) {
        this.last_buy_min_day = last_buy_min_day;
    }

    public Integer getValid_par_ord_num_max() {
        return valid_par_ord_num_max;
    }

    public void setValid_par_ord_num_max(Integer valid_par_ord_num_max) {
        this.valid_par_ord_num_max = valid_par_ord_num_max;
    }

    public Integer getValid_par_ord_num_min() {
        return valid_par_ord_num_min;
    }

    public void setValid_par_ord_num_min(Integer valid_par_ord_num_min) {
        this.valid_par_ord_num_min = valid_par_ord_num_min;
    }

    public Integer getValid_sale_amt_max() {
		return valid_sale_amt_max;
	}

	public void setValid_sale_amt_max(Integer valid_sale_amt_max) {
		this.valid_sale_amt_max = valid_sale_amt_max;
	}

	public Integer getValid_sale_amt_min() {
		return valid_sale_amt_min;
	}

	public void setValid_sale_amt_min(Integer valid_sale_amt_min) {
		this.valid_sale_amt_min = valid_sale_amt_min;
	}

	public String getBrowse_nobuy_user() {
        return browse_nobuy_user;
    }

    public void setBrowse_nobuy_user(String browse_nobuy_user) {
        this.browse_nobuy_user = browse_nobuy_user;
    }

    public String getAddtocart_nobuy_user() {
        return addtocart_nobuy_user;
    }

    public void setAddtocart_nobuy_user(String addtocart_nobuy_user) {
        this.addtocart_nobuy_user = addtocart_nobuy_user;
    }

    public String getSearch_nobuy_user() {
        return search_nobuy_user;
    }

    public void setSearch_nobuy_user(String search_nobuy_user) {
        this.search_nobuy_user = search_nobuy_user;
    }

    public String getItem_first_cate_cd_str() {
        return item_first_cate_cd_str;
    }

    public void setItem_first_cate_cd_str(String item_first_cate_cd_str) {
        this.item_first_cate_cd_str = item_first_cate_cd_str;
    }

    public String getItem_second_cate_cd_str() {
        return item_second_cate_cd_str;
    }

    public void setItem_second_cate_cd_str(String item_second_cate_cd_str) {
        this.item_second_cate_cd_str = item_second_cate_cd_str;
    }

    public String getItem_third_cate_cd_str() {
        return item_third_cate_cd_str;
    }

    public void setItem_third_cate_cd_str(String item_third_cate_cd_str) {
        this.item_third_cate_cd_str = item_third_cate_cd_str;
    }

    public String getUser_lv_desc_str() {
        return user_lv_desc_str;
    }

    public void setUser_lv_desc_str(String user_lv_desc_str) {
        this.user_lv_desc_str = user_lv_desc_str;
    }

    public String getDim_region_str() {
        return dim_region_str;
    }

    public void setDim_region_str(String dim_region_str) {
        this.dim_region_str = dim_region_str;
    }

    public String getDim_city_adm_level_str() {
        return dim_city_adm_level_str;
    }

    public void setDim_city_adm_level_str(String dim_city_adm_level_str) {
        this.dim_city_adm_level_str = dim_city_adm_level_str;
    }

    public String getDim_jxkh_level_str() {
        return dim_jxkh_level_str;
    }

    public void setDim_jxkh_level_str(String dim_jxkh_level_str) {
        this.dim_jxkh_level_str = dim_jxkh_level_str;
    }

    public String getDim_province_name_str() {
        return dim_province_name_str;
    }

    public void setDim_province_name_str(String dim_province_name_str) {
        this.dim_province_name_str = dim_province_name_str;
    }

    public String getDim_city_name_str() {
        return dim_city_name_str;
    }

    public void setDim_city_name_str(String dim_city_name_str) {
        this.dim_city_name_str = dim_city_name_str;
    }
}
