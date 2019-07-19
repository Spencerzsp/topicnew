package com.fsnip.topicdata.controller;

import com.fsnip.topicdata.model.LawsRegulations;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.service.LawsRegulationsService;
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
@RestController
@RequestMapping("/v1/laws/")
@Api(description = "法律法规查询接口")
public class LawsRegulationsController
{
    @Autowired
    private LawsRegulationsService service;

    @ApiOperation("根据法律法规内容条名称查询 例如：中华人民共和国广告法")
    @RequestMapping(value = "json/laws", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findLawByKeyWordJson(String title, Integer offset, Integer limit)
    {
        if (title!=null) {
            try {
                title = URLDecoder.decode(title, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findLawByKeyWord(title, offset, limit);
    }

    @ApiOperation("根据法律法规内容条名称查询 例如：中华人民共和国广告法")
    @RequestMapping(value = "xml/laws", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findLawByKeyWordXml(String title, Integer offset, Integer limit)
    {
        if (title!=null) {
            try {
                title = URLDecoder.decode(title, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findLawByKeyWord(title, offset, limit);
    }

    private ResponseMsg findLawByKeyWord(String title, Integer offset, Integer limit)
    {
        List<LawsRegulations> lawChapter = service.findLawChapter(title, offset, limit);
        int lawChapterCount=service.findLawChapterCount(title);
        ResponseMsg<List<LawsRegulations>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(lawChapterCount);
        return successMsg;
    }
}
