package com.suke.czx.modules.sys.service;

import com.suke.czx.modules.sys.entity.CustomerAccountEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
public interface CustomerAccountService {
    List<CustomerAccountEntity> queryList(HashMap<String, Object> stringObjectHashMap);
}
