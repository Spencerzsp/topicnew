package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.EnterpriseProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/28.
 * @Modified By:
 */
@Mapper
public interface EnterpriseProductDao
{
    EnterpriseProduct findByBarcode(String code);

    List<EnterpriseProduct> findByName(@Param("name") String name, @Param("offset") Integer offset, @Param("limit") Integer limit);
    int findByNameCount(@Param("name") String name);
}
