package day7_1.s3.tools.portable;

import day7_1.s3.tools.Portable;
import day7_1.s3.tools.Tool;

public class HandGrinder extends Tool implements Portable {
    private final String NAME = "HAND_GRINDER";

    @Override
    public void portable() {
        System.out.println("portable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
