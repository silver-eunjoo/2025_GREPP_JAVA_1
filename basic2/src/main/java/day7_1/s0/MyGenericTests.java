package day7_1.s0;

import day7_1.s0.inner.MyGeneric;

public class MyGenericTests {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();

    }

    private static void test4() {
        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

        generic.setKey("test4");

        // generic.setKey(100); // 한 번 지정되면 인스턴스가 없어질 때까지 타입이 고정 ! 유지 된다.

    }

    private static void test3() {
//        MyGeneric<String, int, boolean> generic = new MyGeneric<>();
        // 제네릭은 타입이 정해져있지 않기 때문에 NULL을 포함할 수 있어야 한다.
        // 그러므로, 기본 자료형이 아니라 참조 자료형을 사용해야 한다.


    }

    private static void test2() {
        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

        generic.setKey("key");
        generic.setValue(1);
        generic.setType(false);
    }

    private static void test1() {
        //MyGeneric<K, V, T>

        MyGeneric<String, String, String> generic = new MyGeneric<>();

        generic.setKey("key");
        generic.setValue("value");
        generic.setType("type");
//        generic.setType(1); impossible

        System.out.println("generic = " + generic);

    }

}
