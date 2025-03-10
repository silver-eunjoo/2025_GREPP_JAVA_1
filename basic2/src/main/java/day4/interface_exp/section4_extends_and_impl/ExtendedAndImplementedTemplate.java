package day4.interface_exp.section4_extends_and_impl;

import day4.interface_exp.section2_multiple_inheritance.Template;

// 클래스의 메소드가 인터페이스의 메소드보다 우선한다.
// thetemplate은 template을 구현했다고 생각할 거고, extendedandimplementedtemplate는 the template를 상속받았다고 생각한다.

 public class ExtendedAndImplementedTemplate extends TheTemplate implements Template {
//public class ExtendedAndImplementedTemplate implements Template {

    @Override
    public void method1() {

    }
    @Override
    public void run() {

    }

    // 오버로딩도 가능하다.
    public void method1(int a) {

    }
}
