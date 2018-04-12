package com.ycit.head.first.observer.impl;

/**
 * Created by xlch on 2017/5/9.
 */
public class Main {

    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(28.5f,40.3f,99.4f);
    }

}
