package com.Harry.springboot.config.common.base.baseTools;

/**
 * @Descirption 页码类
 * @Author Harry
 * 2020年 05月 29日
 */
public class Limit {

    private Integer startNumber;

    private Integer endNumber;

    public Limit(Integer startNumber,Integer endNumber){
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public Integer getStartNumber(){
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }
}
