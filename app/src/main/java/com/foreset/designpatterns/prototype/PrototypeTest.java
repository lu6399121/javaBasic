package com.foreset.designpatterns.prototype;

/**
 * Created by zhijian on 2016/6/27.
 */
public class PrototypeTest {
    public static void main(String args[]) {
        Prototype prototype = new Prototype();
        Prototype prototypeClone = prototype.clone();
        System.out.println(prototype == prototypeClone);
        System.out.println(prototype.equals(prototypeClone));
        System.out.println(prototype.getClass() == prototypeClone.getClass());
    }
}
