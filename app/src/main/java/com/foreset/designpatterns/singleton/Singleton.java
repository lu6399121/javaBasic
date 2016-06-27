package com.foreset.designpatterns.singleton;

/**
 * Created by zhijian on 2016/6/27.
 */
public class Singleton {

    private Singleton() {

    }

    private static class Holder{
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }


}
