package com.foreset.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者对象
 * Created by zxl on 2016/6/22 0022 18:47.
 */
abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    protected void attach(Observer observer) {
        if (!this.observerList.contains(observer)) {
            this.observerList.add(observer);
        }
    }

    protected void detach(Observer observer) {
        if (this.observerList.contains(observer)) {
            this.observerList.remove(observer);
        }
    }

    public abstract void notifyObservers();
}
