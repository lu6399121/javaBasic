package com.foreset.refrence;

/**
 * Created by zxl on 2016/5/20 0020 14:16.
 */
public class ExplicitGarbageRetrieve {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyDate date = new MyDate();
        date = null;
        System.gc();
    }
}
