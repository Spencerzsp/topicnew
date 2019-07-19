package com.fsnip.topicdata.service;

import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fsnip.topicdata.model.NameCount;
import com.fsnip.topicdata.model.TableCount;

import java.util.List;

public interface CountService {


    int  totalCount(String type);
    List<TableCount>   totalCount();
    List<NameCount> getNameCountList(String type);

    IPage<NameCount> getNameCountList(String type, int pageNum, int pageSize);

    JSONArray getTopology();
}
