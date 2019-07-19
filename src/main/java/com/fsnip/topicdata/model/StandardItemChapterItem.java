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
 * 文章章节
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@ApiModel(value="StandardItemChapterItem对象", description="文章章节")
public class StandardItemChapterItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "章")
    @TableField("CHAPTER_DESC")
    private String chapterDesc;

    @ApiModelProperty(value = "节")
    @TableField("KNOB_DESC")
    private String knobDesc;

    @ApiModelProperty(value = "条")
    @TableField("ITEM_DESC")
    private String itemDesc;

    @ApiModelProperty(value = "内容")
    @TableField("CONTENT")
    private String content;

    @ApiModelProperty(value = "保存URL")
    @TableField("SAVE_URL")
    private String saveUrl;

    @ApiModelProperty(value = "标准名称")
    @TableField("STANDARD_NAME")
    private String standardName;

    @ApiModelProperty(value = "法规名称")
    @TableField("LAWITEM_NAME")
    private String lawitemName;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "别名")
    @TableField("CHAPTER_ALIAS")
    private String chapterAlias;

    @ApiModelProperty(value = "standard_item_chapter的id")
    @TableField("ITEM_CHAPTER_ID")
    private Integer itemChapterId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间    默认为null")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "修改时间          默认为null")
    @TableField("LAST_MODIFIED_TIME")
    private LocalDateTime lastModifiedTime;

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

    public String getChapterDesc() {
        return chapterDesc;
    }

    public void setChapterDesc(String chapterDesc) {
        this.chapterDesc = chapterDesc;
    }

    public String getKnobDesc() {
        return knobDesc;
    }

    public void setKnobDesc(String knobDesc) {
        this.knobDesc = knobDesc;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getLawitemName() {
        return lawitemName;
    }

    public void setLawitemName(String lawitemName) {
        this.lawitemName = lawitemName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChapterAlias() {
        return chapterAlias;
    }

    public void setChapterAlias(String chapterAlias) {
        this.chapterAlias = chapterAlias;
    }

    public Integer getItemChapterId() {
        return itemChapterId;
    }

    public void setItemChapterId(Integer itemChapterId) {
        this.itemChapterId = itemChapterId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(LocalDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        return "StandardItemChapterItem{" +
        "id=" + id +
        ", chapterDesc=" + chapterDesc +
        ", knobDesc=" + knobDesc +
        ", itemDesc=" + itemDesc +
        ", content=" + content +
        ", saveUrl=" + saveUrl +
        ", standardName=" + standardName +
        ", lawitemName=" + lawitemName +
        ", remark=" + remark +
        ", chapterAlias=" + chapterAlias +
        ", itemChapterId=" + itemChapterId +
        ", createTime=" + createTime +
        ", lastModifiedTime=" + lastModifiedTime +
        ", organization=" + organization +
        ", recordInsertTime=" + recordInsertTime +
        "}";
    }
}
