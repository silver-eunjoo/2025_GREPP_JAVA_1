package day7_1.s3.box;

public class Box<T> {

    T content;

    public Box(T content) {
        this.content = content;
    }

    public void open() {
        System.out.println("저는 열렸습니다!");
        System.out.println("저는 " + content + "을/를 갖고 있습니다!");
    }

    public void close() {
        System.out.println("저는 닫혔습니다!");
    }
}
