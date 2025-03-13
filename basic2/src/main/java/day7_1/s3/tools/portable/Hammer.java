package day7_1.s3.tools.portable;

import day7_1.s3.tools.Portable;
import day7_1.s3.tools.Tool;

public class Hammer extends Tool implements Portable {

    private final String NAME = "HAMMER";

    @Override
    public void portable() {
        System.out.println("portable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
