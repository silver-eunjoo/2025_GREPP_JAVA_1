package day4.objects;

public class A {
    // extends Object 객체가 기본적으로 가져야할 것을 갖고 생성되어야 하기 때문에 Object를 상속받는다.

    public static void main(String[] args) {

    }

    public static void test(Object a) {
        // 같은 type만 놓고 비교한다.
        //동등성 Equality : 객체 안에 있는 내용 즉, 값들이 같은지 비교
            // 두 객체가 같은 값을 가지는지 비교하는 것 ('equals')
            // equals는 Object에 있는 함수
            // 우리가 overriding 할 수 있음.
            // equals는 동등성을 비교
            // 근데 Object에 있는 equals는 동일성을 비교하고 있음.
            // 직접 equals를 오버라이딩하지 않으면 == 비교랑 똑같이 리턴 할 것임.

        //동일성 Identity : 객체가 메모리 주소(참조) 값이 같은지를 비교함
            // 두 객체가 물리적으로 같은 객체인지 비교하는 것 ('==')
    }

}
