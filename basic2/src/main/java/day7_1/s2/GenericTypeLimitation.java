package day7_1.s2;

import day7_1.s2.inner.*;

public class GenericTypeLimitation {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
//
//        GenericWrapper.method1(new Clazz<A>());
//        GenericWrapper.method1(new Clazz<B>());
        GenericWrapper.method1(new Clazz<C>());
        GenericWrapper.method1(new Clazz<D>());
        GenericWrapper.method1(new Clazz<E>());


        GenericWrapper.method2(new Clazz<A>());
        GenericWrapper.method2(new Clazz<B>());
        GenericWrapper.method2(new Clazz<C>());
//        GenericWrapper.method2(new Clazz<D>());
//        GenericWrapper.method2(new Clazz<E>());
    }

    static class GenericWrapper {

        static void method1(Clazz<? extends C> a) { // ? <=C

        }
        static void method2(Clazz<? super C> a) { // ? >= C

        }


    }
}
