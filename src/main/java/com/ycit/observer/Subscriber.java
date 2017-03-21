package com.ycit.observer;

/**
 * Created by xlch on 2017/3/16.
 */
public interface Subscriber {


    /**
     * 状态改变时执行的动作
     * @param newsPublisher
     */
    void update(NewsPublisher newsPublisher);


}
