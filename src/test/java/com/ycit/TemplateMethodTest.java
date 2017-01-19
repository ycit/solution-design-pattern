package com.ycit;

import com.ycit.templateMethod.Generalization;
import com.ycit.templateMethod.SolutionA;
import com.ycit.templateMethod.SolutionB;
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

}
