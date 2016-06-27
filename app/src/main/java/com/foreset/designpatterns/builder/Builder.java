package com.foreset.designpatterns.builder;

/**
 * Created by zhijian on 2016/6/27.
 */
abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }

    public Product construct() {
        this.buildPartA();
        this.buildPartB();
        this.buildPartC();
        return product;
    }
}
