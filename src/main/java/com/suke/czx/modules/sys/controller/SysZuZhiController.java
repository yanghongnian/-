package com.suke.czx.modules.sys.controller;

import com.suke.czx.common.annotation.SysLog;
import com.suke.czx.common.exception.RRException;
import com.suke.czx.common.utils.Constant;
import com.suke.czx.common.utils.PageUtils;
import com.suke.czx.common.utils.Query;
import com.suke.czx.common.utils.R;
import com.suke.czx.common.validator.Assert;
import com.suke.czx.modules.sys.entity.OrganEntity;
import com.suke.czx.modules.sys.entity.SysMenuEntity;
import com.suke.czx.modules.sys.entity.SysUserEntity;
import com.suke.czx.modules.sys.service.OrganService;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/8.
 */
@RestController
@RequestMapping("sys/zuzhi")
public class SysZuZhiController extends AbstractController {

    @Autowired
    OrganService organService;


    /**
     * 所有菜单列表
     */
    @SysLog("查询组织机构列表")
    @RequestMapping("/list")
    @RequiresPermissions("sys:zuzhi:list")
    public List<OrganEntity> list(){
        List<OrganEntity> menuList = organService.queryList(new HashMap<String, Object>());

        return menuList;
    }


    @RequestMapping("/select")
    @RequiresPermissions("sys:zuzhi:select")
    public R select(){
        //查询列表数据
        List<OrganEntity> menuList = organService.queryNotButtonList();

        //添加顶级菜单
        OrganEntity root = new OrganEntity();
        root.setOrganId(0L);
        root.setOrganName("总公司");
        root.setPid(-1L);
        root.setOpen(true);
        menuList.add(root);

        return R.ok().put("menuList", menuList);
    }


    @SysLog("保存机构")
    @RequestMapping("/save")
    @RequiresPermissions("sys:zuzhi:save")
    public R save(@RequestBody OrganEntity organEntity){
        //数据校验
        verifyForm(organEntity);
        organService.save(organEntity);

        return R.ok();
    }



    private void verifyForm(OrganEntity organ){
        if(StringUtils.isBlank(organ.getOrganName())){
            throw new RRException("机构名称不能为空");
        }

        if(organ.getOrganCode() == 0){
            throw new RRException("机构编码不能为空");
        }




    }









}
