package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.ArticleDetail;
import com.fsnip.topicdata.model.ArticleDetailVo;
import com.fsnip.topicdata.model.ArticleInfo;
import com.fsnip.topicdata.model.ExamineInfo;
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
public interface OthersAPIDao {
    List<ArticleInfo> findArticleInfo(@Param("articlecount") String articlecount, @Param("offset") Integer offset, @Param("limit") Integer limit);

    int findArticleInfoCount(@Param("articlecount") String articlecount);

    List<ArticleDetail> findArticleInfoByKey(@Param("searchKeywords") String searchKeywords, @Param("offset") Integer offset, @Param("limit") Integer limit);

    int findArticleInfoByKeyCount(@Param("searchKeywords") String searchKeywords);

    List<ArticleDetailVo> findArticleInfoByKeywords(@Param("searchKeywords") String searchKeywords, @Param("offset") Integer offset, @Param("limit") Integer limit);

    int findArticleInfoByKeywordsCount(@Param("searchKeywords") String searchKeywords);
}
