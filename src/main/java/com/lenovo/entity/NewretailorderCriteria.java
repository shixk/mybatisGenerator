package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewretailorderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public NewretailorderCriteria() {
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("OrderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("OrderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("OrderStatus =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("OrderStatus <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("OrderStatus >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("OrderStatus >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("OrderStatus <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("OrderStatus <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("OrderStatus in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("OrderStatus not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("OrderStatus between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("OrderStatus not between", value1, value2, "orderStatus");
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

        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("UserMobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("UserMobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("UserMobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("UserMobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("UserMobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("UserMobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("UserMobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("UserMobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("UserMobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("UserMobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("UserMobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("UserMobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("UserMobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("UserMobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIsNull() {
            addCriterion("DeliverType is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIsNotNull() {
            addCriterion("DeliverType is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeEqualTo(Short value) {
            addCriterion("DeliverType =", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotEqualTo(Short value) {
            addCriterion("DeliverType <>", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeGreaterThan(Short value) {
            addCriterion("DeliverType >", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("DeliverType >=", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLessThan(Short value) {
            addCriterion("DeliverType <", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLessThanOrEqualTo(Short value) {
            addCriterion("DeliverType <=", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIn(List<Short> values) {
            addCriterion("DeliverType in", values, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotIn(List<Short> values) {
            addCriterion("DeliverType not in", values, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeBetween(Short value1, Short value2) {
            addCriterion("DeliverType between", value1, value2, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotBetween(Short value1, Short value2) {
            addCriterion("DeliverType not between", value1, value2, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyIsNull() {
            addCriterion("DeliverCompany is null");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyIsNotNull() {
            addCriterion("DeliverCompany is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyEqualTo(String value) {
            addCriterion("DeliverCompany =", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyNotEqualTo(String value) {
            addCriterion("DeliverCompany <>", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyGreaterThan(String value) {
            addCriterion("DeliverCompany >", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DeliverCompany >=", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyLessThan(String value) {
            addCriterion("DeliverCompany <", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyLessThanOrEqualTo(String value) {
            addCriterion("DeliverCompany <=", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyLike(String value) {
            addCriterion("DeliverCompany like", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyNotLike(String value) {
            addCriterion("DeliverCompany not like", value, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyIn(List<String> values) {
            addCriterion("DeliverCompany in", values, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyNotIn(List<String> values) {
            addCriterion("DeliverCompany not in", values, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyBetween(String value1, String value2) {
            addCriterion("DeliverCompany between", value1, value2, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverCompanyNotBetween(String value1, String value2) {
            addCriterion("DeliverCompany not between", value1, value2, "deliverCompany");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoIsNull() {
            addCriterion("DeliverExpressNo is null");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoIsNotNull() {
            addCriterion("DeliverExpressNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoEqualTo(String value) {
            addCriterion("DeliverExpressNo =", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoNotEqualTo(String value) {
            addCriterion("DeliverExpressNo <>", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoGreaterThan(String value) {
            addCriterion("DeliverExpressNo >", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("DeliverExpressNo >=", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoLessThan(String value) {
            addCriterion("DeliverExpressNo <", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoLessThanOrEqualTo(String value) {
            addCriterion("DeliverExpressNo <=", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoLike(String value) {
            addCriterion("DeliverExpressNo like", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoNotLike(String value) {
            addCriterion("DeliverExpressNo not like", value, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoIn(List<String> values) {
            addCriterion("DeliverExpressNo in", values, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoNotIn(List<String> values) {
            addCriterion("DeliverExpressNo not in", values, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoBetween(String value1, String value2) {
            addCriterion("DeliverExpressNo between", value1, value2, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverExpressNoNotBetween(String value1, String value2) {
            addCriterion("DeliverExpressNo not between", value1, value2, "deliverExpressNo");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeIsNull() {
            addCriterion("DeliverFee is null");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeIsNotNull() {
            addCriterion("DeliverFee is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeEqualTo(BigDecimal value) {
            addCriterion("DeliverFee =", value, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeNotEqualTo(BigDecimal value) {
            addCriterion("DeliverFee <>", value, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeGreaterThan(BigDecimal value) {
            addCriterion("DeliverFee >", value, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DeliverFee >=", value, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeLessThan(BigDecimal value) {
            addCriterion("DeliverFee <", value, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DeliverFee <=", value, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeIn(List<BigDecimal> values) {
            addCriterion("DeliverFee in", values, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeNotIn(List<BigDecimal> values) {
            addCriterion("DeliverFee not in", values, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeliverFee between", value1, value2, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andDeliverFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeliverFee not between", value1, value2, "deliverFee");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("TotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("TotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("TotalPrice =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("TotalPrice <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("TotalPrice >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPrice >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("TotalPrice <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPrice <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("TotalPrice in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("TotalPrice not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPrice between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPrice not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNull() {
            addCriterion("TotalDiscount is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNotNull() {
            addCriterion("TotalDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount =", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount <>", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThan(BigDecimal value) {
            addCriterion("TotalDiscount >", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount >=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThan(BigDecimal value) {
            addCriterion("TotalDiscount <", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalDiscount <=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIn(List<BigDecimal> values) {
            addCriterion("TotalDiscount in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotIn(List<BigDecimal> values) {
            addCriterion("TotalDiscount not in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalDiscount between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalDiscount not between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountIsNull() {
            addCriterion("TotalNutCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountIsNotNull() {
            addCriterion("TotalNutCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountEqualTo(BigDecimal value) {
            addCriterion("TotalNutCount =", value, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountNotEqualTo(BigDecimal value) {
            addCriterion("TotalNutCount <>", value, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountGreaterThan(BigDecimal value) {
            addCriterion("TotalNutCount >", value, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalNutCount >=", value, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountLessThan(BigDecimal value) {
            addCriterion("TotalNutCount <", value, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalNutCount <=", value, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountIn(List<BigDecimal> values) {
            addCriterion("TotalNutCount in", values, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountNotIn(List<BigDecimal> values) {
            addCriterion("TotalNutCount not in", values, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalNutCount between", value1, value2, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andTotalNutCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalNutCount not between", value1, value2, "totalNutCount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("RealAmount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("RealAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("RealAmount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("RealAmount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("RealAmount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RealAmount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("RealAmount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RealAmount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("RealAmount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("RealAmount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RealAmount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RealAmount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("OrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("OrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("OrderType =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("OrderType <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("OrderType >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderType >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("OrderType <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("OrderType <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("OrderType like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("OrderType not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("OrderType in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("OrderType not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("OrderType between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("OrderType not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIsNull() {
            addCriterion("SaleOrg is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIsNotNull() {
            addCriterion("SaleOrg is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrgEqualTo(String value) {
            addCriterion("SaleOrg =", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotEqualTo(String value) {
            addCriterion("SaleOrg <>", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgGreaterThan(String value) {
            addCriterion("SaleOrg >", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgGreaterThanOrEqualTo(String value) {
            addCriterion("SaleOrg >=", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLessThan(String value) {
            addCriterion("SaleOrg <", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLessThanOrEqualTo(String value) {
            addCriterion("SaleOrg <=", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgLike(String value) {
            addCriterion("SaleOrg like", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotLike(String value) {
            addCriterion("SaleOrg not like", value, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgIn(List<String> values) {
            addCriterion("SaleOrg in", values, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotIn(List<String> values) {
            addCriterion("SaleOrg not in", values, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgBetween(String value1, String value2) {
            addCriterion("SaleOrg between", value1, value2, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andSaleOrgNotBetween(String value1, String value2) {
            addCriterion("SaleOrg not between", value1, value2, "saleOrg");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNull() {
            addCriterion("PaymentChannel is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNotNull() {
            addCriterion("PaymentChannel is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelEqualTo(String value) {
            addCriterion("PaymentChannel =", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotEqualTo(String value) {
            addCriterion("PaymentChannel <>", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThan(String value) {
            addCriterion("PaymentChannel >", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("PaymentChannel >=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThan(String value) {
            addCriterion("PaymentChannel <", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThanOrEqualTo(String value) {
            addCriterion("PaymentChannel <=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLike(String value) {
            addCriterion("PaymentChannel like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotLike(String value) {
            addCriterion("PaymentChannel not like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIn(List<String> values) {
            addCriterion("PaymentChannel in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotIn(List<String> values) {
            addCriterion("PaymentChannel not in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelBetween(String value1, String value2) {
            addCriterion("PaymentChannel between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotBetween(String value1, String value2) {
            addCriterion("PaymentChannel not between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andSalerNameIsNull() {
            addCriterion("SalerName is null");
            return (Criteria) this;
        }

        public Criteria andSalerNameIsNotNull() {
            addCriterion("SalerName is not null");
            return (Criteria) this;
        }

        public Criteria andSalerNameEqualTo(String value) {
            addCriterion("SalerName =", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotEqualTo(String value) {
            addCriterion("SalerName <>", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameGreaterThan(String value) {
            addCriterion("SalerName >", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SalerName >=", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLessThan(String value) {
            addCriterion("SalerName <", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLessThanOrEqualTo(String value) {
            addCriterion("SalerName <=", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLike(String value) {
            addCriterion("SalerName like", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotLike(String value) {
            addCriterion("SalerName not like", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameIn(List<String> values) {
            addCriterion("SalerName in", values, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotIn(List<String> values) {
            addCriterion("SalerName not in", values, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameBetween(String value1, String value2) {
            addCriterion("SalerName between", value1, value2, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameNotBetween(String value1, String value2) {
            addCriterion("SalerName not between", value1, value2, "salerName");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("PaymentTime is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("PaymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("PaymentTime =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("PaymentTime <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("PaymentTime >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PaymentTime >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("PaymentTime <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("PaymentTime <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("PaymentTime in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("PaymentTime not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("PaymentTime between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("PaymentTime not between", value1, value2, "paymentTime");
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