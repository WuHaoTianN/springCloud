package com.Harry.springboot.config.common.base.baseTools;

/**
 * @Descirption
 * @Author Harry
 * 2020年 05月 29日
 */
public interface TypeTransform {

    <T> T transform(Object o);

}
