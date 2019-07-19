package com.fsnip.topicdata.controller;

import com.fsnip.topicdata.model.OperatorsInfo;
import com.fsnip.topicdata.model.ProductionLicense;
import com.fsnip.topicdata.model.ResponseMsg;
import com.fsnip.topicdata.service.ProductionLicenseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/v1/license/")
@Api(description = "食品生产许可和经营许可查询接口")
public class ProductionLicenseController {

    @Autowired
    private ProductionLicenseService service;

    @ApiOperation("食品生产许可证编号查询 例如: SC10652052210017")
    @RequestMapping(value = "json/productid/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findProductByCardIdJson(String id ,Integer offset ,Integer limit) {
        if (id!=null) {
            try {
                id = URLDecoder.decode(id, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findProductByCardId(id,offset,limit);
    }

    @ApiOperation("食品生产许可证编号查询 例如: SC10652052210017")
    @RequestMapping(value = "xml/productid/", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findProductByCardIdXml(String id,Integer offset,Integer limit) {
        if (id!=null) {
            try {
                id = URLDecoder.decode(id, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findProductByCardId(id,offset,limit);
    }

    private ResponseMsg findProductByCardId(String id,Integer offset,Integer limit) {
        List<ProductionLicense> lawChapter = service.findProductByCardId(id,offset,limit);
        int count=service.findProductByCardIdCount(id);
        ResponseMsg<List<ProductionLicense>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(count);
        return successMsg;
    }

    @ApiOperation("食品生产许可证的生产者名称查询 例如：修文贵友食品有限公司")
    @RequestMapping(value = "json/productname", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findProductByNameJson(String name,Integer offset,Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findProductByName(name,offset,limit);
    }

    @ApiOperation("食品生产许可证的生产者名称查询 例如：修文贵友食品有限公司")
    @RequestMapping(value = "xml/productname", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findProductByNameXml(String name,Integer offset,Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findProductByName(name,offset,limit);
    }

    private ResponseMsg findProductByName(String name,Integer offset,Integer limit) {
        List<ProductionLicense> lawChapter = service.findProductByName(name,offset,limit);
        int count=service.findProductByNameCount(name);
        ResponseMsg<List<ProductionLicense>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(count);
        return successMsg;
    }


    @ApiOperation("食品经营许可证编号查询及详细信息 例如：JY15203820000019")
    @RequestMapping(value = "json/operatorid/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findOperatorByCardIdJson(String id,Integer offset, Integer limit) {
        if (id!=null) {
            try {
                id = URLDecoder.decode(id, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findOperatorByCardId(id,offset,limit);
    }

    @ApiOperation("食品经营许可证编号查询及详细信息 例如：JY15203820000019")
    @RequestMapping(value = "xml/operatorid/", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findOperatorByCardIdXml(String id,Integer offset, Integer limit) {
        if (id!=null) {
            try {
                id = URLDecoder.decode(id, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findOperatorByCardId(id,offset,limit);
    }

    private ResponseMsg findOperatorByCardId(String id,Integer offset, Integer limit) {
        List<OperatorsInfo> lawChapter = service.findOperatorByCardId(id,offset,limit);
        int count=service.findOperatorByCardIdCount(id);
        ResponseMsg<List<OperatorsInfo>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(count);
        return successMsg;
    }

    @ApiOperation("食品经营许可的经营者名称查询及详细信息 例如：贵阳云岩佰惠万家食品店")
    @RequestMapping(value = "json/operatorname", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMsg findOperatorByNameJson(String name,Integer offset, Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findOperatorByName(name,offset,limit);
    }

    @ApiOperation("食品经营许可的经营者名称查询及详细信息 例如：贵阳云岩佰惠万家食品店")
    @RequestMapping(value = "xml/operatorname", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseMsg findOperatorByNameXml(String name,Integer offset, Integer limit) {
        if (name!=null) {
            try {
                name = URLDecoder.decode(name, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return findOperatorByName(name,offset,limit);
    }

    private ResponseMsg findOperatorByName(String name,Integer offset, Integer limit) {
        List<OperatorsInfo> lawChapter = service.findOperatorByName(name,offset,limit);
        int count=service.findOperatorByNameCount(name);
        ResponseMsg<List<OperatorsInfo>> successMsg = ResponseMsg.generatorSuccessMsg(lawChapter);
        successMsg.setCount(count);
        return successMsg;
    }
}
