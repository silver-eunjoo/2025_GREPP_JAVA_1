package day4.extends_example.extends_keyword.inner;

public class SubClass extends BaseClass {

    public SubClass(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
//        this.uniqueName = nickname; uniqueName은 private로 선언되었기 때문에 불가능하다 !
    }

    public SubClass() {

    }
}
