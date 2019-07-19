package com.fsnip.topicdata.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fsnip.topicdata.model.ChapterItemVo;
import com.fsnip.topicdata.model.SpBsbs;
import com.fsnip.topicdata.model.StandardItemChapter;
import com.fsnip.topicdata.dao.StandardItemChapterMapper;
import com.fsnip.topicdata.model.StandardItemChapterItem;
import com.fsnip.topicdata.service.StandardItemChapterItemService;
import com.fsnip.topicdata.service.StandardItemChapterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@Service
public class StandardItemChapterServiceImpl extends ServiceImpl<StandardItemChapterMapper, StandardItemChapter> implements StandardItemChapterService {

    @Autowired
    private StandardItemChapterItemService itemChapterItemService;

    @Override
    public boolean saveJson(String standardItemChapter, List<String> standardItemChapterItems) {

        StandardItemChapter  chapter = getstandardItemChapter(standardItemChapter);
       List<StandardItemChapterItem>  items  = Lists.newArrayList();
        for(String temp:standardItemChapterItems){
            StandardItemChapterItem  item = itemChapterItemService.getStandardItemChapter(temp);
            items.add(item);
        }

        save(chapter);

        return false;
    }

    public boolean saveJson(String standardItemChapter, String standardItemChapterItems) {

        StandardItemChapter  chapter = getstandardItemChapter(standardItemChapter);
        saveOrUpdate(chapter);

        itemChapterItemService.removeByChapterId(chapter.getId());
        StandardItemChapterItem  item = itemChapterItemService.getStandardItemChapter(standardItemChapterItems);
        item.setItemChapterId(chapter.getId());
        return itemChapterItemService.save(item);
    }

    @Override
    public List<ChapterItemVo> getChapterAndItem(String standardName, String organization) {

        return baseMapper.getChapterAndItem( standardName,  organization);
    }





    private StandardItemChapter getstandardItemChapter(String standardItemChapter){
        JSONObject obj = JSON.parseObject(standardItemChapter);
        return   JSONObject.toJavaObject(obj,StandardItemChapter.class);
    }
}
