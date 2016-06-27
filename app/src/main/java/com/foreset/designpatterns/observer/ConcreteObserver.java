package com.foreset.designpatterns.observer;

/**
 * Created by zxl on 2016/6/22 0022 18:54.
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println(this.toString() + " has updated");
    }

}
