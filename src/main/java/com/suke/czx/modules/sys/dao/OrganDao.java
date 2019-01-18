package com.suke.czx.modules.sys.dao;

import com.suke.czx.modules.sys.entity.OrganEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/1/8.
 */
@Mapper
public interface OrganDao extends BaseDao<OrganEntity> {
    List<OrganEntity> queryNotButtonList();
}
