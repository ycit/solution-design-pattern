package com.ycit;

import com.ycit.templateMethod.Generalization;
import com.ycit.templateMethod.SolutionA;
import com.ycit.templateMethod.SolutionB;
import com.ycit.templateMethod.complex.SolutionA_1_1;
import com.ycit.templateMethod.complex.SolutionA_1_2;
import org.junit.Test;

/**
 * Created by xlch on 2017/1/19.
 */
public class TemplateMethodTest {

    @Test
    public void doSolutionA() {
        Generalization g = new SolutionA();
        g.template();
    }

    @Test
    public void doSolutionB() {
        Generalization g = new SolutionB();
        g.template();
    }

    @Test
    public void useSolutionA_1_1() {
        Generalization g = new SolutionA_1_1();
        g.template();
    }

    @Test
    public void useSolutionA_1_2() {
        Generalization g = new SolutionA_1_2();
        g.template();
    }

}
