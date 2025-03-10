package day4.extends_example.extends_keyword.inner;

public class BaseClass {

    private String uniqueName = "BaseClass";
    public String name = "BaseClass";
    protected String nickname = "super";

    public void introduce() {
        System.out.printf("name = %s, nickname = %s\n", name, nickname);
    }

    public void getUniqueName() {
        System.out.println("uniqueName = " + uniqueName);
    }



}
