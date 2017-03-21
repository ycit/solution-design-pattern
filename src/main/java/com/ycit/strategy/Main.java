package com.ycit.strategy;

/**
 * Created by xlch on 2017/3/16.
 */
public class Main {

    public static void main(String [] args) {
        Robot robot007 = new Robot("007");
        Robot robotG = new Robot("G");
        Robot robotR = new Robot("R");
        robot007.setBehavior(new AgressiveBehavior());
        robotG.setBehavior(new DefensiveBehavior());
        robotR.setBehavior(new NormalBehavior());
        robot007.move();
        robotG.move();
        robotR.move();
        robot007.setBehavior(new DefensiveBehavior());
        robot007.move();
    }

}
