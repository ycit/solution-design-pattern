package com.ycit.head.first.decorator.impl;

import com.ycit.head.first.decorator.Beverage;
import com.ycit.head.first.decorator.CondimentDecorator;

/**
 * soy 调料
 * Created by xlch on 2017/5/10.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
