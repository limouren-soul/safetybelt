package cn.lsk.safetybelt.po;

import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table device
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public DeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
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
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table device
     *
     * @mbggenerated
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andState0IsNull() {
            addCriterion("state0 is null");
            return (Criteria) this;
        }

        public Criteria andState0IsNotNull() {
            addCriterion("state0 is not null");
            return (Criteria) this;
        }

        public Criteria andState0EqualTo(Integer value) {
            addCriterion("state0 =", value, "state0");
            return (Criteria) this;
        }

        public Criteria andState0NotEqualTo(Integer value) {
            addCriterion("state0 <>", value, "state0");
            return (Criteria) this;
        }

        public Criteria andState0GreaterThan(Integer value) {
            addCriterion("state0 >", value, "state0");
            return (Criteria) this;
        }

        public Criteria andState0GreaterThanOrEqualTo(Integer value) {
            addCriterion("state0 >=", value, "state0");
            return (Criteria) this;
        }

        public Criteria andState0LessThan(Integer value) {
            addCriterion("state0 <", value, "state0");
            return (Criteria) this;
        }

        public Criteria andState0LessThanOrEqualTo(Integer value) {
            addCriterion("state0 <=", value, "state0");
            return (Criteria) this;
        }

        public Criteria andState0In(List<Integer> values) {
            addCriterion("state0 in", values, "state0");
            return (Criteria) this;
        }

        public Criteria andState0NotIn(List<Integer> values) {
            addCriterion("state0 not in", values, "state0");
            return (Criteria) this;
        }

        public Criteria andState0Between(Integer value1, Integer value2) {
            addCriterion("state0 between", value1, value2, "state0");
            return (Criteria) this;
        }

        public Criteria andState0NotBetween(Integer value1, Integer value2) {
            addCriterion("state0 not between", value1, value2, "state0");
            return (Criteria) this;
        }

        public Criteria andState1IsNull() {
            addCriterion("state1 is null");
            return (Criteria) this;
        }

        public Criteria andState1IsNotNull() {
            addCriterion("state1 is not null");
            return (Criteria) this;
        }

        public Criteria andState1EqualTo(Integer value) {
            addCriterion("state1 =", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1NotEqualTo(Integer value) {
            addCriterion("state1 <>", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1GreaterThan(Integer value) {
            addCriterion("state1 >", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1GreaterThanOrEqualTo(Integer value) {
            addCriterion("state1 >=", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1LessThan(Integer value) {
            addCriterion("state1 <", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1LessThanOrEqualTo(Integer value) {
            addCriterion("state1 <=", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1In(List<Integer> values) {
            addCriterion("state1 in", values, "state1");
            return (Criteria) this;
        }

        public Criteria andState1NotIn(List<Integer> values) {
            addCriterion("state1 not in", values, "state1");
            return (Criteria) this;
        }

        public Criteria andState1Between(Integer value1, Integer value2) {
            addCriterion("state1 between", value1, value2, "state1");
            return (Criteria) this;
        }

        public Criteria andState1NotBetween(Integer value1, Integer value2) {
            addCriterion("state1 not between", value1, value2, "state1");
            return (Criteria) this;
        }

        public Criteria andState2IsNull() {
            addCriterion("state2 is null");
            return (Criteria) this;
        }

        public Criteria andState2IsNotNull() {
            addCriterion("state2 is not null");
            return (Criteria) this;
        }

        public Criteria andState2EqualTo(Integer value) {
            addCriterion("state2 =", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotEqualTo(Integer value) {
            addCriterion("state2 <>", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2GreaterThan(Integer value) {
            addCriterion("state2 >", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2GreaterThanOrEqualTo(Integer value) {
            addCriterion("state2 >=", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2LessThan(Integer value) {
            addCriterion("state2 <", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2LessThanOrEqualTo(Integer value) {
            addCriterion("state2 <=", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2In(List<Integer> values) {
            addCriterion("state2 in", values, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotIn(List<Integer> values) {
            addCriterion("state2 not in", values, "state2");
            return (Criteria) this;
        }

        public Criteria andState2Between(Integer value1, Integer value2) {
            addCriterion("state2 between", value1, value2, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotBetween(Integer value1, Integer value2) {
            addCriterion("state2 not between", value1, value2, "state2");
            return (Criteria) this;
        }

        public Criteria andState3IsNull() {
            addCriterion("state3 is null");
            return (Criteria) this;
        }

        public Criteria andState3IsNotNull() {
            addCriterion("state3 is not null");
            return (Criteria) this;
        }

        public Criteria andState3EqualTo(Integer value) {
            addCriterion("state3 =", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3NotEqualTo(Integer value) {
            addCriterion("state3 <>", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3GreaterThan(Integer value) {
            addCriterion("state3 >", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3GreaterThanOrEqualTo(Integer value) {
            addCriterion("state3 >=", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3LessThan(Integer value) {
            addCriterion("state3 <", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3LessThanOrEqualTo(Integer value) {
            addCriterion("state3 <=", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3In(List<Integer> values) {
            addCriterion("state3 in", values, "state3");
            return (Criteria) this;
        }

        public Criteria andState3NotIn(List<Integer> values) {
            addCriterion("state3 not in", values, "state3");
            return (Criteria) this;
        }

        public Criteria andState3Between(Integer value1, Integer value2) {
            addCriterion("state3 between", value1, value2, "state3");
            return (Criteria) this;
        }

        public Criteria andState3NotBetween(Integer value1, Integer value2) {
            addCriterion("state3 not between", value1, value2, "state3");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Double value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Double value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Double value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Double value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Double value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Double value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Double> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Double> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Double value1, Double value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Double value1, Double value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table device
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table device
     *
     * @mbggenerated
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