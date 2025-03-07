package day4.q1;

public class Sword {
    private String name;

    public Sword() {
        name = "맨손";
        attack();
    }

    public Sword(String name) {
        this.name = name;
        attack();
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println(name + "을 휘둘렀습니다.");
    }
}
