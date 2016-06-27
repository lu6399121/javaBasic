package com.foreset.designpatterns.simplefactory;

/**
 * 静态工厂方法
 * Created by zxl on 2016/6/27 0027 11:06.
 */
class Factory {
    public static Product getPrduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }
        return  product;

    }



}
