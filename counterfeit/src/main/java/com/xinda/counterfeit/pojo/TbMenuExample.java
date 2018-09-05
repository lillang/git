package com.xinda.counterfeit.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Long value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Long value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Long value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Long value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Long> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Long> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Long value1, Long value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuParentidIsNull() {
            addCriterion("menu_parentid is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentidIsNotNull() {
            addCriterion("menu_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentidEqualTo(Long value) {
            addCriterion("menu_parentid =", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidNotEqualTo(Long value) {
            addCriterion("menu_parentid <>", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidGreaterThan(Long value) {
            addCriterion("menu_parentid >", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_parentid >=", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidLessThan(Long value) {
            addCriterion("menu_parentid <", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidLessThanOrEqualTo(Long value) {
            addCriterion("menu_parentid <=", value, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidIn(List<Long> values) {
            addCriterion("menu_parentid in", values, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidNotIn(List<Long> values) {
            addCriterion("menu_parentid not in", values, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidBetween(Long value1, Long value2) {
            addCriterion("menu_parentid between", value1, value2, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuParentidNotBetween(Long value1, Long value2) {
            addCriterion("menu_parentid not between", value1, value2, "menuParentid");
            return (Criteria) this;
        }

        public Criteria andMenuTextIsNull() {
            addCriterion("menu_text is null");
            return (Criteria) this;
        }

        public Criteria andMenuTextIsNotNull() {
            addCriterion("menu_text is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTextEqualTo(String value) {
            addCriterion("menu_text =", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotEqualTo(String value) {
            addCriterion("menu_text <>", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextGreaterThan(String value) {
            addCriterion("menu_text >", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextGreaterThanOrEqualTo(String value) {
            addCriterion("menu_text >=", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextLessThan(String value) {
            addCriterion("menu_text <", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextLessThanOrEqualTo(String value) {
            addCriterion("menu_text <=", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextLike(String value) {
            addCriterion("menu_text like", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotLike(String value) {
            addCriterion("menu_text not like", value, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextIn(List<String> values) {
            addCriterion("menu_text in", values, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotIn(List<String> values) {
            addCriterion("menu_text not in", values, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextBetween(String value1, String value2) {
            addCriterion("menu_text between", value1, value2, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuTextNotBetween(String value1, String value2) {
            addCriterion("menu_text not between", value1, value2, "menuText");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("menu_url is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("menu_url is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("menu_url =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("menu_url <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("menu_url >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("menu_url >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("menu_url <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("menu_url <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("menu_url like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("menu_url not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("menu_url in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("menu_url not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("menu_url between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("menu_url not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsIsNull() {
            addCriterion("menu_iconcls is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsIsNotNull() {
            addCriterion("menu_iconcls is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsEqualTo(String value) {
            addCriterion("menu_iconcls =", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsNotEqualTo(String value) {
            addCriterion("menu_iconcls <>", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsGreaterThan(String value) {
            addCriterion("menu_iconcls >", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsGreaterThanOrEqualTo(String value) {
            addCriterion("menu_iconcls >=", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsLessThan(String value) {
            addCriterion("menu_iconcls <", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsLessThanOrEqualTo(String value) {
            addCriterion("menu_iconcls <=", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsLike(String value) {
            addCriterion("menu_iconcls like", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsNotLike(String value) {
            addCriterion("menu_iconcls not like", value, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsIn(List<String> values) {
            addCriterion("menu_iconcls in", values, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsNotIn(List<String> values) {
            addCriterion("menu_iconcls not in", values, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsBetween(String value1, String value2) {
            addCriterion("menu_iconcls between", value1, value2, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuIconclsNotBetween(String value1, String value2) {
            addCriterion("menu_iconcls not between", value1, value2, "menuIconcls");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNull() {
            addCriterion("menu_status is null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNotNull() {
            addCriterion("menu_status is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusEqualTo(Integer value) {
            addCriterion("menu_status =", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotEqualTo(Integer value) {
            addCriterion("menu_status <>", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThan(Integer value) {
            addCriterion("menu_status >", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_status >=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThan(Integer value) {
            addCriterion("menu_status <", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("menu_status <=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIn(List<Integer> values) {
            addCriterion("menu_status in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotIn(List<Integer> values) {
            addCriterion("menu_status not in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusBetween(Integer value1, Integer value2) {
            addCriterion("menu_status between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_status not between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedIsNull() {
            addCriterion("menu_ichecked is null");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedIsNotNull() {
            addCriterion("menu_ichecked is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedEqualTo(Integer value) {
            addCriterion("menu_ichecked =", value, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedNotEqualTo(Integer value) {
            addCriterion("menu_ichecked <>", value, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedGreaterThan(Integer value) {
            addCriterion("menu_ichecked >", value, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_ichecked >=", value, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedLessThan(Integer value) {
            addCriterion("menu_ichecked <", value, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedLessThanOrEqualTo(Integer value) {
            addCriterion("menu_ichecked <=", value, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedIn(List<Integer> values) {
            addCriterion("menu_ichecked in", values, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedNotIn(List<Integer> values) {
            addCriterion("menu_ichecked not in", values, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedBetween(Integer value1, Integer value2) {
            addCriterion("menu_ichecked between", value1, value2, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuIcheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_ichecked not between", value1, value2, "menuIchecked");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoIsNull() {
            addCriterion("menu_sortno is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoIsNotNull() {
            addCriterion("menu_sortno is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoEqualTo(Integer value) {
            addCriterion("menu_sortno =", value, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoNotEqualTo(Integer value) {
            addCriterion("menu_sortno <>", value, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoGreaterThan(Integer value) {
            addCriterion("menu_sortno >", value, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_sortno >=", value, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoLessThan(Integer value) {
            addCriterion("menu_sortno <", value, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("menu_sortno <=", value, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoIn(List<Integer> values) {
            addCriterion("menu_sortno in", values, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoNotIn(List<Integer> values) {
            addCriterion("menu_sortno not in", values, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoBetween(Integer value1, Integer value2) {
            addCriterion("menu_sortno between", value1, value2, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_sortno not between", value1, value2, "menuSortno");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingIsNull() {
            addCriterion("menu_isusing is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingIsNotNull() {
            addCriterion("menu_isusing is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingEqualTo(Integer value) {
            addCriterion("menu_isusing =", value, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingNotEqualTo(Integer value) {
            addCriterion("menu_isusing <>", value, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingGreaterThan(Integer value) {
            addCriterion("menu_isusing >", value, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_isusing >=", value, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingLessThan(Integer value) {
            addCriterion("menu_isusing <", value, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingLessThanOrEqualTo(Integer value) {
            addCriterion("menu_isusing <=", value, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingIn(List<Integer> values) {
            addCriterion("menu_isusing in", values, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingNotIn(List<Integer> values) {
            addCriterion("menu_isusing not in", values, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingBetween(Integer value1, Integer value2) {
            addCriterion("menu_isusing between", value1, value2, "menuIsusing");
            return (Criteria) this;
        }

        public Criteria andMenuIsusingNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_isusing not between", value1, value2, "menuIsusing");
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