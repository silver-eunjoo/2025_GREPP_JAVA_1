package day7.examples.s0;

import day7.examples.s0.inner.Battery;
import day7.examples.s0.inner.ElectricPowerRobot;

public class Labo {

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        ElectricPowerRobot robot = new ElectricPowerRobot(battery);

        robot.doSomething();
        robot.doSomething();

    }
}
