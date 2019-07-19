package com.fsnip.topicdata.model.Topology;

import com.alibaba.fastjson.JSONObject;

public class BaseTopVo {

    private  String name;
    private  String category;
    private  String draggable;
    private  String symbolSize;


    public  BaseTopVo (){
        this.draggable ="false";
    }

    public  BaseTopVo ( String name,String category,String symbolSize){
        this.draggable ="false";
        this.name = name;
        this.category = category;
        this.symbolSize = symbolSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDraggable() {
        return draggable;
    }

    public void setDraggable(String draggable) {
        this.draggable = draggable;
    }

    public String getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(String symbolSize) {
        this.symbolSize = symbolSize;
    }


}
