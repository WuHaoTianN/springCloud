package com.Harry.springboot.config.common.base.baseTools;

import java.io.Serializable;

/**
 * @Descirption
 * @Author Harry
 * 2020年 05月 29日
 */
public class Query implements Serializable {

    private static final long serialVersionUID = -3022837028149841421L;

    private String col;

    private String operation;

    private Object val;

    public Query(String col, String operation, Object val){
        this.col = col;
        this.operation = operation;
        this.val = val;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
