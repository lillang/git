package com.xinda.counterfeit.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbOperatelogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOperatelogExample() {
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

        public Criteria andOperatelogIdIsNull() {
            addCriterion("operatelog_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdIsNotNull() {
            addCriterion("operatelog_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdEqualTo(Long value) {
            addCriterion("operatelog_id =", value, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdNotEqualTo(Long value) {
            addCriterion("operatelog_id <>", value, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdGreaterThan(Long value) {
            addCriterion("operatelog_id >", value, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operatelog_id >=", value, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdLessThan(Long value) {
            addCriterion("operatelog_id <", value, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdLessThanOrEqualTo(Long value) {
            addCriterion("operatelog_id <=", value, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdIn(List<Long> values) {
            addCriterion("operatelog_id in", values, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdNotIn(List<Long> values) {
            addCriterion("operatelog_id not in", values, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdBetween(Long value1, Long value2) {
            addCriterion("operatelog_id between", value1, value2, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogIdNotBetween(Long value1, Long value2) {
            addCriterion("operatelog_id not between", value1, value2, "operatelogId");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateIsNull() {
            addCriterion("operatelog_createdate is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateIsNotNull() {
            addCriterion("operatelog_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateEqualTo(Long value) {
            addCriterion("operatelog_createdate =", value, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateNotEqualTo(Long value) {
            addCriterion("operatelog_createdate <>", value, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateGreaterThan(Long value) {
            addCriterion("operatelog_createdate >", value, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateGreaterThanOrEqualTo(Long value) {
            addCriterion("operatelog_createdate >=", value, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateLessThan(Long value) {
            addCriterion("operatelog_createdate <", value, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateLessThanOrEqualTo(Long value) {
            addCriterion("operatelog_createdate <=", value, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateIn(List<Long> values) {
            addCriterion("operatelog_createdate in", values, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateNotIn(List<Long> values) {
            addCriterion("operatelog_createdate not in", values, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateBetween(Long value1, Long value2) {
            addCriterion("operatelog_createdate between", value1, value2, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogCreatedateNotBetween(Long value1, Long value2) {
            addCriterion("operatelog_createdate not between", value1, value2, "operatelogCreatedate");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrIsNull() {
            addCriterion("operatelog_ipaddr is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrIsNotNull() {
            addCriterion("operatelog_ipaddr is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrEqualTo(String value) {
            addCriterion("operatelog_ipaddr =", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrNotEqualTo(String value) {
            addCriterion("operatelog_ipaddr <>", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrGreaterThan(String value) {
            addCriterion("operatelog_ipaddr >", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("operatelog_ipaddr >=", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrLessThan(String value) {
            addCriterion("operatelog_ipaddr <", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrLessThanOrEqualTo(String value) {
            addCriterion("operatelog_ipaddr <=", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrLike(String value) {
            addCriterion("operatelog_ipaddr like", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrNotLike(String value) {
            addCriterion("operatelog_ipaddr not like", value, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrIn(List<String> values) {
            addCriterion("operatelog_ipaddr in", values, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrNotIn(List<String> values) {
            addCriterion("operatelog_ipaddr not in", values, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrBetween(String value1, String value2) {
            addCriterion("operatelog_ipaddr between", value1, value2, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogIpaddrNotBetween(String value1, String value2) {
            addCriterion("operatelog_ipaddr not between", value1, value2, "operatelogIpaddr");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeIsNull() {
            addCriterion("operatelog_logtype is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeIsNotNull() {
            addCriterion("operatelog_logtype is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeEqualTo(String value) {
            addCriterion("operatelog_logtype =", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeNotEqualTo(String value) {
            addCriterion("operatelog_logtype <>", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeGreaterThan(String value) {
            addCriterion("operatelog_logtype >", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("operatelog_logtype >=", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeLessThan(String value) {
            addCriterion("operatelog_logtype <", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeLessThanOrEqualTo(String value) {
            addCriterion("operatelog_logtype <=", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeLike(String value) {
            addCriterion("operatelog_logtype like", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeNotLike(String value) {
            addCriterion("operatelog_logtype not like", value, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeIn(List<String> values) {
            addCriterion("operatelog_logtype in", values, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeNotIn(List<String> values) {
            addCriterion("operatelog_logtype not in", values, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeBetween(String value1, String value2) {
            addCriterion("operatelog_logtype between", value1, value2, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogLogtypeNotBetween(String value1, String value2) {
            addCriterion("operatelog_logtype not between", value1, value2, "operatelogLogtype");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultIsNull() {
            addCriterion("operatelog_result is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultIsNotNull() {
            addCriterion("operatelog_result is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultEqualTo(String value) {
            addCriterion("operatelog_result =", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultNotEqualTo(String value) {
            addCriterion("operatelog_result <>", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultGreaterThan(String value) {
            addCriterion("operatelog_result >", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultGreaterThanOrEqualTo(String value) {
            addCriterion("operatelog_result >=", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultLessThan(String value) {
            addCriterion("operatelog_result <", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultLessThanOrEqualTo(String value) {
            addCriterion("operatelog_result <=", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultLike(String value) {
            addCriterion("operatelog_result like", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultNotLike(String value) {
            addCriterion("operatelog_result not like", value, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultIn(List<String> values) {
            addCriterion("operatelog_result in", values, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultNotIn(List<String> values) {
            addCriterion("operatelog_result not in", values, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultBetween(String value1, String value2) {
            addCriterion("operatelog_result between", value1, value2, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogResultNotBetween(String value1, String value2) {
            addCriterion("operatelog_result not between", value1, value2, "operatelogResult");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameIsNull() {
            addCriterion("operatelog_username is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameIsNotNull() {
            addCriterion("operatelog_username is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameEqualTo(String value) {
            addCriterion("operatelog_username =", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameNotEqualTo(String value) {
            addCriterion("operatelog_username <>", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameGreaterThan(String value) {
            addCriterion("operatelog_username >", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("operatelog_username >=", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameLessThan(String value) {
            addCriterion("operatelog_username <", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameLessThanOrEqualTo(String value) {
            addCriterion("operatelog_username <=", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameLike(String value) {
            addCriterion("operatelog_username like", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameNotLike(String value) {
            addCriterion("operatelog_username not like", value, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameIn(List<String> values) {
            addCriterion("operatelog_username in", values, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameNotIn(List<String> values) {
            addCriterion("operatelog_username not in", values, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameBetween(String value1, String value2) {
            addCriterion("operatelog_username between", value1, value2, "operatelogUsername");
            return (Criteria) this;
        }

        public Criteria andOperatelogUsernameNotBetween(String value1, String value2) {
            addCriterion("operatelog_username not between", value1, value2, "operatelogUsername");
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