package com.fsnip.topicdata.dao;

import com.fsnip.topicdata.model.NameCount;
import com.fsnip.topicdata.model.SupervisionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
@Mapper
public interface CountMapper
{
    /**
     * 日常监督管理机构  RCJDGLJG 分组
     * @return
     */
    List<NameCount> findSpCoreESpJyxkxx(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    int  findSpCoreESpJyxkxxTotal();
    long findSpCoreESpJyxkxxSize();
    List<NameCount> findSpCoreESpJyxkxxAll();
    /**
     * sc_core.sc_xkzxx  日常监督管理机构 RCJDGLJG
     * @return
     */
    List<NameCount> findSCCoreScxkzxx(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    long findSCCoreScxkzxxSize();
    int  findSCCoreScxkzxxTotal();
    List<NameCount> findSCCoreScxkzxxAll();

    /**
     * fsn_cloud.product
     * @return
     */
    List<NameCount> findFsnCloudProduct(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    long  findFsnCloudProductSize();
    int  findFsnCloudProductTotal();
    List<NameCount> findFsnCloudProductAll();
    /** 日常监督检查 检查单位  XXCDW
     *      jg_system.jg_xcjlb
     *
     */

    List<NameCount> findJgSystemJgXcJlb(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    long  findJgSystemJgXcJlbSize();
    int  findJgSystemJgXcJlbTotal();
    List<NameCount> findJgSystemJgXcJlbAll();
    /**
     * 法律法规数据   jg_system.law_item_chapter 发布单位 RELEASE_BY
     */
    List<NameCount> findJgSystemLawItemChapter(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    long  findJgSystemLawItemChapterSize();
    int  findJgSystemLawItemChapterTotal();
    List<NameCount> findJgSystemLawItemChapterAll();
    /**
     * 舆情相关数据   mymonitor.article_detail  转发数 Article_ReplyCount
     */
    List<NameCount> findMymonitorArticleDetail(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    int  findMymonitorArticleDetailTotal();
    long  findMymonitorArticleDetailSize();
    List<NameCount> findMymonitorArticleDetailAll();
    /** sp_bsbs
     *
     * @return
     */
    List<NameCount> findSpBsbs(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    int  findSpBsbsTotal();
    long  findSpBsbsSize();
    List<NameCount> findSpBsbsAll();

}
