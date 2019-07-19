package com.fsnip.topicdata.controller;


import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fsnip.topicdata.model.NameCount;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.model.SpBsbs;
import com.fsnip.topicdata.model.TableCount;
import com.fsnip.topicdata.service.CountService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@CrossOrigin(allowCredentials="true")
@RequestMapping("/v1/data")
public class DataController {

    @Autowired
    private CountService  countService;

    @RequestMapping(value = "json/getDataAddCount", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "查询表的数据增量", notes = "查询表的数据增量")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "表库名sp_core_e_spjyxkxx（经营许可）sc_core_sc_xkzxx（生产许可）" +
                    "fsn_cloud_product（产品信息）jg_system_jg_xcjlb（日常监督检查）jg_system_law_item_chapter（法律法规）" +
                    " article_detail（舆情系统）sp_bsbs", name = "type", dataType = "String"),
            @ApiImplicitParam(value = "第几页", name = "pageNum", dataType = "int"),
            @ApiImplicitParam(value = "每页数量,不传默认1000条", name = "pageSize", defaultValue = "1000" ,dataType = "int")

    })
    public ResponseMsg<IPage<NameCount>> getDataAddCount( @RequestParam(value = "type", required = true)String type,
                                                         @RequestParam(value = "pageNum", defaultValue = "1", required = false) int pageNum ,
                                                         @RequestParam(value = "pageSize", defaultValue = "1000", required = false) int pageSize){
        IPage<NameCount>  list  = countService.getNameCountList(type,pageNum,pageSize);
        ResponseMsg<IPage<NameCount>> successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }

    @RequestMapping(value = "json/getDataCount", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "查询表的数据总量", notes = "查询表的数据总量")
    /*@ApiImplicitParams({
            @ApiImplicitParam(value = "表库名sp_core_e_spjyxkxx（基本信息）sc_core_sc_xkzxx（基本信息表）" +
                    "fsn_cloud_product（产品信息）jg_system_jg_xcjlb（日常监督检查）jg_system_law_item_chapter（法律法规数据）" +
                    " article_detail（舆情相关数据）sp_bsbs", name = "type", dataType = "String")
    })*/
    public ResponseMsg< List<TableCount> > getDataCount(/*@RequestParam(value = "type", required = true)String type*/){
        List<TableCount>  list   = countService.totalCount();
        ResponseMsg< List<TableCount> > successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }

    @RequestMapping(value = "json/getTopology", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "拓扑图查询", notes = "拓扑图查询")
    /*@ApiImplicitParams({
            @ApiImplicitParam(value = "表库名sp_core_e_spjyxkxx（基本信息）sc_core_sc_xkzxx（基本信息表）" +
                    "fsn_cloud_product（产品信息）jg_system_jg_xcjlb（日常监督检查）jg_system_law_item_chapter（法律法规数据）" +
                    " article_detail（舆情相关数据）sp_bsbs", name = "type", dataType = "String")
    })*/
    public ResponseMsg<JSONArray> getTopology(/*@RequestParam(value = "type", required = true)String type*/){
        JSONArray  list   = countService.getTopology();
        ResponseMsg<JSONArray > successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }
}
