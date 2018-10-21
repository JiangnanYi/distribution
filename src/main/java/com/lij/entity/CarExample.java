package com.lij.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public CarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
     *
     * @mbg.generated
     */
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

        public Criteria andCaridIsNull() {
            addCriterion("carID is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carID is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carID =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carID <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carID >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carID >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carID <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carID <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carID like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carID not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carID in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carID not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carID between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carID not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andRouteidIsNull() {
            addCriterion("routeID is null");
            return (Criteria) this;
        }

        public Criteria andRouteidIsNotNull() {
            addCriterion("routeID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteidEqualTo(String value) {
            addCriterion("routeID =", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotEqualTo(String value) {
            addCriterion("routeID <>", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidGreaterThan(String value) {
            addCriterion("routeID >", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidGreaterThanOrEqualTo(String value) {
            addCriterion("routeID >=", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLessThan(String value) {
            addCriterion("routeID <", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLessThanOrEqualTo(String value) {
            addCriterion("routeID <=", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidLike(String value) {
            addCriterion("routeID like", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotLike(String value) {
            addCriterion("routeID not like", value, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidIn(List<String> values) {
            addCriterion("routeID in", values, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotIn(List<String> values) {
            addCriterion("routeID not in", values, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidBetween(String value1, String value2) {
            addCriterion("routeID between", value1, value2, "routeid");
            return (Criteria) this;
        }

        public Criteria andRouteidNotBetween(String value1, String value2) {
            addCriterion("routeID not between", value1, value2, "routeid");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCarorginIsNull() {
            addCriterion("carOrgin is null");
            return (Criteria) this;
        }

        public Criteria andCarorginIsNotNull() {
            addCriterion("carOrgin is not null");
            return (Criteria) this;
        }

        public Criteria andCarorginEqualTo(String value) {
            addCriterion("carOrgin =", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginNotEqualTo(String value) {
            addCriterion("carOrgin <>", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginGreaterThan(String value) {
            addCriterion("carOrgin >", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginGreaterThanOrEqualTo(String value) {
            addCriterion("carOrgin >=", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginLessThan(String value) {
            addCriterion("carOrgin <", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginLessThanOrEqualTo(String value) {
            addCriterion("carOrgin <=", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginLike(String value) {
            addCriterion("carOrgin like", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginNotLike(String value) {
            addCriterion("carOrgin not like", value, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginIn(List<String> values) {
            addCriterion("carOrgin in", values, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginNotIn(List<String> values) {
            addCriterion("carOrgin not in", values, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginBetween(String value1, String value2) {
            addCriterion("carOrgin between", value1, value2, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarorginNotBetween(String value1, String value2) {
            addCriterion("carOrgin not between", value1, value2, "carorgin");
            return (Criteria) this;
        }

        public Criteria andCarprodateIsNull() {
            addCriterion("carProDate is null");
            return (Criteria) this;
        }

        public Criteria andCarprodateIsNotNull() {
            addCriterion("carProDate is not null");
            return (Criteria) this;
        }

        public Criteria andCarprodateEqualTo(Date value) {
            addCriterion("carProDate =", value, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateNotEqualTo(Date value) {
            addCriterion("carProDate <>", value, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateGreaterThan(Date value) {
            addCriterion("carProDate >", value, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateGreaterThanOrEqualTo(Date value) {
            addCriterion("carProDate >=", value, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateLessThan(Date value) {
            addCriterion("carProDate <", value, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateLessThanOrEqualTo(Date value) {
            addCriterion("carProDate <=", value, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateIn(List<Date> values) {
            addCriterion("carProDate in", values, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateNotIn(List<Date> values) {
            addCriterion("carProDate not in", values, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateBetween(Date value1, Date value2) {
            addCriterion("carProDate between", value1, value2, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarprodateNotBetween(Date value1, Date value2) {
            addCriterion("carProDate not between", value1, value2, "carprodate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateIsNull() {
            addCriterion("carBuyDate is null");
            return (Criteria) this;
        }

        public Criteria andCarbuydateIsNotNull() {
            addCriterion("carBuyDate is not null");
            return (Criteria) this;
        }

        public Criteria andCarbuydateEqualTo(Date value) {
            addCriterion("carBuyDate =", value, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateNotEqualTo(Date value) {
            addCriterion("carBuyDate <>", value, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateGreaterThan(Date value) {
            addCriterion("carBuyDate >", value, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("carBuyDate >=", value, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateLessThan(Date value) {
            addCriterion("carBuyDate <", value, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateLessThanOrEqualTo(Date value) {
            addCriterion("carBuyDate <=", value, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateIn(List<Date> values) {
            addCriterion("carBuyDate in", values, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateNotIn(List<Date> values) {
            addCriterion("carBuyDate not in", values, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateBetween(Date value1, Date value2) {
            addCriterion("carBuyDate between", value1, value2, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarbuydateNotBetween(Date value1, Date value2) {
            addCriterion("carBuyDate not between", value1, value2, "carbuydate");
            return (Criteria) this;
        }

        public Criteria andCarcapacityIsNull() {
            addCriterion("carCapacity is null");
            return (Criteria) this;
        }

        public Criteria andCarcapacityIsNotNull() {
            addCriterion("carCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andCarcapacityEqualTo(Integer value) {
            addCriterion("carCapacity =", value, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityNotEqualTo(Integer value) {
            addCriterion("carCapacity <>", value, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityGreaterThan(Integer value) {
            addCriterion("carCapacity >", value, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("carCapacity >=", value, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityLessThan(Integer value) {
            addCriterion("carCapacity <", value, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityLessThanOrEqualTo(Integer value) {
            addCriterion("carCapacity <=", value, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityIn(List<Integer> values) {
            addCriterion("carCapacity in", values, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityNotIn(List<Integer> values) {
            addCriterion("carCapacity not in", values, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityBetween(Integer value1, Integer value2) {
            addCriterion("carCapacity between", value1, value2, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarcapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("carCapacity not between", value1, value2, "carcapacity");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNull() {
            addCriterion("carState is null");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNotNull() {
            addCriterion("carState is not null");
            return (Criteria) this;
        }

        public Criteria andCarstateEqualTo(Boolean value) {
            addCriterion("carState =", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotEqualTo(Boolean value) {
            addCriterion("carState <>", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThan(Boolean value) {
            addCriterion("carState >", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("carState >=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThan(Boolean value) {
            addCriterion("carState <", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThanOrEqualTo(Boolean value) {
            addCriterion("carState <=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateIn(List<Boolean> values) {
            addCriterion("carState in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotIn(List<Boolean> values) {
            addCriterion("carState not in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateBetween(Boolean value1, Boolean value2) {
            addCriterion("carState between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("carState not between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table car
     *
     * @mbg.generated
     */
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