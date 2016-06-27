package com.foreset.designpatterns.strategy;

/**
 * 环境类
 * Created by zxl on 2016/6/27 0027 10:39.
 */
public class Context {
    public AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        this.strategy.algorithm();
    }
}
