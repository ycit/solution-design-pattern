package com.ycit.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlch on 2017/3/17.
 */
public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object mutex = new Object();

    MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        if (observer == null) throw new NullPointerException("Null observe");
        synchronized (mutex){
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        synchronized (mutex) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        synchronized (mutex) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer observer:observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
