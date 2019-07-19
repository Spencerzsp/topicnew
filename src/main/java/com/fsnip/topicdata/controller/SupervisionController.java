package com.fsnip.topicdata.controller;

import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.model.SupervisionInfo;
import com.fsnip.topicdata.service.SupervisionService;
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
@RequestMapping("/v1/supervision/")
@Api(description = "日常监督检查查询接口")
public class SupervisionController {
    @Autowired
    private SupervisionService service;

    @ApiOperation("日常监督检查的检查单位查询 例如 ：安顺市普定县市场监管局补郎分局")
    @RequestMapping(value = "json/supervisionunit", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findSupervisionByNumJson(String name,Integer offset,Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findSupervisionByNum(name,offset,limit);
    }

    @ApiOperation("日常监督检查的检查单位查询 例如 ：安顺市普定县市场监管局补郎分局")
    @RequestMapping(value = "xml/supervisionunit", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findSupervisionByNumXml(String name,Integer offset,Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findSupervisionByNum(name,offset,limit);
    }

    private ResponseMsg findSupervisionByNum(String name,Integer offset,Integer limit) {
        List<SupervisionInfo> lawChapter = service.findSupervisionByNum(name,offset,limit);
        int lawChapterCount=service.findSupervisionByNumCount(name);
        ResponseMsg<List<SupervisionInfo>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(lawChapterCount);
        return successMsg;
    }

    @ApiOperation("日常监督检查的主体名称查询 例如 ：思南县思林乡")
    @RequestMapping(value = "json/supervisionname", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findSupervisionByNameJson(String name, Integer offset, Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findSupervisionByName(name, offset, limit);
    }

    @ApiOperation("日常监督检查的主体名称查询 例如 ：思南县思林乡")
    @RequestMapping(value = "xml/supervisionname", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findSupervisionByNameXml(String name, Integer offset, Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findSupervisionByName(name, offset, limit);
    }

    private ResponseMsg findSupervisionByName(String name, Integer offset, Integer limit) {
        List<SupervisionInfo> lawChapter = service.findSupervisionByName(name, offset, limit);
        int count=service.findSupervisionByNameCount(name);
        ResponseMsg<List<SupervisionInfo>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(count);
        return successMsg;
    }
}
