package day4.inner_class;


import day4.inner_class.InstanceOuterClass.InnerClass;

public class InstanceOuterClassTest {
    public static void main(String[] args) {
        InstanceOuterClass instOuterCls = new InstanceOuterClass();
        instOuterCls.printInnerClassVariable();

        // InstanceOuterClass 안에 InnerClass
        // InnerClass 직접 생성하는 것이 가능할까?
        // 왜냐하면, InnerClass도 Class이기 때문에 생성자 호출이 가능하지 않을까?
        // 생성할 수 있다 !
        InstanceOuterClass.InnerClass innerClass = instOuterCls.new InnerClass();
        innerClass.printOuterMemberVariables();

        InstanceOuterClass.InnerClass innerClass2 = new InstanceOuterClass().new InnerClass();
        innerClass2.printOuterMemberVariables();

    }
}
