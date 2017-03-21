package com.ycit.strategy;

/**
 * Created by xlch on 2017/3/15.
 */
public class NormalBehavior implements IBehavior {
    @Override
    public int command() {
        System.out.println("无视他，径直走开");
        return 0;
    }
}
