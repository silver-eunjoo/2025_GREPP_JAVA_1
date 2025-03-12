package day7.examples.s0.inner;

public class ElectricPowerRobot {

    private Battery battery;
    private final int EFFICIENCY = 100;

    public ElectricPowerRobot(Battery battery) {
        this.battery = battery;
    }

    public void doSomething() {

        try {
            battery.use(EFFICIENCY);
        } catch (NoPowerException e) {
            System.out.println(e.getMessage());
            System.out.println("배터리를 충전해주세요 !");
        }

    }


}
