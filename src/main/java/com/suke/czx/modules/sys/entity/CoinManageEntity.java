package com.suke.czx.modules.sys.entity;

import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019/1/11.
 */
public class CoinManageEntity implements Serializable {

    private Long id,coinValue;
    private String isdelete,coinEnglish,coinChina,version;
    private Date createdate;


    public String getCoinChina() {
        return coinChina;
    }

    public void setCoinChina(String coinChina) {
        this.coinChina = coinChina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(Long coinValue) {
        this.coinValue = coinValue;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getCoinEnglish() {
        return coinEnglish;
    }

    public void setCoinEnglish(String coinEnglish) {
        this.coinEnglish = coinEnglish;
    }



    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
