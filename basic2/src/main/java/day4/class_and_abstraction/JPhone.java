package day4.class_and_abstraction;

public class JPhone {
    private String color;
    private String phoneNumber;

    public void call() {

    }
    public void call(String phoneNumber) {
        System.out.printf("%s에게 전화를 겁니다.\n", phoneNumber);
    }
}
