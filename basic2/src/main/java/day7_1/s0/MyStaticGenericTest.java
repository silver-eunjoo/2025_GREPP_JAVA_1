package day7_1.s0;

import day7_1.s0.inner.MyStaticGeneric;

public class MyStaticGenericTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        String hello = MyStaticGeneric.test1("Hello");
        MyStaticGeneric.test3(100);
        MyStaticGeneric.test4(true);

        MyStaticGeneric myStaticGeneric = new MyStaticGeneric();
        myStaticGeneric.test2();

    }


}
