package com.suke.czx.modules.sys.service;

import com.suke.czx.modules.sys.entity.OrganEntity;
import com.suke.czx.modules.sys.entity.SysMenuEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/8.
 */
public interface OrganService {
    List<OrganEntity> queryList(HashMap<String, Object> map);

    List<OrganEntity> queryNotButtonList();

    void save(OrganEntity organEntity);
}
