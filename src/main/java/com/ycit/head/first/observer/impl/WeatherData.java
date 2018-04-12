package com.ycit.head.first.observer.impl;

import com.ycit.head.first.observer.Observer;
import com.ycit.head.first.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlch on 2017/5/9.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserves(Observer observer) {
       int i = observers.indexOf(observer);
        if ( i > 0 ) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    private void measurementsChanged() {
            notifyObservers();
    }

    public void setMeasurements(float temperature ,float humidity , float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
