package com.suke.czx.modules.sys.service.impl;

import com.suke.czx.modules.sys.dao.CoinManageDao;
import com.suke.czx.modules.sys.entity.CoinManageEntity;
import com.suke.czx.modules.sys.service.CoinManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/11.
 */
@Service
public class CoinManageServiceImpl implements CoinManageService {

    @Autowired
    CoinManageDao coinManageDao;

    @Override
    public List<CoinManageEntity> queryList(HashMap<String, Object> coinMap) {
        return coinManageDao.queryList(coinMap);
    }

    @Override
    public void save(CoinManageEntity coinManageEntity) {
        coinManageDao.save(coinManageEntity);
    }
}
