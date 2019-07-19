package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.SupervisionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
@Mapper
public interface SupervisionDao
{
    List<SupervisionInfo> findSupervisionByNum(@Param("name") String name,@Param("offset") Integer offset,@Param("limit") Integer limit);
    int findSupervisionByNumCount(@Param("name") String name);

    List<SupervisionInfo> findSupervisionByName(@Param("name") String name, @Param("offset") Integer offset, @Param("limit") Integer limit);
    int findSupervisionByNameCount(@Param("name") String name);
}
