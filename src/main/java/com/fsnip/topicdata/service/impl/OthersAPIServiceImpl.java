package com.fsnip.topicdata.service.impl;

import com.fsnip.topicdata.dao.OthersAPIDao;
import com.fsnip.topicdata.model.ArticleDetail;
import com.fsnip.topicdata.model.ArticleDetailVo;
import com.fsnip.topicdata.model.ArticleInfo;
import com.fsnip.topicdata.model.ExamineInfo;
import com.fsnip.topicdata.service.OthersAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Encoder;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
@Component
public class OthersAPIServiceImpl implements OthersAPIService
{
    private static BASE64Encoder encoder = new BASE64Encoder();

    @Autowired
    private OthersAPIDao dao;

    @Override
    public List<ArticleInfo> findArticle(String articlecount, Integer offset, Integer limit)
    {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        List<ArticleInfo> articleInfos = dao.findArticleInfo(articlecount, offset, limit);
        return articleInfos;
    }

    @Override
    public int findArticleCount(String articlecount) {
        return dao.findArticleInfoCount(articlecount);
    }

    @Override
    public List<ArticleDetail> findArticleInfoByKey(String searchKeywords, Integer offset, Integer limit)
    {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findArticleInfoByKey(searchKeywords, offset, limit);
    }

    @Override
    public int findArticleInfoByKeyCount(String searchKeywords) {
        return dao.findArticleInfoByKeyCount(searchKeywords);
    }

    @Override
    public List<ArticleDetailVo> findArticleInfoByKeywords(String searchKeywords, Integer offset, Integer limit)
    {
        /*offset = offset != null && offset > 0 ? offset : 0;
        limit = limit != null && limit > 0 ? limit : 20;*/
        return dao.findArticleInfoByKeywords(searchKeywords, offset, limit);
    }

    @Override
    public int findArticleInfoByKeywordsCount(String searchKeywords) {
        return dao.findArticleInfoByKeywordsCount(searchKeywords);
    }
}
