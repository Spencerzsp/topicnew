package com.fsnip.topicdata.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by gnaynaw on 2019/5/25.
 */
public class ArticleDetail {
    @XmlElement(name = "article_Detail_ID")
    private String article_Detail_ID;
    @XmlElement(name = "website_Group_ID")
    private String website_Group_ID;
    @XmlElement(name = "media_Type_Code")
    private String media_Type_Code;
    @XmlElement(name = "is_Manual_Added")
    private String is_Manual_Added;
    @XmlElement(name = "website_Column_Level")
    private String website_Column_Level;
    @XmlElement(name = "website_Important_Level")
    private String website_Important_Level;
    @XmlElement(name = "article_Title")
    private String article_Title;
    @XmlElement(name = "article_Abstract")
    private String article_Abstract;
    @XmlElement(name = "article_Focus_Keywords")
    private String article_Focus_Keywords;
    @XmlElement(name = "article_Content")
    private String article_Content;
    @XmlElement(name = "article_Author")
    private String article_Author;
    @XmlElement(name = "article_ViewCount")
    private String article_ViewCount;
    @XmlElement(name = "article_ReplyCount")
    private String article_ReplyCount;
    @XmlElement(name = "article_ForwardCount")
    private String article_ForwardCount;
    @XmlElement(name = "article_PubTime")
    private String article_PubTime;
    @XmlElement(name = "province_Name")
    private String province_Name;
    @XmlElement(name = "city_Name")
    private String city_Name;

    public String getArticle_Detail_ID() {
        return article_Detail_ID;
    }

    public void setArticle_Detail_ID(String article_Detail_ID) {
        this.article_Detail_ID = article_Detail_ID;
    }

    public String getWebsite_Group_ID() {
        return website_Group_ID;
    }

    public void setWebsite_Group_ID(String website_Group_ID) {
        this.website_Group_ID = website_Group_ID;
    }

    public String getMedia_Type_Code() {
        return media_Type_Code;
    }

    public void setMedia_Type_Code(String media_Type_Code) {
        this.media_Type_Code = media_Type_Code;
    }

    public String getIs_Manual_Added() {
        return is_Manual_Added;
    }

    public void setIs_Manual_Added(String is_Manual_Added) {
        this.is_Manual_Added = is_Manual_Added;
    }

    public String getWebsite_Column_Level() {
        return website_Column_Level;
    }

    public void setWebsite_Column_Level(String website_Column_Level) {
        this.website_Column_Level = website_Column_Level;
    }

    public String getWebsite_Important_Level() {
        return website_Important_Level;
    }

    public void setWebsite_Important_Level(String website_Important_Level) {
        this.website_Important_Level = website_Important_Level;
    }

    public String getArticle_Title() {
        return article_Title;
    }

    public void setArticle_Title(String article_Title) {
        this.article_Title = article_Title;
    }

    public String getArticle_Abstract() {
        return article_Abstract;
    }

    public void setArticle_Abstract(String article_Abstract) {
        this.article_Abstract = article_Abstract;
    }

    public String getArticle_Focus_Keywords() {
        return article_Focus_Keywords;
    }

    public void setArticle_Focus_Keywords(String article_Focus_Keywords) {
        this.article_Focus_Keywords = article_Focus_Keywords;
    }

    public String getArticle_Content() {
        return article_Content;
    }

    public void setArticle_Content(String article_Content) {
        this.article_Content = article_Content;
    }

    public String getArticle_Author() {
        return article_Author;
    }

    public void setArticle_Author(String article_Author) {
        this.article_Author = article_Author;
    }

    public String getArticle_ViewCount() {
        return article_ViewCount;
    }

    public void setArticle_ViewCount(String article_ViewCount) {
        this.article_ViewCount = article_ViewCount;
    }

    public String getArticle_ReplyCount() {
        return article_ReplyCount;
    }

    public void setArticle_ReplyCount(String article_ReplyCount) {
        this.article_ReplyCount = article_ReplyCount;
    }

    public String getArticle_ForwardCount() {
        return article_ForwardCount;
    }

    public void setArticle_ForwardCount(String article_ForwardCount) {
        this.article_ForwardCount = article_ForwardCount;
    }

    public String getArticle_PubTime() {
        return article_PubTime;
    }

    public void setArticle_PubTime(String article_PubTime) {
        this.article_PubTime = article_PubTime;
    }

    public String getProvince_Name() {
        return province_Name;
    }

    public void setProvince_Name(String province_Name) {
        this.province_Name = province_Name;
    }

    public String getCity_Name() {
        return city_Name;
    }

    public void setCity_Name(String city_Name) {
        this.city_Name = city_Name;
    }
}
