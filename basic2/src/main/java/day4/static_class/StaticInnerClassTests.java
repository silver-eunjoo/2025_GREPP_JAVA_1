package day4.static_class;

public class StaticInnerClassTests {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        StaticOuterClass.InnerClass innerClass1 = new StaticOuterClass.InnerClass();
        innerClass1.a = 50;

        StaticOuterClass.InnerClass innerClass2 = new StaticOuterClass.InnerClass();
        innerClass2.a = 0;

        System.out.println("innerClass1 = " + innerClass1.a);

        // a는 static변수이기 때문에
    }

    private static void test2() {
        StaticOuterClass.InnerClass innerClass1 = new StaticOuterClass.InnerClass();
        StaticOuterClass.InnerClass innerClass2 = new StaticOuterClass.InnerClass();

        innerClass1.b = 30;
        innerClass2.b = 50;

        System.out.println("innerClass1 = " + innerClass1.b);
        System.out.println("innerClass2.b = " + innerClass2.b);
        // static에 있는 인스턴스변수라고 해서 정적변수처럼 행동하지 않는다.
    }

    private static void test1() {
        StaticOuterClass staticOuterClass = new StaticOuterClass();
        staticOuterClass.accessToInnerClass();

//        Integer innerPublicStaticValue = StaticOuterClass.InnerClass.innerPublicStaticValue;
        StaticOuterClass.InnerClass innerClass = new StaticOuterClass.InnerClass();
        // 외부 클래스에 있는 static 내부 클래스의 생성자를 호출하고 New




    }

}
