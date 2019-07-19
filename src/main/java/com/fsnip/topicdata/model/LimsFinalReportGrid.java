package com.fsnip.topicdata.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/28.
 * @Modified By:
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class LimsFinalReportGrid
{
    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "TEST_ITEM_NAME")
    private String TEST_ITEM_NAME;

    @XmlElement(name = "VALUE_RESULT")
    private String gc_conclusion;

    @XmlElement(name = "STANDARD")
    private String STANDARD;

    @XmlElement(name = "JUDGMENT_STANDARD_NAME")
    private String JUDGMENT_STANDARD_NAME;

    @XmlElement(name = "RECORD_INSERT_TIME")
    private String RECORD_INSERT_TIME;

    @XmlElement(name = "TEST_STANDARD_DESCRIBE")
    private String TEST_STANDARD_DESCRIBE;

    @XmlElement(name = "MEASUREMENT_UNIT")
    private String MEASUREMENT_UNIT;

    @XmlElement(name = "TEST_REQUIREMENT_ID")
    private String TEST_REQUIREMENT_ID;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTEST_ITEM_NAME()
    {
        return TEST_ITEM_NAME;
    }

    public void setTEST_ITEM_NAME(String TEST_ITEM_NAME)
    {
        this.TEST_ITEM_NAME = TEST_ITEM_NAME;
    }

    public String getGc_conclusion()
    {
        return gc_conclusion;
    }

    public void setGc_conclusion(String gc_conclusion)
    {
        this.gc_conclusion = gc_conclusion;
    }

    public String getSTANDARD()
    {
        return STANDARD;
    }

    public void setSTANDARD(String STANDARD)
    {
        this.STANDARD = STANDARD;
    }

    public String getJUDGMENT_STANDARD_NAME()
    {
        return JUDGMENT_STANDARD_NAME;
    }

    public void setJUDGMENT_STANDARD_NAME(String JUDGMENT_STANDARD_NAME)
    {
        this.JUDGMENT_STANDARD_NAME = JUDGMENT_STANDARD_NAME;
    }

    public String getRECORD_INSERT_TIME()
    {
        return RECORD_INSERT_TIME;
    }

    public void setRECORD_INSERT_TIME(String RECORD_INSERT_TIME)
    {
        this.RECORD_INSERT_TIME = RECORD_INSERT_TIME;
    }

    public String getTEST_STANDARD_DESCRIBE()
    {
        return TEST_STANDARD_DESCRIBE;
    }

    public void setTEST_STANDARD_DESCRIBE(String TEST_STANDARD_DESCRIBE)
    {
        this.TEST_STANDARD_DESCRIBE = TEST_STANDARD_DESCRIBE;
    }

    public String getMEASUREMENT_UNIT()
    {
        return MEASUREMENT_UNIT;
    }

    public void setMEASUREMENT_UNIT(String MEASUREMENT_UNIT)
    {
        this.MEASUREMENT_UNIT = MEASUREMENT_UNIT;
    }

    public String getTEST_REQUIREMENT_ID()
    {
        return TEST_REQUIREMENT_ID;
    }

    public void setTEST_REQUIREMENT_ID(String TEST_REQUIREMENT_ID)
    {
        this.TEST_REQUIREMENT_ID = TEST_REQUIREMENT_ID;
    }
}
