package com.fsnip.topicdata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.model.Spdata;
import com.fsnip.topicdata.service.SpdataService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 用户数据2表 前端控制器
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@RestController
@CrossOrigin(allowCredentials="true")
@RequestMapping("/v1/spdata")
public class SpdataController {

    @Autowired
    private SpdataService spdataService;


    @ApiOperation("用户上传的json数据2")
    @RequestMapping(value = "json/saveSpdata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "json数据", name = "params", dataType = "String")
    })
    public ResponseMsg<Boolean> saveSpdata(String params) {
        boolean  flag = spdataService.saveJson(params);
        ResponseMsg<Boolean> successMsg = ResponseMsg.generatorSuccessMsg(flag);
        return  successMsg;
    }
    @RequestMapping(value = "json/listByQuerySpdata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "api用户上传的json数据1", notes = "api用户上传的json数据1")
    @ApiImplicitParams({

            @ApiImplicitParam(value = "检验项目", name = "spdata_0", dataType = "String")
    })
    public ResponseMsg<List<Spdata>> listByQuerySpdata(@RequestParam(value = "spdata_0", required = false)String spdata_0) {

        QueryWrapper<Spdata> query = new QueryWrapper<Spdata>();
        if(StringUtils.isNotEmpty(spdata_0)){
            query.eq("spdata_0",spdata_0);
        }
        List<Spdata>  list  = spdataService.list(query);
        ResponseMsg<List<Spdata>> successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }


}

