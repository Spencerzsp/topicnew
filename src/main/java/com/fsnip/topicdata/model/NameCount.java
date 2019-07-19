package com.fsnip.topicdata.model;

import com.fsnip.topicdata.utils.DateUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel( description="用户增量")
public class NameCount {
    @ApiModelProperty(value = "名称")
    private String username;
    @ApiModelProperty(value = "新增数量")
    private String addcount;

    @ApiModelProperty(value = "查询时间")
    private String selectDate;

    public NameCount(){

    }

    public String getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(String selectDate) {
        this.selectDate = selectDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddcount() {
        return addcount;
    }

    public void setAddcount(String addcount) {
        this.addcount = addcount;
    }
}
