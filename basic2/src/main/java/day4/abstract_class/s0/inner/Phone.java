package day4.abstract_class.s0.inner;

public abstract class Phone {
    public boolean power;
    private int sound;

    private int lightLevel;

    public Phone(int sound, int lightLevel) {
        this.power = false;
        this.sound = sound;
        this.lightLevel = lightLevel;
    }

    public final void powerSwitch() {
        if(power) {
            System.out.println("전원을 끕니다.");
            this.power = false;
        } else {
            System.out.println("전원을 켭니다.");
            this.power = true;
        }
    }

    public abstract void call();
    public abstract void msg();

//    private String color;
//    public Phone(String color) {
//        this.color = color;
//    }
//
//    public boolean isPower() {
//        return power;
//    }
//
//    public void turnOn() {
//        if(!power) {
//            power = true;
//            System.out.println("휴대폰의 전원을 켭니다!");
//        } else {
//            System.out.println("휴대폰의 전원이 이미 켜져있습니다!");
//        }
//    }
//    public void text(String color, String phoneNumber, String message){
//        if(power) {
//        System.out.printf("%s에게서 \"%s\"라는 메세지가 왔습니다\n", phoneNumber, message);
//        } else {
//            System.out.println("전원이 꺼져있습니다. 통화가 불가합니다!");
//        }
//    }
//    public void call(String phoneNumber){
//        if(power){
//        System.out.printf("%s에서 전화가 왔습니다.\n", phoneNumber);
//        } else {
//            System.out.println("전원이 꺼져있습니다. 문자가 불가합니다!");
//        }
//    }
}
