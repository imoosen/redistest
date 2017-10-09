package com.imoosen.redis.service;


import com.imoosen.redis.model.TChanlqyInfo;
import com.imoosen.redis.model.TChanlqyInfoKey;

import java.util.List;
import java.util.Map;

/**
 * Created by mengsen on 2017/9/28.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2017/9/28.
 */
public interface TChanlqyInfoService {
    int deleteByPrimaryKey(TChanlqyInfoKey key);

    int insert(TChanlqyInfo record);
    List<TChanlqyInfo> findChanlqyInfoByParams(Map<String, Object> param);
    int insertSelective(TChanlqyInfo record);

    TChanlqyInfo selectByPrimaryKey(TChanlqyInfoKey key);

    int updateByPrimaryKeySelective(TChanlqyInfo record);

    int updateByPrimaryKey(TChanlqyInfo record);

    List<TChanlqyInfo> listTChanlqyInfo();
}
