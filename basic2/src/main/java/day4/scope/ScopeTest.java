package day4.scope;

import day4.scope.inner.Complex;

public class ScopeTest {

    public static int i =15;

    void method() {
        i++;
    }

    public static void main(String[] args) {
        test1();
        test2();

        ScopeTest scopeTest = new ScopeTest();
        scopeTest.method();
        System.out.println("ScopeTest.i = " + ScopeTest.i);

        scopeTest.i = 500;
        System.out.println("ScopeTest.i = " + ScopeTest.i);

    }



    private static void test2() {
//        int i = 20;
//        System.out.println("i = " + i);

        for(;i<30;i++){
            System.out.println("i = " + i); // 정적변수도 바꿀 수 있다.
        }

        System.out.println("i = " + i);

    }

    private static void test1() {
        System.out.println("ScopeTest.test1");

        Complex complex = new Complex();
        System.out.println("complex.a = " + complex.a);

        complex.method1();
        System.out.println("complex.a = " + complex.a);
    }
}
