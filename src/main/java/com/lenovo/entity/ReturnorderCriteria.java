package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnorderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ReturnorderCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReturnOrderIdIsNull() {
            addCriterion("ReturnOrderId is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIsNotNull() {
            addCriterion("ReturnOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdEqualTo(Integer value) {
            addCriterion("ReturnOrderId =", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotEqualTo(Integer value) {
            addCriterion("ReturnOrderId <>", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThan(Integer value) {
            addCriterion("ReturnOrderId >", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnOrderId >=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThan(Integer value) {
            addCriterion("ReturnOrderId <", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnOrderId <=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIn(List<Integer> values) {
            addCriterion("ReturnOrderId in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotIn(List<Integer> values) {
            addCriterion("ReturnOrderId not in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ReturnOrderId between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnOrderId not between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("OrderId =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("OrderId <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("OrderId >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderId >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("OrderId <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("OrderId <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("OrderId in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("OrderId not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("OrderId between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderId not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderSoIsNull() {
            addCriterion("OrderSo is null");
            return (Criteria) this;
        }

        public Criteria andOrderSoIsNotNull() {
            addCriterion("OrderSo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSoEqualTo(String value) {
            addCriterion("OrderSo =", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoNotEqualTo(String value) {
            addCriterion("OrderSo <>", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoGreaterThan(String value) {
            addCriterion("OrderSo >", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderSo >=", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoLessThan(String value) {
            addCriterion("OrderSo <", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoLessThanOrEqualTo(String value) {
            addCriterion("OrderSo <=", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoLike(String value) {
            addCriterion("OrderSo like", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoNotLike(String value) {
            addCriterion("OrderSo not like", value, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoIn(List<String> values) {
            addCriterion("OrderSo in", values, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoNotIn(List<String> values) {
            addCriterion("OrderSo not in", values, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoBetween(String value1, String value2) {
            addCriterion("OrderSo between", value1, value2, "orderSo");
            return (Criteria) this;
        }

        public Criteria andOrderSoNotBetween(String value1, String value2) {
            addCriterion("OrderSo not between", value1, value2, "orderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusIsNull() {
            addCriterion("ReturnOrderStatus is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusIsNotNull() {
            addCriterion("ReturnOrderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusEqualTo(Short value) {
            addCriterion("ReturnOrderStatus =", value, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusNotEqualTo(Short value) {
            addCriterion("ReturnOrderStatus <>", value, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusGreaterThan(Short value) {
            addCriterion("ReturnOrderStatus >", value, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ReturnOrderStatus >=", value, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusLessThan(Short value) {
            addCriterion("ReturnOrderStatus <", value, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("ReturnOrderStatus <=", value, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusIn(List<Short> values) {
            addCriterion("ReturnOrderStatus in", values, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusNotIn(List<Short> values) {
            addCriterion("ReturnOrderStatus not in", values, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusBetween(Short value1, Short value2) {
            addCriterion("ReturnOrderStatus between", value1, value2, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("ReturnOrderStatus not between", value1, value2, "returnOrderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoIsNull() {
            addCriterion("ReturnOrderSo is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoIsNotNull() {
            addCriterion("ReturnOrderSo is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoEqualTo(String value) {
            addCriterion("ReturnOrderSo =", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoNotEqualTo(String value) {
            addCriterion("ReturnOrderSo <>", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoGreaterThan(String value) {
            addCriterion("ReturnOrderSo >", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnOrderSo >=", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoLessThan(String value) {
            addCriterion("ReturnOrderSo <", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoLessThanOrEqualTo(String value) {
            addCriterion("ReturnOrderSo <=", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoLike(String value) {
            addCriterion("ReturnOrderSo like", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoNotLike(String value) {
            addCriterion("ReturnOrderSo not like", value, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoIn(List<String> values) {
            addCriterion("ReturnOrderSo in", values, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoNotIn(List<String> values) {
            addCriterion("ReturnOrderSo not in", values, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoBetween(String value1, String value2) {
            addCriterion("ReturnOrderSo between", value1, value2, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSoNotBetween(String value1, String value2) {
            addCriterion("ReturnOrderSo not between", value1, value2, "returnOrderSo");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNull() {
            addCriterion("ReturnReason is null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNotNull() {
            addCriterion("ReturnReason is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonEqualTo(String value) {
            addCriterion("ReturnReason =", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotEqualTo(String value) {
            addCriterion("ReturnReason <>", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThan(String value) {
            addCriterion("ReturnReason >", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("ReturnReason >=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThan(String value) {
            addCriterion("ReturnReason <", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("ReturnReason <=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLike(String value) {
            addCriterion("ReturnReason like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotLike(String value) {
            addCriterion("ReturnReason not like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIn(List<String> values) {
            addCriterion("ReturnReason in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotIn(List<String> values) {
            addCriterion("ReturnReason not in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonBetween(String value1, String value2) {
            addCriterion("ReturnReason between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotBetween(String value1, String value2) {
            addCriterion("ReturnReason not between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyIsNull() {
            addCriterion("WaybillCompany is null");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyIsNotNull() {
            addCriterion("WaybillCompany is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyEqualTo(String value) {
            addCriterion("WaybillCompany =", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyNotEqualTo(String value) {
            addCriterion("WaybillCompany <>", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyGreaterThan(String value) {
            addCriterion("WaybillCompany >", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("WaybillCompany >=", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyLessThan(String value) {
            addCriterion("WaybillCompany <", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyLessThanOrEqualTo(String value) {
            addCriterion("WaybillCompany <=", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyLike(String value) {
            addCriterion("WaybillCompany like", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyNotLike(String value) {
            addCriterion("WaybillCompany not like", value, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyIn(List<String> values) {
            addCriterion("WaybillCompany in", values, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyNotIn(List<String> values) {
            addCriterion("WaybillCompany not in", values, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyBetween(String value1, String value2) {
            addCriterion("WaybillCompany between", value1, value2, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillCompanyNotBetween(String value1, String value2) {
            addCriterion("WaybillCompany not between", value1, value2, "waybillCompany");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIsNull() {
            addCriterion("WaybillNo is null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIsNotNull() {
            addCriterion("WaybillNo is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillNoEqualTo(String value) {
            addCriterion("WaybillNo =", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotEqualTo(String value) {
            addCriterion("WaybillNo <>", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThan(String value) {
            addCriterion("WaybillNo >", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoGreaterThanOrEqualTo(String value) {
            addCriterion("WaybillNo >=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThan(String value) {
            addCriterion("WaybillNo <", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLessThanOrEqualTo(String value) {
            addCriterion("WaybillNo <=", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoLike(String value) {
            addCriterion("WaybillNo like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotLike(String value) {
            addCriterion("WaybillNo not like", value, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoIn(List<String> values) {
            addCriterion("WaybillNo in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotIn(List<String> values) {
            addCriterion("WaybillNo not in", values, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoBetween(String value1, String value2) {
            addCriterion("WaybillNo between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andWaybillNoNotBetween(String value1, String value2) {
            addCriterion("WaybillNo not between", value1, value2, "waybillNo");
            return (Criteria) this;
        }

        public Criteria andRamountIsNull() {
            addCriterion("Ramount is null");
            return (Criteria) this;
        }

        public Criteria andRamountIsNotNull() {
            addCriterion("Ramount is not null");
            return (Criteria) this;
        }

        public Criteria andRamountEqualTo(BigDecimal value) {
            addCriterion("Ramount =", value, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountNotEqualTo(BigDecimal value) {
            addCriterion("Ramount <>", value, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountGreaterThan(BigDecimal value) {
            addCriterion("Ramount >", value, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ramount >=", value, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountLessThan(BigDecimal value) {
            addCriterion("Ramount <", value, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ramount <=", value, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountIn(List<BigDecimal> values) {
            addCriterion("Ramount in", values, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountNotIn(List<BigDecimal> values) {
            addCriterion("Ramount not in", values, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ramount between", value1, value2, "ramount");
            return (Criteria) this;
        }

        public Criteria andRamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ramount not between", value1, value2, "ramount");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIsNull() {
            addCriterion("FlowStatus is null");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIsNotNull() {
            addCriterion("FlowStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStatusEqualTo(Short value) {
            addCriterion("FlowStatus =", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotEqualTo(Short value) {
            addCriterion("FlowStatus <>", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusGreaterThan(Short value) {
            addCriterion("FlowStatus >", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("FlowStatus >=", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLessThan(Short value) {
            addCriterion("FlowStatus <", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLessThanOrEqualTo(Short value) {
            addCriterion("FlowStatus <=", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIn(List<Short> values) {
            addCriterion("FlowStatus in", values, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotIn(List<Short> values) {
            addCriterion("FlowStatus not in", values, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusBetween(Short value1, Short value2) {
            addCriterion("FlowStatus between", value1, value2, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotBetween(Short value1, Short value2) {
            addCriterion("FlowStatus not between", value1, value2, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCustomCriteria(String value) {
            addCriterion( "("+ value +")" );
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}