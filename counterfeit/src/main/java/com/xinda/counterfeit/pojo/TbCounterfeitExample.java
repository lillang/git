package com.xinda.counterfeit.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCounterfeitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCounterfeitExample() {
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

        public Criteria andCounterfeitIdIsNull() {
            addCriterion("counterfeit_id is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdIsNotNull() {
            addCriterion("counterfeit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdEqualTo(Long value) {
            addCriterion("counterfeit_id =", value, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdNotEqualTo(Long value) {
            addCriterion("counterfeit_id <>", value, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdGreaterThan(Long value) {
            addCriterion("counterfeit_id >", value, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("counterfeit_id >=", value, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdLessThan(Long value) {
            addCriterion("counterfeit_id <", value, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdLessThanOrEqualTo(Long value) {
            addCriterion("counterfeit_id <=", value, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdIn(List<Long> values) {
            addCriterion("counterfeit_id in", values, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdNotIn(List<Long> values) {
            addCriterion("counterfeit_id not in", values, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdBetween(Long value1, Long value2) {
            addCriterion("counterfeit_id between", value1, value2, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitIdNotBetween(Long value1, Long value2) {
            addCriterion("counterfeit_id not between", value1, value2, "counterfeitId");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumIsNull() {
            addCriterion("counterfeit_serialnum is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumIsNotNull() {
            addCriterion("counterfeit_serialnum is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumEqualTo(String value) {
            addCriterion("counterfeit_serialnum =", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumNotEqualTo(String value) {
            addCriterion("counterfeit_serialnum <>", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumGreaterThan(String value) {
            addCriterion("counterfeit_serialnum >", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_serialnum >=", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumLessThan(String value) {
            addCriterion("counterfeit_serialnum <", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_serialnum <=", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumLike(String value) {
            addCriterion("counterfeit_serialnum like", value, "counterfeitSerialnum");
            return (Criteria) this;
        }
        public Criteria andDeviceAddressLike(String value) {
            addCriterion("d.device_address like", value, "deviceAddress");
            return (Criteria) this;
        }
        public Criteria andCounterfeitSerialnumNotLike(String value) {
            addCriterion("counterfeit_serialnum not like", value, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumIn(List<String> values) {
            addCriterion("counterfeit_serialnum in", values, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumNotIn(List<String> values) {
            addCriterion("counterfeit_serialnum not in", values, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumBetween(String value1, String value2) {
            addCriterion("counterfeit_serialnum between", value1, value2, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitSerialnumNotBetween(String value1, String value2) {
            addCriterion("counterfeit_serialnum not between", value1, value2, "counterfeitSerialnum");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateIsNull() {
            addCriterion("counterfeit_createdate is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateIsNotNull() {
            addCriterion("counterfeit_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateEqualTo(Long value) {
            addCriterion("counterfeit_createdate =", value, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateNotEqualTo(Long value) {
            addCriterion("counterfeit_createdate <>", value, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateGreaterThan(Long value) {
            addCriterion("counterfeit_createdate >", value, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateGreaterThanOrEqualTo(Long value) {
            addCriterion("counterfeit_createdate >=", value, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateLessThan(Long value) {
            addCriterion("counterfeit_createdate <", value, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateLessThanOrEqualTo(Long value) {
            addCriterion("counterfeit_createdate <=", value, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateIn(List<Long> values) {
            addCriterion("counterfeit_createdate in", values, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateNotIn(List<Long> values) {
            addCriterion("counterfeit_createdate not in", values, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateBetween(Long value1, Long value2) {
            addCriterion("counterfeit_createdate between", value1, value2, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCreatedateNotBetween(Long value1, Long value2) {
            addCriterion("counterfeit_createdate not between", value1, value2, "counterfeitCreatedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidIsNull() {
            addCriterion("counterfeit_deviceid is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidIsNotNull() {
            addCriterion("counterfeit_deviceid is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidEqualTo(Long value) {
            addCriterion("counterfeit_deviceid =", value, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidNotEqualTo(Long value) {
            addCriterion("counterfeit_deviceid <>", value, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidGreaterThan(Long value) {
            addCriterion("counterfeit_deviceid >", value, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidGreaterThanOrEqualTo(Long value) {
            addCriterion("counterfeit_deviceid >=", value, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidLessThan(Long value) {
            addCriterion("counterfeit_deviceid <", value, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidLessThanOrEqualTo(Long value) {
            addCriterion("counterfeit_deviceid <=", value, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidIn(List<Long> values) {
            addCriterion("counterfeit_deviceid in", values, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidNotIn(List<Long> values) {
            addCriterion("counterfeit_deviceid not in", values, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidBetween(Long value1, Long value2) {
            addCriterion("counterfeit_deviceid between", value1, value2, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitDeviceidNotBetween(Long value1, Long value2) {
            addCriterion("counterfeit_deviceid not between", value1, value2, "counterfeitDeviceid");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyIsNull() {
            addCriterion("counterfeit_currency is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyIsNotNull() {
            addCriterion("counterfeit_currency is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyEqualTo(String value) {
            addCriterion("counterfeit_currency =", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyNotEqualTo(String value) {
            addCriterion("counterfeit_currency <>", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyGreaterThan(String value) {
            addCriterion("counterfeit_currency >", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_currency >=", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyLessThan(String value) {
            addCriterion("counterfeit_currency <", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_currency <=", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyLike(String value) {
            addCriterion("counterfeit_currency like", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyNotLike(String value) {
            addCriterion("counterfeit_currency not like", value, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyIn(List<String> values) {
            addCriterion("counterfeit_currency in", values, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyNotIn(List<String> values) {
            addCriterion("counterfeit_currency not in", values, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyBetween(String value1, String value2) {
            addCriterion("counterfeit_currency between", value1, value2, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCurrencyNotBetween(String value1, String value2) {
            addCriterion("counterfeit_currency not between", value1, value2, "counterfeitCurrency");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleIsNull() {
            addCriterion("counterfeit_bottle is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleIsNotNull() {
            addCriterion("counterfeit_bottle is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleEqualTo(String value) {
            addCriterion("counterfeit_bottle =", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleNotEqualTo(String value) {
            addCriterion("counterfeit_bottle <>", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleGreaterThan(String value) {
            addCriterion("counterfeit_bottle >", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_bottle >=", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleLessThan(String value) {
            addCriterion("counterfeit_bottle <", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_bottle <=", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleLike(String value) {
            addCriterion("counterfeit_bottle like", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleNotLike(String value) {
            addCriterion("counterfeit_bottle not like", value, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleIn(List<String> values) {
            addCriterion("counterfeit_bottle in", values, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleNotIn(List<String> values) {
            addCriterion("counterfeit_bottle not in", values, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleBetween(String value1, String value2) {
            addCriterion("counterfeit_bottle between", value1, value2, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitBottleNotBetween(String value1, String value2) {
            addCriterion("counterfeit_bottle not between", value1, value2, "counterfeitBottle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyIsNull() {
            addCriterion("counterfeit_money is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyIsNotNull() {
            addCriterion("counterfeit_money is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyEqualTo(Integer value) {
            addCriterion("counterfeit_money =", value, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyNotEqualTo(Integer value) {
            addCriterion("counterfeit_money <>", value, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyGreaterThan(Integer value) {
            addCriterion("counterfeit_money >", value, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("counterfeit_money >=", value, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyLessThan(Integer value) {
            addCriterion("counterfeit_money <", value, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("counterfeit_money <=", value, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyIn(List<Integer> values) {
            addCriterion("counterfeit_money in", values, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyNotIn(List<Integer> values) {
            addCriterion("counterfeit_money not in", values, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyBetween(Integer value1, Integer value2) {
            addCriterion("counterfeit_money between", value1, value2, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("counterfeit_money not between", value1, value2, "counterfeitMoney");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultIsNull() {
            addCriterion("counterfeit_checkresult is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultIsNotNull() {
            addCriterion("counterfeit_checkresult is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultEqualTo(String value) {
            addCriterion("counterfeit_checkresult =", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultNotEqualTo(String value) {
            addCriterion("counterfeit_checkresult <>", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultGreaterThan(String value) {
            addCriterion("counterfeit_checkresult >", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_checkresult >=", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultLessThan(String value) {
            addCriterion("counterfeit_checkresult <", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_checkresult <=", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultLike(String value) {
            addCriterion("counterfeit_checkresult like", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultNotLike(String value) {
            addCriterion("counterfeit_checkresult not like", value, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultIn(List<String> values) {
            addCriterion("counterfeit_checkresult in", values, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultNotIn(List<String> values) {
            addCriterion("counterfeit_checkresult not in", values, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultBetween(String value1, String value2) {
            addCriterion("counterfeit_checkresult between", value1, value2, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCheckresultNotBetween(String value1, String value2) {
            addCriterion("counterfeit_checkresult not between", value1, value2, "counterfeitCheckresult");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureIsNull() {
            addCriterion("counterfeit_picture is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureIsNotNull() {
            addCriterion("counterfeit_picture is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureEqualTo(String value) {
            addCriterion("counterfeit_picture =", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureNotEqualTo(String value) {
            addCriterion("counterfeit_picture <>", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureGreaterThan(String value) {
            addCriterion("counterfeit_picture >", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_picture >=", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureLessThan(String value) {
            addCriterion("counterfeit_picture <", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_picture <=", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureLike(String value) {
            addCriterion("counterfeit_picture like", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureNotLike(String value) {
            addCriterion("counterfeit_picture not like", value, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureIn(List<String> values) {
            addCriterion("counterfeit_picture in", values, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureNotIn(List<String> values) {
            addCriterion("counterfeit_picture not in", values, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureBetween(String value1, String value2) {
            addCriterion("counterfeit_picture between", value1, value2, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitPictureNotBetween(String value1, String value2) {
            addCriterion("counterfeit_picture not between", value1, value2, "counterfeitPicture");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameIsNull() {
            addCriterion("counterfeit_capturename is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameIsNotNull() {
            addCriterion("counterfeit_capturename is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameEqualTo(String value) {
            addCriterion("counterfeit_capturename =", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameNotEqualTo(String value) {
            addCriterion("counterfeit_capturename <>", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameGreaterThan(String value) {
            addCriterion("counterfeit_capturename >", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_capturename >=", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameLessThan(String value) {
            addCriterion("counterfeit_capturename <", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_capturename <=", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameLike(String value) {
            addCriterion("counterfeit_capturename like", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameNotLike(String value) {
            addCriterion("counterfeit_capturename not like", value, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameIn(List<String> values) {
            addCriterion("counterfeit_capturename in", values, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameNotIn(List<String> values) {
            addCriterion("counterfeit_capturename not in", values, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameBetween(String value1, String value2) {
            addCriterion("counterfeit_capturename between", value1, value2, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturenameNotBetween(String value1, String value2) {
            addCriterion("counterfeit_capturename not between", value1, value2, "counterfeitCapturename");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressIsNull() {
            addCriterion("counterfeit_captureaddress is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressIsNotNull() {
            addCriterion("counterfeit_captureaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressEqualTo(String value) {
            addCriterion("counterfeit_captureaddress =", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressNotEqualTo(String value) {
            addCriterion("counterfeit_captureaddress <>", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressGreaterThan(String value) {
            addCriterion("counterfeit_captureaddress >", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressGreaterThanOrEqualTo(String value) {
            addCriterion("counterfeit_captureaddress >=", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressLessThan(String value) {
            addCriterion("counterfeit_captureaddress <", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressLessThanOrEqualTo(String value) {
            addCriterion("counterfeit_captureaddress <=", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressLike(String value) {
            addCriterion("counterfeit_captureaddress like", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressNotLike(String value) {
            addCriterion("counterfeit_captureaddress not like", value, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressIn(List<String> values) {
            addCriterion("counterfeit_captureaddress in", values, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressNotIn(List<String> values) {
            addCriterion("counterfeit_captureaddress not in", values, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressBetween(String value1, String value2) {
            addCriterion("counterfeit_captureaddress between", value1, value2, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCaptureaddressNotBetween(String value1, String value2) {
            addCriterion("counterfeit_captureaddress not between", value1, value2, "counterfeitCaptureaddress");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeIsNull() {
            addCriterion("counterfeit_type is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeIsNotNull() {
            addCriterion("counterfeit_type is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeEqualTo(Integer value) {
            addCriterion("counterfeit_type =", value, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeNotEqualTo(Integer value) {
            addCriterion("counterfeit_type <>", value, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeGreaterThan(Integer value) {
            addCriterion("counterfeit_type >", value, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("counterfeit_type >=", value, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeLessThan(Integer value) {
            addCriterion("counterfeit_type <", value, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("counterfeit_type <=", value, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeIn(List<Integer> values) {
            addCriterion("counterfeit_type in", values, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeNotIn(List<Integer> values) {
            addCriterion("counterfeit_type not in", values, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeBetween(Integer value1, Integer value2) {
            addCriterion("counterfeit_type between", value1, value2, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("counterfeit_type not between", value1, value2, "counterfeitType");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateIsNull() {
            addCriterion("counterfeit_capturedate is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateIsNotNull() {
            addCriterion("counterfeit_capturedate is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateEqualTo(Long value) {
            addCriterion("counterfeit_capturedate =", value, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateNotEqualTo(Long value) {
            addCriterion("counterfeit_capturedate <>", value, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateGreaterThan(Long value) {
            addCriterion("counterfeit_capturedate >", value, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateGreaterThanOrEqualTo(Long value) {
            addCriterion("counterfeit_capturedate >=", value, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateLessThan(Long value) {
            addCriterion("counterfeit_capturedate <", value, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateLessThanOrEqualTo(Long value) {
            addCriterion("counterfeit_capturedate <=", value, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateIn(List<Long> values) {
            addCriterion("counterfeit_capturedate in", values, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateNotIn(List<Long> values) {
            addCriterion("counterfeit_capturedate not in", values, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateBetween(Long value1, Long value2) {
            addCriterion("counterfeit_capturedate between", value1, value2, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitCapturedateNotBetween(Long value1, Long value2) {
            addCriterion("counterfeit_capturedate not between", value1, value2, "counterfeitCapturedate");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleIsNull() {
            addCriterion("counterfeit_recycle is null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleIsNotNull() {
            addCriterion("counterfeit_recycle is not null");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleEqualTo(Integer value) {
            addCriterion("counterfeit_recycle =", value, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleNotEqualTo(Integer value) {
            addCriterion("counterfeit_recycle <>", value, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleGreaterThan(Integer value) {
            addCriterion("counterfeit_recycle >", value, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("counterfeit_recycle >=", value, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleLessThan(Integer value) {
            addCriterion("counterfeit_recycle <", value, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleLessThanOrEqualTo(Integer value) {
            addCriterion("counterfeit_recycle <=", value, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleIn(List<Integer> values) {
            addCriterion("counterfeit_recycle in", values, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleNotIn(List<Integer> values) {
            addCriterion("counterfeit_recycle not in", values, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleBetween(Integer value1, Integer value2) {
            addCriterion("counterfeit_recycle between", value1, value2, "counterfeitRecycle");
            return (Criteria) this;
        }

        public Criteria andCounterfeitRecycleNotBetween(Integer value1, Integer value2) {
            addCriterion("counterfeit_recycle not between", value1, value2, "counterfeitRecycle");
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