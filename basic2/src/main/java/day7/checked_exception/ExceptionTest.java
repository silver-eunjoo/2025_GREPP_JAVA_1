package day7.checked_exception;

public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println("hello");
//
//        int result = test3();
//        System.out.println(result);

//        try {
//            test1(); // runtime exception -> catch에서 제일 먼저 걸리는 것에 들어감.
//            test2();
//        } catch (RuntimeException e) {
//            System.out.println("Hello World!");
//        } catch (Exception e) {
//            System.out.println("1");
//        } finally { // finally는 어떤 상황에서도 실행된다.
//            System.out.println("2");
//        }
    }

    static int test3() {
        try {
            System.out.println("test3-try");
//            active1();
            return 1;
        } catch (RuntimeException e) {
            System.out.println("test3-catch");
        } finally {
            System.out.println("test3-finally");
            return 3;
        }
        // return 3; -> try 에서 return 할 경우, finally 하고 끝나버림.
    }

    static void test1() {
        active1();
        active2();
    }

    static void active1() {
        throw new RuntimeException(); // unchecked Exception
    }

    static void active2() throws RuntimeException { // 언체크드라 신경 안 씀. 그러다가 터진다.
        throw new RuntimeException(); // thr + tab -> throw new 적어줌.
    }

    static void test2() {
        active3();
//        active4();
    }

    static void active3() {
//        throw new Exception(); // checked Exception, 처리를 안 했기 때문에 컴파일 자체를 안 함.
    }
    static void active4() throws Exception{
        throw new Exception();
    }

}
