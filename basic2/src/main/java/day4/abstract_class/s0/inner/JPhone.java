package day4.abstract_class.s0.inner;

public class JPhone extends Phone{

    private final String COLOR = "blue";
    private boolean isSameType = true;

    public JPhone(int sound, int lightLevel) {
        super(sound, lightLevel);
    }

    public void setTargetPhone(Phone targetPhone) {
        this.isSameType = targetPhone instanceof JPhone;
        // instanceof 연산자 왼쪽, 오른쪽이 같은 타입인지 판단해준다.
    }

    @Override
    public void call() {
        if (this.power) {
            System.out.println("통화");
        }
    }

    @Override
    public void msg() {
        if(this.isSameType) {
            System.out.println("파란색");
        } else {
            System.out.println("초록색");
        }
    }
}
