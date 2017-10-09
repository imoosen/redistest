package com.imoosen.redis.controller;

import com.imoosen.redis.model.TChanlqyInfo;
import com.imoosen.redis.service.TChanlqyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengsen on 2017/9/30.
 *
 * @Description: [一句话描述该类的功能]
 * @UpdateUser: mengsen on 2017/9/30.
 */
@RestController
public class TChanlqyInfoController {

    @Autowired
    private TChanlqyInfoService tChanlqyInfoService;

    public TChanlqyInfo getTChanlqyInfo(){
        tChanlqyInfoService.
    }

}
