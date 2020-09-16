package com.ycit.singleton;

/**
 * 静态内部类单例
 *
 * 不会因为外部内的加载而加载，同时静态内部类的加载不需要依附外部类,
 * 在使用时才加载，不过在加载静态内部类的过程中也会加载外部类
 *
 *
 * @author chenxiaolei
 * @date 2019/6/21
 */
public class InnerClassSingleton {

    private static class SingltonHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return SingltonHolder.instance;
    }

}
