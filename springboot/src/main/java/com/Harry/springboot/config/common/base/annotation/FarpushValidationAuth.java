package com.Harry.springboot.config.common.base.annotation;

import java.lang.annotation.*;

/**
 * @Descirption
 * @Author Harry
 * 2020年 05月 29日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FarpushValidationAuth {

    String[] authId();

}
