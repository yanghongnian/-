package com.suke.czx.modules.sys.service;

import com.suke.czx.modules.sys.entity.CurrencyPairEntity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/1/13.
 */
public interface CurrencyPairService {
    List<CurrencyPairEntity> queryList(HashMap<String, Object> stringObjectHashMap);
}
