package day4.abstract_class.s0;

import day4.abstract_class.s0.inner.CalaxyS25;
import day4.abstract_class.s0.inner.JPhone;
import day4.abstract_class.s0.inner.Phone;

public class PhoneStore {

    public static void main(String[] args) {
        //Phone이라는 객체를 만들지 못함 !! why? abstract class로 생성했기 때문에 !
        customer1();
        customer2();
        customer3();
    }

    private static void customer3() {
        JPhone jPhone1 = generateJPhone();
        JPhone jPhone2 = generateJPhone();

        CalaxyS25 calaxyS25 = generateCalaxy();

        jPhone1.powerSwitch();
        jPhone2.powerSwitch();
        calaxyS25.powerSwitch();

        jPhone1.setTargetPhone(jPhone2);
        jPhone2.setTargetPhone(calaxyS25);

        jPhone1.call();
        jPhone1.msg();

        jPhone2.call();
        jPhone2.msg();

    }

    private static void customer2() {
//        CalaxyS25 calaxyS25 = new CalaxyS25(10, 10);
        Phone calaxyS25 = generateCalaxy();
        calaxyS25.powerSwitch();
        calaxyS25.call();
        calaxyS25.msg();
    }

    private static CalaxyS25 generateCalaxy() {
        return new CalaxyS25(10, 10);
    }
    private static JPhone generateJPhone() {
        return new JPhone(10, 10);
    }

    private static void customer1() {
        Phone phone = new Phone(10, 10) {
            @Override
            public void call() {
                System.out.println("따르릉!");
            }

            @Override
            public void msg() {
                System.out.println("문자!");
            }
        }; // 추상 클래스를 바로 구현하면 가능하다. 그냥은 못 씀.

        phone.call();
        phone.msg();
    }


}
