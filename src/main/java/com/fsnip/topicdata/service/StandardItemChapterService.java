package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.ChapterItemVo;
import com.fsnip.topicdata.model.StandardItemChapter;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
public interface StandardItemChapterService extends IService<StandardItemChapter> {

    boolean saveJson(String standardItemChapter, List<String> standardItemChapterItems);
    boolean saveJson(String standardItemChapter, String standardItemChapterItems);

    List<ChapterItemVo> getChapterAndItem(String standardName, String organization);
}
