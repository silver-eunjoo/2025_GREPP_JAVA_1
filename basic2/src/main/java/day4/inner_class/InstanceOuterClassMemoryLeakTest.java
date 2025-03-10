package day4.inner_class;

public class InstanceOuterClassMemoryLeakTest {

    private String name = "MemoryLeakTest";
    class InnerClass {
        void printName() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        InstanceOuterClassMemoryLeakTest instance = new InstanceOuterClassMemoryLeakTest();
        InnerClass innerClass = instance.new InnerClass();

        instance = null;
        innerClass.printName(); // nullException이 떠야 하는데, 안 뜸 => 메모리 누수 발생
        // printName에서 name을 사용하고 있기 때문에 메모리에서 해제 되지 않았다. 그래서 메모리 누수 발생함.
        // => inner class를 사용할 땐 static을 사용해주는 게 좋다.
    }
}
