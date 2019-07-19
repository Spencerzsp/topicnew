package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.OperatorsInfo;
import com.fsnip.topicdata.model.ProductionLicense;
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
public interface ProductionLicenseDao
{
    List<ProductionLicense> findProductByCardId(@Param("id") String id,@Param("offset") Integer offset,@Param("limit") Integer limit);
    int findProductByCardIdCount(@Param("id") String id);

    List<OperatorsInfo> findOperatorByCardId(@Param("id") String id,@Param("offset") Integer offset,@Param("limit") Integer limit);
    int findOperatorByCardIdCount(@Param("id") String id);

    List<ProductionLicense> findProductByName(@Param("name") String name, @Param("offset") Integer offset, @Param("limit") Integer limit);
    int findProductByNameCount(@Param("name") String name);

    List<OperatorsInfo> findOperatorByName(@Param("name") String name, @Param("offset") Integer offset, @Param("limit") Integer limit);
    int findOperatorByNameCount(@Param("name") String name);

}
