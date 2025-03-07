package day4.scope;

public class LocalVariable {
    public int a = 10;

    public void method3() {
        if (true) {
            System.out.println("a = " + a);

            int b =10;

            System.out.println("b = " + b);
        }
        // if문 안의 b는 호출할 수 없다. if문 안에서 존재하는 변수이기 때문.
        // if문 밖에서는 다시 초기화해줄 수 있다.
    }
    void method1() {
        int x = 10;
        System.out.println("x = " + x);
    }

    void method2(int y) {
        int x = 10;
        // 또 다른 y를 선언할 수 없다.
        System.out.println("x+y= " +x+y);
    }

}
