package com.ycit.templateMethod.complex;

import com.ycit.templateMethod.Generalization;

/**
 * Created by xlch on 2017/1/19.
 */
public abstract class SolutionA extends Generalization {

    @Override
    protected void stepThree() {
        solutionA_1();
        solutionA_2();
    }

    protected abstract void solutionA_1();

    protected void solutionA_2() {
        System.out.println(" use solution A_2 in step three ");
    }

}
