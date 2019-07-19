package com.fsnip.topicdata.service.impl;

import com.fsnip.topicdata.dao.LawsRegulationsDao;
import com.fsnip.topicdata.model.LawsRegulations;
import com.fsnip.topicdata.service.LawsRegulationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
@Component
public class LawsRegulationsServiceImpl implements LawsRegulationsService
{
    @Autowired
    private LawsRegulationsDao dao;

    @Override
    public List<LawsRegulations> findLawChapter(String title, Integer offset, Integer limit)
    {
        //if (title != null && !title.equals(" "))
        //{
            //offset = offset != null && offset > 0 ? offset : 0;
            //limit = limit != null && limit > 0 ? limit : 20;
            return dao.findLawChapter(title, offset, limit);
        //}
       // return Arrays.asList(new LawsRegulations());
    }

    @Override
    public int findLawChapterCount(String title) {
        return dao.findLawChapterCount(title);
    }
}
