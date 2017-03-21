package com.ycit.strategy;

/**
 * Created by xlch on 2017/3/15.
 */
public class DefensiveBehavior implements IBehavior {
    @Override
    public int command() {
        System.out.println("远离他");
        return -1;
    }
}
