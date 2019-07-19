package com.fsnip.topicdata.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


/**
 * @Author: zengsm.
 * @Description: TODO()
 * @Date:Created in 2018/8/28.
 * @Modified By:
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class LimsTestItem
{
    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "STDMEHTOD_LIMIT")
    private String STDMEHTOD_LIMIT;

    @XmlElement(name = "STDMETHOD_LIMIT_UNIT")
    private String STDMETHOD_LIMIT_UNIT;

    @XmlElement(name = "METHOD_LIMIT")
    private String METHOD_LIMIT;

    @XmlElement(name = "METHOD_LIMIT_UNIT")
    private String METHOD_LIMIT_UNIT;

    @XmlElement(name = "STDMIN_ALLOW_LIMIT")
    private String STDMIN_ALLOW_LIMIT;

    @XmlElement(name = "STDMIN_ALLOW_LIMIT_UNIT")
    private String STDMIN_ALLOW_LIMIT_UNIT;

    @XmlElement(name = "MIN_LIMIT")
    private String MIN_LIMIT;

    @XmlElement(name = "MIN_LIMIT_UNIT")
    private String MIN_LIMIT_UNIT;

    @XmlElement(name = "MAX_LIMIT")
    private String MAX_LIMIT;

    @XmlElement(name = "MAX_LIMIT_UNIT")
    private String MAX_LIMIT_UNIT;

   @XmlElement(name = "STDMAX_ALLOW_LIMIT")
    private String STDMAX_ALLOW_LIMIT;

   @XmlElement(name = "STDMAX_ALLOW_LIMIT_UNIT")
    private String STDMAX_ALLOW_LIMIT_UNIT;

   @XmlElement(name = "limsFinalReportGrids")
   private List<LimsFinalReportGrid> limsFinalReportGrids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSTDMEHTOD_LIMIT() {
        return STDMEHTOD_LIMIT;
    }

    public void setSTDMEHTOD_LIMIT(String STDMEHTOD_LIMIT) {
        this.STDMEHTOD_LIMIT = STDMEHTOD_LIMIT;
    }

    public String getSTDMETHOD_LIMIT_UNIT() {
        return STDMETHOD_LIMIT_UNIT;
    }

    public void setSTDMETHOD_LIMIT_UNIT(String STDMETHOD_LIMIT_UNIT) {
        this.STDMETHOD_LIMIT_UNIT = STDMETHOD_LIMIT_UNIT;
    }

    public String getMETHOD_LIMIT() {
        return METHOD_LIMIT;
    }

    public void setMETHOD_LIMIT(String METHOD_LIMIT) {
        this.METHOD_LIMIT = METHOD_LIMIT;
    }

    public String getMETHOD_LIMIT_UNIT() {
        return METHOD_LIMIT_UNIT;
    }

    public void setMETHOD_LIMIT_UNIT(String METHOD_LIMIT_UNIT) {
        this.METHOD_LIMIT_UNIT = METHOD_LIMIT_UNIT;
    }

    public String getSTDMIN_ALLOW_LIMIT() {
        return STDMIN_ALLOW_LIMIT;
    }

    public void setSTDMIN_ALLOW_LIMIT(String STDMIN_ALLOW_LIMIT) {
        this.STDMIN_ALLOW_LIMIT = STDMIN_ALLOW_LIMIT;
    }

    public String getSTDMIN_ALLOW_LIMIT_UNIT() {
        return STDMIN_ALLOW_LIMIT_UNIT;
    }

    public void setSTDMIN_ALLOW_LIMIT_UNIT(String STDMIN_ALLOW_LIMIT_UNIT) {
        this.STDMIN_ALLOW_LIMIT_UNIT = STDMIN_ALLOW_LIMIT_UNIT;
    }

    public String getMIN_LIMIT() {
        return MIN_LIMIT;
    }

    public void setMIN_LIMIT(String MIN_LIMIT) {
        this.MIN_LIMIT = MIN_LIMIT;
    }

    public String getMIN_LIMIT_UNIT() {
        return MIN_LIMIT_UNIT;
    }

    public void setMIN_LIMIT_UNIT(String MIN_LIMIT_UNIT) {
        this.MIN_LIMIT_UNIT = MIN_LIMIT_UNIT;
    }

    public String getMAX_LIMIT() {
        return MAX_LIMIT;
    }

    public void setMAX_LIMIT(String MAX_LIMIT) {
        this.MAX_LIMIT = MAX_LIMIT;
    }

    public String getMAX_LIMIT_UNIT() {
        return MAX_LIMIT_UNIT;
    }

    public void setMAX_LIMIT_UNIT(String MAX_LIMIT_UNIT) {
        this.MAX_LIMIT_UNIT = MAX_LIMIT_UNIT;
    }

    public String getSTDMAX_ALLOW_LIMIT() {
        return STDMAX_ALLOW_LIMIT;
    }

    public void setSTDMAX_ALLOW_LIMIT(String STDMAX_ALLOW_LIMIT) {
        this.STDMAX_ALLOW_LIMIT = STDMAX_ALLOW_LIMIT;
    }

    public String getSTDMAX_ALLOW_LIMIT_UNIT() {
        return STDMAX_ALLOW_LIMIT_UNIT;
    }

    public void setSTDMAX_ALLOW_LIMIT_UNIT(String STDMAX_ALLOW_LIMIT_UNIT) {
        this.STDMAX_ALLOW_LIMIT_UNIT = STDMAX_ALLOW_LIMIT_UNIT;
    }

    public List<LimsFinalReportGrid> getLimsFinalReportGrids() {
        return limsFinalReportGrids;
    }

    public void setLimsFinalReportGrids(List<LimsFinalReportGrid> limsFinalReportGrids) {
        this.limsFinalReportGrids = limsFinalReportGrids;
    }
}
