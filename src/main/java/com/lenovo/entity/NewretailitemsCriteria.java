package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewretailitemsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public NewretailitemsCriteria() {
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

        public Criteria andOrderItemIdIsNull() {
            addCriterion("OrderItemId is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("OrderItemId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("OrderItemId =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("OrderItemId <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("OrderItemId >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderItemId >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("OrderItemId <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("OrderItemId <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("OrderItemId in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("OrderItemId not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("OrderItemId between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderItemId not between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("ProductCode is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("ProductCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("ProductCode =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("ProductCode <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("ProductCode >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductCode >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("ProductCode <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("ProductCode <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("ProductCode like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("ProductCode not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("ProductCode in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("ProductCode not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("ProductCode between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("ProductCode not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("ProductName =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("ProductName <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("ProductName like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("ProductName not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("ProductName in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("Sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("Sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("Sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("Sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("Sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("Sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("Sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("Sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("Sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("Sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("Sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("Sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("Sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("Sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("ShopId is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("ShopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("ShopId =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("ShopId <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("ShopId >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("ShopId >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("ShopId <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("ShopId <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("ShopId like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("ShopId not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("ShopId in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("ShopId not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("ShopId between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("ShopId not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("Warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("Warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("Warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("Warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("Warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("Warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("Warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("Warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("Warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("Warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("Warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("Warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("Warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("Warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountIsNull() {
            addCriterion("NutDiscount is null");
            return (Criteria) this;
        }

        public Criteria andNutDiscountIsNotNull() {
            addCriterion("NutDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andNutDiscountEqualTo(Long value) {
            addCriterion("NutDiscount =", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountNotEqualTo(Long value) {
            addCriterion("NutDiscount <>", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountGreaterThan(Long value) {
            addCriterion("NutDiscount >", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountGreaterThanOrEqualTo(Long value) {
            addCriterion("NutDiscount >=", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountLessThan(Long value) {
            addCriterion("NutDiscount <", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountLessThanOrEqualTo(Long value) {
            addCriterion("NutDiscount <=", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountIn(List<Long> values) {
            addCriterion("NutDiscount in", values, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountNotIn(List<Long> values) {
            addCriterion("NutDiscount not in", values, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountBetween(Long value1, Long value2) {
            addCriterion("NutDiscount between", value1, value2, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountNotBetween(Long value1, Long value2) {
            addCriterion("NutDiscount not between", value1, value2, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIsNull() {
            addCriterion("ReturnQuantity is null");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIsNotNull() {
            addCriterion("ReturnQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityEqualTo(Integer value) {
            addCriterion("ReturnQuantity =", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotEqualTo(Integer value) {
            addCriterion("ReturnQuantity <>", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityGreaterThan(Integer value) {
            addCriterion("ReturnQuantity >", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnQuantity >=", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityLessThan(Integer value) {
            addCriterion("ReturnQuantity <", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnQuantity <=", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIn(List<Integer> values) {
            addCriterion("ReturnQuantity in", values, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotIn(List<Integer> values) {
            addCriterion("ReturnQuantity not in", values, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityBetween(Integer value1, Integer value2) {
            addCriterion("ReturnQuantity between", value1, value2, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnQuantity not between", value1, value2, "returnQuantity");
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

        public Criteria andProductGroupIsNull() {
            addCriterion("ProductGroup is null");
            return (Criteria) this;
        }

        public Criteria andProductGroupIsNotNull() {
            addCriterion("ProductGroup is not null");
            return (Criteria) this;
        }

        public Criteria andProductGroupEqualTo(String value) {
            addCriterion("ProductGroup =", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupNotEqualTo(String value) {
            addCriterion("ProductGroup <>", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupGreaterThan(String value) {
            addCriterion("ProductGroup >", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupGreaterThanOrEqualTo(String value) {
            addCriterion("ProductGroup >=", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupLessThan(String value) {
            addCriterion("ProductGroup <", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupLessThanOrEqualTo(String value) {
            addCriterion("ProductGroup <=", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupLike(String value) {
            addCriterion("ProductGroup like", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupNotLike(String value) {
            addCriterion("ProductGroup not like", value, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupIn(List<String> values) {
            addCriterion("ProductGroup in", values, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupNotIn(List<String> values) {
            addCriterion("ProductGroup not in", values, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupBetween(String value1, String value2) {
            addCriterion("ProductGroup between", value1, value2, "productGroup");
            return (Criteria) this;
        }

        public Criteria andProductGroupNotBetween(String value1, String value2) {
            addCriterion("ProductGroup not between", value1, value2, "productGroup");
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