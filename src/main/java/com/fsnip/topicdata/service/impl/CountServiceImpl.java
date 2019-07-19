package com.fsnip.topicdata.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fsnip.topicdata.dao.CountMapper;
import com.fsnip.topicdata.model.NameCount;
import com.fsnip.topicdata.model.TableCount;
import com.fsnip.topicdata.model.Topology.BaseNameVo;
import com.fsnip.topicdata.model.Topology.BaseTopVo;
import com.fsnip.topicdata.model.Topology.LinkVo;
import com.fsnip.topicdata.service.CountService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CountServiceImpl implements CountService {

    @Autowired
    CountMapper countMapper;

    public int totalCount(String type) {

        switch (type) {
            case "sp_core_e_spjyxkxx":
                return countMapper.findSpCoreESpJyxkxxTotal();
            case "sc_core_sc_xkzxx":
                return countMapper.findSCCoreScxkzxxTotal();
            case "fsn_cloud_product":
                return countMapper.findFsnCloudProductTotal();
            case "jg_system_jg_xcjlb":
                return countMapper.findJgSystemJgXcJlbTotal();
            case "jg_system_law_item_chapter":
                return countMapper.findJgSystemLawItemChapterTotal();
            case "article_detail":
                return countMapper.findMymonitorArticleDetailTotal();
            case "sp_bsbs":
                return countMapper.findSpBsbsTotal();
        }

        return 0;
    }

    public List<TableCount> totalCount() {

        List<TableCount> list = new ArrayList<>();

        {
            TableCount name = new TableCount();
            name.setTablename("sp_core_e_spjyxkxx");
            name.setCount(countMapper.findSpCoreESpJyxkxxTotal() + "");
            list.add(name);
        }
        {
            TableCount name = new TableCount();
            name.setTablename("sc_core_sc_xkzxx");
            name.setCount(countMapper.findSCCoreScxkzxxTotal() + "");
            list.add(name);
        }
        {
            TableCount name = new TableCount();
            name.setTablename("fsn_cloud_product");
            name.setCount(countMapper.findFsnCloudProductTotal() + "");
            list.add(name);
        }
        {
            TableCount name = new TableCount();
            name.setTablename("jg_system_jg_xcjlb");
            name.setCount(countMapper.findJgSystemJgXcJlbTotal() + "");
            list.add(name);
        }
        {
            TableCount name = new TableCount();
            name.setTablename("jg_system_law_item_chapter");
            name.setCount(countMapper.findJgSystemLawItemChapterTotal() + "");
            list.add(name);
        }
        {
            TableCount name = new TableCount();
            name.setTablename("article_detail");
            name.setCount(countMapper.findMymonitorArticleDetailTotal() + "");
            list.add(name);
        }
        {
            TableCount name = new TableCount();
            name.setTablename("sp_bsbs");
            name.setCount(countMapper.findSpBsbsTotal() + "");
            list.add(name);
        }


        return list;
    }

    @Override
    public List<NameCount> getNameCountList(String type) {

       /*switch (type){
           case "sp_core.e_spjyxkxx":
               return  countMapper.findSpCoreESpJyxkxx();
           case "sc_core.sc_xkzxx":
               return  countMapper.findSCCoreScxkzxx();
           case "fsn_cloud.product":
               return  countMapper.findFsnCloudProduct();
           case "jg_system.jg_xcjlb":
               return  countMapper.findJgSystemJgXcJlb();
           case "jg_system.law_item_chapter":
               return  countMapper.findJgSystemLawItemChapter();
           case "mymonitor.article_detail":
               return  countMapper.findMymonitorArticleDetail();
           case "sp_bsbs":
               return  countMapper.findSpBsbs();
       }*/
        return null;
    }

    public IPage<NameCount> getNameCountList(String type, int pageNum, int pageSize) {
        IPage<NameCount> page = new Page<NameCount>(pageNum, pageSize);
        switch (type) {
            case "sp_core_e_spjyxkxx":
                page.setTotal(countMapper.findSpCoreESpJyxkxxSize());
                page.setRecords(countMapper.findSpCoreESpJyxkxx((pageNum - 1) * pageSize, pageSize));
                break;
            case "sc_core_sc_xkzxx":
                page.setTotal(countMapper.findSCCoreScxkzxxSize());
                page.setRecords(countMapper.findSCCoreScxkzxx((pageNum - 1) * pageSize, pageSize));
                break;
            case "fsn_cloud_product":
                page.setTotal(countMapper.findFsnCloudProductSize());
                page.setRecords(countMapper.findFsnCloudProduct((pageNum - 1) * pageSize, pageSize));
                break;
            case "jg_system_jg_xcjlb":
                page.setTotal(countMapper.findJgSystemJgXcJlbSize());
                page.setRecords(countMapper.findJgSystemJgXcJlb((pageNum - 1) * pageSize, pageSize));
                break;
            case "jg_system_law_item_chapter":
                page.setTotal(countMapper.findJgSystemLawItemChapterSize());
                page.setRecords(countMapper.findJgSystemLawItemChapter((pageNum - 1) * pageSize, pageSize));
                break;
            case "article_detail":
                page.setTotal(countMapper.findMymonitorArticleDetailSize());
                page.setRecords(countMapper.findMymonitorArticleDetail((pageNum - 1) * pageSize, pageSize));
                break;
            case "sp_bsbs":
                page.setTotal(countMapper.findSpBsbsSize());
                page.setRecords(countMapper.findSpBsbs((pageNum - 1) * pageSize, pageSize));
                break;
        }
        return page;
    }

    @Override
    public JSONArray getTopology() {
        /**
         * 查询所有基础数据
         */
        List<NameCount> l1 = countMapper.findSpCoreESpJyxkxxAll();
        List<NameCount> l2 = countMapper.findSCCoreScxkzxxAll();
        List<NameCount> l3 = countMapper.findFsnCloudProductAll();
        List<NameCount> l4 = countMapper.findJgSystemJgXcJlbAll();
        List<NameCount> l5 = countMapper.findJgSystemLawItemChapterAll();
        List<NameCount> l6 = countMapper.findMymonitorArticleDetailAll();
        List<NameCount> l7 = countMapper.findSpBsbsAll();

        List<LinkVo> linkVoList = Lists.newArrayList();
        {
            linkVoList.add(new LinkVo(zhuti, jyxk, l1.size() + ""));
            linkVoList.add(new LinkVo(zhuti, scxk, l2.size() + ""));
            linkVoList.add(new LinkVo(zhuti, cpxx, l3.size() + ""));
            linkVoList.add(new LinkVo(zhuti, rcjdjc, l4.size() + ""));
            linkVoList.add(new LinkVo(zhuti, flfg, l5.size() + ""));
            linkVoList.add(new LinkVo(zhuti, yqxt, l6.size() + ""));
            linkVoList.add(new LinkVo(zhuti, jyjc, l7.size() + ""));
        }
        List<BaseNameVo> baseNameVoList = getBaseNameList();
        List<BaseTopVo> baseTopVoList = getLinkBaseList();
        for (NameCount temp : l1) {
            linkVoList.add(new LinkVo(jyxk, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        for (NameCount temp : l2) {
            linkVoList.add(new LinkVo(scxk, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        for (NameCount temp : l3) {
            linkVoList.add(new LinkVo(cpxx, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        for (NameCount temp : l4) {
            linkVoList.add(new LinkVo(rcjdjc, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        for (NameCount temp : l5) {
            linkVoList.add(new LinkVo(flfg, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        for (NameCount temp : l6) {
            linkVoList.add(new LinkVo(yqxt, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        for (NameCount temp : l7) {
            linkVoList.add(new LinkVo(jyjc, temp.getUsername(), temp.getAddcount()));
            baseNameVoList.add(new BaseNameVo(temp.getUsername()));
            baseTopVoList.add(new BaseTopVo(temp.getUsername(), temp.getUsername(), "10"));
        }
        List re = Lists.newArrayList();
        re.add(linkVoList);
        re.add(baseNameVoList);
        re.add(baseTopVoList);
        String jsonStr = JSONObject.toJSONString(re);
        return JSONObject.parseArray(jsonStr);
    }


    public static final String zhuti = "主题";
    public static final String jyxk = "经营许可";
    public static final String scxk = "生产许可";
    public static final String cpxx = "产品信息";
    public static final String rcjdjc = "日常监督检查";
    public static final String flfg = "法律法规";
    public static final String yqxt = "舆情系统";
    public static final String jyjc = "检验检测";

    /**
     * sp_core_e_spjyxkxx（经营许可）sc_core_sc_xkzxx（生产许可）" +
     * "fsn_cloud_product（产品信息）jg_system_jg_xcjlb（日常监督检查）jg_system_law_item_chapter（法律法规）" +
     * " article_detail（舆情系统）sp_bsbs（检验检测）
     *
     * @return
     */
    private List<BaseNameVo> getBaseNameList() {
        List<BaseNameVo> list = Lists.newArrayList();
        list.add(new BaseNameVo(zhuti));
        list.add(new BaseNameVo(jyxk));
        list.add(new BaseNameVo(scxk));
        list.add(new BaseNameVo(cpxx));
        list.add(new BaseNameVo(rcjdjc));
        list.add(new BaseNameVo(flfg));
        list.add(new BaseNameVo(yqxt));
        list.add(new BaseNameVo(jyjc));
        return list;
    }

    private List<BaseTopVo> getLinkBaseList() {
        List<BaseTopVo> list = Lists.newArrayList();
        list.add(new BaseTopVo(zhuti, zhuti, "30"));
        list.add(new BaseTopVo(jyxk, jyxk, "20"));
        list.add(new BaseTopVo(scxk, scxk, "20"));
        list.add(new BaseTopVo(cpxx, cpxx, "20"));
        list.add(new BaseTopVo(rcjdjc, rcjdjc, "20"));
        list.add(new BaseTopVo(flfg, flfg, "20"));
        list.add(new BaseTopVo(yqxt, yqxt, "20"));
        list.add(new BaseTopVo(jyjc, jyjc, "20"));
        return list;
    }


}
