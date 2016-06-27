package com.foreset.designpatterns.abstractFactory;

/**
 * Created by zxl on 2016/6/27 0027 13:55.
 */
public class AbstractFactoryTest {
    public static void main(String args[]) {
        AbstractFactory abstractFactory = new ConcreteFactory();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
    }
}
