package com.foreset.designpatterns.singleton;

/**
 * Created by zhijian on 2016/6/27.
 */
public class SingletonTest {

    public static void main(String args[]) {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.print(s1 == s2);

    }
}
