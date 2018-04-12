package com.ycit.head.first.decorator.impl;

import com.ycit.head.first.decorator.Beverage;
import com.ycit.head.first.decorator.CondimentDecorator;

/**
 * mocha 调料
 * Created by xlch on 2017/5/10.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
