package com.jd.leo.domain.task;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: hesonglin
 * Date: 15-1-15
 * Time: 上午9:29
 */
public class TaskCrowd {
    private Integer id;

    private Integer taskId;

    private Integer crowdId;

    private Integer ceilingNum;

    private Integer filteredNum;

    private Integer crowdNum;

    private Integer blackNum;

    private Integer regNum;

    private Integer ndaysNum;

    private Integer othersNum;

    private Long kid;

    private Date gmtModified;

    private Integer hasDel;

    private Long klid;

    private String creator;

    private Date gmtCreate;

    private String modifier;
    
    private Integer synTaskId;
    
    private Long synCursor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getCrowdId() {
        return crowdId;
    }

    public void setCrowdId(Integer crowdId) {
        this.crowdId = crowdId;
    }

    public Integer getCeilingNum() {
        return ceilingNum;
    }

    public void setCeilingNum(Integer ceilingNum) {
        this.ceilingNum = ceilingNum;
    }

    public Integer getFilteredNum() {
        return filteredNum;
    }

    public void setFilteredNum(Integer filteredNum) {
        this.filteredNum = filteredNum;
    }

    public Integer getCrowdNum() {
        return crowdNum;
    }

    public void setCrowdNum(Integer crowdNum) {
        this.crowdNum = crowdNum;
    }

    public Integer getBlackNum() {
        return blackNum;
    }

    public void setBlackNum(Integer blackNum) {
        this.blackNum = blackNum;
    }

    public Integer getRegNum() {
        return regNum;
    }

    public void setRegNum(Integer regNum) {
        this.regNum = regNum;
    }

    public Integer getNdaysNum() {
        return ndaysNum;
    }

    public void setNdaysNum(Integer ndaysNum) {
        this.ndaysNum = ndaysNum;
    }

    public Integer getOthersNum() {
        return othersNum;
    }

    public void setOthersNum(Integer othersNum) {
        this.othersNum = othersNum;
    }


    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getHasDel() {
        return hasDel;
    }

    public void setHasDel(Integer hasDel) {
        this.hasDel = hasDel;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

	public Integer getSynTaskId() {
		return synTaskId;
	}

	public void setSynTaskId(Integer synTaskId) {
		this.synTaskId = synTaskId;
	}

	public Long getSynCursor() {
		return synCursor;
	}

	public void setSynCursor(Long synCursor) {
		this.synCursor = synCursor;
	}

}
