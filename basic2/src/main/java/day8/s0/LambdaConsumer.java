package day8.s0;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {

    // 람다 : 함수형 프로그래밍
    // () -> {}
    // () -> ...

    public static void main(String[] args) {

        // 익명 클래스를 지우고 매개변수로
        // 구현해야 할 메소드가 딱 하나만 존재해야 한다. (한 개 !! 중요)
        // () -> {}
        test1();
        test2();
        test3();

/*        A a = new A() {
            @Override
            void m() {

            }
        }; // 익명 클래스라고 부른다.*/
    }

    private static void test3() {

        List<String> mannheim = Arrays.asList("Yilin", "Ayame", "Phu");

//        Consumer<String> sayHello = s -> {
//            System.out.println("Hello, "+ s);
//            System.out.println("반가워!");
//        };


        Consumer<String> lv1 = s -> System.out.println("Hello, "+ s); // lv1.accept()하면 hello만 출력된다.
        Consumer<String> lv2 = lv1.andThen(s -> System.out.println("반가워!" + s)); //lv2.accept()하면 hello, 반가워까지 호출된다.

        for (String friend : mannheim) {
//            lv1.accept(friend);
            lv2.accept(friend);
        }
    }

    private static void test2() {
        List<String> germanFriends = Arrays.asList("David", "Jacob", "Paul", "Christopher", "Geza");

        sayHello(germanFriends, new Hello<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });
        sayHello(germanFriends, (s) -> {
            System.out.println(s);
        });
        sayHello(germanFriends, (s) -> System.out.println(s));
    }

    static void sayHello(List<String> list, Hello<String> hello) {
        for (String s : list) { // iter
            hello.accept(s); // hello 의 accept라는 함수를 아직 정의해주지 않았다.
        }
    }

    private static void test1() {

        // Consumer : 입력된 값을 쓰기만한다 ! (consume) 사용해버린다. -> 값을 반환하지는 않는다.
        // 사용하는 메소드 이름은 accept
        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String o) {
                System.out.println("o = " + o);
            }
        };

        consumer.accept("Hello");

        Consumer<String> consumer2 = (s) -> {
            // s 메서드의 첫 번째 매개변수가 오게 된다.
            System.out.println("s = " + s);
        };

        consumer2.accept("World!");

        Consumer<String> consumer3 = (s) -> System.out.println("s = " + s);
        consumer3.accept("하하");

        Consumer<String> consumer4 = s -> System.out.println("s = " + s);
        consumer4.accept("!");

    }

    interface Hello<T> {
        void accept(T value);
    }

    abstract static class A {
        abstract void m();
    }

}
