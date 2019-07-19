package com.fsnip.topicdata.model;


import javax.xml.bind.annotation.XmlElement;

/**
 * 舆情
 *
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
public class ArticleInfo {
    @XmlElement(name = "client_ID")
    private String client_ID;
    @XmlElement(name = "subject_ID")
    private String subject_ID;
    @XmlElement(name = "extracted_Date")
    private String extracted_Date;
    @XmlElement(name = "extracted_Article_Count")
    private String extracted_Article_Count;
    @XmlElement(name = "read_Article_Count")
    private String read_Article_Count;
    @XmlElement(name = "selected_Article_Count")
    private String selected_Article_Count;
    @XmlElement(name = "negative_Article_Count")
    private String negative_Article_Count;
    @XmlElement(name = "maybeNegative_Article_Count")
    private String maybeNegative_Article_Count;
    @XmlElement(name = "unread_MbNgt_Article_Count")
    private String unread_MbNgt_Article_Count;
    @XmlElement(name = "positive_Article_Count")
    private String positive_Article_Count;

    public String getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(String client_ID) {
        this.client_ID = client_ID;
    }

    public String getSubject_ID() {
        return subject_ID;
    }

    public void setSubject_ID(String subject_ID) {
        this.subject_ID = subject_ID;
    }

    public String getExtracted_Date() {
        return extracted_Date;
    }

    public void setExtracted_Date(String extracted_Date) {
        this.extracted_Date = extracted_Date;
    }

    public String getExtracted_Article_Count() {
        return extracted_Article_Count;
    }

    public void setExtracted_Article_Count(String extracted_Article_Count) {
        this.extracted_Article_Count = extracted_Article_Count;
    }

    public String getRead_Article_Count() {
        return read_Article_Count;
    }

    public void setRead_Article_Count(String read_Article_Count) {
        this.read_Article_Count = read_Article_Count;
    }

    public String getSelected_Article_Count() {
        return selected_Article_Count;
    }

    public void setSelected_Article_Count(String selected_Article_Count) {
        this.selected_Article_Count = selected_Article_Count;
    }

    public String getNegative_Article_Count() {
        return negative_Article_Count;
    }

    public void setNegative_Article_Count(String negative_Article_Count) {
        this.negative_Article_Count = negative_Article_Count;
    }

    public String getMaybeNegative_Article_Count() {
        return maybeNegative_Article_Count;
    }

    public void setMaybeNegative_Article_Count(String maybeNegative_Article_Count) {
        this.maybeNegative_Article_Count = maybeNegative_Article_Count;
    }

    public String getUnread_MbNgt_Article_Count() {
        return unread_MbNgt_Article_Count;
    }

    public void setUnread_MbNgt_Article_Count(String unread_MbNgt_Article_Count) {
        this.unread_MbNgt_Article_Count = unread_MbNgt_Article_Count;
    }

    public String getPositive_Article_Count() {
        return positive_Article_Count;
    }

    public void setPositive_Article_Count(String positive_Article_Count) {
        this.positive_Article_Count = positive_Article_Count;
    }
}
