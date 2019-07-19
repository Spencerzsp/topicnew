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
public class ProductionLicense {
    @XmlElement(name = "SCZMC")
    private String SCZMC;
    @XmlElement(name = "SCXKZBH")
    private String SCXKZBH;
    @XmlElement(name = "SHXYDM")
    //@SensitiveInfo(SensitiveType.ID_CARD)
    private String SHXYDM;
    @XmlElement(name = "FDDBR")
    private String FDDBR;
    @XmlElement(name = "RCJDGLJG")
    private String RCJDGLJG;
    @XmlElement(name = "ZS")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String ZS;
    @XmlElement(name = "RCJDGLRY")
    private String RCJDGLRY;
    @XmlElement(name = "FZJG")
    private String FZJG;
    @XmlElement(name = "SCDZ")
    //@SensitiveInfo(SensitiveType.ADDRESS)
    private String SCDZ;
    @XmlElement(name = "SPFL")
    private String SPFL;
    @XmlElement(name = "QFR")
    private String QFR;
    @XmlElement(name = "FZRQ")
    private String FZRQ;
    @XmlElement(name = "YXQZ")
    private String YXQZ;
    @XmlElement(name = "WSCKDZ")
    private String WSCKDZ;
    @XmlElement(name = "SPTJJLB")
    private String SPTJJLB;
    @XmlElement(name = "SCXKZXX_ID")
    private String SCXKZXX_ID;
    @XmlElement(name = "LBBH")
    private String LBBH;
    @XmlElement(name = "LBMC")
    private String LBMC;
    @XmlElement(name = "PZMX")
    private String PZMX;
    @XmlElement(name = "BZ")
    private String BZ;

    public String getSCXKZXX_ID() {
        return SCXKZXX_ID;
    }

    public void setSCXKZXX_ID(String SCXKZXX_ID) {
        this.SCXKZXX_ID = SCXKZXX_ID;
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ;
    }

    public String getSCZMC() {
        return SCZMC;
    }

    public void setSCZMC(String SCZMC) {
        this.SCZMC = SCZMC;
    }

    public String getSCXKZBH() {
        return SCXKZBH;
    }

    public void setSCXKZBH(String SCXKZBH) {
        this.SCXKZBH = SCXKZBH;
    }

    public String getSHXYDM() {
        return SHXYDM;
    }

    public void setSHXYDM(String SHXYDM) {
        this.SHXYDM = SHXYDM;
    }

    public String getRCJDGLJG() {
        return RCJDGLJG;
    }

    public void setRCJDGLJG(String RCJDGLJG) {
        this.RCJDGLJG = RCJDGLJG;
    }

    public String getFDDBR() {
        return FDDBR;
    }

    public void setFDDBR(String FDDBR) {
        this.FDDBR = FDDBR;
    }

    public String getZS() {
        return ZS;
    }

    public void setZS(String ZS) {
        this.ZS = ZS;
    }

    public String getRCJDGLRY() {
        return RCJDGLRY;
    }

    public void setRCJDGLRY(String RCJDGLRY) {
        this.RCJDGLRY = RCJDGLRY;
    }

    public String getSCDZ() {
        return SCDZ;
    }

    public void setSCDZ(String SCDZ) {
        this.SCDZ = SCDZ;
    }

    public String getFZJG() {
        return FZJG;
    }

    public void setFZJG(String FZJG) {
        this.FZJG = FZJG;
    }

    public String getSPFL() {
        return SPFL;
    }

    public void setSPFL(String SPFL) {
        this.SPFL = SPFL;
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

    public String getYXQZ() {
        return YXQZ;
    }

    public void setYXQZ(String YXQZ) {
        this.YXQZ = YXQZ;
    }

    public String getWSCKDZ() {
        return WSCKDZ;
    }

    public void setWSCKDZ(String WSCKDZ) {
        this.WSCKDZ = WSCKDZ;
    }

    public String getSPTJJLB() {
        return SPTJJLB;
    }

    public void setSPTJJLB(String SPTJJLB) {
        this.SPTJJLB = SPTJJLB;
    }

    public String getLBBH() {
        return LBBH;
    }

    public void setLBBH(String LBBH) {
        this.LBBH = LBBH;
    }

    public String getLBMC() {
        return LBMC;
    }

    public void setLBMC(String LBMC) {
        this.LBMC = LBMC;
    }

    public String getPZMX() {
        return PZMX;
    }

    public void setPZMX(String PZMX) {
        this.PZMX = PZMX;
    }

    @Override
    public String toString() {
        return "ProductionLicense{" +
                "SCZMC='" + SCZMC + '\'' +
                ", SCXKZBH='" + SCXKZBH + '\'' +
                ", SHXYDM='" + SHXYDM + '\'' +
                ", FDDBR='" + FDDBR + '\'' +
                ", RCJDGLJG='" + RCJDGLJG + '\'' +
                ", ZS='" + ZS + '\'' +
                ", RCJDGLRY='" + RCJDGLRY + '\'' +
                ", FZJG='" + FZJG + '\'' +
                ", SCDZ='" + SCDZ + '\'' +
                ", SPFL='" + SPFL + '\'' +
                ", QFR='" + QFR + '\'' +
                ", FZRQ='" + FZRQ + '\'' +
                ", YXQZ='" + YXQZ + '\'' +
                ", WSCKDZ='" + WSCKDZ + '\'' +
                ", SPTJJLB='" + SPTJJLB + '\'' +
                ", ID='" + SCXKZXX_ID + '\'' +
                ", LBBH='" + LBBH + '\'' +
                ", LBMC='" + LBMC + '\'' +
                ", PZMX='" + PZMX + '\'' +
                ", BZ='" + BZ + '\'' +
                '}';
    }
}
