package com.foreset.designpatterns.factoryMethod;

/**
 * Created by zxl on 2016/6/27 0027 11:21.
 */
class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

    @Override
    public Product factoryMethod(String args) {
        return new ConcreteProduct();
    }

}
