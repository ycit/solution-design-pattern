package com.ycit.head.first.observer.jdk;

/**
 * Created by xlch on 2017/5/9.
 */
public class Main {

    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(23.5f,56,87.4f);
    }

}
