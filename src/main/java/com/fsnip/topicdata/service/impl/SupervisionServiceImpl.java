package com.fsnip.topicdata.service.impl;

import com.fsnip.topicdata.dao.SupervisionDao;
import com.fsnip.topicdata.model.SupervisionInfo;
import com.fsnip.topicdata.service.SupervisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
@Component
public class SupervisionServiceImpl implements SupervisionService {
    @Autowired
    private SupervisionDao dao;

    @Override
    public List<SupervisionInfo> findSupervisionByNum(String name,Integer offset, Integer limit) {
        //offset = offset != null && offset > 0 ? offset : 0;
        //limit = limit != null && limit > 0 ? limit : 20;
        return dao.findSupervisionByNum(name,offset,limit);
    }

    @Override
    public int findSupervisionByNumCount(String name) {
        return dao.findSupervisionByNumCount(name);
    }

    @Override
    public List<SupervisionInfo> findSupervisionByName(String name, Integer offset, Integer limit) {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findSupervisionByName(name, offset, limit);
    }

    @Override
    public int findSupervisionByNameCount(String name) {
        return dao.findSupervisionByNameCount(name);
    }

}
