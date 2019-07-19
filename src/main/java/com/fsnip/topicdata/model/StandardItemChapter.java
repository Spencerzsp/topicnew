package com.fsnip.topicdata.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@ApiModel(value="StandardItemChapter对象", description="文章表")
public class StandardItemChapter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "内容标题")
    @TableField("TITLE")
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "生效日期")
    @TableField("EFFECTIVE_DATE")
    private LocalDateTime effectiveDate;

    @ApiModelProperty(value = "发布单位")
    @TableField("RELEASE_BY")
    private String releaseBy;

    @ApiModelProperty(value = "发文字号")
    @TableField("MESSAGE_NUMBER")
    private String messageNumber;

    @ApiModelProperty(value = "发布状态: 草稿（0）,已发布（1）")
    @TableField("PUBLISH_STATE")
    private Integer publishState;

    @ApiModelProperty(value = "国家")
    @TableField("COUNTRY_NAME")
    private String countryName;

    @ApiModelProperty(value = "省份")
    @TableField("PROVINCE_NAME")
    private String provinceName;

    @ApiModelProperty(value = "市")
    @TableField("CITY_NAME")
    private String cityName;

    @ApiModelProperty(value = "区")
    @TableField("AREA_NAME")
    private String areaName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "组织机构")
    @TableField("ORGANIZATION")
    private String organization;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "记录插入时间")
    @TableField("RECORD_INSERT_TIME")
    private LocalDateTime recordInsertTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getReleaseBy() {
        return releaseBy;
    }

    public void setReleaseBy(String releaseBy) {
        this.releaseBy = releaseBy;
    }

    public String getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(String messageNumber) {
        this.messageNumber = messageNumber;
    }

    public Integer getPublishState() {
        return publishState;
    }

    public void setPublishState(Integer publishState) {
        this.publishState = publishState;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public LocalDateTime getRecordInsertTime() {
        return recordInsertTime;
    }

    public void setRecordInsertTime(LocalDateTime recordInsertTime) {
        this.recordInsertTime = recordInsertTime;
    }

    @Override
    public String toString() {
        return "StandardItemChapter{" +
        "id=" + id +
        ", title=" + title +
        ", effectiveDate=" + effectiveDate +
        ", releaseBy=" + releaseBy +
        ", messageNumber=" + messageNumber +
        ", publishState=" + publishState +
        ", countryName=" + countryName +
        ", provinceName=" + provinceName +
        ", cityName=" + cityName +
        ", areaName=" + areaName +
        ", createTime=" + createTime +
        ", organization=" + organization +
        ", recordInsertTime=" + recordInsertTime +
        "}";
    }
}
