package com.suke.czx.modules.sys.controller;

import com.suke.czx.common.annotation.SysLog;
import com.suke.czx.common.utils.R;
import com.suke.czx.common.validator.ValidatorUtils;
import com.suke.czx.common.validator.group.AddGroup;
import com.suke.czx.modules.sys.entity.CoinManageEntity;
import com.suke.czx.modules.sys.entity.OrganEntity;
import com.suke.czx.modules.sys.entity.SysUserEntity;
import com.suke.czx.modules.sys.service.CoinManageService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/11.
 */
@RestController
@RequestMapping("coin/manage")
public class CoinManageController {

    @Autowired
    CoinManageService coinManageService;

    @SysLog("查询组织机构列表")
    @RequestMapping("/list")
    @RequiresPermissions("coin:manage:list")
    public List<CoinManageEntity> list(){
        List<CoinManageEntity> menuList = coinManageService.queryList(new HashMap<String, Object>());

        return menuList;
    }


    @SysLog("保存货币管理")
    @RequestMapping("/save")
    @RequiresPermissions("coin:manage:save")
    public R save(@RequestBody CoinManageEntity coinManageEntity){



        coinManageService.save(coinManageEntity);

        return R.ok();
    }
}
