package com.foreset.designpatterns.adapter;

/**
 * Created by zxl on 2016/6/28 0028 14:12.
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        if (this.adaptee != null) {
            this.adaptee.specialRequest();
        }
    }
}
