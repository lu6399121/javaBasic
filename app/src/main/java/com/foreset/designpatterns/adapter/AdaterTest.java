package com.foreset.designpatterns.adapter;

/**
 * Created by zxl on 2016/6/28 0028 14:14.
 */
public class AdaterTest {
    public static void main(String args[]) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
