package com.fsnip.topicdata.controller;

import com.fsnip.topicdata.model.*;
import com.fsnip.topicdata.service.OthersAPIService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/28.
 * @Modified By:
 */
@Api(description = "舆情系统查询和检验检测查询接口")
@RestController
@RequestMapping("/v1/check/")
public class OthersAPIController {
    @Autowired
    private OthersAPIService service;

    @ApiOperation("舆情系统查询文章数量查询，例如：8")
    @RequestMapping(value = "json/article", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findArticleByNameJson(String count, Integer offset, Integer limit) {
        if (count != null) {
            try {
                count = URLDecoder.decode(count, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findArticleByName(count, offset, limit);
    }

    @ApiOperation("舆情系统查询文章数量查询，例如：8")
    @RequestMapping(value = "xml/article", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findArticleByNameXml(String count, Integer offset, Integer limit) {
        if (count != null) {
            try {
                count = URLDecoder.decode(count, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findArticleByName(count, offset, limit);
    }

    private ResponseMsg findArticleByName(String articlecount, Integer offset, Integer limit) {
        List<ArticleInfo> lawChapter = service.findArticle(articlecount, offset, limit);
        int count = service.findArticleCount(articlecount);
        ResponseMsg<List<ArticleInfo>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(count);
        return successMsg;
    }

    @ApiOperation("舆情系统文章标题核心词查询，例如：食品安全")
    @RequestMapping(value = "json/articledetail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findArticleByKeywordsJson(String searchKeywords, Integer offset, Integer limit) {
        if (searchKeywords != null) {
            try {
                searchKeywords = URLDecoder.decode(searchKeywords, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findArticleByKeywords(searchKeywords, offset, limit);
    }

    @ApiOperation("舆情系统文章标题核心词查询，例如：食品安全")
    @RequestMapping(value = "xml/articledetail", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findArticleByKeywordsXml(String searchKeywords, Integer offset, Integer limit) {
        if (searchKeywords != null) {
            try {
                searchKeywords = URLDecoder.decode(searchKeywords, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findArticleByKeywords(searchKeywords, offset, limit);
    }

    private ResponseMsg findArticleByKeywords(String searchKeywords, Integer offset, Integer limit) {
        List<ArticleDetail> artilcle = service.findArticleInfoByKey(searchKeywords, offset, limit);
        int count=service.findArticleInfoByKeyCount(searchKeywords);
        ResponseMsg<List<ArticleDetail>> successMsg = ResponseMsg.generatorSuccessMsg(artilcle);
        successMsg.setCount(count);
        return successMsg;
    }

    @ApiOperation("舆情系统的客户文章标题核心词查询，例如：酸奶")
    @RequestMapping(value = "json/articleclient", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findAritcleClientBykeyJson(String searchKeywords, Integer offset, Integer limit) {
        if (searchKeywords != null) {
            try {
                searchKeywords = URLDecoder.decode(searchKeywords, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findAritcleClientBykey(searchKeywords, offset, limit);
    }

    @ApiOperation("舆情系统的客户文章标题核心词查询，例如：酸奶")
    @RequestMapping(value = "xml/articleclient", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findAritcleClientBykeyXml(String searchKeywords, Integer offset, Integer limit) {
        if (searchKeywords != null) {
            try {
                searchKeywords = URLDecoder.decode(searchKeywords, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findAritcleClientBykey(searchKeywords, offset, limit);
    }

    private ResponseMsg findAritcleClientBykey(String searchKeywords, Integer offset, Integer limit) {
        List<ArticleDetailVo> articleDetailVos = service.findArticleInfoByKeywords(searchKeywords, offset, limit);
        int count=service.findArticleInfoByKeywordsCount(searchKeywords);
        ResponseMsg<List<ArticleDetailVo>> successMsg = ResponseMsg.generatorSuccessMsg(articleDetailVos);
        successMsg.setCount(count);
        return successMsg;
    }
}
