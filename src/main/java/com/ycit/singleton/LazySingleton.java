package com.ycit.singleton;

/**
 * 懒汉式单例
 *
 * @author chenxiaolei
 * @date 2019/6/21
 */
public class LazySingleton {

    private volatile static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public static void main(String[]args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
    }

}
