package com.suke.czx.modules.sys.entity;

import java.util.Date;

/**
 * Created by Administrator on 2019/1/13.
 */
public class CurrencyPairEntity {

    private Long id;
    private String coin1,coin2,bjdw;
    private Long huilv;
    private Date createdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoin1() {
        return coin1;
    }

    public void setCoin1(String coin1) {
        this.coin1 = coin1;
    }

    public String getCoin2() {
        return coin2;
    }

    public void setCoin2(String coin2) {
        this.coin2 = coin2;
    }

    public String getBjdw() {
        return bjdw;
    }

    public void setBjdw(String bjdw) {
        this.bjdw = bjdw;
    }

    public Long getHuilv() {
        return huilv;
    }

    public void setHuilv(Long huilv) {
        this.huilv = huilv;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
