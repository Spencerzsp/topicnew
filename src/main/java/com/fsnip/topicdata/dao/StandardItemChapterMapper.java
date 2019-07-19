package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.ChapterItemVo;
import com.fsnip.topicdata.model.StandardItemChapter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author tdj
 * @since 2019-06-03
 */
@Mapper
public interface StandardItemChapterMapper extends BaseMapper<StandardItemChapter> {

    List<ChapterItemVo> getChapterAndItem(@Param("standardName") String standardName, @Param("organization") String organization);

}
