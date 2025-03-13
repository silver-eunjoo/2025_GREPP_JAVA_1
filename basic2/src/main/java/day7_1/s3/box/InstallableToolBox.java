package day7_1.s3.box;

import day7_1.s3.tools.Installable;
import day7_1.s3.tools.Tool;

public class InstallableToolBox<T extends Tool & Installable> extends Box<T> {

    public InstallableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("content = " + content.getName());
        content.installable();
    }
}
