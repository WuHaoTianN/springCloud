package com.Harry.springboot.config.common.base.annotation;

import java.lang.annotation.*;

/**
 * @Descirption 实体注解
 * @Author Harry
 * 2020年 05月 29日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FarpushSqlData {

    /**
     * 表名
     */
    String tableName();

    /**
     * 主键名
     */
    String keyName();

}
