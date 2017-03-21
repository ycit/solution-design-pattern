package com.ycit.observer.example;

/**
 * Created by xlch on 2017/3/17.
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);

}
