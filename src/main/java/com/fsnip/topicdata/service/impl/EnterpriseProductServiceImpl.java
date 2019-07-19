package com.fsnip.topicdata.service.impl;

import com.fsnip.topicdata.dao.EnterpriseProductDao;
import com.fsnip.topicdata.model.EnterpriseProduct;
import com.fsnip.topicdata.service.EnterpriseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/28.
 * @Modified By:
 */
@Component
public class EnterpriseProductServiceImpl implements EnterpriseProductService
{
    @Autowired
    private EnterpriseProductDao productDao;

    @Override
    public EnterpriseProduct findByBarcode(String code)
    {
        return productDao.findByBarcode(code);
    }

    @Override
    public List<EnterpriseProduct> findByName(String name, Integer offset, Integer limit)
    {
        //offset = offset != null && offset > 0 ? offset : 0;
        //limit = limit != null && limit > 0 ? limit : 20;
        return productDao.findByName(name, offset, limit);
    }

    @Override
    public int findByNameCount(String name) {
        return productDao.findByNameCount(name);
    }
}
