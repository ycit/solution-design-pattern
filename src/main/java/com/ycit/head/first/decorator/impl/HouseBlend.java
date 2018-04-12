package com.ycit.head.first.decorator.impl;

import com.ycit.head.first.decorator.Beverage;

/**
 * Created by xlch on 2017/5/10.
 */
public class HouseBlend extends Beverage {

    HouseBlend () {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
