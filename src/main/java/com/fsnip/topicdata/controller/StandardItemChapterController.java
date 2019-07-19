package com.fsnip.topicdata.controller;


import com.fsnip.topicdata.model.ChapterItemVo;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.model.StandardItemChapter;
import com.fsnip.topicdata.service.StandardItemChapterService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@RestController
@CrossOrigin(allowCredentials="true")
@RequestMapping("/v1/standardItemChapter")
public class StandardItemChapterController {

    @Autowired
    private StandardItemChapterService  standardItemChapterService;

    //@ApiOperation("保存文章和多个章节")
    //@RequestMapping(value = "/json/saveChapterAndItems", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
 /*   @ApiImplicitParams({
            @ApiImplicitParam(value = "chapter数据", name = "standardItemChapter", dataType = "String"),
            @ApiImplicitParam(value = "item数据", name = "standardItemChapterItems", dataType = "String")
    })
    public ResponseMsg<Boolean> saveChapterAndItems(@RequestParam(value = "standardItemChapter")String standardItemChapter,
                                                 *//*  @RequestParam(value ="standardItemChapterItems[]", required = true)*//* String[] standardItemChapterItems) {

     //   boolean  flag = standardItemChapterService.saveJson(standardItemChapter,new ArrayList<String>());
        ResponseMsg<Boolean> successMsg = ResponseMsg.generatorSuccessMsg(true);
        return  successMsg;
    }
*/
    @ApiOperation("保存文章和单个章节")
    @RequestMapping(value = "/json/saveChapterAndItem", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "chapter数据", name = "standardItemChapter", dataType = "String"),
            @ApiImplicitParam(value = "item数据", name = "standardItemChapterItem", dataType = "String")
    })
    public ResponseMsg<Boolean> saveChapterAndItem(@RequestParam(value = "standardItemChapter")String standardItemChapter,
             @RequestParam(value ="standardItemChapterItem", required = true) String standardItemChapterItem) {

          boolean  flag = standardItemChapterService.saveJson(standardItemChapter,standardItemChapterItem);
        ResponseMsg<Boolean> successMsg = ResponseMsg.generatorSuccessMsg(true);
        return  successMsg;
    }

    @ApiOperation("获取文章和单个章节")
    @RequestMapping(value = "/json/getChapterAndItem", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "标准名称", name = "standardName", dataType = "String"),
            @ApiImplicitParam(value = "组织机构", name = "organization", dataType = "String")
    })
    public ResponseMsg<List<ChapterItemVo>> getChapterAndItem(@RequestParam(value = "standardName" , required = false)String standardName,
                                                              @RequestParam(value ="organization", required = false) String organization) {

        List<ChapterItemVo>  list = standardItemChapterService.getChapterAndItem(standardName,organization);
        ResponseMsg<List<ChapterItemVo>> successMsg = ResponseMsg.generatorSuccessMsg(list);
        return  successMsg;
    }

}

