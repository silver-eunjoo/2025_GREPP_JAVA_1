package day7_1.s3.tools.portable;

import day7_1.s3.tools.Portable;
import day7_1.s3.tools.Tool;

public class Wrench extends Tool implements Portable {
    private final String NAME = "WRENCH";

    @Override
    public void portable() {
        System.out.println("portable");
    }

    @Override
    public String getName() {
        return null;
    }
}
