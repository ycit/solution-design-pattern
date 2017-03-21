package com.ycit.observer;

/**
 * Created by xlch on 2017/3/16.
 */
public class Main {

    public static void main(String [] args) {

        SportNewsPublisher sportNewsPublisher = new SportNewsPublisher("体育新闻发布者");

        EmailSubscriber emailSubscriber = new EmailSubscriber("邮件订阅者");
        SMSSubscriber smsSubscriber = new SMSSubscriber("sms 订阅者");

        sportNewsPublisher.attach(emailSubscriber);
        sportNewsPublisher.attach(smsSubscriber);

        sportNewsPublisher.publishNews("姚明退出NBA,火箭篮下恐不保");

    }

}
