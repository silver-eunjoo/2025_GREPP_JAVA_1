package day7_1.s3.component;

import day7_1.s3.box.Box;

public class Packager<T>{

    public void close(Box<T> box) {
        box.close();
    }

}
