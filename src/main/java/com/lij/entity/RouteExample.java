package com.lij.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RouteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table route
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table route
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table route
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public RouteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
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
     * This method corresponds to the database table route
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
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
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
     * This class corresponds to the database table route
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

        public Criteria andCityidIsNull() {
            addCriterion("cityID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityID like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityID not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(String value) {
            addCriterion("provinceID =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(String value) {
            addCriterion("provinceID <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(String value) {
            addCriterion("provinceID >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(String value) {
            addCriterion("provinceID >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(String value) {
            addCriterion("provinceID <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(String value) {
            addCriterion("provinceID <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLike(String value) {
            addCriterion("provinceID like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotLike(String value) {
            addCriterion("provinceID not like", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<String> values) {
            addCriterion("provinceID in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<String> values) {
            addCriterion("provinceID not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(String value1, String value2) {
            addCriterion("provinceID between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(String value1, String value2) {
            addCriterion("provinceID not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andRoutenameIsNull() {
            addCriterion("routeName is null");
            return (Criteria) this;
        }

        public Criteria andRoutenameIsNotNull() {
            addCriterion("routeName is not null");
            return (Criteria) this;
        }

        public Criteria andRoutenameEqualTo(String value) {
            addCriterion("routeName =", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotEqualTo(String value) {
            addCriterion("routeName <>", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameGreaterThan(String value) {
            addCriterion("routeName >", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameGreaterThanOrEqualTo(String value) {
            addCriterion("routeName >=", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameLessThan(String value) {
            addCriterion("routeName <", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameLessThanOrEqualTo(String value) {
            addCriterion("routeName <=", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameLike(String value) {
            addCriterion("routeName like", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotLike(String value) {
            addCriterion("routeName not like", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameIn(List<String> values) {
            addCriterion("routeName in", values, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotIn(List<String> values) {
            addCriterion("routeName not in", values, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameBetween(String value1, String value2) {
            addCriterion("routeName between", value1, value2, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotBetween(String value1, String value2) {
            addCriterion("routeName not between", value1, value2, "routename");
            return (Criteria) this;
        }

        public Criteria andStartprovinceIsNull() {
            addCriterion("startProvince is null");
            return (Criteria) this;
        }

        public Criteria andStartprovinceIsNotNull() {
            addCriterion("startProvince is not null");
            return (Criteria) this;
        }

        public Criteria andStartprovinceEqualTo(String value) {
            addCriterion("startProvince =", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotEqualTo(String value) {
            addCriterion("startProvince <>", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceGreaterThan(String value) {
            addCriterion("startProvince >", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("startProvince >=", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceLessThan(String value) {
            addCriterion("startProvince <", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceLessThanOrEqualTo(String value) {
            addCriterion("startProvince <=", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceLike(String value) {
            addCriterion("startProvince like", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotLike(String value) {
            addCriterion("startProvince not like", value, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceIn(List<String> values) {
            addCriterion("startProvince in", values, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotIn(List<String> values) {
            addCriterion("startProvince not in", values, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceBetween(String value1, String value2) {
            addCriterion("startProvince between", value1, value2, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartprovinceNotBetween(String value1, String value2) {
            addCriterion("startProvince not between", value1, value2, "startprovince");
            return (Criteria) this;
        }

        public Criteria andStartcityIsNull() {
            addCriterion("startCity is null");
            return (Criteria) this;
        }

        public Criteria andStartcityIsNotNull() {
            addCriterion("startCity is not null");
            return (Criteria) this;
        }

        public Criteria andStartcityEqualTo(String value) {
            addCriterion("startCity =", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotEqualTo(String value) {
            addCriterion("startCity <>", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityGreaterThan(String value) {
            addCriterion("startCity >", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityGreaterThanOrEqualTo(String value) {
            addCriterion("startCity >=", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLessThan(String value) {
            addCriterion("startCity <", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLessThanOrEqualTo(String value) {
            addCriterion("startCity <=", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityLike(String value) {
            addCriterion("startCity like", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotLike(String value) {
            addCriterion("startCity not like", value, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityIn(List<String> values) {
            addCriterion("startCity in", values, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotIn(List<String> values) {
            addCriterion("startCity not in", values, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityBetween(String value1, String value2) {
            addCriterion("startCity between", value1, value2, "startcity");
            return (Criteria) this;
        }

        public Criteria andStartcityNotBetween(String value1, String value2) {
            addCriterion("startCity not between", value1, value2, "startcity");
            return (Criteria) this;
        }

        public Criteria andEndprovinceIsNull() {
            addCriterion("endProvince is null");
            return (Criteria) this;
        }

        public Criteria andEndprovinceIsNotNull() {
            addCriterion("endProvince is not null");
            return (Criteria) this;
        }

        public Criteria andEndprovinceEqualTo(String value) {
            addCriterion("endProvince =", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotEqualTo(String value) {
            addCriterion("endProvince <>", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceGreaterThan(String value) {
            addCriterion("endProvince >", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("endProvince >=", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceLessThan(String value) {
            addCriterion("endProvince <", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceLessThanOrEqualTo(String value) {
            addCriterion("endProvince <=", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceLike(String value) {
            addCriterion("endProvince like", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotLike(String value) {
            addCriterion("endProvince not like", value, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceIn(List<String> values) {
            addCriterion("endProvince in", values, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotIn(List<String> values) {
            addCriterion("endProvince not in", values, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceBetween(String value1, String value2) {
            addCriterion("endProvince between", value1, value2, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndprovinceNotBetween(String value1, String value2) {
            addCriterion("endProvince not between", value1, value2, "endprovince");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNull() {
            addCriterion("endCity is null");
            return (Criteria) this;
        }

        public Criteria andEndcityIsNotNull() {
            addCriterion("endCity is not null");
            return (Criteria) this;
        }

        public Criteria andEndcityEqualTo(String value) {
            addCriterion("endCity =", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotEqualTo(String value) {
            addCriterion("endCity <>", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThan(String value) {
            addCriterion("endCity >", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityGreaterThanOrEqualTo(String value) {
            addCriterion("endCity >=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThan(String value) {
            addCriterion("endCity <", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLessThanOrEqualTo(String value) {
            addCriterion("endCity <=", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityLike(String value) {
            addCriterion("endCity like", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotLike(String value) {
            addCriterion("endCity not like", value, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityIn(List<String> values) {
            addCriterion("endCity in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotIn(List<String> values) {
            addCriterion("endCity not in", values, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityBetween(String value1, String value2) {
            addCriterion("endCity between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andEndcityNotBetween(String value1, String value2) {
            addCriterion("endCity not between", value1, value2, "endcity");
            return (Criteria) this;
        }

        public Criteria andMidprovinceIsNull() {
            addCriterion("midProvince is null");
            return (Criteria) this;
        }

        public Criteria andMidprovinceIsNotNull() {
            addCriterion("midProvince is not null");
            return (Criteria) this;
        }

        public Criteria andMidprovinceEqualTo(String value) {
            addCriterion("midProvince =", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceNotEqualTo(String value) {
            addCriterion("midProvince <>", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceGreaterThan(String value) {
            addCriterion("midProvince >", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("midProvince >=", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceLessThan(String value) {
            addCriterion("midProvince <", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceLessThanOrEqualTo(String value) {
            addCriterion("midProvince <=", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceLike(String value) {
            addCriterion("midProvince like", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceNotLike(String value) {
            addCriterion("midProvince not like", value, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceIn(List<String> values) {
            addCriterion("midProvince in", values, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceNotIn(List<String> values) {
            addCriterion("midProvince not in", values, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceBetween(String value1, String value2) {
            addCriterion("midProvince between", value1, value2, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidprovinceNotBetween(String value1, String value2) {
            addCriterion("midProvince not between", value1, value2, "midprovince");
            return (Criteria) this;
        }

        public Criteria andMidcityIsNull() {
            addCriterion("midCity is null");
            return (Criteria) this;
        }

        public Criteria andMidcityIsNotNull() {
            addCriterion("midCity is not null");
            return (Criteria) this;
        }

        public Criteria andMidcityEqualTo(String value) {
            addCriterion("midCity =", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityNotEqualTo(String value) {
            addCriterion("midCity <>", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityGreaterThan(String value) {
            addCriterion("midCity >", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityGreaterThanOrEqualTo(String value) {
            addCriterion("midCity >=", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityLessThan(String value) {
            addCriterion("midCity <", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityLessThanOrEqualTo(String value) {
            addCriterion("midCity <=", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityLike(String value) {
            addCriterion("midCity like", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityNotLike(String value) {
            addCriterion("midCity not like", value, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityIn(List<String> values) {
            addCriterion("midCity in", values, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityNotIn(List<String> values) {
            addCriterion("midCity not in", values, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityBetween(String value1, String value2) {
            addCriterion("midCity between", value1, value2, "midcity");
            return (Criteria) this;
        }

        public Criteria andMidcityNotBetween(String value1, String value2) {
            addCriterion("midCity not between", value1, value2, "midcity");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceIsNull() {
            addCriterion("trdnsportPrice is null");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceIsNotNull() {
            addCriterion("trdnsportPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceEqualTo(BigDecimal value) {
            addCriterion("trdnsportPrice =", value, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceNotEqualTo(BigDecimal value) {
            addCriterion("trdnsportPrice <>", value, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceGreaterThan(BigDecimal value) {
            addCriterion("trdnsportPrice >", value, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trdnsportPrice >=", value, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceLessThan(BigDecimal value) {
            addCriterion("trdnsportPrice <", value, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trdnsportPrice <=", value, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceIn(List<BigDecimal> values) {
            addCriterion("trdnsportPrice in", values, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceNotIn(List<BigDecimal> values) {
            addCriterion("trdnsportPrice not in", values, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trdnsportPrice between", value1, value2, "trdnsportprice");
            return (Criteria) this;
        }

        public Criteria andTrdnsportpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trdnsportPrice not between", value1, value2, "trdnsportprice");
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
     * This class corresponds to the database table route
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
     * This class corresponds to the database table route
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