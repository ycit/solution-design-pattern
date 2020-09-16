package com.ycit.singleton;

/**
 * 饿汉式
 *
 * @author chenxiaolei
 * @date 2019/6/21
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
