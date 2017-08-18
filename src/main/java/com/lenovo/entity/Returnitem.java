package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Returnitem {
    private Integer returnItemId;

    private Integer returnOrderId;

    private String productCode;

    private String productName;

    private String sn;

    private Integer quanity;

    private BigDecimal discount;

    private BigDecimal nutDiscount;

    private BigDecimal price;

    private String wareHouse;

    private String shopId;

    private String productGroup;

    private Date createTime;

    private Date modifyTime;

    public Integer getReturnItemId() {
        return returnItemId;
    }

    public void setReturnItemId(Integer returnItemId) {
        this.returnItemId = returnItemId;
    }

    public Integer getReturnOrderId() {
        return returnOrderId;
    }

    public void setReturnOrderId(Integer returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Integer getQuanity() {
        return quanity;
    }

    public void setQuanity(Integer quanity) {
        this.quanity = quanity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getNutDiscount() {
        return nutDiscount;
    }

    public void setNutDiscount(BigDecimal nutDiscount) {
        this.nutDiscount = nutDiscount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse == null ? null : wareHouse.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup == null ? null : productGroup.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}