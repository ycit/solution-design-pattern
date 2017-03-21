package com.ycit.observer;

/**
 * Created by xlch on 2017/3/16.
 */
public class SportNewsPublisher extends NewsPublisher {

    private String name;

    public SportNewsPublisher(String name) {
        this.name = name;
    }

    @Override
    void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    void notifyObservers() {
        for (Subscriber subscriber:subscribers) {
            subscriber.update(this);
        }
    }

    /**
     * 发布新闻，代表 latestNews 状态改变,通知所有订阅者
     * @param news
     */
    @Override
    void publishNews(String news) {
        System.out.println(this.name + "  publish a news:" + news);
        latestNews = news;
        notifyObservers();
    }
}
