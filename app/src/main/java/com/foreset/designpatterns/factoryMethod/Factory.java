package com.foreset.designpatterns.factoryMethod;

/**
 * Created by zxl on 2016/6/27 0027 11:19.
 */
interface Factory {
    public Product factoryMethod();
    //重载方法
    public Product factoryMethod(String args);
}
