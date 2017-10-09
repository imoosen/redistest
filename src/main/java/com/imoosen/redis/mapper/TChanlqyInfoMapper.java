package com.imoosen.redis.mapper;


import com.imoosen.redis.model.TChanlqyInfo;
import com.imoosen.redis.model.TChanlqyInfoKey;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@CacheConfig()
public interface TChanlqyInfoMapper extends Repository {

    int deleteByPrimaryKey(TChanlqyInfoKey key);

    List<TChanlqyInfo> listTChanlqyInfo();
    List<TChanlqyInfo> findChanlqyInfoByParams(Map<String, Object> param);

    int insert(TChanlqyInfo record);

    int insertSelective(TChanlqyInfo record);

    @Cacheable(key ="#p0")
    TChanlqyInfo selectByPrimaryKey(TChanlqyInfoKey key);

    int updateByPrimaryKeySelective(TChanlqyInfo record);

    int updateByPrimaryKey(TChanlqyInfo record);
}