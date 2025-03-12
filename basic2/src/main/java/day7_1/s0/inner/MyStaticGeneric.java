package day7_1.s0.inner;

public class MyStaticGeneric { // 여기에 쓰인 <T>와 메서드에 쓰인 제네릭은 별개임.

    public static <T> String test1(T data) { // String은 반환형, T는 매개변수 타입

        System.out.println("data = " + data);

        return "ok";
    }

    public void test2() { // 클래스에서 온 것
        return;
    }

    public static <T> void test3(T data) {
        System.out.println("data = " + data);
    }
    public static <T> T test4 (T data) {
        System.out.println("data = " + data);
        return data;
    }

}
