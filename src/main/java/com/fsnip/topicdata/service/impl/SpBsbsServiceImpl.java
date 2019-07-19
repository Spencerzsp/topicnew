package com.fsnip.topicdata.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fsnip.topicdata.dao.SpBsbsMapper;
import com.fsnip.topicdata.model.SpBsBsAnddata;
import com.fsnip.topicdata.model.SpBsbs;
import com.fsnip.topicdata.service.SpBsbsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fsnip.topicdata.service.SpdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户数据 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@Service
public class SpBsbsServiceImpl extends ServiceImpl<SpBsbsMapper, SpBsbs> implements SpBsbsService {


    @Autowired
    private SpdataService spdataService;
    @Override
    public boolean saveJson(String params) {
        SpBsbs   spBsbs = getSpbasbs(params);
        boolean flag = saveOrUpdate(spBsbs);
        return flag;
    }

    @Override
    public boolean saveJson(String paramsBabs, String paramsData) {
        SpBsbs   spBsbs = getSpbasbs(paramsBabs);
         boolean spbasbsflag = saveOrUpdate(spBsbs);

        boolean spdataflag  = spdataService.saveJson(paramsData,spBsbs.getId());
        if(spbasbsflag&&spdataflag){
            return spbasbsflag;
        }else{
            return  false;
        }

    }

    @Override
    public List<SpBsBsAnddata> getAllData(Map<String, String> map) {

        return baseMapper.getAllDataByMap(map);
    }

    @Override
    public List<SpBsbs> listByMaps(Map<String, String> map) {
        return baseMapper.listByMaps(map);
    }

    private SpBsbs getSpbasbs(String paramsBabs){

        JSONObject  obj = JSON.parseObject(paramsBabs);
        return   JSONObject.toJavaObject(obj,SpBsbs.class);
    }


}
