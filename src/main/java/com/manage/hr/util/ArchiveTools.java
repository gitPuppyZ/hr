package com.manage.hr.util;

import java.util.Date;

public class ArchiveTools {
    private String  archCode;
    private Integer reviewStatus;
    private Integer archStatus;
    private Date beginTime;
    private Date endTime;

    public String getArchCode() {
        return archCode;
    }

    public void setArchCode(String archCode) {
        this.archCode = archCode;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Integer getArchStatus() {
        return archStatus;
    }

    public void setArchStatus(Integer archStatus) {
        this.archStatus = archStatus;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
