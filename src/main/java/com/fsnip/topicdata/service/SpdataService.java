package com.fsnip.topicdata.service;

import com.fsnip.topicdata.model.Spdata;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户数据2表 服务类
 * </p>
 *
 * @author tdj
 * @since 2019-05-28
 */
public interface SpdataService extends IService<Spdata> {

    boolean saveJson(String params);

    boolean saveJson(String params, String id);
}
