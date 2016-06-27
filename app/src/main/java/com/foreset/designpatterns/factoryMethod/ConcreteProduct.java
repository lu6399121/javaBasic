package com.foreset.designpatterns.factoryMethod;

/**
 * Created by zxl on 2016/6/27 0027 11:06.
 */
class ConcreteProduct extends Product {
    //实现业务方法
    @Override
    public void methodDiff() {
        //业务方法的实现
        System.out.println("ConcreteProduct.methodDiff()");
    }
}
