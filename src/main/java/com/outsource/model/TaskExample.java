package com.outsource.model;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
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
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineIsNull() {
            addCriterion("task_outline is null");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineIsNotNull() {
            addCriterion("task_outline is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineEqualTo(String value) {
            addCriterion("task_outline =", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineNotEqualTo(String value) {
            addCriterion("task_outline <>", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineGreaterThan(String value) {
            addCriterion("task_outline >", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("task_outline >=", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineLessThan(String value) {
            addCriterion("task_outline <", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineLessThanOrEqualTo(String value) {
            addCriterion("task_outline <=", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineLike(String value) {
            addCriterion("task_outline like", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineNotLike(String value) {
            addCriterion("task_outline not like", value, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineIn(List<String> values) {
            addCriterion("task_outline in", values, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineNotIn(List<String> values) {
            addCriterion("task_outline not in", values, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineBetween(String value1, String value2) {
            addCriterion("task_outline between", value1, value2, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskOutlineNotBetween(String value1, String value2) {
            addCriterion("task_outline not between", value1, value2, "taskOutline");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNull() {
            addCriterion("task_desc is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescIsNotNull() {
            addCriterion("task_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescEqualTo(String value) {
            addCriterion("task_desc =", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotEqualTo(String value) {
            addCriterion("task_desc <>", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThan(String value) {
            addCriterion("task_desc >", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescGreaterThanOrEqualTo(String value) {
            addCriterion("task_desc >=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThan(String value) {
            addCriterion("task_desc <", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLessThanOrEqualTo(String value) {
            addCriterion("task_desc <=", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescLike(String value) {
            addCriterion("task_desc like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotLike(String value) {
            addCriterion("task_desc not like", value, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescIn(List<String> values) {
            addCriterion("task_desc in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotIn(List<String> values) {
            addCriterion("task_desc not in", values, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescBetween(String value1, String value2) {
            addCriterion("task_desc between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskDescNotBetween(String value1, String value2) {
            addCriterion("task_desc not between", value1, value2, "taskDesc");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(Integer value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(Integer value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(Integer value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(Integer value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(Integer value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<Integer> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<Integer> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(Integer value1, Integer value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(Integer value1, Integer value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorIsNull() {
            addCriterion("task_executor is null");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorIsNotNull() {
            addCriterion("task_executor is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorEqualTo(String value) {
            addCriterion("task_executor =", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorNotEqualTo(String value) {
            addCriterion("task_executor <>", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorGreaterThan(String value) {
            addCriterion("task_executor >", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("task_executor >=", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorLessThan(String value) {
            addCriterion("task_executor <", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorLessThanOrEqualTo(String value) {
            addCriterion("task_executor <=", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorLike(String value) {
            addCriterion("task_executor like", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorNotLike(String value) {
            addCriterion("task_executor not like", value, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorIn(List<String> values) {
            addCriterion("task_executor in", values, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorNotIn(List<String> values) {
            addCriterion("task_executor not in", values, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorBetween(String value1, String value2) {
            addCriterion("task_executor between", value1, value2, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskExecutorNotBetween(String value1, String value2) {
            addCriterion("task_executor not between", value1, value2, "taskExecutor");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidIsNull() {
            addCriterion("task_projectid is null");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidIsNotNull() {
            addCriterion("task_projectid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidEqualTo(Integer value) {
            addCriterion("task_projectid =", value, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidNotEqualTo(Integer value) {
            addCriterion("task_projectid <>", value, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidGreaterThan(Integer value) {
            addCriterion("task_projectid >", value, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_projectid >=", value, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidLessThan(Integer value) {
            addCriterion("task_projectid <", value, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("task_projectid <=", value, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidIn(List<Integer> values) {
            addCriterion("task_projectid in", values, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidNotIn(List<Integer> values) {
            addCriterion("task_projectid not in", values, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidBetween(Integer value1, Integer value2) {
            addCriterion("task_projectid between", value1, value2, "taskProjectid");
            return (Criteria) this;
        }

        public Criteria andTaskProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("task_projectid not between", value1, value2, "taskProjectid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
     *
     * @mbggenerated do_not_delete_during_merge Thu Feb 01 22:31:09 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
     *
     * @mbggenerated Thu Feb 01 22:31:09 CST 2018
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