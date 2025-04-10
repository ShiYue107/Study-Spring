package com.admin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andSuperidIsNull() {
            addCriterion("superid is null");
            return (Criteria) this;
        }

        public Criteria andSuperidIsNotNull() {
            addCriterion("superid is not null");
            return (Criteria) this;
        }

        public Criteria andSuperidEqualTo(Integer value) {
            addCriterion("superid =", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotEqualTo(Integer value) {
            addCriterion("superid <>", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidGreaterThan(Integer value) {
            addCriterion("superid >", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("superid >=", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidLessThan(Integer value) {
            addCriterion("superid <", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidLessThanOrEqualTo(Integer value) {
            addCriterion("superid <=", value, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidIn(List<Integer> values) {
            addCriterion("superid in", values, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotIn(List<Integer> values) {
            addCriterion("superid not in", values, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidBetween(Integer value1, Integer value2) {
            addCriterion("superid between", value1, value2, "superid");
            return (Criteria) this;
        }

        public Criteria andSuperidNotBetween(Integer value1, Integer value2) {
            addCriterion("superid not between", value1, value2, "superid");
            return (Criteria) this;
        }

        public Criteria andSupernameIsNull() {
            addCriterion("supername is null");
            return (Criteria) this;
        }

        public Criteria andSupernameIsNotNull() {
            addCriterion("supername is not null");
            return (Criteria) this;
        }

        public Criteria andSupernameEqualTo(String value) {
            addCriterion("supername =", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameNotEqualTo(String value) {
            addCriterion("supername <>", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameGreaterThan(String value) {
            addCriterion("supername >", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameGreaterThanOrEqualTo(String value) {
            addCriterion("supername >=", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameLessThan(String value) {
            addCriterion("supername <", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameLessThanOrEqualTo(String value) {
            addCriterion("supername <=", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameLike(String value) {
            addCriterion("supername like", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameNotLike(String value) {
            addCriterion("supername not like", value, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameIn(List<String> values) {
            addCriterion("supername in", values, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameNotIn(List<String> values) {
            addCriterion("supername not in", values, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameBetween(String value1, String value2) {
            addCriterion("supername between", value1, value2, "supername");
            return (Criteria) this;
        }

        public Criteria andSupernameNotBetween(String value1, String value2) {
            addCriterion("supername not between", value1, value2, "supername");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordIsNull() {
            addCriterion("superpassword is null");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordIsNotNull() {
            addCriterion("superpassword is not null");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordEqualTo(String value) {
            addCriterion("superpassword =", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordNotEqualTo(String value) {
            addCriterion("superpassword <>", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordGreaterThan(String value) {
            addCriterion("superpassword >", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("superpassword >=", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordLessThan(String value) {
            addCriterion("superpassword <", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordLessThanOrEqualTo(String value) {
            addCriterion("superpassword <=", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordLike(String value) {
            addCriterion("superpassword like", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordNotLike(String value) {
            addCriterion("superpassword not like", value, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordIn(List<String> values) {
            addCriterion("superpassword in", values, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordNotIn(List<String> values) {
            addCriterion("superpassword not in", values, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordBetween(String value1, String value2) {
            addCriterion("superpassword between", value1, value2, "superpassword");
            return (Criteria) this;
        }

        public Criteria andSuperpasswordNotBetween(String value1, String value2) {
            addCriterion("superpassword not between", value1, value2, "superpassword");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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