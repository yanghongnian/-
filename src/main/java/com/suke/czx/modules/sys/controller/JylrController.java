package com.suke.czx.modules.sys.controller;

import com.suke.czx.common.annotation.SysLog;
import com.suke.czx.modules.sys.entity.CustomerAccountEntity;
import com.suke.czx.modules.sys.entity.CustomerEntity;
import com.suke.czx.modules.sys.service.CustomerAccountService;
import com.suke.czx.modules.sys.service.CustomerService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
@RestController
@RequestMapping("jylr")
public class JylrController {


    @Autowired
    CustomerService customerService;

    @SysLog("查询客户列表")
    @RequestMapping("/list")
    @RequiresPermissions("jylr:list")
    public List<CustomerEntity> list(){
        List<CustomerEntity> menuList = customerService.queryList(new HashMap<String, Object>());

        return menuList;
    }

}
