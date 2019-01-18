package com.suke.czx.modules.sys.service;

import com.suke.czx.modules.sys.entity.CustomerEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
public interface CustomerService {
    List<CustomerEntity> queryList(HashMap<String, Object> stringObjectHashMap);
}
