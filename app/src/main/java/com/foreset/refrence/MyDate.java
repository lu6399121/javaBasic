package com.foreset.refrence;

import java.util.Date;

/**
 * Created by zxl on 2016/5/20 0020 14:14.
 */
public class MyDate extends Date {

    public MyDate() {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("obj [Date: " + this.getTime() + "] is gc");
    }

    public String toString() {
        return "Date: " + this.getTime();
    }
}
