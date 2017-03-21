package com.ycit.observer.example;

/**
 * Created by xlch on 2017/3/17.
 */
public class Main {

    public static void main(String [] args) {
        MyTopic topic = new MyTopic();
        MyTopicSubscriber observer1 = new MyTopicSubscriber("张三");
        MyTopicSubscriber observer2 = new MyTopicSubscriber("李四");
        MyTopicSubscriber observer3 = new MyTopicSubscriber("王武");

        topic.attach(observer1);
        topic.attach(observer2);
        topic.attach(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

//        observer1.update();

        topic.postMessage("光明日报");



    }

}
