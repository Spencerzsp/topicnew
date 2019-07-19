package com.fsnip.topicdata.service.impl;

import com.fsnip.topicdata.dao.ProductionLicenseDao;
import com.fsnip.topicdata.model.OperatorsInfo;
import com.fsnip.topicdata.model.ProductionLicense;
import com.fsnip.topicdata.service.ProductionLicenseService;
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
public class ProductionLicenseServiceImpl implements ProductionLicenseService {
    @Autowired
    private ProductionLicenseDao dao;

    @Override
    public List<ProductionLicense> findProductByCardId(String id,Integer offset,Integer limit) {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findProductByCardId(id,offset,limit);
    }

    @Override
    public int findProductByCardIdCount(String id) {
        return dao.findProductByCardIdCount(id);
    }

    @Override
    public List<OperatorsInfo> findOperatorByCardId(String id,Integer offset,Integer limit) {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findOperatorByCardId(id,offset,limit);
    }

    @Override
    public int findOperatorByCardIdCount(String id) {
        return dao.findOperatorByCardIdCount(id);
    }

    @Override
    public List<ProductionLicense> findProductByName(String name,Integer offset,Integer limit) {
       /* offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findProductByName(name,offset,limit);
    }

    @Override
    public int findProductByNameCount(String name) {
        return dao.findProductByNameCount(name);
    }

    @Override
    public List<OperatorsInfo> findOperatorByName(String name,Integer offset, Integer limit) {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findOperatorByName(name,offset,limit);
    }

    @Override
    public int findOperatorByNameCount(String name) {
        return dao.findOperatorByNameCount(name);
    }

}
