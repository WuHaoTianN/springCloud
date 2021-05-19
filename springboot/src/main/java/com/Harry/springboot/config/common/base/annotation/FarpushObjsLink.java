package com.Harry.springboot.config.common.base.annotation;

import com.Harry.springboot.config.common.base.baseEntity.BaseEntity;

import java.lang.annotation.*;

/**
 * @Descirption 对象关联
 * @Author Harry
 * 2020年 05月 29日
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FarpushObjsLink {

    String relevanceField();

    String targetRelevanceField();

    Class<? extends BaseEntity> targetRelevanceClass();

}
