package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.SupervisionInfo;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
public interface SupervisionService {
    List<SupervisionInfo> findSupervisionByNum(String name,Integer offset, Integer limit);
    int findSupervisionByNumCount(String name);

    List<SupervisionInfo> findSupervisionByName(String name, Integer offset, Integer limit);
    int findSupervisionByNameCount(String name);

}
