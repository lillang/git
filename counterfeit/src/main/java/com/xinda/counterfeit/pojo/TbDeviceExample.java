package com.xinda.counterfeit.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDeviceExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Long value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Long value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Long value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Long value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Long value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Long> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Long> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Long value1, Long value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Long value1, Long value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountIsNull() {
            addCriterion("device_account is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountIsNotNull() {
            addCriterion("device_account is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountEqualTo(String value) {
            addCriterion("device_account =", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountNotEqualTo(String value) {
            addCriterion("device_account <>", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountGreaterThan(String value) {
            addCriterion("device_account >", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountGreaterThanOrEqualTo(String value) {
            addCriterion("device_account >=", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountLessThan(String value) {
            addCriterion("device_account <", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountLessThanOrEqualTo(String value) {
            addCriterion("device_account <=", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountLike(String value) {
            addCriterion("device_account like", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountNotLike(String value) {
            addCriterion("device_account not like", value, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountIn(List<String> values) {
            addCriterion("device_account in", values, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountNotIn(List<String> values) {
            addCriterion("device_account not in", values, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountBetween(String value1, String value2) {
            addCriterion("device_account between", value1, value2, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceAccountNotBetween(String value1, String value2) {
            addCriterion("device_account not between", value1, value2, "deviceAccount");
            return (Criteria) this;
        }

        public Criteria andDeviceBankIsNull() {
            addCriterion("device_bank is null");
            return (Criteria) this;
        }

        public Criteria andDeviceBankIsNotNull() {
            addCriterion("device_bank is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceBankEqualTo(String value) {
            addCriterion("device_bank =", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankNotEqualTo(String value) {
            addCriterion("device_bank <>", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankGreaterThan(String value) {
            addCriterion("device_bank >", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankGreaterThanOrEqualTo(String value) {
            addCriterion("device_bank >=", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankLessThan(String value) {
            addCriterion("device_bank <", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankLessThanOrEqualTo(String value) {
            addCriterion("device_bank <=", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankLike(String value) {
            addCriterion("device_bank like", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankNotLike(String value) {
            addCriterion("device_bank not like", value, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankIn(List<String> values) {
            addCriterion("device_bank in", values, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankNotIn(List<String> values) {
            addCriterion("device_bank not in", values, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankBetween(String value1, String value2) {
            addCriterion("device_bank between", value1, value2, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceBankNotBetween(String value1, String value2) {
            addCriterion("device_bank not between", value1, value2, "deviceBank");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIsNull() {
            addCriterion("device_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIsNotNull() {
            addCriterion("device_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressEqualTo(String value) {
            addCriterion("device_address =", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotEqualTo(String value) {
            addCriterion("device_address <>", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressGreaterThan(String value) {
            addCriterion("device_address >", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_address >=", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLessThan(String value) {
            addCriterion("device_address <", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLessThanOrEqualTo(String value) {
            addCriterion("device_address <=", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLike(String value) {
            addCriterion("device_address like", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotLike(String value) {
            addCriterion("device_address not like", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIn(List<String> values) {
            addCriterion("device_address in", values, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotIn(List<String> values) {
            addCriterion("device_address not in", values, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressBetween(String value1, String value2) {
            addCriterion("device_address between", value1, value2, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotBetween(String value1, String value2) {
            addCriterion("device_address not between", value1, value2, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedIsNull() {
            addCriterion("device_detailed is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedIsNotNull() {
            addCriterion("device_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedEqualTo(String value) {
            addCriterion("device_detailed =", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedNotEqualTo(String value) {
            addCriterion("device_detailed <>", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedGreaterThan(String value) {
            addCriterion("device_detailed >", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("device_detailed >=", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedLessThan(String value) {
            addCriterion("device_detailed <", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedLessThanOrEqualTo(String value) {
            addCriterion("device_detailed <=", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedLike(String value) {
            addCriterion("device_detailed like", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedNotLike(String value) {
            addCriterion("device_detailed not like", value, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedIn(List<String> values) {
            addCriterion("device_detailed in", values, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedNotIn(List<String> values) {
            addCriterion("device_detailed not in", values, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedBetween(String value1, String value2) {
            addCriterion("device_detailed between", value1, value2, "deviceDetailed");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailedNotBetween(String value1, String value2) {
            addCriterion("device_detailed not between", value1, value2, "deviceDetailed");
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