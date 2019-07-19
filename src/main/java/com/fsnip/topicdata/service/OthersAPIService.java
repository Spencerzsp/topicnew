package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.ArticleDetail;
import com.fsnip.topicdata.model.ArticleDetailVo;
import com.fsnip.topicdata.model.ArticleInfo;
import com.fsnip.topicdata.model.ExamineInfo;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
public interface OthersAPIService
{
    List<ArticleInfo> findArticle(String articlecount, Integer offset, Integer limit);
    int findArticleCount(String articlecount);

    List<ArticleDetail> findArticleInfoByKey(String searchKeywords, Integer offset, Integer limit);
    int findArticleInfoByKeyCount(String searchKeywords);

    List<ArticleDetailVo> findArticleInfoByKeywords(String searchKeywords, Integer offset, Integer limit);
    int findArticleInfoByKeywordsCount(String searchKeywords);
}
