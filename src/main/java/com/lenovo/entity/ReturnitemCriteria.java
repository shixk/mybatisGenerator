package com.lenovo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnitemCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ReturnitemCriteria() {
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

        public Criteria andReturnItemIdIsNull() {
            addCriterion("ReturnItemId is null");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdIsNotNull() {
            addCriterion("ReturnItemId is not null");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdEqualTo(Integer value) {
            addCriterion("ReturnItemId =", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdNotEqualTo(Integer value) {
            addCriterion("ReturnItemId <>", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdGreaterThan(Integer value) {
            addCriterion("ReturnItemId >", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReturnItemId >=", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdLessThan(Integer value) {
            addCriterion("ReturnItemId <", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("ReturnItemId <=", value, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdIn(List<Integer> values) {
            addCriterion("ReturnItemId in", values, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdNotIn(List<Integer> values) {
            addCriterion("ReturnItemId not in", values, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdBetween(Integer value1, Integer value2) {
            addCriterion("ReturnItemId between", value1, value2, "returnItemId");
            return (Criteria) this;
        }

        public Criteria andReturnItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ReturnItemId not between", value1, value2, "returnItemId");
            return (Criteria) this;
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

        public Criteria andQuanityIsNull() {
            addCriterion("Quanity is null");
            return (Criteria) this;
        }

        public Criteria andQuanityIsNotNull() {
            addCriterion("Quanity is not null");
            return (Criteria) this;
        }

        public Criteria andQuanityEqualTo(Integer value) {
            addCriterion("Quanity =", value, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityNotEqualTo(Integer value) {
            addCriterion("Quanity <>", value, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityGreaterThan(Integer value) {
            addCriterion("Quanity >", value, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quanity >=", value, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityLessThan(Integer value) {
            addCriterion("Quanity <", value, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityLessThanOrEqualTo(Integer value) {
            addCriterion("Quanity <=", value, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityIn(List<Integer> values) {
            addCriterion("Quanity in", values, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityNotIn(List<Integer> values) {
            addCriterion("Quanity not in", values, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityBetween(Integer value1, Integer value2) {
            addCriterion("Quanity between", value1, value2, "quanity");
            return (Criteria) this;
        }

        public Criteria andQuanityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quanity not between", value1, value2, "quanity");
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

        public Criteria andNutDiscountEqualTo(BigDecimal value) {
            addCriterion("NutDiscount =", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountNotEqualTo(BigDecimal value) {
            addCriterion("NutDiscount <>", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountGreaterThan(BigDecimal value) {
            addCriterion("NutDiscount >", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NutDiscount >=", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountLessThan(BigDecimal value) {
            addCriterion("NutDiscount <", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NutDiscount <=", value, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountIn(List<BigDecimal> values) {
            addCriterion("NutDiscount in", values, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountNotIn(List<BigDecimal> values) {
            addCriterion("NutDiscount not in", values, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NutDiscount between", value1, value2, "nutDiscount");
            return (Criteria) this;
        }

        public Criteria andNutDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NutDiscount not between", value1, value2, "nutDiscount");
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

        public Criteria andWareHouseIsNull() {
            addCriterion("WareHouse is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIsNotNull() {
            addCriterion("WareHouse is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseEqualTo(String value) {
            addCriterion("WareHouse =", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotEqualTo(String value) {
            addCriterion("WareHouse <>", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseGreaterThan(String value) {
            addCriterion("WareHouse >", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseGreaterThanOrEqualTo(String value) {
            addCriterion("WareHouse >=", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLessThan(String value) {
            addCriterion("WareHouse <", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLessThanOrEqualTo(String value) {
            addCriterion("WareHouse <=", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLike(String value) {
            addCriterion("WareHouse like", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotLike(String value) {
            addCriterion("WareHouse not like", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseIn(List<String> values) {
            addCriterion("WareHouse in", values, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotIn(List<String> values) {
            addCriterion("WareHouse not in", values, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseBetween(String value1, String value2) {
            addCriterion("WareHouse between", value1, value2, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotBetween(String value1, String value2) {
            addCriterion("WareHouse not between", value1, value2, "wareHouse");
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