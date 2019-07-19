package com.fsnip.topicdata.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fsnip.topicdata.utils.SensitiveInfo;
import com.fsnip.topicdata.utils.SensitiveType;

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
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OperatorsInfo
{

    @XmlElement(name = "JYZMC")
    private String JYZMC;

    @XmlElement(name = "ZS")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String ZS;

    @XmlElement(name = "JYCS")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String JYCS;

    @XmlElement(name = "JJXZ")
    private String JJXZ;

    @XmlElement(name = "CKDZ")
    private String CKDZ;

    /*@XmlElement(name = "SHXYDMZJHM")
    @SensitiveInfo(SensitiveType.ID_CARD)
    private String SHXYDMZJHM;*/
    //取消注解即可无脱敏
    @XmlElement(name = "SHXYDMZJHM")
    private String SHXYDMZJHM;

    @XmlElement(name = "ZTYT")
    private String ZTYT;

    @XmlElement(name = "JYXM")
    private String JYXM;

    @XmlElement(name = "YXQZ")
    private String YXQZ;

    @XmlElement(name = "QFR")
    private String QFR;

    @XmlElement(name = "FZRQ")
    private String FZRQ;

    @XmlElement(name = "FZJG")
    private String FZJG;

    @XmlElement(name = "XKZBH")
    private String XKZBH;

    @XmlElement(name = "RCJDGLJG")
    private String RCJDGLJG;

    @XmlElement(name = "RCJDGLRY")
    private String RCJDGLRY;

    @XmlElement(name = "YJBM")
    private String YJBM;

    @XmlElement(name = "ZGRS")
    private String ZGRS;

    @XmlElement(name = "XM")
    private String XM;

    @XmlElement(name = "XB")
    private String XB;

    @XmlElement(name = "ZJLX")
    private String ZJLX;

    @XmlElement(name = "ZJH")
    // @SensitiveInfo(SensitiveType.ID_CARD)
    private String ZJH;

    @XmlElement(name = "MZ")
    private String MZ;

    @XmlElement(name = "HJDJZZ")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String HJDJZZ;

    @XmlElement(name = "ZW")
    private String ZW;

    @XmlElement(name = "GDDH")
    private String GDDH;

    @XmlElement(name = "YDDH")
    //@SensitiveInfo(SensitiveType.MOBILE_PHONE)
    private String YDDH;




    @XmlElement(name = "aXM")
    private String aXM;

    @XmlElement(name = "aXB")
    private String aXB;

    @XmlElement(name = "aZJLX")
    private String aZJLX;

    @XmlElement(name = "aZJH")
    // @SensitiveInfo(SensitiveType.ID_CARD)
    private String aZJH;

    @XmlElement(name = "aMZ")
    private String aMZ;

    @XmlElement(name = "aHJDJZZ")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String aHJDJZZ;

    @XmlElement(name = "aZW")
    private String aZW;
    @XmlElement(name = "aRMDW")
    private String aRMDW;

    @XmlElement(name = "aGDDH")
    private String aGDDH;

    @XmlElement(name = "aYDDH")
    //@SensitiveInfo(SensitiveType.MOBILE_PHONE)
    private String aYDDH;




    @XmlElement(name = "cXM")
    private String cXM;

    @XmlElement(name = "cXB")
    private String cXB;

    @XmlElement(name = "cZJLX")
    private String cZJLX;

    @XmlElement(name = "cZJH")
    // @SensitiveInfo(SensitiveType.ID_CARD)
    private String cZJH;

    @XmlElement(name = "cMZ")
    private String cMZ;

    @XmlElement(name = "cHJDJZZ")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String cHJDJZZ;

    @XmlElement(name = "cZW")
    private String cZW;

    @XmlElement(name = "cGDDH")
    private String cGDDH;

    @XmlElement(name = "cRMDW")
    private String cRMDW;

    @XmlElement(name = "cYDDH")
    //@SensitiveInfo(SensitiveType.MOBILE_PHONE)
    private String cYDDH;

    @XmlElement(name = "cGZ")
    private String cGZ;

    @XmlElement(name = "cWZDW")
    private String cWZDW;

    @XmlElement(name = "cJKZBH")
    private String cJKZBH;

    public String getaRMDW() {
        return aRMDW;
    }

    public void setaRMDW(String aRMDW) {
        this.aRMDW = aRMDW;
    }

    public String getcRMDW() {
        return cRMDW;
    }

    public void setcRMDW(String cRMDW) {
        this.cRMDW = cRMDW;
    }

    public String getcGZ() {
        return cGZ;
    }

    public void setcGZ(String cGZ) {
        this.cGZ = cGZ;
    }

    public String getcWZDW() {
        return cWZDW;
    }

    public void setcWZDW(String cWZDW) {
        this.cWZDW = cWZDW;
    }

    public String getcJKZBH() {
        return cJKZBH;
    }

    public void setcJKZBH(String cJKZBH) {
        this.cJKZBH = cJKZBH;
    }

    public String getJYZMC() {
        return JYZMC;
    }

    public void setJYZMC(String JYZMC) {
        this.JYZMC = JYZMC;
    }

    public String getZS() {
        return ZS;
    }

    public void setZS(String ZS) {
        this.ZS = ZS;
    }

    public String getJYCS() {
        return JYCS;
    }

    public void setJYCS(String JYCS) {
        this.JYCS = JYCS;
    }

    public String getJJXZ() {
        return JJXZ;
    }

    public void setJJXZ(String JJXZ) {
        this.JJXZ = JJXZ;
    }

    public String getCKDZ() {
        return CKDZ;
    }

    public void setCKDZ(String CKDZ) {
        this.CKDZ = CKDZ;
    }

    public String getSHXYDMZJHM() {
        return SHXYDMZJHM;
    }

    public void setSHXYDMZJHM(String SHXYDMZJHM) {
        this.SHXYDMZJHM = SHXYDMZJHM;
    }

    public String getZTYT() {
        return ZTYT;
    }

    public void setZTYT(String ZTYT) {
        this.ZTYT = ZTYT;
    }

    public String getJYXM() {
        return JYXM;
    }

    public void setJYXM(String JYXM) {
        this.JYXM = JYXM;
    }

    public String getYXQZ() {
        return YXQZ;
    }

    public void setYXQZ(String YXQZ) {
        this.YXQZ = YXQZ;
    }

    public String getQFR() {
        return QFR;
    }

    public void setQFR(String QFR) {
        this.QFR = QFR;
    }

    public String getFZRQ() {
        return FZRQ;
    }

    public void setFZRQ(String FZRQ) {
        this.FZRQ = FZRQ;
    }

    public String getFZJG() {
        return FZJG;
    }

    public void setFZJG(String FZJG) {
        this.FZJG = FZJG;
    }

    public String getXKZBH() {
        return XKZBH;
    }

    public void setXKZBH(String XKZBH) {
        this.XKZBH = XKZBH;
    }

    public String getRCJDGLJG() {
        return RCJDGLJG;
    }

    public void setRCJDGLJG(String RCJDGLJG) {
        this.RCJDGLJG = RCJDGLJG;
    }

    public String getRCJDGLRY() {
        return RCJDGLRY;
    }

    public void setRCJDGLRY(String RCJDGLRY) {
        this.RCJDGLRY = RCJDGLRY;
    }

    public String getYJBM() {
        return YJBM;
    }

    public void setYJBM(String YJBM) {
        this.YJBM = YJBM;
    }

    public String getZGRS() {
        return ZGRS;
    }

    public void setZGRS(String ZGRS) {
        this.ZGRS = ZGRS;
    }

    public String getXM() {
        return XM;
    }

    public void setXM(String XM) {
        this.XM = XM;
    }

    public String getXB() {
        return XB;
    }

    public void setXB(String XB) {
        this.XB = XB;
    }

    public String getZJLX() {
        return ZJLX;
    }

    public void setZJLX(String ZJLX) {
        this.ZJLX = ZJLX;
    }

    public String getZJH() {
        return ZJH;
    }

    public void setZJH(String ZJH) {
        this.ZJH = ZJH;
    }

    public String getMZ() {
        return MZ;
    }

    public void setMZ(String MZ) {
        this.MZ = MZ;
    }

    public String getHJDJZZ() {
        return HJDJZZ;
    }

    public void setHJDJZZ(String HJDJZZ) {
        this.HJDJZZ = HJDJZZ;
    }

    public String getZW() {
        return ZW;
    }

    public void setZW(String ZW) {
        this.ZW = ZW;
    }

    public String getGDDH() {
        return GDDH;
    }

    public void setGDDH(String GDDH) {
        this.GDDH = GDDH;
    }

    public String getYDDH() {
        return YDDH;
    }

    public void setYDDH(String YDDH) {
        this.YDDH = YDDH;
    }

    public String getaXM() {
        return aXM;
    }

    public void setaXM(String aXM) {
        this.aXM = aXM;
    }

    public String getaXB() {
        return aXB;
    }

    public void setaXB(String aXB) {
        this.aXB = aXB;
    }

    public String getaZJLX() {
        return aZJLX;
    }

    public void setaZJLX(String aZJLX) {
        this.aZJLX = aZJLX;
    }

    public String getaZJH() {
        return aZJH;
    }

    public void setaZJH(String aZJH) {
        this.aZJH = aZJH;
    }

    public String getaMZ() {
        return aMZ;
    }

    public void setaMZ(String aMZ) {
        this.aMZ = aMZ;
    }

    public String getaHJDJZZ() {
        return aHJDJZZ;
    }

    public void setaHJDJZZ(String aHJDJZZ) {
        this.aHJDJZZ = aHJDJZZ;
    }

    public String getaZW() {
        return aZW;
    }

    public void setaZW(String aZW) {
        this.aZW = aZW;
    }

    public String getaGDDH() {
        return aGDDH;
    }

    public void setaGDDH(String aGDDH) {
        this.aGDDH = aGDDH;
    }

    public String getaYDDH() {
        return aYDDH;
    }

    public void setaYDDH(String aYDDH) {
        this.aYDDH = aYDDH;
    }

    public String getcXM() {
        return cXM;
    }

    public void setcXM(String cXM) {
        this.cXM = cXM;
    }

    public String getcXB() {
        return cXB;
    }

    public void setcXB(String cXB) {
        this.cXB = cXB;
    }

    public String getcZJLX() {
        return cZJLX;
    }

    public void setcZJLX(String cZJLX) {
        this.cZJLX = cZJLX;
    }

    public String getcZJH() {
        return cZJH;
    }

    public void setcZJH(String cZJH) {
        this.cZJH = cZJH;
    }

    public String getcMZ() {
        return cMZ;
    }

    public void setcMZ(String cMZ) {
        this.cMZ = cMZ;
    }

    public String getcHJDJZZ() {
        return cHJDJZZ;
    }

    public void setcHJDJZZ(String cHJDJZZ) {
        this.cHJDJZZ = cHJDJZZ;
    }

    public String getcZW() {
        return cZW;
    }

    public void setcZW(String cZW) {
        this.cZW = cZW;
    }

    public String getcGDDH() {
        return cGDDH;
    }

    public void setcGDDH(String cGDDH) {
        this.cGDDH = cGDDH;
    }

    public String getcYDDH() {
        return cYDDH;
    }

    public void setcYDDH(String cYDDH) {
        this.cYDDH = cYDDH;
    }
}
