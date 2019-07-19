package com.fsnip.topicdata.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author tdj
 * @since 2019-06-11
 */
@ApiModel(value="SpInspectionAgency对象", description="")
public class SpInspectionAgency implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String  RESULT_TYPE = "result_type";
    public static final String  NOMINAL_COMPANY_NAME = "nominal_company_name";
    public static final String  SAMPLED_COMPANY_NAME = "sampled_company_name";


    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "序号")
    private String number;

    @ApiModelProperty(value = "标称生产企业名称")
    private String nominalCompanyName;

    @ApiModelProperty(value = "标称生产企业地址")
    private String nominalCompanyAdress;

    @ApiModelProperty(value = "被抽样单位名称")
    private String sampledCompanyName;

    @ApiModelProperty(value = "被抽样单位所在省份")
    private String sampledCompanyProvince;

    @ApiModelProperty(value = "被抽样单位地址")
    private String sampledCompanyAdress;

    @ApiModelProperty(value = "食品名称")
    private String foodName;

    @ApiModelProperty(value = "规格型号")
    private String specificationModel;

    @ApiModelProperty(value = "生产日期/批号")
    private String productionDate;

    @ApiModelProperty(value = "商标")
    private String trademark;

    @ApiModelProperty(value = "不合格项目║检验结果║标准值")
    private String testResult;

    @ApiModelProperty(value = "检验机构")
    private String inspectionAgency;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "1检验合格数据，0不合格数据")
    private String resultType;

    @ApiModelProperty(value = "上传文件名称")
    private String fileName;

    @ApiModelProperty(value = "插入时间")
    private LocalDateTime insertDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNominalCompanyName() {
        return nominalCompanyName;
    }

    public void setNominalCompanyName(String nominalCompanyName) {
        this.nominalCompanyName = nominalCompanyName;
    }

    public String getNominalCompanyAdress() {
        return nominalCompanyAdress;
    }

    public void setNominalCompanyAdress(String nominalCompanyAdress) {
        this.nominalCompanyAdress = nominalCompanyAdress;
    }

    public String getSampledCompanyName() {
        return sampledCompanyName;
    }

    public void setSampledCompanyName(String sampledCompanyName) {
        this.sampledCompanyName = sampledCompanyName;
    }

    public String getSampledCompanyProvince() {
        return sampledCompanyProvince;
    }

    public void setSampledCompanyProvince(String sampledCompanyProvince) {
        this.sampledCompanyProvince = sampledCompanyProvince;
    }

    public String getSampledCompanyAdress() {
        return sampledCompanyAdress;
    }

    public void setSampledCompanyAdress(String sampledCompanyAdress) {
        this.sampledCompanyAdress = sampledCompanyAdress;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getInspectionAgency() {
        return inspectionAgency;
    }

    public void setInspectionAgency(String inspectionAgency) {
        this.inspectionAgency = inspectionAgency;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    @Override
    public String toString() {
        return "SpInspectionAgency{" +
        "id=" + id +
        ", number=" + number +
        ", nominalCompanyName=" + nominalCompanyName +
        ", nominalCompanyAdress=" + nominalCompanyAdress +
        ", sampledCompanyName=" + sampledCompanyName +
        ", sampledCompanyProvince=" + sampledCompanyProvince +
        ", sampledCompanyAdress=" + sampledCompanyAdress +
        ", foodName=" + foodName +
        ", specificationModel=" + specificationModel +
        ", productionDate=" + productionDate +
        ", trademark=" + trademark +
        ", testResult=" + testResult +
        ", inspectionAgency=" + inspectionAgency +
        ", remark=" + remark +
        ", resultType=" + resultType +
        ", fileName=" + fileName +
        ", insertDate=" + insertDate +
        "}";
    }
}
