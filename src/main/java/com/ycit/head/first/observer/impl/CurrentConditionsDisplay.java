package com.ycit.head.first.observer.impl;

import com.ycit.head.first.observer.DisplayElement;
import com.ycit.head.first.observer.Observer;
import com.ycit.head.first.observer.Subject;

/**
 * Created by xlch on 2017/5/9.
 */
public class CurrentConditionsDisplay implements Observer , DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public  CurrentConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObservers(this);
    }

    @Override
    public void update(float temperature, float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("temperature is :" + temperature);
        System.out.println("humidity is :" + humidity);
        System.out.println("pressure is :" + pressure);
    }
}
