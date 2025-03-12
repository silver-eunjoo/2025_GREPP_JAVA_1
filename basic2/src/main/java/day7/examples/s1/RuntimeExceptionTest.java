package day7.examples.s1;

public class RuntimeExceptionTest {

    public static void main(String[] args) {
        test3();
    }

    static void test1() {
        throw new FirstRuntimeException("first");
    }

    static void test2() {
        try {
            test1();
        } catch (FirstRuntimeException e) {
            throw new SecondRuntimeException();
        }
    }

    static void test3() {
        try {
            test2();
        } catch (SecondRuntimeException e) {
            throw e;
        }
    }
}
