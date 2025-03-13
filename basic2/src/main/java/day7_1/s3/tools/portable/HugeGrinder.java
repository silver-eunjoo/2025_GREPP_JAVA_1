package day7_1.s3.tools.portable;

import day7_1.s3.tools.Installable;
import day7_1.s3.tools.Portable;
import day7_1.s3.tools.Tool;

public class HugeGrinder extends Tool implements Installable, Portable {
    private final String NAME = "VERY_HUGE_GRINDER";

    @Override
    public void installable() {
        System.out.println("Installable");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void portable() {
        System.out.println("Portable");
    }
}
