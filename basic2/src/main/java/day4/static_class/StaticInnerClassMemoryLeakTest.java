package day4.static_class;

public class StaticInnerClassMemoryLeakTest {

    private static String name = "StaticInnerClassMemoryLeakTest";

    static class StaticInnerClass {
        void display() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//        StaticInnerClass staticInnerClass = new StaticInnerClass();
//        staticInnerClass.display();
//        staticInnerClass = null;
//        staticInnerClass.display();

//        StaticInnerClassMemoryLeakTest.StaticInnerClass instance = new StaticInnerClassMemoryLeakTest.StaticInnerClass();
//        instance.display();
//        instance = null;
//        instance.display();
    }
}
