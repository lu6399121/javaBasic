package com.foreset.designpatterns.simplefactory;

/**
 * Created by zxl on 2016/6/27 0027 11:07.
 */
public class SimpleFactoryTest {
    public static void main(String args[]) {
        Product product;
        product = Factory.getPrduct("A");
        if (product != null) {
            product.methodSame();
            product.methodDiff();
        }
    }
}
