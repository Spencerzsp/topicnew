package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.StandardItemChapterItem;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 文章章节 服务类
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
public interface StandardItemChapterItemService extends IService<StandardItemChapterItem> {

     StandardItemChapterItem getStandardItemChapter(String standardItemChapterItem);

    void removeByChapterId(Integer id);
}
