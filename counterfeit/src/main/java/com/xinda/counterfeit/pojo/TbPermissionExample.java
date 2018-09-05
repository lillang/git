package com.xinda.counterfeit.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Long value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Long value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Long value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Long value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Long> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Long> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Long value1, Long value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidIsNull() {
            addCriterion("permission_roleid is null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidIsNotNull() {
            addCriterion("permission_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidEqualTo(Long value) {
            addCriterion("permission_roleid =", value, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidNotEqualTo(Long value) {
            addCriterion("permission_roleid <>", value, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidGreaterThan(Long value) {
            addCriterion("permission_roleid >", value, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_roleid >=", value, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidLessThan(Long value) {
            addCriterion("permission_roleid <", value, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidLessThanOrEqualTo(Long value) {
            addCriterion("permission_roleid <=", value, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidIn(List<Long> values) {
            addCriterion("permission_roleid in", values, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidNotIn(List<Long> values) {
            addCriterion("permission_roleid not in", values, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidBetween(Long value1, Long value2) {
            addCriterion("permission_roleid between", value1, value2, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleidNotBetween(Long value1, Long value2) {
            addCriterion("permission_roleid not between", value1, value2, "permissionRoleid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidIsNull() {
            addCriterion("permission_rightid is null");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidIsNotNull() {
            addCriterion("permission_rightid is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidEqualTo(Long value) {
            addCriterion("permission_rightid =", value, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidNotEqualTo(Long value) {
            addCriterion("permission_rightid <>", value, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidGreaterThan(Long value) {
            addCriterion("permission_rightid >", value, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_rightid >=", value, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidLessThan(Long value) {
            addCriterion("permission_rightid <", value, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidLessThanOrEqualTo(Long value) {
            addCriterion("permission_rightid <=", value, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidIn(List<Long> values) {
            addCriterion("permission_rightid in", values, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidNotIn(List<Long> values) {
            addCriterion("permission_rightid not in", values, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidBetween(Long value1, Long value2) {
            addCriterion("permission_rightid between", value1, value2, "permissionRightid");
            return (Criteria) this;
        }

        public Criteria andPermissionRightidNotBetween(Long value1, Long value2) {
            addCriterion("permission_rightid not between", value1, value2, "permissionRightid");
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