package com.foreset.designpatterns.prototype;

/**
 * 浅复制
 * Created by zhijian on 2016/6/27.
 */
public class Prototype implements Cloneable {
    public Prototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Not support cloneable");
        }
        return (Prototype) object;
    }
}
