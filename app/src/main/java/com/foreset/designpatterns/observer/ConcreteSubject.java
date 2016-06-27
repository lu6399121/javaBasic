package com.foreset.designpatterns.observer;

/**
 * Created by zxl on 2016/6/22 0022 18:55.
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
