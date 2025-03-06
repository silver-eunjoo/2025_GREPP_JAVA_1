package day3.function;

public class ParameterMethod {
    public static void main(String[] args) {
        buySnack(1000);
    }

    static void buySnack(int money) {
        System.out.println(money + "원을 사용해서 간식을 사왔습니다.");
    }
}
