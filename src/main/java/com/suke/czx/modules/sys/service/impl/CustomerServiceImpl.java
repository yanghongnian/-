package com.suke.czx.modules.sys.service.impl;

import com.suke.czx.modules.sys.dao.CustomerDao;
import com.suke.czx.modules.sys.entity.CustomerEntity;
import com.suke.czx.modules.sys.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/14.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public List<CustomerEntity> queryList(HashMap<String, Object> stringObjectHashMap) {
        return customerDao.queryList(stringObjectHashMap);
    }
}
