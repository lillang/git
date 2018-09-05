package com.xinda.counterfeit.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRightExample() {
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

        public Criteria andRightIdIsNull() {
            addCriterion("right_id is null");
            return (Criteria) this;
        }

        public Criteria andRightIdIsNotNull() {
            addCriterion("right_id is not null");
            return (Criteria) this;
        }

        public Criteria andRightIdEqualTo(Long value) {
            addCriterion("right_id =", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotEqualTo(Long value) {
            addCriterion("right_id <>", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThan(Long value) {
            addCriterion("right_id >", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThanOrEqualTo(Long value) {
            addCriterion("right_id >=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThan(Long value) {
            addCriterion("right_id <", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThanOrEqualTo(Long value) {
            addCriterion("right_id <=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdIn(List<Long> values) {
            addCriterion("right_id in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotIn(List<Long> values) {
            addCriterion("right_id not in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdBetween(Long value1, Long value2) {
            addCriterion("right_id between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotBetween(Long value1, Long value2) {
            addCriterion("right_id not between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightParentidIsNull() {
            addCriterion("right_parentid is null");
            return (Criteria) this;
        }

        public Criteria andRightParentidIsNotNull() {
            addCriterion("right_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andRightParentidEqualTo(Long value) {
            addCriterion("right_parentid =", value, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidNotEqualTo(Long value) {
            addCriterion("right_parentid <>", value, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidGreaterThan(Long value) {
            addCriterion("right_parentid >", value, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("right_parentid >=", value, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidLessThan(Long value) {
            addCriterion("right_parentid <", value, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidLessThanOrEqualTo(Long value) {
            addCriterion("right_parentid <=", value, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidIn(List<Long> values) {
            addCriterion("right_parentid in", values, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidNotIn(List<Long> values) {
            addCriterion("right_parentid not in", values, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidBetween(Long value1, Long value2) {
            addCriterion("right_parentid between", value1, value2, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightParentidNotBetween(Long value1, Long value2) {
            addCriterion("right_parentid not between", value1, value2, "rightParentid");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNull() {
            addCriterion("right_name is null");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNotNull() {
            addCriterion("right_name is not null");
            return (Criteria) this;
        }

        public Criteria andRightNameEqualTo(String value) {
            addCriterion("right_name =", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotEqualTo(String value) {
            addCriterion("right_name <>", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThan(String value) {
            addCriterion("right_name >", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("right_name >=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThan(String value) {
            addCriterion("right_name <", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThanOrEqualTo(String value) {
            addCriterion("right_name <=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLike(String value) {
            addCriterion("right_name like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotLike(String value) {
            addCriterion("right_name not like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameIn(List<String> values) {
            addCriterion("right_name in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotIn(List<String> values) {
            addCriterion("right_name not in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameBetween(String value1, String value2) {
            addCriterion("right_name between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotBetween(String value1, String value2) {
            addCriterion("right_name not between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightSortIsNull() {
            addCriterion("right_sort is null");
            return (Criteria) this;
        }

        public Criteria andRightSortIsNotNull() {
            addCriterion("right_sort is not null");
            return (Criteria) this;
        }

        public Criteria andRightSortEqualTo(Integer value) {
            addCriterion("right_sort =", value, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortNotEqualTo(Integer value) {
            addCriterion("right_sort <>", value, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortGreaterThan(Integer value) {
            addCriterion("right_sort >", value, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_sort >=", value, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortLessThan(Integer value) {
            addCriterion("right_sort <", value, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortLessThanOrEqualTo(Integer value) {
            addCriterion("right_sort <=", value, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortIn(List<Integer> values) {
            addCriterion("right_sort in", values, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortNotIn(List<Integer> values) {
            addCriterion("right_sort not in", values, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortBetween(Integer value1, Integer value2) {
            addCriterion("right_sort between", value1, value2, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightSortNotBetween(Integer value1, Integer value2) {
            addCriterion("right_sort not between", value1, value2, "rightSort");
            return (Criteria) this;
        }

        public Criteria andRightMenuidIsNull() {
            addCriterion("right_menuid is null");
            return (Criteria) this;
        }

        public Criteria andRightMenuidIsNotNull() {
            addCriterion("right_menuid is not null");
            return (Criteria) this;
        }

        public Criteria andRightMenuidEqualTo(Long value) {
            addCriterion("right_menuid =", value, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidNotEqualTo(Long value) {
            addCriterion("right_menuid <>", value, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidGreaterThan(Long value) {
            addCriterion("right_menuid >", value, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidGreaterThanOrEqualTo(Long value) {
            addCriterion("right_menuid >=", value, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidLessThan(Long value) {
            addCriterion("right_menuid <", value, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidLessThanOrEqualTo(Long value) {
            addCriterion("right_menuid <=", value, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidIn(List<Long> values) {
            addCriterion("right_menuid in", values, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidNotIn(List<Long> values) {
            addCriterion("right_menuid not in", values, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidBetween(Long value1, Long value2) {
            addCriterion("right_menuid between", value1, value2, "rightMenuid");
            return (Criteria) this;
        }

        public Criteria andRightMenuidNotBetween(Long value1, Long value2) {
            addCriterion("right_menuid not between", value1, value2, "rightMenuid");
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