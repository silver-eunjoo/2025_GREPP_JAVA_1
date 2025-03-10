package day4.independent_class.inner;

import day4.independent_class.IndependentClass;
public class OtherPackageClass {

    public static void main(String[] args) {
        IndependentClass publicCls = new IndependentClass();
        publicCls.printName();

        publicCls.printOuterDefaultClassName();

//        new OuterDefaultClass(); // 얘는 참조, 생성할 수 없음.
    }
}
