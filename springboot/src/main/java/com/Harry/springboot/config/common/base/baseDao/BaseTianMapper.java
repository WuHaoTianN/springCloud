package com.Harry.springboot.config.common.base.baseDao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Descirption BaseMapper封装接口
 * @Author Harry
 * 2020年 05月 29日
 */
public interface BaseTianMapper<U> {

    @Select("select column_name from information_schema.columns where table_name = #{tableName }")
    Set<String> selectColNames(@Param("tableName")String tableName);

    @Select("select column_name,data_type from information_schema.columns where table_name = #{tableName }")
    List<Map<String,String>> selelctColNameVals(@Param("tableName")String tableName);

    Integer insert(@Param("param") Map<String,Object> param);

    Integer delete(@Param("param")Map<String,Object> param);

    Integer update(@Param("param")Map<String,Object> param);

    List<Map<String,Object>> selectByQuery(@Param("param")Map<String,Object> param);

    Integer selectCountByQuery(@Param("param")Map<String,Object> param);

}
