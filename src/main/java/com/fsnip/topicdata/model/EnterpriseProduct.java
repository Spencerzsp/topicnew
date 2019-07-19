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
public class EnterpriseProduct
{

    @XmlElement(name = "productName")
    private String productName;
    @XmlElement(name = "productBarcode")
    private String productBarcode;

    @XmlElement(name = "businessBrandName")
    private String businessBrandName;

    @XmlElement(name = "productFormat")
    private String productFormat;

    @XmlElement(name = "productExpiration")
    private String productExpiration;

    @XmlElement(name = "productInstanceProductionDate")
    private String productInstanceProductionDate;

    @XmlElement(name = "productionLicenseInfoQsNo")
    private String productionLicenseInfoQsNo;

    @XmlElement(name = "productCharacteristic")
    private String productCharacteristic;

    @XmlElement(name = "productCategoryName")
    private String productCategoryName;

    @XmlElement(name = "productRegularity")
    private String productRegularity;

    @XmlElement(name = "businessUnitName")
    private String businessUnitName;

    @XmlElement(name = "productionLicenseInfoProductionAddress")
    private String productionLicenseInfoProductionAddress;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarcode() {
        return productBarcode;
    }

    public void setBarcode(String barcode) {
        this.productBarcode = barcode;
    }

    public String getBusinessBrandName() {
        return businessBrandName;
    }

    public void setBusinessBrandName(String businessBrandName) {
        this.businessBrandName = businessBrandName;
    }

    public String getProductFormat() {
        return productFormat;
    }

    public void setProductFormat(String productFormat) {
        this.productFormat = productFormat;
    }

    public String getProductExpiration() {
        return productExpiration;
    }

    public void setProductExpiration(String productExpiration) {
        this.productExpiration = productExpiration;
    }

    public String getProductInstanceProductionDate() {
        return productInstanceProductionDate;
    }

    public void setProductInstanceProductionDate(String productInstanceProductionDate) {
        this.productInstanceProductionDate = productInstanceProductionDate;
    }

    public String getProductionLicenseInfoQsNo() {
        return productionLicenseInfoQsNo;
    }

    public void setProductionLicenseInfoQsNo(String productionLicenseInfoQsNo) {
        this.productionLicenseInfoQsNo = productionLicenseInfoQsNo;
    }

    public String getProductCharacteristic() {
        return productCharacteristic;
    }

    public void setProductCharacteristic(String productCharacteristic) {
        this.productCharacteristic = productCharacteristic;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductRegularity() {
        return productRegularity;
    }

    public void setProductRegularity(String productRegularity) {
        this.productRegularity = productRegularity;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public String getProductionLicenseInfoProductionAddress() {
        return productionLicenseInfoProductionAddress;
    }

    public void setProductionLicenseInfoProductionAddress(String productionLicenseInfoProductionAddress) {
        this.productionLicenseInfoProductionAddress = productionLicenseInfoProductionAddress;
    }
}
