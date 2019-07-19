package com.fsnip.topicdata.model.Topology;

import com.alibaba.fastjson.JSONObject;

public class LinkVo {

    private String source;
    private String target;
    private  String value;
    private JSONObject label;


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    public LinkVo(){

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JSONObject getLabel() {
        return label;
    }

    public void setLabel(JSONObject label) {
        this.label = label;
    }

    public LinkVo(String source, String target,String value){
        this.source = source;
        this.target = target;
        this.value = value;
        JSONObject ob = new JSONObject();
        JSONObject obj = new JSONObject();
        obj.put("show","true");
        obj.put("formatter","{c}");
        ob.put("normal",obj);
        this.label =ob;
    }
}
