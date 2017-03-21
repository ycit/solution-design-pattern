package com.ycit.observer.example;

/**
 * Created by xlch on 2017/3/17.
 */
public class MyTopicSubscriber implements  Observer {

    private String name;
    private Subject topic;

    MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":No new message");
        }else {
            System.out.println(name + " consume message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
