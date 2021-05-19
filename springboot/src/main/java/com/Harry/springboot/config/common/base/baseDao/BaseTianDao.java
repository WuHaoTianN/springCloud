package com.Harry.springboot.config.common.base.baseDao;

import com.Harry.springboot.config.common.base.baseEntity.BaseEntity;
import com.Harry.springboot.config.common.base.baseTools.Limit;
import com.Harry.springboot.config.common.base.baseTools.Query;
import com.Harry.springboot.config.common.base.baseTools.Queue;

import java.util.List;

/**
 * @Descirption BaseDao层封装的公共方法
 * @Author Harry
 * 2020年 05月 29日
 */
public interface BaseTianDao {

    /**
      * @Description: 通用新增对象
      * @Date: 2020/5/29 16:49
      * @Author: Harry
      * @Param: t
      * @return: 
      */ 
    <T extends BaseEntity> Integer insert(T t);

    /**
      * @Description: 通用根据id删除
      * @Date: 2020/5/29 16:50
      * @Author: Harry
      * @Param: primaryKey
      * @return: 
      */ 
    Integer deleteByPrimaryKey(Class<? extends BaseEntity> clzz,Object primaryKey);

    /**
      * @Description: 通用根据条件删除
      * @Date: 2020/5/29 16:56
      * @Author: Harry
      * @Param: querys
      * @return: 
      */ 
    Integer deleteByQuerys(Class<? extends BaseEntity> clzz, Query... querys);

    /**
      * @Description: 通用根据条件删除
      * @Date: 2020/5/29 16:57
      * @Author: Harry
      * @Param: t
      * @return: 
      */ 
    <T extends BaseEntity> Integer delete(T t);

    /**
      * @Description: 通用修改
      * @Date: 2020/5/29 16:59
      * @Author: Harry
      * @Param: t
      * @return: 
      */ 
    <T extends BaseEntity> Integer update(T t);

    /**
      * @Description: 根据条件修改
      * @Date: 2020/5/29 17:01
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    <T extends BaseEntity> Integer updateByQuerys(T t, Query... querys);

    /**
      * @Description: 根据id查找
      * @Date: 2020/5/29 17:02
      * @Author: Harry
      * @Param: primaryKey
      * @return: 
      */ 
    <T extends BaseEntity> T selectByPrimaryKey(Class<? extends BaseEntity> clzz, Boolean typeTransition, Object primaryKey);


    /**
      * @Description: 根据条件查找
      * @Date: 2020/5/29 17:04
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    <T extends BaseEntity> List<T> selectByQuery(Class<? extends BaseEntity> clzz, Boolean typeTransition, Query... querys);

    /**
      * @Description: 根据条件，分页，排序查找
      * @Date: 2020/5/29 17:05
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    <T extends BaseEntity> List<T> selectByQueryLimit(Class<? extends BaseEntity> clzz, Queue queue, Limit limit, Boolean typeTransition, Query... querys);

}
