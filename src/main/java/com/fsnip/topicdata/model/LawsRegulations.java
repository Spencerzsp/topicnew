package com.fsnip.topicdata.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/31.
 * @Modified By:
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class LawsRegulations
{
    @XmlElement(name="TITLE")
    private String TITLE;
    @XmlElement(name="RELEASE_BY")
    private String RELEASE_BY;
    @XmlElement(name="MESSAGE_NUMBER")
    private String MESSAGE_NUMBER;
    @XmlElement(name="EFFECTIVE_DATE")
    private String EFFECTIVE_DATE;
    @XmlElement(name="CHAPTER_DESC")
    private String CHAPTER_DESC;
    @XmlElement(name="KNOB_DESC")
    private String KNOB_DESC;
    @XmlElement(name="ITEM_DESC")
    private String ITEM_DESC;
    @XmlElement(name="LAW_CONTENT")
    private String LAW_CONTENT;

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getRELEASE_BY() {
        return RELEASE_BY;
    }

    public void setRELEASE_BY(String RELEASE_BY) {
        this.RELEASE_BY = RELEASE_BY;
    }

    public String getMESSAGE_NUMBER() {
        return MESSAGE_NUMBER;
    }

    public void setMESSAGE_NUMBER(String MESSAGE_NUMBER) {
        this.MESSAGE_NUMBER = MESSAGE_NUMBER;
    }

    public String getEFFECTIVE_DATE() {
        return EFFECTIVE_DATE;
    }

    public void setEFFECTIVE_DATE(String EFFECTIVE_DATE) {
        this.EFFECTIVE_DATE = EFFECTIVE_DATE;
    }

    public String getCHAPTER_DESC() {
        return CHAPTER_DESC;
    }

    public void setCHAPTER_DESC(String CHAPTER_DESC) {
        this.CHAPTER_DESC = CHAPTER_DESC;
    }

    public String getKNOB_DESC() {
        return KNOB_DESC;
    }

    public void setKNOB_DESC(String KNOB_DESC) {
        this.KNOB_DESC = KNOB_DESC;
    }

    public String getITEM_DESC() {
        return ITEM_DESC;
    }

    public void setITEM_DESC(String ITEM_DESC) {
        this.ITEM_DESC = ITEM_DESC;
    }

    public String getLAW_CONTENT() {
        return LAW_CONTENT;
    }

    public void setLAW_CONTENT(String LAW_CONTENT) {
        this.LAW_CONTENT = LAW_CONTENT;
    }
}
