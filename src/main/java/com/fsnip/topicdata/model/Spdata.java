package com.fsnip.topicdata.model;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户数据2表
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@ApiModel(value="Spdata对象", description="用户数据2表")
public class Spdata implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id")
    private String id;

    @ApiModelProperty(value = "检验项目")
    private String spdata_0;

    @ApiModelProperty(value = "检验结果*检验结果")
    private String spdata_1;

    @ApiModelProperty(value = "结果判定*")
    private String spdata_2;

    @ApiModelProperty(value = "检验依据")
    private String spdata_3;

    @ApiModelProperty(value = "判定依据")
    private String spdata_4;

    @ApiModelProperty(value = "标准方法检出限")
    private String spdata_5;

    @ApiModelProperty(value = "标准检出限单位")
    private String spdata_6;

    @ApiModelProperty(value = "方法检出限")
    private String spdata_7;

    @ApiModelProperty(value = "检出限单位")
    private String spdata_8;

    @ApiModelProperty(value = "标准最小允许限")
    private String spdata_9;

    @ApiModelProperty(value = "抽检编号")
    private Integer sp_bsb_id;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created_at;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updated_at;

    @ApiModelProperty(value = "标准最小允许限单位")
    private String spdata_10;

    @ApiModelProperty(value = "最小允许限")
    private String spdata_11;

    @ApiModelProperty(value = "最小允许限单位")
    private String spdata_12;

    @ApiModelProperty(value = "标准最大允许限")
    private String spdata_13;

    @ApiModelProperty(value = "标准最大允许限单位")
    private String spdata_14;

    @ApiModelProperty(value = "最大允许限")
    private String spdata_15;

    @ApiModelProperty(value = "最大允许限单位")
    private String spdata_16;

    @ApiModelProperty(value = "说明")
    private String spdata_17;

    @ApiModelProperty(value = "结果单位")
    private String spdata_18;

    @ApiModelProperty(value = "检验依据简写")
    private String spdata_19;

    private String spdata_20;

    private Integer check_item_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpdata_0() {
        return spdata_0;
    }

    public void setSpdata_0(String spdata_0) {
        this.spdata_0 = spdata_0;
    }

    public String getSpdata_1() {
        return spdata_1;
    }

    public void setSpdata_1(String spdata_1) {
        this.spdata_1 = spdata_1;
    }

    public String getSpdata_2() {
        return spdata_2;
    }

    public void setSpdata_2(String spdata_2) {
        this.spdata_2 = spdata_2;
    }

    public String getSpdata_3() {
        return spdata_3;
    }

    public void setSpdata_3(String spdata_3) {
        this.spdata_3 = spdata_3;
    }

    public String getSpdata_4() {
        return spdata_4;
    }

    public void setSpdata_4(String spdata_4) {
        this.spdata_4 = spdata_4;
    }

    public String getSpdata_5() {
        return spdata_5;
    }

    public void setSpdata_5(String spdata_5) {
        this.spdata_5 = spdata_5;
    }

    public String getSpdata_6() {
        return spdata_6;
    }

    public void setSpdata_6(String spdata_6) {
        this.spdata_6 = spdata_6;
    }

    public String getSpdata_7() {
        return spdata_7;
    }

    public void setSpdata_7(String spdata_7) {
        this.spdata_7 = spdata_7;
    }

    public String getSpdata_8() {
        return spdata_8;
    }

    public void setSpdata_8(String spdata_8) {
        this.spdata_8 = spdata_8;
    }

    public String getSpdata_9() {
        return spdata_9;
    }

    public void setSpdata_9(String spdata_9) {
        this.spdata_9 = spdata_9;
    }

    public Integer getSp_bsb_id() {
        return sp_bsb_id;
    }

    public void setSp_bsb_id(Integer sp_bsb_id) {
        this.sp_bsb_id = sp_bsb_id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getSpdata_10() {
        return spdata_10;
    }

    public void setSpdata_10(String spdata_10) {
        this.spdata_10 = spdata_10;
    }

    public String getSpdata_11() {
        return spdata_11;
    }

    public void setSpdata_11(String spdata_11) {
        this.spdata_11 = spdata_11;
    }

    public String getSpdata_12() {
        return spdata_12;
    }

    public void setSpdata_12(String spdata_12) {
        this.spdata_12 = spdata_12;
    }

    public String getSpdata_13() {
        return spdata_13;
    }

    public void setSpdata_13(String spdata_13) {
        this.spdata_13 = spdata_13;
    }

    public String getSpdata_14() {
        return spdata_14;
    }

    public void setSpdata_14(String spdata_14) {
        this.spdata_14 = spdata_14;
    }

    public String getSpdata_15() {
        return spdata_15;
    }

    public void setSpdata_15(String spdata_15) {
        this.spdata_15 = spdata_15;
    }

    public String getSpdata_16() {
        return spdata_16;
    }

    public void setSpdata_16(String spdata_16) {
        this.spdata_16 = spdata_16;
    }

    public String getSpdata_17() {
        return spdata_17;
    }

    public void setSpdata_17(String spdata_17) {
        this.spdata_17 = spdata_17;
    }

    public String getSpdata_18() {
        return spdata_18;
    }

    public void setSpdata_18(String spdata_18) {
        this.spdata_18 = spdata_18;
    }

    public String getSpdata_19() {
        return spdata_19;
    }

    public void setSpdata_19(String spdata_19) {
        this.spdata_19 = spdata_19;
    }

    public String getSpdata_20() {
        return spdata_20;
    }

    public void setSpdata_20(String spdata_20) {
        this.spdata_20 = spdata_20;
    }

    public Integer getCheck_item_id() {
        return check_item_id;
    }

    public void setCheck_item_id(Integer check_item_id) {
        this.check_item_id = check_item_id;
    }

    @Override
    public String toString() {
        return "Spdata{" +
        "id=" + id +
        ", spdata_0=" + spdata_0 +
        ", spdata_1=" + spdata_1 +
        ", spdata_2=" + spdata_2 +
        ", spdata_3=" + spdata_3 +
        ", spdata_4=" + spdata_4 +
        ", spdata_5=" + spdata_5 +
        ", spdata_6=" + spdata_6 +
        ", spdata_7=" + spdata_7 +
        ", spdata_8=" + spdata_8 +
        ", spdata_9=" + spdata_9 +
        ", sp_bsb_id=" + sp_bsb_id +
        ", created_at=" + created_at +
        ", updated_at=" + updated_at +
        ", spdata_10=" + spdata_10 +
        ", spdata_11=" + spdata_11 +
        ", spdata_12=" + spdata_12 +
        ", spdata_13=" + spdata_13 +
        ", spdata_14=" + spdata_14 +
        ", spdata_15=" + spdata_15 +
        ", spdata_16=" + spdata_16 +
        ", spdata_17=" + spdata_17 +
        ", spdata_18=" + spdata_18 +
        ", spdata_19=" + spdata_19 +
        ", spdata_20=" + spdata_20 +
        ", check_item_id=" + check_item_id +
        "}";
    }
}
