package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.OperatorsInfo;
import com.fsnip.topicdata.model.ProductionLicense;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
public interface ProductionLicenseService {
    List<ProductionLicense> findProductByCardId(String id,Integer offset,Integer limit);
    int findProductByCardIdCount(String id);

    List<OperatorsInfo> findOperatorByCardId(String id,Integer offset,Integer limit);
    int findOperatorByCardIdCount(String id);

    List<ProductionLicense> findProductByName(String name, Integer offset, Integer limit);
    int findProductByNameCount(String name);

    List<OperatorsInfo> findOperatorByName(String name,Integer offset, Integer limit);
    int findOperatorByNameCount(String name);
}
