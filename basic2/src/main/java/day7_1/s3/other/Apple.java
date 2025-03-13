package day7_1.s3.other;

import day7_1.s3.tools.Portable;

public class Apple implements Portable {

    private final String TASTE = "SWEET";
    @Override
    public void portable() {
        System.out.println("저는 갖고 다닐 수는 있어요 !");
    }

}
