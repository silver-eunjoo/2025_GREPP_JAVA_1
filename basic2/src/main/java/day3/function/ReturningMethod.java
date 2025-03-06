package day3.function;

public class ReturningMethod {
    public static void main(String[] args) {
        int amount = buyIceCream(1000);
        System.out.println("amount = " + amount);
        amount = buyIceCream(300);

        System.out.println("amount = " + amount);
    }

    static int buyIceCream(int money) {
        int PRICE = 500;
        int amount = money / PRICE;

        if ( amount == 0 ){
            System.out.println("돈이나 제대로 주세요.");
            return 0;
        }

        System.out.println("아이스크림을 1개라도 구매 완료!");

        return amount;

    }
}
