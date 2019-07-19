package com.fsnip.topicdata.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fsnip.topicdata.dao.SpdataMapper;
import com.fsnip.topicdata.model.SpBsbs;
import com.fsnip.topicdata.model.Spdata;
import com.fsnip.topicdata.service.SpdataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户数据2表 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@Service
public class SpdataServiceImpl extends ServiceImpl<SpdataMapper, Spdata> implements SpdataService {


    @Override
    public boolean saveJson(String params) {
        Spdata spdata = getSpdata(params);
        boolean flag = saveOrUpdate(spdata);
        return flag;
    }

    @Override
    public boolean saveJson(String params, String id) {
        Spdata spdata = getSpdata(params);
        spdata.setId(id);
        return saveOrUpdate(spdata);
    }

    private  Spdata   getSpdata(String params){

        JSONObject obj = JSON.parseObject(params);
        return  JSONObject.toJavaObject(obj,Spdata.class);
    }

}
