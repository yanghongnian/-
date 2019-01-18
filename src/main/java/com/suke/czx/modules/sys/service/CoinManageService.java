package com.suke.czx.modules.sys.service;

import com.suke.czx.modules.sys.entity.CoinManageEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/11.
 */
public interface CoinManageService {
    List<CoinManageEntity> queryList(HashMap<String, Object> stringObjectHashMap);

    void save(CoinManageEntity coinManageEntity);
}
