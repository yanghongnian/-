package com.suke.czx.modules.sys.service.impl;

import com.suke.czx.modules.sys.dao.OrganDao;
import com.suke.czx.modules.sys.entity.OrganEntity;
import com.suke.czx.modules.sys.entity.SysMenuEntity;
import com.suke.czx.modules.sys.service.OrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/8.
 */
@Service
public class OrganServiceImpl implements OrganService {

    @Autowired
    OrganDao organDao;
    @Override
    public List<OrganEntity> queryList(HashMap<String, Object> map) {
        return organDao.queryList(map);
    }

    @Override
    public List<OrganEntity> queryNotButtonList() {

        return organDao.queryNotButtonList();
    }

    @Override
    public void save(OrganEntity organEntity) {
        organDao.save(organEntity);
    }
}
