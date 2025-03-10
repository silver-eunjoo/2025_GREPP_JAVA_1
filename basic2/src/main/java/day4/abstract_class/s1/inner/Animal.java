package day4.abstract_class.s1.inner;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void sleep();
    public void drink(){
        System.out.println("물을 마십니다.");
    }

    public void run(int speed) {
        System.out.printf("%s가 %d의 속도로 걷습니다.\n", name, speed);
    }

    public void hide(String place) {
        System.out.printf("%s가 %s에 숨었습니다!\n", name, place);
    }

}
