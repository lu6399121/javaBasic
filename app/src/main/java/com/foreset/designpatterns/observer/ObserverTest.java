package com.foreset.designpatterns.observer;

/**
 * Created by zxl on 2016/6/22 0022 18:55.
 */
public class ObserverTest {
    public static void main(String args[]) {
        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserver();
        Observer observerB = new ConcreteObserver();
        subject.attach(observerA);
        subject.attach(observerB);
        subject.notifyObservers();
    }
}
