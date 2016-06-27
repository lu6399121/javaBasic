package com.foreset.designpatterns.singleton;

/**
 * 恶汉式
 * Created by zhijian on 2016/6/27.
 */
public class EagerSingleton {
    //静态
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 私有化构造函数
     */
    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
