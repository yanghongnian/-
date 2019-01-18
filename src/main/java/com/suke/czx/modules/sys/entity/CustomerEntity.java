package com.suke.czx.modules.sys.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/1/14.
 */
public class CustomerEntity implements Serializable {
    private Long id;
    private Long employeeId;
    private Date createdate;
    private String cusName,remark,coinname;
    private int cusStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname;
    }

    public int getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(int cusStatus) {
        this.cusStatus = cusStatus;
    }
}
