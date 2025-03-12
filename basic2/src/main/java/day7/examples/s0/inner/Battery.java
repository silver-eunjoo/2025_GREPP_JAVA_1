package day7.examples.s0.inner;

public class Battery {

    private int amount;

    public Battery(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void use(int amount) throws NoPowerException {
        if(amount > this.amount ) {
            // 전기 없어 예외
            // throw new RuntimeException();
            throw new NoPowerException("배터리가 충분하지 않습니다!");
        }

        System.out.println(amount + "만큼의 배터리를 사용해서 무언가를 했습니다!");

        this.amount -= amount;
    }
}
