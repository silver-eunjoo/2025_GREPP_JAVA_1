package day7_1.s1;

public class BoxTests {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {

        try{
            Box.of(null);
        } catch (NullPointerException e) {
            System.out.println("Null은 보관할 수 없습니다!");
            System.out.println(e.getMessage());
        }

        Box<Object> empty = Box.empty();

        try{
            empty.get();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        boolean isEmpty = empty.isEmpty();
        boolean isPresent = empty.isPresent();

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isPresent = " + isPresent);

    }

    private static void test1() {

//        new Box<String>(); private 생성자이기 때문에 직접 호출할 수 없다.

        String rawString = "안녕하세요!";

        Box<String> stringBox = Box.of(rawString);

        boolean isEmpty = stringBox.isEmpty();
        boolean isPresent = stringBox.isPresent();


        boolean result = rawString.equals(stringBox.get());
        System.out.println("result = " + result);

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isPresent = " + isPresent);

    }
}
