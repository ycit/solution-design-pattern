package com.ycit.observer;

/**
 * Created by xlch on 2017/3/16.
 */
public class SMSSubscriber implements Subscriber {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SMSSubscriber(String name) {
        this.name = name;
    }

    private NewsPublisher newsPublisher;

    public void setNewsPublisher(NewsPublisher newsPublisher) {
        this.newsPublisher = newsPublisher;
    }

    public NewsPublisher getNewsPublisher() {
        return newsPublisher;
    }

    @Override
    public void update(NewsPublisher newsPublisher) {
        System.out.println(this.name + " receive a news :" + newsPublisher.getLatestNews());
    }
}
