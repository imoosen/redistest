package com.imoosen.redis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TChanlqyInfo extends TChanlqyInfoKey implements Serializable{
    private String qyBatchid;

    private String intfcName;

    private String queryStatus;

    private String rediskey;

    private Date insertime;

    private String erroreason;
}