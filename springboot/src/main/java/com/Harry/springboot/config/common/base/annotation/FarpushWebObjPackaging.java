package com.Harry.springboot.config.common.base.annotation;

import com.Harry.springboot.config.common.base.baseEntity.BaseEntity;

import java.lang.annotation.*;

/**
 * @Descirption web对象解析封装 注解
 * @Author Harry
 * 2020年 05月 29日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FarpushWebObjPackaging {

    /**
      * @Description: web对象解析封装开关
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    boolean objPackaging() default false;

    /**
      * @Description:  web对象解析封装 对象class
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    Class<? extends BaseEntity>[] objType() default BaseEntity.class;
    
    /**
      * @Description: 对象变量类型转换器
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    boolean typeTransition()default false;
    
    /**
      * @Description: 查询解析
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    boolean search()default false;

    /**
      * @Description: 分页开关
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    boolean limit() default false;

    /**
      * @Description: 默认分页数
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    int limitNum() default 10;

    /**
      * @Description: 分页对象
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    Class<? extends BaseEntity> limitObject()default BaseEntity.class;
}
