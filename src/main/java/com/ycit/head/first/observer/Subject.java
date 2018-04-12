package com.ycit.head.first.observer;

/**
 * Created by xlch on 2017/5/9.
 */
public interface Subject {

    void registerObservers(Observer observer);

    void  removeObserves(Observer observer);

    void notifyObservers();

}
