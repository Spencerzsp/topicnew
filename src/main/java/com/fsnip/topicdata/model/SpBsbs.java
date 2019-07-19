package com.fsnip.topicdata.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户数据
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@ApiModel(value="Sp_bsbs对象", description="用户数据")
public class SpBsbs implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id")
    private String id;

    @ApiModelProperty(value = "被抽样单位名称")
    private String sp_s_1;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created_at;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updated_at;

    @ApiModelProperty(value = "抽样地点-2*")
    private String sp_s_2;

    @ApiModelProperty(value = "省(被抽样单位)*")
    private String sp_s_3;

    @ApiModelProperty(value = "市(被抽样单位)")
    private String sp_s_4;

    @ApiModelProperty(value = "县(被抽样单位)")
    private String sp_s_5;

    @ApiModelProperty(value = "单位*")
    private String sp_s_6;

    @ApiModelProperty(value = "单位地址(被抽样单位)*")
    private String sp_s_7;

    @ApiModelProperty(value = "被抽样单位法人(负责人)*")
    private String sp_s_8;

    @ApiModelProperty(value = "电话(被抽样单位负责人)")
    private String sp_s_9;

    @ApiModelProperty(value = "邮编(被抽样单位)")
    private String sp_s_10;

    @ApiModelProperty(value = "被抽样单位负责(联系)人*")
    private String sp_s_11;

    @ApiModelProperty(value = "电话(被抽样单位联系人)*")
    private String sp_s_12;

    @ApiModelProperty(value = "生产许可证号*")
    private String sp_s_13;

    @ApiModelProperty(value = "样品名称*")
    private String sp_s_14;

    @ApiModelProperty(value = "抽样数量*")
    private Float sp_n_15;

    @ApiModelProperty(value = "抽样编号*")
    private String sp_s_16;

    @ApiModelProperty(value = "食品大类")
    private String sp_s_17;

    @ApiModelProperty(value = "食品亚类")
    private String sp_s_18;

    @ApiModelProperty(value = "食品次亚类")
    private String sp_s_19;

    @ApiModelProperty(value = "食品细类")
    private String sp_s_20;

    @ApiModelProperty(value = "任务来源")
    private String sp_s_21;

    private LocalDate sp_d_22;

    @ApiModelProperty(value = "样品年销售额")
    private String sp_s_23;

    @ApiModelProperty(value = "抽样方式")
    private String sp_s_24;

    @ApiModelProperty(value = "抽样工具")
    private String sp_s_25;

    @ApiModelProperty(value = "样品规格")
    private String sp_s_26;

    @ApiModelProperty(value = "样品批号")
    private String sp_s_27;

    @ApiModelProperty(value = "样品生产日期")
    private LocalDate sp_d_28;

    @ApiModelProperty(value = "样品保质期")
    private String sp_n_29;

    @ApiModelProperty(value = "抽样时样品存储状态")
    private String sp_s_30;

    @ApiModelProperty(value = "样品储存条件-温度(℃)")
    private BigDecimal sp_n_31;

    @ApiModelProperty(value = "样品储存条件-湿度(%)")
    private BigDecimal sp_n_32;

    @ApiModelProperty(value = "抽样样品包装")
    private String sp_s_33;

    @ApiModelProperty(value = "备注")
    private String sp_s_34;

    @ApiModelProperty(value = "抽样单位名称")
    private String sp_s_35;

    @ApiModelProperty(value = "单位级别")
    private String sp_s_36;

    @ApiModelProperty(value = "抽样人员")
    private String sp_s_37;

    @ApiModelProperty(value = "抽样时间")
    private LocalDate sp_d_38;

    @ApiModelProperty(value = "电话（抽样单位）")
    private String sp_s_39;

    @ApiModelProperty(value = "抽样单位负责（联系）人")
    private String sp_s_40;

    @ApiModelProperty(value = "电话(抽样单位负责人)")
    private String sp_s_41;

    @ApiModelProperty(value = "电子邮箱(抽样单位负责人)")
    private String sp_s_42;

    @ApiModelProperty(value = "检验机构名称")
    private String sp_s_43;

    @ApiModelProperty(value = "检验目的/任务类别")
    private String sp_s_44;

    @ApiModelProperty(value = "报告书编号")
    private String sp_s_45;

    @ApiModelProperty(value = "收检日期")
    private LocalDate sp_d_46;

    @ApiModelProperty(value = "报告日期")
    private LocalDate sp_d_47;

    @ApiModelProperty(value = "报告签发人")
    private String sp_s_48;

    @ApiModelProperty(value = "联系人(检验机构)")
    private String sp_s_49;

    @ApiModelProperty(value = "电话(检验机构)")
    private String sp_s_50;

    @ApiModelProperty(value = "电子邮箱(检验机构)")
    private String sp_s_51;

    @ApiModelProperty(value = "所在省份")
    private String sp_s_52;

    private String sp_s_53;

    private String sp_s_54;

    private String sp_s_55;

    private String sp_s_56;

    private String sp_s_57;

    private String sp_s_58;

    private String sp_s_59;

    private String sp_s_60;

    @ApiModelProperty(value = "样品形态")
    private String sp_s_61;

    @ApiModelProperty(value = "样品类型")
    private String sp_s_62;

    @ApiModelProperty(value = "包装分类")
    private String sp_s_63;

    @ApiModelProperty(value = "标识生产企业名称")
    private String sp_s_64;

    @ApiModelProperty(value = "标识生产企业地址")
    private String sp_s_65;

    private String sp_s_66;

    @ApiModelProperty(value = "报送分类-2")
    private String sp_s_67;

    @ApiModelProperty(value = "抽样地点-1")
    private String sp_s_68;

    private String sp_s_69;

    @ApiModelProperty(value = "报送分类-1")
    private String sp_s_70;

    @ApiModelProperty(value = "结论")
    private String sp_s_71;

    @ApiModelProperty(value = "执行标准/技术文件")
    private String sp_s_72;

    @ApiModelProperty(value = "质量等级")
    private String sp_s_73;

    @ApiModelProperty(value = "商标")
    private String sp_s_74;

    @ApiModelProperty(value = "生产企业联系人")
    private String sp_s_75;

    @ApiModelProperty(value = "生产企业电话")
    private String sp_s_76;

    private String sp_s_77;

    private String sp_s_78;

    private String sp_s_79;

    private String sp_s_80;

    private String sp_s_81;

    private String sp_s_82;

    private String sp_s_83;

    @ApiModelProperty(value = "检验报告备注")
    private String sp_s_84;

    @ApiModelProperty(value = "填报人(检验机构)")
    private String sp_s_85;

    @ApiModelProperty(value = "填报日期")
    private LocalDate sp_d_86;

    @ApiModelProperty(value = "电话(检验机构填报人)")
    private String sp_s_87;

    @ApiModelProperty(value = "电子邮箱(检验机构填报人)")
    private String sp_s_88;

    private String tname;

    private LocalDateTime submit_d_flag;

    private BigDecimal sp_n_jcxcount;

    private String sp_s_bsfl;

    private String sp_s_2_1;

    private Integer sp_i_state;

    private Integer sp_i_jgback;

    private String sp_s_reason;

    private Integer sp_i_backtimes;

    @ApiModelProperty(value = "区域类型")
    private String sp_s_201;

    @ApiModelProperty(value = "省(生产企业)")
    private String sp_s_202;

    @ApiModelProperty(value = "样品属性")
    private String sp_s_203;

    @ApiModelProperty(value = "单价")
    private String sp_s_204;

    @ApiModelProperty(value = "是否出口")
    private String sp_s_205;

    @ApiModelProperty(value = "抽样基数/批量")
    private String sp_s_206;

    private String sp_s_207;

    @ApiModelProperty(value = "备样数量")
    private String sp_s_208;

    private String sp_s_209;

    private String sp_s_210;

    @ApiModelProperty(value = "单位地址（抽样单位）")
    private String sp_s_211;

    @ApiModelProperty(value = "邮编（抽样单位）")
    private String sp_s_212;

    @ApiModelProperty(value = "传真（抽样单位）")
    private String sp_s_213;

    @ApiModelProperty(value = "确认情况")
    private String sp_s_214;

    @ApiModelProperty(value = "社会信用代码/营业执照号")
    private String sp_s_215;

    private String sp_t_procedure;

    private String fail_report_path;

    private Boolean is_yydj;

    private Integer current_yycz_step;

    private String bgfl;

    @ApiModelProperty(value = "许可证-类型")
    private String sp_xkz;

    @ApiModelProperty(value = "许可证-编号")
    private String sp_xkz_id;

    private LocalDateTime fail_report_at;

    private Boolean czb_reverted_flag;

    private Boolean synced;

    private String gbsj;

    private Boolean via_api;

    private Integer application_id;

    private String report_path;

    private String cyd_file_path;

    private String cyjygzs_file_path;

    private LocalDateTime yydj_enabled_by_admin_at;

    private LocalDateTime synced_at;

    private String czb_reverted_reason;

    @ApiModelProperty(value = "市(生产企业)")
    private String sp_s_220;

    @ApiModelProperty(value = "县(生产企业)")
    private String sp_s_221;

    @ApiModelProperty(value = "条形码（样品）")
    private String sp_s_222;

    private Integer user_id;

    private String uid;

    private Integer sp_s_37_user_id;

    private LocalDateTime deleted_at;

    private String xsbg_file_path;

    private Integer ca_key_status;

    private String sp_s_city;

    @ApiModelProperty(value = "检验结论")
    private String inspection_basis;

    @ApiModelProperty(value = "检验依据")
    private String decision_basis;

    private LocalDateTime sign_date;

    @ApiModelProperty(value = "风险监测报告备注")
    private String sp_s_89;

    @ApiModelProperty(value = "风险报告检验依据")
    @TableField("FX_jyyj_custom")
    private String FX_jyyj_custom;
    @TableField("JDCJ_report_path")
    private String JDCJ_report_path;
    @TableField("FXJC_report_path")
    private String FXJC_report_path;
    @TableField("JDCJ_pdf_rules")
    private String JDCJ_pdf_rules;
    @TableField("FXJC_pdf_rules")
    private String FXJC_pdf_rules;

    private Integer wochacha_task_id;

    private String sp_s_sfjk;

    @ApiModelProperty(value = "原产国")
    private String sp_s_ycg;

    @ApiModelProperty(value = "是否委托生产")
    private String sp_s_sfwtsc;

    private String sp_s_wtsheng;

    private String sp_s_wtshi;

    private String sp_s_wtxian;

    @ApiModelProperty(value = "委托企业名称")
    private String sp_s_qymc;

    @ApiModelProperty(value = "委托企业详细地址")
    private String sp_s_qydz;

    @ApiModelProperty(value = "委托生产许可证编号")
    private String sp_s_qs;

    @ApiModelProperty(value = "委托联系人")
    private String sp_s_lxr;

    @ApiModelProperty(value = "委托联系电话")
    private String sp_s_tel;

    private String sp_s_pic;

    private String sp_s_sign;

    private String health_code;

    private String health_func_cat;

    private String barcode;

    private String rainbowcode;

    private String rainbowcode_url;

    private String state;

    private String isdelete;

    @ApiModelProperty(value = "同步状态(0=未同步，1=已同步)")
    @TableField("SYN_STATUS")
    private Integer SYN_STATUS;
    @TableField("RECORD_INSERT_TIME")
    @ApiModelProperty(value = "用于大数据应用部数据提取")
    private LocalDateTime RECORD_INSERT_TIME;
    @TableField("insertDate")
    private Date insertDate;


    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSp_s_1() {
        return sp_s_1;
    }

    public void setSp_s_1(String sp_s_1) {
        this.sp_s_1 = sp_s_1;
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

    public String getSp_s_2() {
        return sp_s_2;
    }

    public void setSp_s_2(String sp_s_2) {
        this.sp_s_2 = sp_s_2;
    }

    public String getSp_s_3() {
        return sp_s_3;
    }

    public void setSp_s_3(String sp_s_3) {
        this.sp_s_3 = sp_s_3;
    }

    public String getSp_s_4() {
        return sp_s_4;
    }

    public void setSp_s_4(String sp_s_4) {
        this.sp_s_4 = sp_s_4;
    }

    public String getSp_s_5() {
        return sp_s_5;
    }

    public void setSp_s_5(String sp_s_5) {
        this.sp_s_5 = sp_s_5;
    }

    public String getSp_s_6() {
        return sp_s_6;
    }

    public void setSp_s_6(String sp_s_6) {
        this.sp_s_6 = sp_s_6;
    }

    public String getSp_s_7() {
        return sp_s_7;
    }

    public void setSp_s_7(String sp_s_7) {
        this.sp_s_7 = sp_s_7;
    }

    public String getSp_s_8() {
        return sp_s_8;
    }

    public void setSp_s_8(String sp_s_8) {
        this.sp_s_8 = sp_s_8;
    }

    public String getSp_s_9() {
        return sp_s_9;
    }

    public void setSp_s_9(String sp_s_9) {
        this.sp_s_9 = sp_s_9;
    }

    public String getSp_s_10() {
        return sp_s_10;
    }

    public void setSp_s_10(String sp_s_10) {
        this.sp_s_10 = sp_s_10;
    }

    public String getSp_s_11() {
        return sp_s_11;
    }

    public void setSp_s_11(String sp_s_11) {
        this.sp_s_11 = sp_s_11;
    }

    public String getSp_s_12() {
        return sp_s_12;
    }

    public void setSp_s_12(String sp_s_12) {
        this.sp_s_12 = sp_s_12;
    }

    public String getSp_s_13() {
        return sp_s_13;
    }

    public void setSp_s_13(String sp_s_13) {
        this.sp_s_13 = sp_s_13;
    }

    public String getSp_s_14() {
        return sp_s_14;
    }

    public void setSp_s_14(String sp_s_14) {
        this.sp_s_14 = sp_s_14;
    }

    public Float getSp_n_15() {
        return sp_n_15;
    }

    public void setSp_n_15(Float sp_n_15) {
        this.sp_n_15 = sp_n_15;
    }

    public String getSp_s_16() {
        return sp_s_16;
    }

    public void setSp_s_16(String sp_s_16) {
        this.sp_s_16 = sp_s_16;
    }

    public String getSp_s_17() {
        return sp_s_17;
    }

    public void setSp_s_17(String sp_s_17) {
        this.sp_s_17 = sp_s_17;
    }

    public String getSp_s_18() {
        return sp_s_18;
    }

    public void setSp_s_18(String sp_s_18) {
        this.sp_s_18 = sp_s_18;
    }

    public String getSp_s_19() {
        return sp_s_19;
    }

    public void setSp_s_19(String sp_s_19) {
        this.sp_s_19 = sp_s_19;
    }

    public String getSp_s_20() {
        return sp_s_20;
    }

    public void setSp_s_20(String sp_s_20) {
        this.sp_s_20 = sp_s_20;
    }

    public String getSp_s_21() {
        return sp_s_21;
    }

    public void setSp_s_21(String sp_s_21) {
        this.sp_s_21 = sp_s_21;
    }

    public LocalDate getSp_d_22() {
        return sp_d_22;
    }

    public void setSp_d_22(LocalDate sp_d_22) {
        this.sp_d_22 = sp_d_22;
    }

    public String getSp_s_23() {
        return sp_s_23;
    }

    public void setSp_s_23(String sp_s_23) {
        this.sp_s_23 = sp_s_23;
    }

    public String getSp_s_24() {
        return sp_s_24;
    }

    public void setSp_s_24(String sp_s_24) {
        this.sp_s_24 = sp_s_24;
    }

    public String getSp_s_25() {
        return sp_s_25;
    }

    public void setSp_s_25(String sp_s_25) {
        this.sp_s_25 = sp_s_25;
    }

    public String getSp_s_26() {
        return sp_s_26;
    }

    public void setSp_s_26(String sp_s_26) {
        this.sp_s_26 = sp_s_26;
    }

    public String getSp_s_27() {
        return sp_s_27;
    }

    public void setSp_s_27(String sp_s_27) {
        this.sp_s_27 = sp_s_27;
    }

    public LocalDate getSp_d_28() {
        return sp_d_28;
    }

    public void setSp_d_28(LocalDate sp_d_28) {
        this.sp_d_28 = sp_d_28;
    }

    public String getSp_n_29() {
        return sp_n_29;
    }

    public void setSp_n_29(String sp_n_29) {
        this.sp_n_29 = sp_n_29;
    }

    public String getSp_s_30() {
        return sp_s_30;
    }

    public void setSp_s_30(String sp_s_30) {
        this.sp_s_30 = sp_s_30;
    }

    public BigDecimal getSp_n_31() {
        return sp_n_31;
    }

    public void setSp_n_31(BigDecimal sp_n_31) {
        this.sp_n_31 = sp_n_31;
    }

    public BigDecimal getSp_n_32() {
        return sp_n_32;
    }

    public void setSp_n_32(BigDecimal sp_n_32) {
        this.sp_n_32 = sp_n_32;
    }

    public String getSp_s_33() {
        return sp_s_33;
    }

    public void setSp_s_33(String sp_s_33) {
        this.sp_s_33 = sp_s_33;
    }

    public String getSp_s_34() {
        return sp_s_34;
    }

    public void setSp_s_34(String sp_s_34) {
        this.sp_s_34 = sp_s_34;
    }

    public String getSp_s_35() {
        return sp_s_35;
    }

    public void setSp_s_35(String sp_s_35) {
        this.sp_s_35 = sp_s_35;
    }

    public String getSp_s_36() {
        return sp_s_36;
    }

    public void setSp_s_36(String sp_s_36) {
        this.sp_s_36 = sp_s_36;
    }

    public String getSp_s_37() {
        return sp_s_37;
    }

    public void setSp_s_37(String sp_s_37) {
        this.sp_s_37 = sp_s_37;
    }

    public LocalDate getSp_d_38() {
        return sp_d_38;
    }

    public void setSp_d_38(LocalDate sp_d_38) {
        this.sp_d_38 = sp_d_38;
    }

    public String getSp_s_39() {
        return sp_s_39;
    }

    public void setSp_s_39(String sp_s_39) {
        this.sp_s_39 = sp_s_39;
    }

    public String getSp_s_40() {
        return sp_s_40;
    }

    public void setSp_s_40(String sp_s_40) {
        this.sp_s_40 = sp_s_40;
    }

    public String getSp_s_41() {
        return sp_s_41;
    }

    public void setSp_s_41(String sp_s_41) {
        this.sp_s_41 = sp_s_41;
    }

    public String getSp_s_42() {
        return sp_s_42;
    }

    public void setSp_s_42(String sp_s_42) {
        this.sp_s_42 = sp_s_42;
    }

    public String getSp_s_43() {
        return sp_s_43;
    }

    public void setSp_s_43(String sp_s_43) {
        this.sp_s_43 = sp_s_43;
    }

    public String getSp_s_44() {
        return sp_s_44;
    }

    public void setSp_s_44(String sp_s_44) {
        this.sp_s_44 = sp_s_44;
    }

    public String getSp_s_45() {
        return sp_s_45;
    }

    public void setSp_s_45(String sp_s_45) {
        this.sp_s_45 = sp_s_45;
    }

    public LocalDate getSp_d_46() {
        return sp_d_46;
    }

    public void setSp_d_46(LocalDate sp_d_46) {
        this.sp_d_46 = sp_d_46;
    }

    public LocalDate getSp_d_47() {
        return sp_d_47;
    }

    public void setSp_d_47(LocalDate sp_d_47) {
        this.sp_d_47 = sp_d_47;
    }

    public String getSp_s_48() {
        return sp_s_48;
    }

    public void setSp_s_48(String sp_s_48) {
        this.sp_s_48 = sp_s_48;
    }

    public String getSp_s_49() {
        return sp_s_49;
    }

    public void setSp_s_49(String sp_s_49) {
        this.sp_s_49 = sp_s_49;
    }

    public String getSp_s_50() {
        return sp_s_50;
    }

    public void setSp_s_50(String sp_s_50) {
        this.sp_s_50 = sp_s_50;
    }

    public String getSp_s_51() {
        return sp_s_51;
    }

    public void setSp_s_51(String sp_s_51) {
        this.sp_s_51 = sp_s_51;
    }

    public String getSp_s_52() {
        return sp_s_52;
    }

    public void setSp_s_52(String sp_s_52) {
        this.sp_s_52 = sp_s_52;
    }

    public String getSp_s_53() {
        return sp_s_53;
    }

    public void setSp_s_53(String sp_s_53) {
        this.sp_s_53 = sp_s_53;
    }

    public String getSp_s_54() {
        return sp_s_54;
    }

    public void setSp_s_54(String sp_s_54) {
        this.sp_s_54 = sp_s_54;
    }

    public String getSp_s_55() {
        return sp_s_55;
    }

    public void setSp_s_55(String sp_s_55) {
        this.sp_s_55 = sp_s_55;
    }

    public String getSp_s_56() {
        return sp_s_56;
    }

    public void setSp_s_56(String sp_s_56) {
        this.sp_s_56 = sp_s_56;
    }

    public String getSp_s_57() {
        return sp_s_57;
    }

    public void setSp_s_57(String sp_s_57) {
        this.sp_s_57 = sp_s_57;
    }

    public String getSp_s_58() {
        return sp_s_58;
    }

    public void setSp_s_58(String sp_s_58) {
        this.sp_s_58 = sp_s_58;
    }

    public String getSp_s_59() {
        return sp_s_59;
    }

    public void setSp_s_59(String sp_s_59) {
        this.sp_s_59 = sp_s_59;
    }

    public String getSp_s_60() {
        return sp_s_60;
    }

    public void setSp_s_60(String sp_s_60) {
        this.sp_s_60 = sp_s_60;
    }

    public String getSp_s_61() {
        return sp_s_61;
    }

    public void setSp_s_61(String sp_s_61) {
        this.sp_s_61 = sp_s_61;
    }

    public String getSp_s_62() {
        return sp_s_62;
    }

    public void setSp_s_62(String sp_s_62) {
        this.sp_s_62 = sp_s_62;
    }

    public String getSp_s_63() {
        return sp_s_63;
    }

    public void setSp_s_63(String sp_s_63) {
        this.sp_s_63 = sp_s_63;
    }

    public String getSp_s_64() {
        return sp_s_64;
    }

    public void setSp_s_64(String sp_s_64) {
        this.sp_s_64 = sp_s_64;
    }

    public String getSp_s_65() {
        return sp_s_65;
    }

    public void setSp_s_65(String sp_s_65) {
        this.sp_s_65 = sp_s_65;
    }

    public String getSp_s_66() {
        return sp_s_66;
    }

    public void setSp_s_66(String sp_s_66) {
        this.sp_s_66 = sp_s_66;
    }

    public String getSp_s_67() {
        return sp_s_67;
    }

    public void setSp_s_67(String sp_s_67) {
        this.sp_s_67 = sp_s_67;
    }

    public String getSp_s_68() {
        return sp_s_68;
    }

    public void setSp_s_68(String sp_s_68) {
        this.sp_s_68 = sp_s_68;
    }

    public String getSp_s_69() {
        return sp_s_69;
    }

    public void setSp_s_69(String sp_s_69) {
        this.sp_s_69 = sp_s_69;
    }

    public String getSp_s_70() {
        return sp_s_70;
    }

    public void setSp_s_70(String sp_s_70) {
        this.sp_s_70 = sp_s_70;
    }

    public String getSp_s_71() {
        return sp_s_71;
    }

    public void setSp_s_71(String sp_s_71) {
        this.sp_s_71 = sp_s_71;
    }

    public String getSp_s_72() {
        return sp_s_72;
    }

    public void setSp_s_72(String sp_s_72) {
        this.sp_s_72 = sp_s_72;
    }

    public String getSp_s_73() {
        return sp_s_73;
    }

    public void setSp_s_73(String sp_s_73) {
        this.sp_s_73 = sp_s_73;
    }

    public String getSp_s_74() {
        return sp_s_74;
    }

    public void setSp_s_74(String sp_s_74) {
        this.sp_s_74 = sp_s_74;
    }

    public String getSp_s_75() {
        return sp_s_75;
    }

    public void setSp_s_75(String sp_s_75) {
        this.sp_s_75 = sp_s_75;
    }

    public String getSp_s_76() {
        return sp_s_76;
    }

    public void setSp_s_76(String sp_s_76) {
        this.sp_s_76 = sp_s_76;
    }

    public String getSp_s_77() {
        return sp_s_77;
    }

    public void setSp_s_77(String sp_s_77) {
        this.sp_s_77 = sp_s_77;
    }

    public String getSp_s_78() {
        return sp_s_78;
    }

    public void setSp_s_78(String sp_s_78) {
        this.sp_s_78 = sp_s_78;
    }

    public String getSp_s_79() {
        return sp_s_79;
    }

    public void setSp_s_79(String sp_s_79) {
        this.sp_s_79 = sp_s_79;
    }

    public String getSp_s_80() {
        return sp_s_80;
    }

    public void setSp_s_80(String sp_s_80) {
        this.sp_s_80 = sp_s_80;
    }

    public String getSp_s_81() {
        return sp_s_81;
    }

    public void setSp_s_81(String sp_s_81) {
        this.sp_s_81 = sp_s_81;
    }

    public String getSp_s_82() {
        return sp_s_82;
    }

    public void setSp_s_82(String sp_s_82) {
        this.sp_s_82 = sp_s_82;
    }

    public String getSp_s_83() {
        return sp_s_83;
    }

    public void setSp_s_83(String sp_s_83) {
        this.sp_s_83 = sp_s_83;
    }

    public String getSp_s_84() {
        return sp_s_84;
    }

    public void setSp_s_84(String sp_s_84) {
        this.sp_s_84 = sp_s_84;
    }

    public String getSp_s_85() {
        return sp_s_85;
    }

    public void setSp_s_85(String sp_s_85) {
        this.sp_s_85 = sp_s_85;
    }

    public LocalDate getSp_d_86() {
        return sp_d_86;
    }

    public void setSp_d_86(LocalDate sp_d_86) {
        this.sp_d_86 = sp_d_86;
    }

    public String getSp_s_87() {
        return sp_s_87;
    }

    public void setSp_s_87(String sp_s_87) {
        this.sp_s_87 = sp_s_87;
    }

    public String getSp_s_88() {
        return sp_s_88;
    }

    public void setSp_s_88(String sp_s_88) {
        this.sp_s_88 = sp_s_88;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public LocalDateTime getSubmit_d_flag() {
        return submit_d_flag;
    }

    public void setSubmit_d_flag(LocalDateTime submit_d_flag) {
        this.submit_d_flag = submit_d_flag;
    }

    public BigDecimal getSp_n_jcxcount() {
        return sp_n_jcxcount;
    }

    public void setSp_n_jcxcount(BigDecimal sp_n_jcxcount) {
        this.sp_n_jcxcount = sp_n_jcxcount;
    }

    public String getSp_s_bsfl() {
        return sp_s_bsfl;
    }

    public void setSp_s_bsfl(String sp_s_bsfl) {
        this.sp_s_bsfl = sp_s_bsfl;
    }

    public String getSp_s_2_1() {
        return sp_s_2_1;
    }

    public void setSp_s_2_1(String sp_s_2_1) {
        this.sp_s_2_1 = sp_s_2_1;
    }

    public Integer getSp_i_state() {
        return sp_i_state;
    }

    public void setSp_i_state(Integer sp_i_state) {
        this.sp_i_state = sp_i_state;
    }

    public Integer getSp_i_jgback() {
        return sp_i_jgback;
    }

    public void setSp_i_jgback(Integer sp_i_jgback) {
        this.sp_i_jgback = sp_i_jgback;
    }

    public String getSp_s_reason() {
        return sp_s_reason;
    }

    public void setSp_s_reason(String sp_s_reason) {
        this.sp_s_reason = sp_s_reason;
    }

    public Integer getSp_i_backtimes() {
        return sp_i_backtimes;
    }

    public void setSp_i_backtimes(Integer sp_i_backtimes) {
        this.sp_i_backtimes = sp_i_backtimes;
    }

    public String getSp_s_201() {
        return sp_s_201;
    }

    public void setSp_s_201(String sp_s_201) {
        this.sp_s_201 = sp_s_201;
    }

    public String getSp_s_202() {
        return sp_s_202;
    }

    public void setSp_s_202(String sp_s_202) {
        this.sp_s_202 = sp_s_202;
    }

    public String getSp_s_203() {
        return sp_s_203;
    }

    public void setSp_s_203(String sp_s_203) {
        this.sp_s_203 = sp_s_203;
    }

    public String getSp_s_204() {
        return sp_s_204;
    }

    public void setSp_s_204(String sp_s_204) {
        this.sp_s_204 = sp_s_204;
    }

    public String getSp_s_205() {
        return sp_s_205;
    }

    public void setSp_s_205(String sp_s_205) {
        this.sp_s_205 = sp_s_205;
    }

    public String getSp_s_206() {
        return sp_s_206;
    }

    public void setSp_s_206(String sp_s_206) {
        this.sp_s_206 = sp_s_206;
    }

    public String getSp_s_207() {
        return sp_s_207;
    }

    public void setSp_s_207(String sp_s_207) {
        this.sp_s_207 = sp_s_207;
    }

    public String getSp_s_208() {
        return sp_s_208;
    }

    public void setSp_s_208(String sp_s_208) {
        this.sp_s_208 = sp_s_208;
    }

    public String getSp_s_209() {
        return sp_s_209;
    }

    public void setSp_s_209(String sp_s_209) {
        this.sp_s_209 = sp_s_209;
    }

    public String getSp_s_210() {
        return sp_s_210;
    }

    public void setSp_s_210(String sp_s_210) {
        this.sp_s_210 = sp_s_210;
    }

    public String getSp_s_211() {
        return sp_s_211;
    }

    public void setSp_s_211(String sp_s_211) {
        this.sp_s_211 = sp_s_211;
    }

    public String getSp_s_212() {
        return sp_s_212;
    }

    public void setSp_s_212(String sp_s_212) {
        this.sp_s_212 = sp_s_212;
    }

    public String getSp_s_213() {
        return sp_s_213;
    }

    public void setSp_s_213(String sp_s_213) {
        this.sp_s_213 = sp_s_213;
    }

    public String getSp_s_214() {
        return sp_s_214;
    }

    public void setSp_s_214(String sp_s_214) {
        this.sp_s_214 = sp_s_214;
    }

    public String getSp_s_215() {
        return sp_s_215;
    }

    public void setSp_s_215(String sp_s_215) {
        this.sp_s_215 = sp_s_215;
    }

    public String getSp_t_procedure() {
        return sp_t_procedure;
    }

    public void setSp_t_procedure(String sp_t_procedure) {
        this.sp_t_procedure = sp_t_procedure;
    }

    public String getFail_report_path() {
        return fail_report_path;
    }

    public void setFail_report_path(String fail_report_path) {
        this.fail_report_path = fail_report_path;
    }

    public Boolean getIs_yydj() {
        return is_yydj;
    }

    public void setIs_yydj(Boolean is_yydj) {
        this.is_yydj = is_yydj;
    }

    public Integer getCurrent_yycz_step() {
        return current_yycz_step;
    }

    public void setCurrent_yycz_step(Integer current_yycz_step) {
        this.current_yycz_step = current_yycz_step;
    }

    public String getBgfl() {
        return bgfl;
    }

    public void setBgfl(String bgfl) {
        this.bgfl = bgfl;
    }

    public String getSp_xkz() {
        return sp_xkz;
    }

    public void setSp_xkz(String sp_xkz) {
        this.sp_xkz = sp_xkz;
    }

    public String getSp_xkz_id() {
        return sp_xkz_id;
    }

    public void setSp_xkz_id(String sp_xkz_id) {
        this.sp_xkz_id = sp_xkz_id;
    }

    public LocalDateTime getFail_report_at() {
        return fail_report_at;
    }

    public void setFail_report_at(LocalDateTime fail_report_at) {
        this.fail_report_at = fail_report_at;
    }

    public Boolean getCzb_reverted_flag() {
        return czb_reverted_flag;
    }

    public void setCzb_reverted_flag(Boolean czb_reverted_flag) {
        this.czb_reverted_flag = czb_reverted_flag;
    }

    public Boolean getSynced() {
        return synced;
    }

    public void setSynced(Boolean synced) {
        this.synced = synced;
    }

    public String getGbsj() {
        return gbsj;
    }

    public void setGbsj(String gbsj) {
        this.gbsj = gbsj;
    }

    public Boolean getVia_api() {
        return via_api;
    }

    public void setVia_api(Boolean via_api) {
        this.via_api = via_api;
    }

    public Integer getApplication_id() {
        return application_id;
    }

    public void setApplication_id(Integer application_id) {
        this.application_id = application_id;
    }

    public String getReport_path() {
        return report_path;
    }

    public void setReport_path(String report_path) {
        this.report_path = report_path;
    }

    public String getCyd_file_path() {
        return cyd_file_path;
    }

    public void setCyd_file_path(String cyd_file_path) {
        this.cyd_file_path = cyd_file_path;
    }

    public String getCyjygzs_file_path() {
        return cyjygzs_file_path;
    }

    public void setCyjygzs_file_path(String cyjygzs_file_path) {
        this.cyjygzs_file_path = cyjygzs_file_path;
    }

    public LocalDateTime getYydj_enabled_by_admin_at() {
        return yydj_enabled_by_admin_at;
    }

    public void setYydj_enabled_by_admin_at(LocalDateTime yydj_enabled_by_admin_at) {
        this.yydj_enabled_by_admin_at = yydj_enabled_by_admin_at;
    }

    public LocalDateTime getSynced_at() {
        return synced_at;
    }

    public void setSynced_at(LocalDateTime synced_at) {
        this.synced_at = synced_at;
    }

    public String getCzb_reverted_reason() {
        return czb_reverted_reason;
    }

    public void setCzb_reverted_reason(String czb_reverted_reason) {
        this.czb_reverted_reason = czb_reverted_reason;
    }

    public String getSp_s_220() {
        return sp_s_220;
    }

    public void setSp_s_220(String sp_s_220) {
        this.sp_s_220 = sp_s_220;
    }

    public String getSp_s_221() {
        return sp_s_221;
    }

    public void setSp_s_221(String sp_s_221) {
        this.sp_s_221 = sp_s_221;
    }

    public String getSp_s_222() {
        return sp_s_222;
    }

    public void setSp_s_222(String sp_s_222) {
        this.sp_s_222 = sp_s_222;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getSp_s_37_user_id() {
        return sp_s_37_user_id;
    }

    public void setSp_s_37_user_id(Integer sp_s_37_user_id) {
        this.sp_s_37_user_id = sp_s_37_user_id;
    }

    public LocalDateTime getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(LocalDateTime deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getXsbg_file_path() {
        return xsbg_file_path;
    }

    public void setXsbg_file_path(String xsbg_file_path) {
        this.xsbg_file_path = xsbg_file_path;
    }

    public Integer getCa_key_status() {
        return ca_key_status;
    }

    public void setCa_key_status(Integer ca_key_status) {
        this.ca_key_status = ca_key_status;
    }

    public String getSp_s_city() {
        return sp_s_city;
    }

    public void setSp_s_city(String sp_s_city) {
        this.sp_s_city = sp_s_city;
    }

    public String getInspection_basis() {
        return inspection_basis;
    }

    public void setInspection_basis(String inspection_basis) {
        this.inspection_basis = inspection_basis;
    }

    public String getDecision_basis() {
        return decision_basis;
    }

    public void setDecision_basis(String decision_basis) {
        this.decision_basis = decision_basis;
    }

    public LocalDateTime getSign_date() {
        return sign_date;
    }

    public void setSign_date(LocalDateTime sign_date) {
        this.sign_date = sign_date;
    }

    public String getSp_s_89() {
        return sp_s_89;
    }

    public void setSp_s_89(String sp_s_89) {
        this.sp_s_89 = sp_s_89;
    }

    public String getFX_jyyj_custom() {
        return FX_jyyj_custom;
    }

    public void setFX_jyyj_custom(String FX_jyyj_custom) {
        this.FX_jyyj_custom = FX_jyyj_custom;
    }

    public String getJDCJ_report_path() {
        return JDCJ_report_path;
    }

    public void setJDCJ_report_path(String JDCJ_report_path) {
        this.JDCJ_report_path = JDCJ_report_path;
    }

    public String getFXJC_report_path() {
        return FXJC_report_path;
    }

    public void setFXJC_report_path(String FXJC_report_path) {
        this.FXJC_report_path = FXJC_report_path;
    }

    public String getJDCJ_pdf_rules() {
        return JDCJ_pdf_rules;
    }

    public void setJDCJ_pdf_rules(String JDCJ_pdf_rules) {
        this.JDCJ_pdf_rules = JDCJ_pdf_rules;
    }

    public String getFXJC_pdf_rules() {
        return FXJC_pdf_rules;
    }

    public void setFXJC_pdf_rules(String FXJC_pdf_rules) {
        this.FXJC_pdf_rules = FXJC_pdf_rules;
    }

    public Integer getWochacha_task_id() {
        return wochacha_task_id;
    }

    public void setWochacha_task_id(Integer wochacha_task_id) {
        this.wochacha_task_id = wochacha_task_id;
    }

    public String getSp_s_sfjk() {
        return sp_s_sfjk;
    }

    public void setSp_s_sfjk(String sp_s_sfjk) {
        this.sp_s_sfjk = sp_s_sfjk;
    }

    public String getSp_s_ycg() {
        return sp_s_ycg;
    }

    public void setSp_s_ycg(String sp_s_ycg) {
        this.sp_s_ycg = sp_s_ycg;
    }

    public String getSp_s_sfwtsc() {
        return sp_s_sfwtsc;
    }

    public void setSp_s_sfwtsc(String sp_s_sfwtsc) {
        this.sp_s_sfwtsc = sp_s_sfwtsc;
    }

    public String getSp_s_wtsheng() {
        return sp_s_wtsheng;
    }

    public void setSp_s_wtsheng(String sp_s_wtsheng) {
        this.sp_s_wtsheng = sp_s_wtsheng;
    }

    public String getSp_s_wtshi() {
        return sp_s_wtshi;
    }

    public void setSp_s_wtshi(String sp_s_wtshi) {
        this.sp_s_wtshi = sp_s_wtshi;
    }

    public String getSp_s_wtxian() {
        return sp_s_wtxian;
    }

    public void setSp_s_wtxian(String sp_s_wtxian) {
        this.sp_s_wtxian = sp_s_wtxian;
    }

    public String getSp_s_qymc() {
        return sp_s_qymc;
    }

    public void setSp_s_qymc(String sp_s_qymc) {
        this.sp_s_qymc = sp_s_qymc;
    }

    public String getSp_s_qydz() {
        return sp_s_qydz;
    }

    public void setSp_s_qydz(String sp_s_qydz) {
        this.sp_s_qydz = sp_s_qydz;
    }

    public String getSp_s_qs() {
        return sp_s_qs;
    }

    public void setSp_s_qs(String sp_s_qs) {
        this.sp_s_qs = sp_s_qs;
    }

    public String getSp_s_lxr() {
        return sp_s_lxr;
    }

    public void setSp_s_lxr(String sp_s_lxr) {
        this.sp_s_lxr = sp_s_lxr;
    }

    public String getSp_s_tel() {
        return sp_s_tel;
    }

    public void setSp_s_tel(String sp_s_tel) {
        this.sp_s_tel = sp_s_tel;
    }

    public String getSp_s_pic() {
        return sp_s_pic;
    }

    public void setSp_s_pic(String sp_s_pic) {
        this.sp_s_pic = sp_s_pic;
    }

    public String getSp_s_sign() {
        return sp_s_sign;
    }

    public void setSp_s_sign(String sp_s_sign) {
        this.sp_s_sign = sp_s_sign;
    }

    public String getHealth_code() {
        return health_code;
    }

    public void setHealth_code(String health_code) {
        this.health_code = health_code;
    }

    public String getHealth_func_cat() {
        return health_func_cat;
    }

    public void setHealth_func_cat(String health_func_cat) {
        this.health_func_cat = health_func_cat;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getRainbowcode() {
        return rainbowcode;
    }

    public void setRainbowcode(String rainbowcode) {
        this.rainbowcode = rainbowcode;
    }

    public String getRainbowcode_url() {
        return rainbowcode_url;
    }

    public void setRainbowcode_url(String rainbowcode_url) {
        this.rainbowcode_url = rainbowcode_url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getSYN_STATUS() {
        return SYN_STATUS;
    }

    public void setSYN_STATUS(Integer SYN_STATUS) {
        this.SYN_STATUS = SYN_STATUS;
    }

    public LocalDateTime getRECORD_INSERT_TIME() {
        return RECORD_INSERT_TIME;
    }

    public void setRECORD_INSERT_TIME(LocalDateTime RECORD_INSERT_TIME) {
        this.RECORD_INSERT_TIME = RECORD_INSERT_TIME;
    }

    @Override
    public String toString() {
        return "SpBsbs{" +
        "id=" + id +
        ", sp_s_1=" + sp_s_1 +
        ", created_at=" + created_at +
        ", updated_at=" + updated_at +
        ", sp_s_2=" + sp_s_2 +
        ", sp_s_3=" + sp_s_3 +
        ", sp_s_4=" + sp_s_4 +
        ", sp_s_5=" + sp_s_5 +
        ", sp_s_6=" + sp_s_6 +
        ", sp_s_7=" + sp_s_7 +
        ", sp_s_8=" + sp_s_8 +
        ", sp_s_9=" + sp_s_9 +
        ", sp_s_10=" + sp_s_10 +
        ", sp_s_11=" + sp_s_11 +
        ", sp_s_12=" + sp_s_12 +
        ", sp_s_13=" + sp_s_13 +
        ", sp_s_14=" + sp_s_14 +
        ", sp_n_15=" + sp_n_15 +
        ", sp_s_16=" + sp_s_16 +
        ", sp_s_17=" + sp_s_17 +
        ", sp_s_18=" + sp_s_18 +
        ", sp_s_19=" + sp_s_19 +
        ", sp_s_20=" + sp_s_20 +
        ", sp_s_21=" + sp_s_21 +
        ", sp_d_22=" + sp_d_22 +
        ", sp_s_23=" + sp_s_23 +
        ", sp_s_24=" + sp_s_24 +
        ", sp_s_25=" + sp_s_25 +
        ", sp_s_26=" + sp_s_26 +
        ", sp_s_27=" + sp_s_27 +
        ", sp_d_28=" + sp_d_28 +
        ", sp_n_29=" + sp_n_29 +
        ", sp_s_30=" + sp_s_30 +
        ", sp_n_31=" + sp_n_31 +
        ", sp_n_32=" + sp_n_32 +
        ", sp_s_33=" + sp_s_33 +
        ", sp_s_34=" + sp_s_34 +
        ", sp_s_35=" + sp_s_35 +
        ", sp_s_36=" + sp_s_36 +
        ", sp_s_37=" + sp_s_37 +
        ", sp_d_38=" + sp_d_38 +
        ", sp_s_39=" + sp_s_39 +
        ", sp_s_40=" + sp_s_40 +
        ", sp_s_41=" + sp_s_41 +
        ", sp_s_42=" + sp_s_42 +
        ", sp_s_43=" + sp_s_43 +
        ", sp_s_44=" + sp_s_44 +
        ", sp_s_45=" + sp_s_45 +
        ", sp_d_46=" + sp_d_46 +
        ", sp_d_47=" + sp_d_47 +
        ", sp_s_48=" + sp_s_48 +
        ", sp_s_49=" + sp_s_49 +
        ", sp_s_50=" + sp_s_50 +
        ", sp_s_51=" + sp_s_51 +
        ", sp_s_52=" + sp_s_52 +
        ", sp_s_53=" + sp_s_53 +
        ", sp_s_54=" + sp_s_54 +
        ", sp_s_55=" + sp_s_55 +
        ", sp_s_56=" + sp_s_56 +
        ", sp_s_57=" + sp_s_57 +
        ", sp_s_58=" + sp_s_58 +
        ", sp_s_59=" + sp_s_59 +
        ", sp_s_60=" + sp_s_60 +
        ", sp_s_61=" + sp_s_61 +
        ", sp_s_62=" + sp_s_62 +
        ", sp_s_63=" + sp_s_63 +
        ", sp_s_64=" + sp_s_64 +
        ", sp_s_65=" + sp_s_65 +
        ", sp_s_66=" + sp_s_66 +
        ", sp_s_67=" + sp_s_67 +
        ", sp_s_68=" + sp_s_68 +
        ", sp_s_69=" + sp_s_69 +
        ", sp_s_70=" + sp_s_70 +
        ", sp_s_71=" + sp_s_71 +
        ", sp_s_72=" + sp_s_72 +
        ", sp_s_73=" + sp_s_73 +
        ", sp_s_74=" + sp_s_74 +
        ", sp_s_75=" + sp_s_75 +
        ", sp_s_76=" + sp_s_76 +
        ", sp_s_77=" + sp_s_77 +
        ", sp_s_78=" + sp_s_78 +
        ", sp_s_79=" + sp_s_79 +
        ", sp_s_80=" + sp_s_80 +
        ", sp_s_81=" + sp_s_81 +
        ", sp_s_82=" + sp_s_82 +
        ", sp_s_83=" + sp_s_83 +
        ", sp_s_84=" + sp_s_84 +
        ", sp_s_85=" + sp_s_85 +
        ", sp_d_86=" + sp_d_86 +
        ", sp_s_87=" + sp_s_87 +
        ", sp_s_88=" + sp_s_88 +
        ", tname=" + tname +
        ", submit_d_flag=" + submit_d_flag +
        ", sp_n_jcxcount=" + sp_n_jcxcount +
        ", sp_s_bsfl=" + sp_s_bsfl +
        ", sp_s_2_1=" + sp_s_2_1 +
        ", sp_i_state=" + sp_i_state +
        ", sp_i_jgback=" + sp_i_jgback +
        ", sp_s_reason=" + sp_s_reason +
        ", sp_i_backtimes=" + sp_i_backtimes +
        ", sp_s_201=" + sp_s_201 +
        ", sp_s_202=" + sp_s_202 +
        ", sp_s_203=" + sp_s_203 +
        ", sp_s_204=" + sp_s_204 +
        ", sp_s_205=" + sp_s_205 +
        ", sp_s_206=" + sp_s_206 +
        ", sp_s_207=" + sp_s_207 +
        ", sp_s_208=" + sp_s_208 +
        ", sp_s_209=" + sp_s_209 +
        ", sp_s_210=" + sp_s_210 +
        ", sp_s_211=" + sp_s_211 +
        ", sp_s_212=" + sp_s_212 +
        ", sp_s_213=" + sp_s_213 +
        ", sp_s_214=" + sp_s_214 +
        ", sp_s_215=" + sp_s_215 +
        ", sp_t_procedure=" + sp_t_procedure +
        ", fail_report_path=" + fail_report_path +
        ", is_yydj=" + is_yydj +
        ", current_yycz_step=" + current_yycz_step +
        ", bgfl=" + bgfl +
        ", sp_xkz=" + sp_xkz +
        ", sp_xkz_id=" + sp_xkz_id +
        ", fail_report_at=" + fail_report_at +
        ", czb_reverted_flag=" + czb_reverted_flag +
        ", synced=" + synced +
        ", gbsj=" + gbsj +
        ", via_api=" + via_api +
        ", application_id=" + application_id +
        ", report_path=" + report_path +
        ", cyd_file_path=" + cyd_file_path +
        ", cyjygzs_file_path=" + cyjygzs_file_path +
        ", yydj_enabled_by_admin_at=" + yydj_enabled_by_admin_at +
        ", synced_at=" + synced_at +
        ", czb_reverted_reason=" + czb_reverted_reason +
        ", sp_s_220=" + sp_s_220 +
        ", sp_s_221=" + sp_s_221 +
        ", sp_s_222=" + sp_s_222 +
        ", user_id=" + user_id +
        ", uid=" + uid +
        ", sp_s_37_user_id=" + sp_s_37_user_id +
        ", deleted_at=" + deleted_at +
        ", xsbg_file_path=" + xsbg_file_path +
        ", ca_key_status=" + ca_key_status +
        ", sp_s_city=" + sp_s_city +
        ", inspection_basis=" + inspection_basis +
        ", decision_basis=" + decision_basis +
        ", sign_date=" + sign_date +
        ", sp_s_89=" + sp_s_89 +
        ", FX_jyyj_custom=" + FX_jyyj_custom +
        ", JDCJ_report_path=" + JDCJ_report_path +
        ", FXJC_report_path=" + FXJC_report_path +
        ", JDCJ_pdf_rules=" + JDCJ_pdf_rules +
        ", FXJC_pdf_rules=" + FXJC_pdf_rules +
        ", wochacha_task_id=" + wochacha_task_id +
        ", sp_s_sfjk=" + sp_s_sfjk +
        ", sp_s_ycg=" + sp_s_ycg +
        ", sp_s_sfwtsc=" + sp_s_sfwtsc +
        ", sp_s_wtsheng=" + sp_s_wtsheng +
        ", sp_s_wtshi=" + sp_s_wtshi +
        ", sp_s_wtxian=" + sp_s_wtxian +
        ", sp_s_qymc=" + sp_s_qymc +
        ", sp_s_qydz=" + sp_s_qydz +
        ", sp_s_qs=" + sp_s_qs +
        ", sp_s_lxr=" + sp_s_lxr +
        ", sp_s_tel=" + sp_s_tel +
        ", sp_s_pic=" + sp_s_pic +
        ", sp_s_sign=" + sp_s_sign +
        ", health_code=" + health_code +
        ", health_func_cat=" + health_func_cat +
        ", barcode=" + barcode +
        ", rainbowcode=" + rainbowcode +
        ", rainbowcode_url=" + rainbowcode_url +
        ", state=" + state +
        ", isdelete=" + isdelete +
        ", SYN_STATUS=" + SYN_STATUS +
        ", RECORD_INSERT_TIME=" + RECORD_INSERT_TIME +
        "}";
    }
}
