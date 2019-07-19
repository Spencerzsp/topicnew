package com.fsnip.topicdata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fsnip.topicdata.model.SpBsBsAnddata;
import com.fsnip.topicdata.model.SpBsbs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户数据 Mapper 接口
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
@Mapper
public interface SpBsbsMapper  extends BaseMapper<SpBsbs> {

    List<SpBsBsAnddata> getAllDataByMap(Map<String, String> map);

    List<SpBsbs> listByMaps(Map<String, String> map);
}
