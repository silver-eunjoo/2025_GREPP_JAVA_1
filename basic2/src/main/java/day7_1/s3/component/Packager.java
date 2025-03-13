package day7_1.s3.component;

import day7_1.s3.box.Box;
import day7_1.s3.tools.Installable;
import day7_1.s3.tools.Portable;

public class Packager<T>{

    public static void closePortableBox(Box<? extends Portable> box) {
        box.close();
    }

    public static void closeInstallableBox(Box<? extends Installable> box) {
        box.close();
    }
    public static void closeBox(Box<?> box) {
        box.close();
    }

    public void close(Box<T> box) {
        box.close();
    }

}
