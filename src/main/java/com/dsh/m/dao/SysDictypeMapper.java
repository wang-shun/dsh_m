package com.dsh.m.dao;

import com.dsh.m.model.SysDictype;
import com.dsh.m.model.SysDictypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int countByExample(SysDictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int deleteByExample(SysDictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int insert(SysDictype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int insertSelective(SysDictype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    List<SysDictype> selectByExample(SysDictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    SysDictype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByExampleSelective(@Param("record") SysDictype record, @Param("example") SysDictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByExample(@Param("record") SysDictype record, @Param("example") SysDictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByPrimaryKeySelective(SysDictype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictype
     *
     * @mbggenerated Wed Jun 17 13:34:44 CST 2015
     */
    int updateByPrimaryKey(SysDictype record);
}