package day4.inner_class;

// Outer Class
public class InstanceOuterClass {

    private final String name = "InstOuterClass";
    protected final String protectedValue = "protectedValue";
    public final Integer sharedValue = 100;
    String defaultValue = "defaultValue";

    private final String duplicatedName = "duplicatedName1";

    // Inner Class
    // 인스턴스 클래스 - 외부 클래스의 인스턴스 멤버 변수처럼 다룬다.
    class InnerClass {

        public static final String constValue = "CONST";
        public final Integer sharedValue = 90;
        private final String duplicatedName = "duplicatedName2";

        public void printOuterMemberVariables() {
            System.out.println("name = " + name); // private라도 접근 가능함.
            System.out.println("protectedValue = " + protectedValue);
            System.out.println("sharedValue = " + sharedValue);
            System.out.println("defaultValue = " + defaultValue);
//            System.out.println("duplicatedName = " + duplicatedName); //this가 자동으로 붙기 때문에 2가 출력됨.

        }

        public void printDuplicatedValue() {
            String innerVariable = this.duplicatedName;
            String outerValue = InstanceOuterClass.this.duplicatedName; //duplicatedName -> 인스턴스 변수 그래서 클래스 이름으로 참조하는 것은 불가능함.
            // 인스턴스 변수가 안에 존재하기 때문에 InstanceOuterClass의 ! 를 this가 의미해줌. this keyword !

            System.out.println("innerVariable = " + innerVariable);
            System.out.println("outerValue = " + outerValue);
        }
    }
    
    public void printInnerClassVariable() {
//        public static final String constValue = "CONST";
//        public final Integer sharedValue = 90;
//        private final String duplicatedName = "duplicatedName2";

//        System.out.println("constValue = " + constValue);
        
        System.out.println("InnerClass.constValue = " + InnerClass.constValue); // static 이라서 직접 참조가 가능함.

        InnerClass innerClass = new InnerClass();

        String innerStringValue = innerClass.duplicatedName; // private인데? 가능하다 ! 이것이 inner class기 때문에 가능하다.
        System.out.println("innerStringValue = " + innerStringValue);
        System.out.println("innerClass.sharedValue = " + innerClass.sharedValue);
    }
    
}
