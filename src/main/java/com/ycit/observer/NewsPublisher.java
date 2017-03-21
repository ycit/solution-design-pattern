package com.ycit.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlch on 2017/3/16.
 */
public abstract class NewsPublisher {

    List<Subscriber> subscribers = new ArrayList<>();

    String latestNews;

    abstract void attach(Subscriber subscriber);

    abstract void detach(Subscriber subscriber);

    abstract void notifyObservers();

    abstract void publishNews(String news);

    public String getLatestNews() {
        return latestNews;
    }
}
