package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Returnorder {
    private Integer returnOrderId;

    private Integer orderId;

    private String orderSo;

    private Short returnOrderStatus;

    private String returnOrderSo;

    private String returnReason;

    private String waybillCompany;

    private String waybillNo;

    private BigDecimal ramount;

    private Short flowStatus;

    private Date createTime;

    private Date modifyTime;

    public Integer getReturnOrderId() {
        return returnOrderId;
    }

    public void setReturnOrderId(Integer returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

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

    public Short getReturnOrderStatus() {
        return returnOrderStatus;
    }

    public void setReturnOrderStatus(Short returnOrderStatus) {
        this.returnOrderStatus = returnOrderStatus;
    }

    public String getReturnOrderSo() {
        return returnOrderSo;
    }

    public void setReturnOrderSo(String returnOrderSo) {
        this.returnOrderSo = returnOrderSo == null ? null : returnOrderSo.trim();
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public String getWaybillCompany() {
        return waybillCompany;
    }

    public void setWaybillCompany(String waybillCompany) {
        this.waybillCompany = waybillCompany == null ? null : waybillCompany.trim();
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public BigDecimal getRamount() {
        return ramount;
    }

    public void setRamount(BigDecimal ramount) {
        this.ramount = ramount;
    }

    public Short getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Short flowStatus) {
        this.flowStatus = flowStatus;
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