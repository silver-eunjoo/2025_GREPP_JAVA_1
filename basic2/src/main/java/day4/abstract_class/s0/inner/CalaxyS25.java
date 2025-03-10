package day4.abstract_class.s0.inner;

public class CalaxyS25 extends Phone{

    private int recordCount = 0;

    public CalaxyS25(int sound, int lightLevel) {
        super(sound, lightLevel);
    }

    @Override
    public void call() {
        if (super.power) {
            System.out.println("통화를 합니다.");
            recordCount++;
        }
    }

    @Override
    public void msg() {
        if(this.power) {
            System.out.println("문자를 합니다.");
        }
    }
}
