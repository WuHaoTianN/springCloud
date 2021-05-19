package com.Harry.springboot.config.common.base.baseEntity;

import com.Harry.springboot.config.common.base.baseTools.TypeTransform;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @Descirption 顶级实体父类
 * @Author Harry
 * 2020年5月28日
 */
public class BaseEntity extends HashMap<String,Object> implements Serializable {

    public <T> T getV(String key){
        return (T) this.get(key);
    }

    public void setKV(String key, Object val){
        this.put(key, val);
    }

    public <T> T getVAssignType(String key, TypeTransform typeTransform){
        Object o = this.get(key);
        return (T) typeTransform.transform(o);
    }

}
