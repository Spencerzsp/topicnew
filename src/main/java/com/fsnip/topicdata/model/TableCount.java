package com.fsnip.topicdata.model;

import com.fsnip.topicdata.utils.DateUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel( description="表数据量")
public class TableCount {
    @ApiModelProperty(value = "名称")
    private String tablename;
    @ApiModelProperty(value = "数量")
    private String count;
    @ApiModelProperty(value = "查询时间")
    private String selectDate;

    public TableCount(){
        selectDate = DateUtil.getDateTime();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(String selectDate) {
        this.selectDate = selectDate;
    }
}
