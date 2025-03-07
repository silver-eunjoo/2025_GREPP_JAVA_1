package day4.instance;

public class InstanceBluePrintTests {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        InstanceBluePrint instance1 = new InstanceBluePrint();
        InstanceBluePrint instance2 = new InstanceBluePrint();

        String ins1Field1 = instance1.field1;
        int ins1Field2 = instance1.field2;

        System.out.println("ins1Field1 = " + ins1Field1);
        System.out.println("ins1Field2 = " + ins1Field2);

//        instance1.method1();
        instance1.method2();

        instance1.field1 = "InjectedValue";
        instance1.field2 = 999;

        instance1.method2();
        instance2.method2();

    }

}
