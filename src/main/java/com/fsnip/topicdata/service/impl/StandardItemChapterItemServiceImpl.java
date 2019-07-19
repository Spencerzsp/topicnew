package com.fsnip.topicdata.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fsnip.topicdata.model.StandardItemChapterItem;
import com.fsnip.topicdata.model.StandardItemChapterItem;
import com.fsnip.topicdata.dao.StandardItemChapterItemMapper;
import com.fsnip.topicdata.service.StandardItemChapterItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章章节 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@Service
public class StandardItemChapterItemServiceImpl extends ServiceImpl<StandardItemChapterItemMapper, StandardItemChapterItem> implements StandardItemChapterItemService {


    public StandardItemChapterItem getStandardItemChapter(String standardItemChapterItem){

        JSONObject obj = JSON.parseObject(standardItemChapterItem);

        return   JSONObject.toJavaObject(obj,StandardItemChapterItem.class);
    }

    @Override
    public void removeByChapterId(Integer chapterId) {
        baseMapper.removeByChapterId(chapterId);
    }

}
