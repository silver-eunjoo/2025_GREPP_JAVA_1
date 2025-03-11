package day4.static_class;

public class StaticOuterClass {

    private final String instanceName = "StaticOuterClassInstanceName";
    private static final String staticName = "StaticOuterClassStaticName";

    public final Integer sharedInstanceValue = 10;
    public static final Integer sharedStaticValue = 90;

    static class InnerClass {
        // 다른 정적변수랑 완전히 동일하게 동작하진 않음.
        // 완전히 같다고 생각하면 내부 변수에 static변수만 가능해야 함.
        // public int a = 10; // 근데 static 변수가 아니더라도 생성 가능하다.
        //외부 클래스와 내부 클래스는 독립적으로 존재할 수 있다.

        private String innerName = "StaticInnerClassInstanceName";
        private static String innerPrivateStaticName = "StaticInnerClassStaticName";

        public final Integer innerValue = 10;
        public static final Integer innerPublicStaticValue = 90;

        public static int a = 10;
        public int b = 20;

        public void test() {

            // 인스턴스 변수는 직접 참조할 수 없다.
            //System.out.println("instanceName = " + instanceName); //static인 곳에서 non-static을 부를 수 없다
            System.out.println("staticName = " + staticName); // 정적 영역에 있기 때문에 가능하다.
            System.out.println("sharedStaticValue = " + sharedStaticValue);

            // 인스턴스 변수 사용하는 법
            StaticOuterClass outerCls = new StaticOuterClass(); // 인스턴스를 생성하면 접근이 가능하다.
            Integer privateValue = outerCls.sharedInstanceValue;
            System.out.println("privateValue = " + privateValue);
        }
    }

    public void accessToInnerClass() {
        Integer innerPublicStaticValue = InnerClass.innerPublicStaticValue;
        // static 변수이기 때문에 직접 참조가 가능하다.
        String innerPrivateStaticName = InnerClass.innerPrivateStaticName;
        // 접근 제어자가 private이더라도 가능하다.

        // 인스턴스 변수는 new로 인스턴스를 만들어준 후 사용가능함.
        String innerName = new InnerClass().innerName; // private이지만 사용 가능하다.
    }

}
