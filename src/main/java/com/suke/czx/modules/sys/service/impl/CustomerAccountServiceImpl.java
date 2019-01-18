package com.suke.czx.modules.sys.service.impl;

import com.suke.czx.modules.sys.dao.CustomerAccountDao;
import com.suke.czx.modules.sys.entity.CustomerAccountEntity;
import com.suke.czx.modules.sys.service.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
@Service
public class CustomerAccountServiceImpl implements CustomerAccountService {

    @Autowired
    CustomerAccountDao customerAccountDao;

    @Override
    public List<CustomerAccountEntity> queryList(HashMap<String, Object> stringObjectHashMap) {
        return customerAccountDao.queryList(stringObjectHashMap);
    }
}
