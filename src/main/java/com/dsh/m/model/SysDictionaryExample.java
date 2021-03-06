package com.dsh.m.model;

import java.util.ArrayList;
import java.util.List;

public class SysDictionaryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public SysDictionaryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTypeidIsNull() {
			addCriterion("typeid is null");
			return (Criteria) this;
		}

		public Criteria andTypeidIsNotNull() {
			addCriterion("typeid is not null");
			return (Criteria) this;
		}

		public Criteria andTypeidEqualTo(Integer value) {
			addCriterion("typeid =", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidNotEqualTo(Integer value) {
			addCriterion("typeid <>", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidGreaterThan(Integer value) {
			addCriterion("typeid >", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("typeid >=", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidLessThan(Integer value) {
			addCriterion("typeid <", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidLessThanOrEqualTo(Integer value) {
			addCriterion("typeid <=", value, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidIn(List<Integer> values) {
			addCriterion("typeid in", values, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidNotIn(List<Integer> values) {
			addCriterion("typeid not in", values, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidBetween(Integer value1, Integer value2) {
			addCriterion("typeid between", value1, value2, "typeid");
			return (Criteria) this;
		}

		public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
			addCriterion("typeid not between", value1, value2, "typeid");
			return (Criteria) this;
		}

		public Criteria andDictypeIsNull() {
			addCriterion("dictype is null");
			return (Criteria) this;
		}

		public Criteria andDictypeIsNotNull() {
			addCriterion("dictype is not null");
			return (Criteria) this;
		}

		public Criteria andDictypeEqualTo(String value) {
			addCriterion("dictype =", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeNotEqualTo(String value) {
			addCriterion("dictype <>", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeGreaterThan(String value) {
			addCriterion("dictype >", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeGreaterThanOrEqualTo(String value) {
			addCriterion("dictype >=", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeLessThan(String value) {
			addCriterion("dictype <", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeLessThanOrEqualTo(String value) {
			addCriterion("dictype <=", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeLike(String value) {
			addCriterion("dictype like", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeNotLike(String value) {
			addCriterion("dictype not like", value, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeIn(List<String> values) {
			addCriterion("dictype in", values, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeNotIn(List<String> values) {
			addCriterion("dictype not in", values, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeBetween(String value1, String value2) {
			addCriterion("dictype between", value1, value2, "dictype");
			return (Criteria) this;
		}

		public Criteria andDictypeNotBetween(String value1, String value2) {
			addCriterion("dictype not between", value1, value2, "dictype");
			return (Criteria) this;
		}

		public Criteria andDicnumIsNull() {
			addCriterion("dicnum is null");
			return (Criteria) this;
		}

		public Criteria andDicnumIsNotNull() {
			addCriterion("dicnum is not null");
			return (Criteria) this;
		}

		public Criteria andDicnumEqualTo(String value) {
			addCriterion("dicnum =", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumNotEqualTo(String value) {
			addCriterion("dicnum <>", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumGreaterThan(String value) {
			addCriterion("dicnum >", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumGreaterThanOrEqualTo(String value) {
			addCriterion("dicnum >=", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumLessThan(String value) {
			addCriterion("dicnum <", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumLessThanOrEqualTo(String value) {
			addCriterion("dicnum <=", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumLike(String value) {
			addCriterion("dicnum like", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumNotLike(String value) {
			addCriterion("dicnum not like", value, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumIn(List<String> values) {
			addCriterion("dicnum in", values, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumNotIn(List<String> values) {
			addCriterion("dicnum not in", values, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumBetween(String value1, String value2) {
			addCriterion("dicnum between", value1, value2, "dicnum");
			return (Criteria) this;
		}

		public Criteria andDicnumNotBetween(String value1, String value2) {
			addCriterion("dicnum not between", value1, value2, "dicnum");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andMemoIsNull() {
			addCriterion("memo is null");
			return (Criteria) this;
		}

		public Criteria andMemoIsNotNull() {
			addCriterion("memo is not null");
			return (Criteria) this;
		}

		public Criteria andMemoEqualTo(String value) {
			addCriterion("memo =", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotEqualTo(String value) {
			addCriterion("memo <>", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThan(String value) {
			addCriterion("memo >", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThanOrEqualTo(String value) {
			addCriterion("memo >=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLessThan(String value) {
			addCriterion("memo <", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLessThanOrEqualTo(String value) {
			addCriterion("memo <=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLike(String value) {
			addCriterion("memo like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotLike(String value) {
			addCriterion("memo not like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoIn(List<String> values) {
			addCriterion("memo in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotIn(List<String> values) {
			addCriterion("memo not in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoBetween(String value1, String value2) {
			addCriterion("memo between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotBetween(String value1, String value2) {
			addCriterion("memo not between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andTsIsNull() {
			addCriterion("ts is null");
			return (Criteria) this;
		}

		public Criteria andTsIsNotNull() {
			addCriterion("ts is not null");
			return (Criteria) this;
		}

		public Criteria andTsEqualTo(String value) {
			addCriterion("ts =", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotEqualTo(String value) {
			addCriterion("ts <>", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThan(String value) {
			addCriterion("ts >", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThanOrEqualTo(String value) {
			addCriterion("ts >=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThan(String value) {
			addCriterion("ts <", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThanOrEqualTo(String value) {
			addCriterion("ts <=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLike(String value) {
			addCriterion("ts like", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotLike(String value) {
			addCriterion("ts not like", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsIn(List<String> values) {
			addCriterion("ts in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotIn(List<String> values) {
			addCriterion("ts not in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsBetween(String value1, String value2) {
			addCriterion("ts between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotBetween(String value1, String value2) {
			addCriterion("ts not between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andDrIsNull() {
			addCriterion("dr is null");
			return (Criteria) this;
		}

		public Criteria andDrIsNotNull() {
			addCriterion("dr is not null");
			return (Criteria) this;
		}

		public Criteria andDrEqualTo(String value) {
			addCriterion("dr =", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotEqualTo(String value) {
			addCriterion("dr <>", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrGreaterThan(String value) {
			addCriterion("dr >", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrGreaterThanOrEqualTo(String value) {
			addCriterion("dr >=", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrLessThan(String value) {
			addCriterion("dr <", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrLessThanOrEqualTo(String value) {
			addCriterion("dr <=", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrLike(String value) {
			addCriterion("dr like", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotLike(String value) {
			addCriterion("dr not like", value, "dr");
			return (Criteria) this;
		}

		public Criteria andDrIn(List<String> values) {
			addCriterion("dr in", values, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotIn(List<String> values) {
			addCriterion("dr not in", values, "dr");
			return (Criteria) this;
		}

		public Criteria andDrBetween(String value1, String value2) {
			addCriterion("dr between", value1, value2, "dr");
			return (Criteria) this;
		}

		public Criteria andDrNotBetween(String value1, String value2) {
			addCriterion("dr not between", value1, value2, "dr");
			return (Criteria) this;
		}

		public Criteria andZdy1IsNull() {
			addCriterion("zdy1 is null");
			return (Criteria) this;
		}

		public Criteria andZdy1IsNotNull() {
			addCriterion("zdy1 is not null");
			return (Criteria) this;
		}

		public Criteria andZdy1EqualTo(String value) {
			addCriterion("zdy1 =", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1NotEqualTo(String value) {
			addCriterion("zdy1 <>", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1GreaterThan(String value) {
			addCriterion("zdy1 >", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1GreaterThanOrEqualTo(String value) {
			addCriterion("zdy1 >=", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1LessThan(String value) {
			addCriterion("zdy1 <", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1LessThanOrEqualTo(String value) {
			addCriterion("zdy1 <=", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1Like(String value) {
			addCriterion("zdy1 like", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1NotLike(String value) {
			addCriterion("zdy1 not like", value, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1In(List<String> values) {
			addCriterion("zdy1 in", values, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1NotIn(List<String> values) {
			addCriterion("zdy1 not in", values, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1Between(String value1, String value2) {
			addCriterion("zdy1 between", value1, value2, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy1NotBetween(String value1, String value2) {
			addCriterion("zdy1 not between", value1, value2, "zdy1");
			return (Criteria) this;
		}

		public Criteria andZdy2IsNull() {
			addCriterion("zdy2 is null");
			return (Criteria) this;
		}

		public Criteria andZdy2IsNotNull() {
			addCriterion("zdy2 is not null");
			return (Criteria) this;
		}

		public Criteria andZdy2EqualTo(String value) {
			addCriterion("zdy2 =", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2NotEqualTo(String value) {
			addCriterion("zdy2 <>", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2GreaterThan(String value) {
			addCriterion("zdy2 >", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2GreaterThanOrEqualTo(String value) {
			addCriterion("zdy2 >=", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2LessThan(String value) {
			addCriterion("zdy2 <", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2LessThanOrEqualTo(String value) {
			addCriterion("zdy2 <=", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2Like(String value) {
			addCriterion("zdy2 like", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2NotLike(String value) {
			addCriterion("zdy2 not like", value, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2In(List<String> values) {
			addCriterion("zdy2 in", values, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2NotIn(List<String> values) {
			addCriterion("zdy2 not in", values, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2Between(String value1, String value2) {
			addCriterion("zdy2 between", value1, value2, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy2NotBetween(String value1, String value2) {
			addCriterion("zdy2 not between", value1, value2, "zdy2");
			return (Criteria) this;
		}

		public Criteria andZdy3IsNull() {
			addCriterion("zdy3 is null");
			return (Criteria) this;
		}

		public Criteria andZdy3IsNotNull() {
			addCriterion("zdy3 is not null");
			return (Criteria) this;
		}

		public Criteria andZdy3EqualTo(String value) {
			addCriterion("zdy3 =", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3NotEqualTo(String value) {
			addCriterion("zdy3 <>", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3GreaterThan(String value) {
			addCriterion("zdy3 >", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3GreaterThanOrEqualTo(String value) {
			addCriterion("zdy3 >=", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3LessThan(String value) {
			addCriterion("zdy3 <", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3LessThanOrEqualTo(String value) {
			addCriterion("zdy3 <=", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3Like(String value) {
			addCriterion("zdy3 like", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3NotLike(String value) {
			addCriterion("zdy3 not like", value, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3In(List<String> values) {
			addCriterion("zdy3 in", values, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3NotIn(List<String> values) {
			addCriterion("zdy3 not in", values, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3Between(String value1, String value2) {
			addCriterion("zdy3 between", value1, value2, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy3NotBetween(String value1, String value2) {
			addCriterion("zdy3 not between", value1, value2, "zdy3");
			return (Criteria) this;
		}

		public Criteria andZdy4IsNull() {
			addCriterion("zdy4 is null");
			return (Criteria) this;
		}

		public Criteria andZdy4IsNotNull() {
			addCriterion("zdy4 is not null");
			return (Criteria) this;
		}

		public Criteria andZdy4EqualTo(String value) {
			addCriterion("zdy4 =", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4NotEqualTo(String value) {
			addCriterion("zdy4 <>", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4GreaterThan(String value) {
			addCriterion("zdy4 >", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4GreaterThanOrEqualTo(String value) {
			addCriterion("zdy4 >=", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4LessThan(String value) {
			addCriterion("zdy4 <", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4LessThanOrEqualTo(String value) {
			addCriterion("zdy4 <=", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4Like(String value) {
			addCriterion("zdy4 like", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4NotLike(String value) {
			addCriterion("zdy4 not like", value, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4In(List<String> values) {
			addCriterion("zdy4 in", values, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4NotIn(List<String> values) {
			addCriterion("zdy4 not in", values, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4Between(String value1, String value2) {
			addCriterion("zdy4 between", value1, value2, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy4NotBetween(String value1, String value2) {
			addCriterion("zdy4 not between", value1, value2, "zdy4");
			return (Criteria) this;
		}

		public Criteria andZdy5IsNull() {
			addCriterion("zdy5 is null");
			return (Criteria) this;
		}

		public Criteria andZdy5IsNotNull() {
			addCriterion("zdy5 is not null");
			return (Criteria) this;
		}

		public Criteria andZdy5EqualTo(String value) {
			addCriterion("zdy5 =", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5NotEqualTo(String value) {
			addCriterion("zdy5 <>", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5GreaterThan(String value) {
			addCriterion("zdy5 >", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5GreaterThanOrEqualTo(String value) {
			addCriterion("zdy5 >=", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5LessThan(String value) {
			addCriterion("zdy5 <", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5LessThanOrEqualTo(String value) {
			addCriterion("zdy5 <=", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5Like(String value) {
			addCriterion("zdy5 like", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5NotLike(String value) {
			addCriterion("zdy5 not like", value, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5In(List<String> values) {
			addCriterion("zdy5 in", values, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5NotIn(List<String> values) {
			addCriterion("zdy5 not in", values, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5Between(String value1, String value2) {
			addCriterion("zdy5 between", value1, value2, "zdy5");
			return (Criteria) this;
		}

		public Criteria andZdy5NotBetween(String value1, String value2) {
			addCriterion("zdy5 not between", value1, value2, "zdy5");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sys_dictionary
	 * @mbggenerated  Thu Oct 22 14:19:04 CST 2015
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_dictionary
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 17 13:34:44 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}