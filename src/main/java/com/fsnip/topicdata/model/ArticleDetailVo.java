package com.fsnip.topicdata.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by gnaynaw on 2019/5/25.
 */
public class ArticleDetailVo {
    @XmlElement(name = "author_ID")
    private String author_ID;
    @XmlElement(name = "article_Detail_ID")
    private String article_Detail_ID;
    @XmlElement(name = "article_URL")
    private String article_URL;
    @XmlElement(name = "article_Search_Keywords")
    private String article_Search_Keywords;
    @XmlElement(name = "article_Title")
    private String article_Title;
    @XmlElement(name = "article_Content")
    private String article_Content;
    @XmlElement(name = "article_PubTime")
    private String article_PubTime;
    @XmlElement(name = "website_No")
    private String website_No;
    @XmlElement(name = "article_Content_FingerPrint")
    private String article_Content_FingerPrint;

    public String getAuthor_ID() {
        return author_ID;
    }

    public void setAuthor_ID(String author_ID) {
        this.author_ID = author_ID;
    }

    public String getArticle_Detail_ID() {
        return article_Detail_ID;
    }

    public void setArticle_Detail_ID(String article_Detail_ID) {
        this.article_Detail_ID = article_Detail_ID;
    }

    public String getArticle_URL() {
        return article_URL;
    }

    public void setArticle_URL(String article_URL) {
        this.article_URL = article_URL;
    }

    public String getArticle_Search_Keywords() {
        return article_Search_Keywords;
    }

    public void setArticle_Search_Keywords(String article_Search_Keywords) {
        this.article_Search_Keywords = article_Search_Keywords;
    }

    public String getArticle_Title() {
        return article_Title;
    }

    public void setArticle_Title(String article_Title) {
        this.article_Title = article_Title;
    }

    public String getArticle_Content() {
        return article_Content;
    }

    public void setArticle_Content(String article_Content) {
        this.article_Content = article_Content;
    }

    public String getArticle_PubTime() {
        return article_PubTime;
    }

    public void setArticle_PubTime(String article_PubTime) {
        this.article_PubTime = article_PubTime;
    }

    public String getWebsite_No() {
        return website_No;
    }

    public void setWebsite_No(String website_No) {
        this.website_No = website_No;
    }

    public String getArticle_Content_FingerPrint() {
        return article_Content_FingerPrint;
    }

    public void setArticle_Content_FingerPrint(String article_Content_FingerPrint) {
        this.article_Content_FingerPrint = article_Content_FingerPrint;
    }
}
