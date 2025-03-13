package day7_1.s3.tools.portable;

import day7_1.s3.tools.Installable;
import day7_1.s3.tools.Portable;
import day7_1.s3.tools.Tool;

public class HugeCrowbar extends Tool implements Installable {
    private final String NAME = "VERY_HUGE_CROWBAR";

    @Override
    public void installable() {
        System.out.println("Installable");
    }

    @Override
    public String getName() {
        return null;
    }
}
