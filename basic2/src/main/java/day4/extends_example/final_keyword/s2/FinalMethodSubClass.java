package day4.extends_example.final_keyword.s2;

import day4.extends_example.final_keyword.s2.inner.FinalMethod;

public class FinalMethodSubClass extends FinalMethod {
    
/*    @Override
    public void method1() {
        FinalMethod 안에 있는 method1은 final로 정의했기 때문에 재정의할 수 없다. 
        final method는 overriding 자체가 불가능
    }*/

    @Override
    public void method3(int a, int b) { // final은 효력이 없기 때문에 오버라이딩이다 오버로딩 x
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
