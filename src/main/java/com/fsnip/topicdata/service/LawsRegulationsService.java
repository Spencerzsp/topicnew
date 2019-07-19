package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.LawsRegulations;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
public interface LawsRegulationsService
{
    List<LawsRegulations> findLawChapter(String title, Integer offset, Integer limit);
    int findLawChapterCount(String title);
}
