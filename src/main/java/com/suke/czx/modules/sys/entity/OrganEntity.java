package com.suke.czx.modules.sys.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/8.
 */
public class OrganEntity implements Serializable {


    private Long organId;
    private Long pid;
    private String parentName;
    private int organCode;
    private String organName,organLianming;
    private int rank;
    private int type;
    private Boolean open;

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Long getOrganId() {
        return organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    public int getOrganCode() {
        return organCode;
    }

    public void setOrganCode(int organCode) {
        this.organCode = organCode;
    }



    public String getOrganLianming() {
        return organLianming;
    }

    public void setOrganLianming(String organLianming) {
        this.organLianming = organLianming;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
