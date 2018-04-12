package com.ycit.head.first.decorator;

/**
 * 星巴兹咖啡抽象类
 * Created by xlch on 2017/5/10.
 */
public abstract class Beverage {

    public String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }


    public abstract double cost();

}
