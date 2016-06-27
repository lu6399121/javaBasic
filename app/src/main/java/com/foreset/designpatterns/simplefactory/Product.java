package com.foreset.designpatterns.simplefactory;

/**
 * Created by zxl on 2016/6/27 0027 11:05.
 */
abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame() {
        //公共方法的实现
        System.out.println("Product.methodSame()");
    }
    //声明抽象业务方法
    public abstract void methodDiff();
}
