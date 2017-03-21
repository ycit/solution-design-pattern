package com.ycit.strategy;

/**
 * Created by xlch on 2017/3/15.
 */
public class AgressiveBehavior implements IBehavior {
    @Override
    public int command() {
        System.out.println("攻击他");
        return 1;
    }
}
