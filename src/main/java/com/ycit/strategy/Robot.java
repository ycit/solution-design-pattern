package com.ycit.strategy;

/**
 * Created by xlch on 2017/3/15.
 */
public class Robot {

    private String name;

    private IBehavior behavior;

    public Robot() {
    }

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(IBehavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        System.out.print(this.name + " 在行走的过程中遇到了另一个机器人 →");
        behavior.command();
    }
}
