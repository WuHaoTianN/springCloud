package com.Harry.springboot.config.common.allEnum;

/**
 * @Descirption
 * @Author Harry
 * 2020年 05月 29日
 */
public enum JustAgainst {

    ASC("asc"),DESC("desc");

    private String value;

    private JustAgainst(String val){
        this.value = val;
    }

    public String getValue(){
        return this.value;
    }

}
