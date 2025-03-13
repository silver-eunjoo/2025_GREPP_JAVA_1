package day7_1.s3.box;

import day7_1.s3.tools.Portable;
import day7_1.s3.tools.Tool;

public class PortableToolBox<T extends Tool & Portable> extends Box<T>{
    public PortableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("content = " + content.getName());
        content.portable();
    }
}
