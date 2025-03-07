package day4.scope.inner;

public class Complex {
    public int a = 10; // 인스턴스 멤버 변수
    public void method1() {
        if (true) {
            a = 20;
        }
    }
}
