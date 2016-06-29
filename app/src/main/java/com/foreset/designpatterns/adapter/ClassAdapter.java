package com.foreset.designpatterns.adapter;

/**
 * Created by zxl on 2016/6/28 0028 14:21.
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specialRequest();
    }
}
