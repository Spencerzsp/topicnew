package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.EnterpriseProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/28.
 * @Modified By:
 */
public interface EnterpriseProductService
{
    EnterpriseProduct findByBarcode(String code);

    List<EnterpriseProduct> findByName(String name, Integer offset, Integer limit);
    int findByNameCount(String name);
}
