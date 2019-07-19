package com.fsnip.topicdata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.model.SpBsBsAnddata;
import com.fsnip.topicdata.model.SpBsbs;
import com.fsnip.topicdata.model.SupervisionInfo;
import com.fsnip.topicdata.service.SpBsbsService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户数据 前端控制器
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@RestController
@CrossOrigin(allowCredentials="true")
@RequestMapping("/v1/spBsbs")
public class SpBsbsController {

    @Autowired
    private SpBsbsService  spBsbsService;

    @ApiOperation("用户上传的json数据1")
    @RequestMapping(value = "json/saveSpBsbs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "json数据", name = "params", dataType = "String")
    })
    public ResponseMsg<Boolean> saveSpBsbs(String params) {
        boolean  flag = spBsbsService.saveJson(params);
        ResponseMsg<Boolean> successMsg = ResponseMsg.generatorSuccessMsg(flag);
        return  successMsg;
    }

    @ApiOperation("用户上传的json数据1和2")
    @RequestMapping(value = "json/saveSpBabsAndSpData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "bsbsjson数据", name = "paramsBabs", dataType = "String"),
            @ApiImplicitParam(value = "datajson数据", name = "paramsData", dataType = "String")
    })
    public ResponseMsg<Boolean> saveSpBabsAndSpData(String paramsBsbs,String paramsData) {
        boolean  flag = spBsbsService.saveJson(paramsBsbs,paramsData);
        ResponseMsg<Boolean> successMsg = ResponseMsg.generatorSuccessMsg(flag);
        return  successMsg;
    }

    @RequestMapping(value = "json/listByQuerySpBsbs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "api用户上传的json数据1", notes = "api用户上传的json数据1")
    @ApiImplicitParams({

            @ApiImplicitParam(value = "抽样编号", name = "sp_s_16", dataType = "String"),
            @ApiImplicitParam(value = "食品大类", name = "sp_s_17", dataType = "String"),
            @ApiImplicitParam(value = "抽样单位名称,模糊匹配", name = "sp_s_35", dataType = "String"),
            @ApiImplicitParam(value = "检验机构名称,模糊匹配", name = "sp_s_43", dataType = "String"),
            @ApiImplicitParam(value = "第几页", name = "pageNum", dataType = "int"),
            @ApiImplicitParam(value = "每页数量,不传默认1000条", name = "pageSize", defaultValue = "1000" ,dataType = "int")
    })
    public ResponseMsg<List<SpBsbs>> listByQuerySpBsbs( @RequestParam(value = "sp_s_16", required = false)String sp_s_16,
                                                   @RequestParam(value = "sp_s_17", required = false)String sp_s_17,
                                                   @RequestParam(value = "sp_s_35", required = false)String sp_s_35,
                                                   @RequestParam(value = "sp_s_43", required = false)String sp_s_43,
                                                   @RequestParam(value = "pageNum", defaultValue = "1", required = false) int pageNum ,
                                                   @RequestParam(value = "pageSize", defaultValue = "1000", required = false) int pageSize) {

       Map<String,String > map = new HashMap<>();
        if(StringUtils.isNotEmpty(sp_s_16)){
            map.put("sp_s_16",sp_s_16);
        }
        if(StringUtils.isNotEmpty(sp_s_17)){
            map.put("sp_s_17",sp_s_17);
        }
        if(StringUtils.isNotEmpty(sp_s_35)){
            map.put("sp_s_35",sp_s_35);
        }
        if(StringUtils.isNotEmpty(sp_s_43)){
            map.put("sp_s_43",sp_s_43);
        }
        map.put("pageNum",(pageNum-1)*pageSize+"");
        map.put("pageSize",pageSize+"");
        List<SpBsbs>  list=  spBsbsService.listByMaps(map);
        ResponseMsg<List<SpBsbs>> successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }



    @RequestMapping(value = "json/listByQuerySpBsbsAnddata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "api用户上传的json数据1", notes = "api用户上传的json数据1")
    @ApiImplicitParams({

            @ApiImplicitParam(value = "抽样编号", name = "sp_s_16", dataType = "String"),
            @ApiImplicitParam(value = "食品大类", name = "sp_s_17", dataType = "String"),
            @ApiImplicitParam(value = "抽样单位名称,模糊匹配", name = "sp_s_35", dataType = "String"),
            @ApiImplicitParam(value = "检验机构名称,模糊匹配", name = "sp_s_43", dataType = "String"),

    })
    public ResponseMsg<List<SpBsBsAnddata>> listByQuerySpBsbsAnddata( @RequestParam(value = "sp_s_16", required = false)String sp_s_16,
                                                        @RequestParam(value = "sp_s_17", required = false)String sp_s_17,
                                                        @RequestParam(value = "sp_s_35", required = false)String sp_s_35,
                                                        @RequestParam(value = "sp_s_43", required = false)String sp_s_43) {

        Map<String,String > map = new HashMap();
        if(StringUtils.isNotEmpty(sp_s_16)){
            map.put("sp_s_16",sp_s_16);
        }
        if(StringUtils.isNotEmpty(sp_s_17)){
            map.put("sp_s_17",sp_s_17);
        }
        if(StringUtils.isNotEmpty(sp_s_35)){
            map.put("sp_s_35",sp_s_35);
        }
        if(StringUtils.isNotEmpty(sp_s_43)){
            map.put("sp_s_43",sp_s_43);
        }
        List<SpBsBsAnddata>  list  = spBsbsService.getAllData(map);
        ResponseMsg<List<SpBsBsAnddata>> successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }

}

