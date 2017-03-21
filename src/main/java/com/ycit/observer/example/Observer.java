package com.ycit.observer.example;

/**
 * Created by xlch on 2017/3/17.
 */
public interface Observer {

    void update();

    void setSubject(Subject subject);

}
