package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.SpBsBsAnddata;
import com.fsnip.topicdata.model.SpBsbs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户数据 服务类
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
public interface SpBsbsService extends IService<SpBsbs> {

    /**
     * json字符串
     * @param params
     * @return
     */
    boolean saveJson(String params);

    boolean saveJson(String paramsBabs, String paramsData);

    List<SpBsBsAnddata> getAllData(Map<String, String> map);

    List<SpBsbs> listByMaps(Map<String, String> map);
}
