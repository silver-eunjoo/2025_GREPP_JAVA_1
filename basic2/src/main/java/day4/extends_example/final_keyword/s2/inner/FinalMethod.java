package day4.extends_example.final_keyword.s2.inner;

public class FinalMethod {

    public final void method1(){
        System.out.println("Hello World!");

    }

    public void method2(int a, int b){
        int sum = a + b;

        System.out.println("sum = " + sum);

        a = 20;
        System.out.println("a = " + a);
    }

    public void method3(final int a, int b){
        int sum = a + b;

        System.out.println("sum = " + sum);
    }
}
