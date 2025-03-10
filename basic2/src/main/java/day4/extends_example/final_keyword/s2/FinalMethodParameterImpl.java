package day4.extends_example.final_keyword.s2;

import day4.extends_example.final_keyword.s2.inner.FinalMethodParameter;

public class FinalMethodParameterImpl implements FinalMethodParameter {

    @Override
    public void method1() {

    }

    @Override
    public void method2(int a, int b) {

    }

    @Override
    public void method3(int a, int b) {
        a = 20; // interface에서는 final이 붙어있는데, 여긴 떨어져있음.
        b = 30;
        System.out.println("a = " + a);
        a = 30;
    }

    @Override
    public void method4(int a, int b) { // 다시 final을 붙여줘도 된다.

    }
}
