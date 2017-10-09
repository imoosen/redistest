package com.imoosen.redis.manage;

import com.imoosen.redis.model.TChanlqyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by mengsen on 2017/9/30.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2017/9/30.
 */
@Service
public class RedisManager {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     *
     * @param key
     * @param value
     */
    public void setValue(String key,String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }

    /**
     *
     * @param key
     * @param value
     */
    public void setListLast(String key,String value){
        stringRedisTemplate.opsForList().rightPushAll(key,value);
    }

    /**
     *
     * @param tChanlqyInfo
     */
    public void setTChanlqyInfo(TChanlqyInfo tChanlqyInfo){
        redisTemplate.opsForValue().set(tChanlqyInfo.getRediskey(),tChanlqyInfo);
    }
}
