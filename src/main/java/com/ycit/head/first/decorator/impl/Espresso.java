package com.ycit.head.first.decorator.impl;

import com.ycit.head.first.decorator.Beverage;

/**
 * 浓缩咖啡
 * Created by xlch on 2017/5/10.
 */
public class Espresso extends Beverage {


    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
