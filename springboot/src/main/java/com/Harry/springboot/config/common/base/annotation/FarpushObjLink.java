package com.Harry.springboot.config.common.base.annotation;

import java.lang.annotation.*;

/**
 * @Descirption 对象关联
 * @Author Harry
 * 2020年 05月 29日
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FarpushObjLink {

    String relovanceField();

    String targetRelevanceField();

}
