package com.foreset.designpatterns.singleton;

/**
 * 懒汉式
 * Created by zhijian on 2016/6/27.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    /**
     * @return
     */
//    synchronized public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance =  new LazySingleton();
//        }
//        return instance;
//    }

//
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            synchronized (LazySingleton.class) {
//                instance = new LazySingleton();
//            }
//        }
//        return instance;
//    }

    /**
     * 双重检查锁定
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
