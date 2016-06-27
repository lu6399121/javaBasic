package com.foreset.refrence;

/**
 * Created by zxl on 2016/5/20 0020 14:16.
 */
public class NoGarbageRetrieve {

    public static void main(String[] args) {
        MyDate date = new MyDate();
        date = null;
    }
}
