package com.foreset.designpatterns.prototype;

/**
 * Created by zhijian on 2016/6/27.
 */
public class PrototypeTest {
    public static void main(String args[]) throws Exception {
        Prototype prototype = new Prototype();
        Prototype prototypeClone = prototype.clone();
        System.out.println(prototype == prototypeClone);
        System.out.println(prototype.equals(prototypeClone));
        System.out.println(prototype.getClass() == prototypeClone.getClass());
        System.out.println("--------");
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setAttr("deepPrototype");
        deepPrototype.setObject(new SerializableObject());

        DeepPrototype deepPrototype1 = deepPrototype.deepClone();
        DeepPrototype deepPrototype2 = deepPrototype.clone();

        System.out.println(deepPrototype.getAttr());
        System.out.println(deepPrototype1.getAttr());
        System.out.println(deepPrototype2.getAttr());

        System.out.println("--------");

        System.out.println(deepPrototype.getObject());
        System.out.println(deepPrototype1.getObject());
        System.out.println(deepPrototype2.getObject());
        System.out.println("--------");

        System.out.println(deepPrototype == deepPrototype1);
        System.out.println(deepPrototype.equals(deepPrototype1));
        System.out.println(deepPrototype.getClass() == deepPrototype1.getClass());
        System.out.println("--------");
        System.out.println(deepPrototype == deepPrototype2);
        System.out.println(deepPrototype.equals(deepPrototype2));
        System.out.println(deepPrototype.getClass() == deepPrototype2.getClass());
        System.out.println("--------");
        System.out.println(deepPrototype1 == deepPrototype2);
        System.out.println(deepPrototype1.equals(deepPrototype2));
        System.out.println(deepPrototype1.getClass() == deepPrototype2.getClass());

    }
}
