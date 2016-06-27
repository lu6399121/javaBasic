package com.foreset.designpatterns.abstractFactory;

/**
 * Created by zxl on 2016/6/27 0027 13:54.
 */
public class ConcreteFactory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA();
}

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB();
    }
}
