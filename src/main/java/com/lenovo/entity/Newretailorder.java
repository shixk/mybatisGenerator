package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Newretailorder {
    private Integer orderId;

    private String orderSo;

    private Short orderStatus;

    private Short flowStatus;

    private String userName;

    private String userMobile;

    private Short deliverType;

    private String deliverCompany;

    private String deliverExpressNo;

    private BigDecimal deliverFee;

    private BigDecimal totalPrice;

    private BigDecimal totalDiscount;

    private BigDecimal totalNutCount;

    private BigDecimal realAmount;

    private String orderType;

    private String saleOrg;

    private String paymentChannel;

    private String salerName;

    private Date createTime;

    private Date updateTime;

    private Date paymentTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSo() {
        return orderSo;
    }

    public void setOrderSo(String orderSo) {
        this.orderSo = orderSo == null ? null : orderSo.trim();
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Short getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Short flowStatus) {
        this.flowStatus = flowStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Short getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(Short deliverType) {
        this.deliverType = deliverType;
    }

    public String getDeliverCompany() {
        return deliverCompany;
    }

    public void setDeliverCompany(String deliverCompany) {
        this.deliverCompany = deliverCompany == null ? null : deliverCompany.trim();
    }

    public String getDeliverExpressNo() {
        return deliverExpressNo;
    }

    public void setDeliverExpressNo(String deliverExpressNo) {
        this.deliverExpressNo = deliverExpressNo == null ? null : deliverExpressNo.trim();
    }

    public BigDecimal getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(BigDecimal deliverFee) {
        this.deliverFee = deliverFee;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getTotalNutCount() {
        return totalNutCount;
    }

    public void setTotalNutCount(BigDecimal totalNutCount) {
        this.totalNutCount = totalNutCount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getSaleOrg() {
        return saleOrg;
    }

    public void setSaleOrg(String saleOrg) {
        this.saleOrg = saleOrg == null ? null : saleOrg.trim();
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel == null ? null : paymentChannel.trim();
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName == null ? null : salerName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}