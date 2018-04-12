package com.ycit.head.first.observer.jdk;

import com.ycit.head.first.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xlch on 2017/5/9.
 */
public class CurrentConditionsDisplay implements Observer , DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature is :" + temperature);
        System.out.println("humidity is :" + humidity);
        System.out.println("pressure is :" + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
