package day4.extends_example.extends_keyword;

import day4.extends_example.extends_keyword.inner.SubClass;

public class ExtendClass {

    // 상수 : 바뀌지 않는 값
    // 변수 : 바뀔 수 있는 값
    // final class 는 상속이 불가능하다.


    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        SubClass subClass = new SubClass("subClass", "childClass");
        subClass.introduce();
        subClass.getUniqueName();
    }
}
