package day7_1.s3;

import day7_1.s3.box.Box;
import day7_1.s3.box.InstallableToolBox;
import day7_1.s3.box.PortableToolBox;
import day7_1.s3.box.ToolBox;
import day7_1.s3.component.Packager;
import day7_1.s3.other.Apple;
import day7_1.s3.tools.Tool;
import day7_1.s3.tools.portable.Hammer;
import day7_1.s3.tools.portable.HandGrinder;
import day7_1.s3.tools.portable.HugeCrowbar;
import day7_1.s3.tools.portable.HugeGrinder;

public class Factory {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test4() {
        Packager<HugeGrinder> grinderPackager = new Packager<>(); // hugeGrinder box만 가능하다.

        Hammer hammer = new Hammer();
        ToolBox<Hammer> hammerToolBox = new ToolBox<>(hammer);

        HugeGrinder hugeGrinder = new HugeGrinder();
        ToolBox<HugeGrinder> hugeGrinderToolBox = new ToolBox<HugeGrinder>(hugeGrinder);

        grinderPackager.close(hugeGrinderToolBox);
//        grinderPackager.close(hammerToolBox); Packager grinderPackager 만들 때 T가 정해졌기 때문에 hugeGrinder만 닫을 수 있다.


        Packager.closeBox(hammerToolBox); // 얘는 static method로서 와일드카드를 썼기 때문에 가능하다.

        HugeCrowbar hugeCrowbar = new HugeCrowbar();
        ToolBox<HugeCrowbar> crowbarToolBox = new ToolBox<>(hugeCrowbar);

//        Packager.closePortableBox(crowbarToolBox); portable이 아니니까 불가능
        Packager.closeInstallableBox(crowbarToolBox);
        Packager.closeBox(crowbarToolBox);

    }

    private static void test3() {

        HandGrinder handGrinder = new HandGrinder();
        PortableToolBox<HandGrinder> toolBox1 = new PortableToolBox<>(handGrinder);
        toolBox1.open();

        HugeCrowbar hugeCrowbar = new HugeCrowbar();
        // PortableToolBox 은 Portable 을 구현해야 한다.
        // HugeCrowbar은 Installable을 가지고 있기 때문에 PortableToolBox에 넣을 수 없다.
        InstallableToolBox<HugeCrowbar> toolBox2 = new InstallableToolBox<>(hugeCrowbar);

        HugeGrinder hugeGrinder = new HugeGrinder();
        PortableToolBox<HugeGrinder> hugeGrinderPortableToolBox = new PortableToolBox<>(hugeGrinder);
        // 오호 이거 신기하네
    }

    private static void test2() {

        Hammer hammer = new Hammer();
        ToolBox<Hammer> hammerBox = new ToolBox<>(hammer); // Hammer은 portable 구현, Tool 상속이지만 Tool 상속이니까 들어갈 수 있다.
        hammerBox.open();

        Apple apple = new Apple();
//        new ToolBox<Apple>(apple); // 불가

        HugeGrinder hugeGrinder = new HugeGrinder();
        ToolBox<HugeGrinder> hugeGrinderToolBox = new ToolBox<>(hugeGrinder);
        hugeGrinderToolBox.open();

    }

    private static void test1() {

        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>(apple);
        appleBox.open();

        HugeGrinder hugeGrinder = new HugeGrinder();
        Box<HugeGrinder> hugeGrinderBox = new Box<>(hugeGrinder);
        hugeGrinderBox.open();
    }

}
