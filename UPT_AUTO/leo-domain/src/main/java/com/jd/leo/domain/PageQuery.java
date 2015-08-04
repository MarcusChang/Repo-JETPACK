/**
 *
 */
package com.jd.leo.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;


/**
 * @author liukunyang
 */
public class PageQuery {
	
	public static final String CURRENT_PAGE = "currentPage";
	public static final String DIRECTION_ASC = "ASC";
	public static final String DIRECTION_DESC = "DESC";
	
	private int currentPageNo;
	private int pageSize = 10;
	private int startIndex;
	private int startRow;
	private int totalCount;
	private int pageCount;
	private String orderBy;
	private String direction;
	private Map<String, Object> params = null;
	
	public PageQuery(){
		if( params == null ){
			params = new HashMap<String, Object>();
		}
	}
	
	public PageQuery(int currentPageNo, int pageSize,Map<String, Object> params) {
		this.currentPageNo = currentPageNo;
		this.pageSize = pageSize;
		this.params = params;
	}
	
	public PageQuery(int pageSize, Map<String, Object> params) {
		this.pageSize = pageSize;
		this.params = params;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartIndex() {
		startIndex = (getCurrentPageNo() - 1) * pageSize;
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.init();
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

    /**
     * 获取下一页页码
     *
     * @return
     */
    public int getNextPage() {
        if (isLastPage()) {
            return getCurrentPageNo();
        }
        return getCurrentPageNo() + 1;
    }

    /**
     * 是否第一页
     *
     * @return
     */
    public boolean isFirstPage() {
        return getCurrentPageNo() <= 1;
    }


    /**
     * 获取上一页页码
     *
     * @return
     */
    public int getPreviousPage() {
        if (isFirstPage()) {
            return 1;
        }
        return getCurrentPageNo() - 1;
    }

    /**
     * 是否末页
     *
     * @return
     */
    public boolean isLastPage() {
        return getCurrentPageNo() >= getPageCount();
    }

    public int getCurrentPageNo() {
		if(currentPageNo==0){
			String cpn = String.valueOf(this.params.get(PageQuery.CURRENT_PAGE));
			if (StringUtils.isBlank(cpn) || !StringUtils.isNumeric(cpn)) {
				cpn = "0";
			}
			currentPageNo = Integer.parseInt(cpn);
		}
		if (currentPageNo < 1) currentPageNo = 1;
		if (currentPageNo > pageCount) currentPageNo = pageCount;
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.params.put(PageQuery.CURRENT_PAGE, String.valueOf(currentPageNo));
		this.currentPageNo = currentPageNo;
	}
	
	
	private void init() {
		pageCount = (int) totalCount / pageSize;
		if (totalCount % pageSize > 0 || pageCount == 0) {
			pageCount++;
		}
		
		// 把与分页相关的数据放入Map用于查询
		params.put("startIndex", getStartIndex());
		params.put("startRow", getStartIndex());
		params.put("pageSize", getPageSize());
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	
	public int getStartRow() {
		startRow = this.getStartIndex();
        return startRow;
    }
	
	public void setStartRow(int startRow) {
		this.setStartIndex(startRow);
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		params.put("order_by", this.getOrderBy());
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		params.put("sort_type", this.getDirection());
	}

    public boolean hasNextPage() {
        return getCurrentPageNo() < getPageCount();
    }
	
	/**
	 * 添加查询参数
	 * 
	 * @param name
	 * @param value
	 */
	public void addQueryParam(String name, Object value) {
		params.put(name, value);
	}

}
