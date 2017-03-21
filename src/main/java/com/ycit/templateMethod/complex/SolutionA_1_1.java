package com.ycit.templateMethod.complex;

/**
 * Created by xlch on 2017/1/19.
 */
public class SolutionA_1_1 extends SolutionA{
    @Override
    protected void solutionA_1() {
        System.out.println(" use solution A_1_1 do solution A in step three");
    }

    @Override
    protected void stepFour() {
//        super.stepFour();
        System.out.println(" override generalization step four method in SolutionA_1_1 ");
    }
}
