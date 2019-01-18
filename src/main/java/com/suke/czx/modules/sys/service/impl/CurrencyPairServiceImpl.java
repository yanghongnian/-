package com.suke.czx.modules.sys.service.impl;

import com.suke.czx.modules.sys.dao.CurrencyPairDao;
import com.suke.czx.modules.sys.entity.CurrencyPairEntity;
import com.suke.czx.modules.sys.service.CurrencyPairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/13.
 */
@Service
public class CurrencyPairServiceImpl implements CurrencyPairService {

    @Autowired
    CurrencyPairDao currencyPairDao;
    @Override
    public List<CurrencyPairEntity> queryList(HashMap<String, Object> stringObjectHashMap) {
        return currencyPairDao.queryList(stringObjectHashMap);
    }
}
