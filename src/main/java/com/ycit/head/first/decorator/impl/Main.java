package com.ycit.head.first.decorator.impl;

/**
 * Created by xlch on 2017/5/10.
 */
public class Main {

    public static void main(String [] args) {
        /**我需要一杯mocha 浓缩咖啡**/
        Espresso espresso = new Espresso();
        Mocha mocha = new Mocha(espresso);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());
        /**我需要一杯mocha + soy 浓缩咖啡**/
        Soy soy = new Soy(mocha);
        System.out.println(soy.getDescription());
        System.out.println(soy.cost());
    }

}
