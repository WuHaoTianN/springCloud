package com.Harry.springboot.config.common.base.baseTools;

import com.Harry.springboot.config.common.allEnum.JustAgainst;

/**
 * @Descirption
 * @Author Harry
 * 2020年 05月 29日
 */
public class Queue {

    private String queueColName;

    private JustAgainst justAgainst;

    public Queue(String queueColName, JustAgainst justAgainst){
        this.queueColName = queueColName;
        this.justAgainst = justAgainst;
    }

    public String getQueueColName() {
        return queueColName;
    }

    public void setQueueColName(String queueColName) {
        this.queueColName = queueColName;
    }

    public JustAgainst getJustAgainst() {
        return justAgainst;
    }

    public void setJustAgainst(JustAgainst justAgainst) {
        this.justAgainst = justAgainst;
    }
}
