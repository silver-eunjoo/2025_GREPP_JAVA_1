package day4.q1;

public class Adventurer {
    private String name;
    private Sword sword = null;

    public Adventurer(String name) {
        this.name = name;
        sword = new Sword();
        myState();
    }

    public Adventurer(String name, String weapon) {
        sword = new Sword(weapon);
        myState();
    }
    public void myState() {
        System.out.println("제 이름은 " + name + "입니다.");
        if(this.sword.getName() == "") {
            System.out.println("무기가 없습니다.");
        } else{
            System.out.printf("%s라는 무기가 있습니다.\n", sword.getName());
        }
    }

}
