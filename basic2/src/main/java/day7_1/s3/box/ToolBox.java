package day7_1.s3.box;

import day7_1.s3.tools.Tool;

public class ToolBox<T extends Tool> extends Box<T> {

    public ToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("저는 " + content.getName() + " 을/를 갖고 있습니다! ");
    }
}
