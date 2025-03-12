package day7_1.s1;

import java.util.Objects;
import java.util.Optional;

// Box를 Optional로 바꾸면 Optional class가 된다.
public class Box<T> {

    private final T data;

    private Box(T data) { // 생성자를 private로 만들었다.
        this.data = data;
    }

    public static <T> Box<T> empty() {
        return new Box<>(null);
    }

    // 무조건 값이 있을 때 만들 수 있도록 하고 싶다.
    public static <T> Box<T> of(T value) {
//        if(value == null) {
//            throw new NullPointerException();
//        } -> requireNonNull 함수랑 동일
        return new Box<>(Objects.requireNonNull(value));
    }

    public static <T> Box<T> ofNullable(T value) {
        return value == null
                ? new Box<>(null)
                : new Box<>(value);
    }

    public T get() { // 반환형 T
        if (data == null) {
            throw new NoSuchElementException("No value present");
        }
        return data;
    }

    public boolean isPresent() {
        return data != null;
    }

    public boolean isEmpty() {
        return data == null;
    }


}
