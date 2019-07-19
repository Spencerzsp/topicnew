package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.StandardItemChapterItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 文章章节 Mapper 接口
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@Mapper
public interface StandardItemChapterItemMapper extends BaseMapper<StandardItemChapterItem> {

    void removeByChapterId(@Param("chapterId") Integer chapterId);
}
