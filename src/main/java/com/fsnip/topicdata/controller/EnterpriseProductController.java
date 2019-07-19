package com.fsnip.topicdata.controller;

import com.fsnip.topicdata.model.EnterpriseProduct;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.service.EnterpriseProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/v1/product/")
@Api(description = "产品信息查询接口")
public class EnterpriseProductController {
    @Autowired
    private EnterpriseProductService productService;

    /*@ApiOperation("产品信息的产品条形码查询，例如：69219712010020")
    @RequestMapping(value = "json/barcode/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findByBarcodeJson(String code)
    {
        if (code!=null) {
            try {
                code = URLDecoder.decode(code, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findByBarcode(code);
    }

    @ApiOperation("产品信息的产品条形码查询，例如：69219712010020")
    @RequestMapping(value = "xml/barcode/", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findByBarcodeXml(String code)
    {
        if (code!=null) {
            try {
                code = URLDecoder.decode(code, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findByBarcode(code);
    }

    private ResponseMsg findByBarcode(String code)
    {
        EnterpriseProduct product = productService.findByBarcode(code);
        ResponseMsg<EnterpriseProduct> successMsg = ResponseMsg.generatorSuccessMsg(product);
        return successMsg;
    }*/

    @ApiOperation("产品信息的产品名称查询，例如：name=1953酸牛奶  limit=20 offset=0 ")
    @ApiParam(value = "name", required = true, example = "1953酸牛奶")
    @RequestMapping(value = "json/name", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findByNameXml(String name, Integer offset, Integer limit) {
        if (name != null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findByName(name, offset, limit);
    }

    @ApiOperation("产品信息的产品名称查询，例如：name=1953酸牛奶  limit=20 offset=0 ")
    @RequestMapping(value = "xml/name", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findByNameJson(String name, Integer offset, Integer limit) {
        if (name != null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findByName(name, offset, limit);
    }

    public ResponseMsg findByName(String name, Integer offset, Integer limit) {
        List<EnterpriseProduct> product = productService.findByName(name, offset, limit);
        int productCount=productService.findByNameCount(name);
        ResponseMsg<List<EnterpriseProduct>> successMsg = ResponseMsg.generatorSuccessMsg(product);
        successMsg.setCount(productCount);
        return successMsg;
    }
}
