package com.foreset.designpatterns.factoryMethod;

/**
 * Created by zxl on 2016/6/27 0027 11:21.
 */
public class FactoryMethodTest {
    public static void main(String args[]) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.methodSame();
        product.methodDiff();
    }
}
