package com.suke.czx.modules.sys.controller;

import com.suke.czx.common.annotation.SysLog;
import com.suke.czx.modules.sys.entity.CoinManageEntity;
import com.suke.czx.modules.sys.entity.CurrencyPairEntity;
import com.suke.czx.modules.sys.service.CurrencyPairService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/13.
 */
@RestController
@RequestMapping("currency/pair")
public class CurrencyPairController {

    @Autowired
    CurrencyPairService currencyPairService;

    @SysLog("查询货币对列表")
    @RequestMapping("/list")
    @RequiresPermissions("currency:pair:list")
    public List<CurrencyPairEntity> list(){
        List<CurrencyPairEntity> menuList = currencyPairService.queryList(new HashMap<String, Object>());

        return menuList;
    }


}
