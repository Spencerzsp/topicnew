package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.LawsRegulations;
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
public interface LawsRegulationsDao
{
    List<LawsRegulations> findLawChapter(@Param("title") String keyword, @Param("offset") Integer offset, @Param("limit") Integer limit);
    int findLawChapterCount(@Param("title") String keyword);
}
