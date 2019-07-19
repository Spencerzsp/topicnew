package com.fsnip.topicdata.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.model.SpInspectionAgency;
import com.fsnip.topicdata.service.SpInspectionAgencyService;
import com.fsnip.topicdata.utils.ExcelUtils;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tdj
 * @since 2019-06-11
 */
@RestController
@CrossOrigin(allowCredentials="true")
@RequestMapping("/v1/spInspectionAgency")
public class SpInspectionAgencyController {


    @Autowired
    private SpInspectionAgencyService spInspectionAgencyService;

    @ApiOperation("文件上传")
    @RequestMapping(value = "/json/fileUpload", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "fileName", name = "fileName", dataType = "String")
    })
    public ResponseMsg<List<String>> fileUpload(
                                                    @RequestParam("fileName") MultipartFile[] files) {
        List<String> fileList = Lists.newArrayList();
        File temp =null;
        String fileName="";
        for(MultipartFile  file:files ){

             fileName = file.getOriginalFilename();
            String result = fileName.contains("不合格")?"0":"1";
            try {
                File path = new File(ResourceUtils.getURL("classpath:").getPath());
                temp = new File(path + "/" + fileName);
                if (!temp.getParentFile().exists()) { //判断文件父目录是否存在
                    temp.getParentFile().mkdir();
                }
                file.transferTo(temp);
                Map<String, String> map = new HashMap<>();
                map.put("序号", "number");
                map.put("标称生产企业名称", "nominalCompanyName");
                map.put("标称生产企业地址", "nominalCompanyAdress");
                map.put("被抽样单位名称", "sampledCompanyName");
                map.put("被抽样单位所在省份", "sampledCompanyProvince");
                map.put("被抽样单位地址", "sampledCompanyAdress");
                map.put("食品名称", "foodName");
                map.put("规格型号", "specificationModel");
                map.put("生产日期/批号", "productionDate");
                map.put("商标", "trademark");
                map.put("不合格项目║检验结果║标准值", "testResult");
                map.put("检验机构", "inspectionAgency");
                map.put("备注", "remark");

                List<SpInspectionAgency> list = (List<SpInspectionAgency>) ExcelUtils.excelImport(map, temp.getPath(), SpInspectionAgency.class);
                for (SpInspectionAgency sp : list) {
                    sp.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                    sp.setFileName(fileName);
                    sp.setResultType(result);
                  // spInspectionAgencyService.save(sp);
                }
                spInspectionAgencyService.saveBatch(list);

                temp.deleteOnExit();
            }catch (Exception e){
                e.printStackTrace();
                temp.deleteOnExit();
                fileList.add(fileName);
            }
        }
        ResponseMsg<List<String>> successMsg = ResponseMsg.generatorSuccessMsg(fileList);
        return successMsg;
    }

    @ApiOperation("查询上传数据")
    @RequestMapping(value = "/json/getInspectionAgencys", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "1检验合格数据，0不合格数据", name = "resultType", dataType = "String"),
            @ApiImplicitParam(value = "被抽样单位名称", name = "sampledCompanyName", dataType = "String")
    })
    public ResponseMsg<List<SpInspectionAgency>> getInspectionAgencys(
            @RequestParam("resultType") String resultType ,
            @RequestParam(value = "sampledCompanyName" , required = false) String sampledCompanyName) {


        QueryWrapper<SpInspectionAgency> wrapper = new QueryWrapper<>();
        wrapper.like(SpInspectionAgency.SAMPLED_COMPANY_NAME, sampledCompanyName);
        wrapper.eq(SpInspectionAgency.RESULT_TYPE, resultType);
                List<SpInspectionAgency> list =    spInspectionAgencyService.list(wrapper);
        ResponseMsg<List<SpInspectionAgency>> successMsg = ResponseMsg.generatorSuccessMsg(list);
        return successMsg;
    }
}

