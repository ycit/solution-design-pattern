package com.ycit.templateMethod;

/**
 * 提供模版方法的 基类
 * @author xlch
 * @date 2017-01-19
 */
public abstract class Generalization {

    public void template() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }

    protected void stepOne() {
        System.out.println(" step one content....");
    }

    protected void stepTwo() {
        System.out.println(" step two content ...");
    }

    protected abstract void stepThree();

    protected void stepFour() {
        System.out.println(" step four content ...");
    }

}
