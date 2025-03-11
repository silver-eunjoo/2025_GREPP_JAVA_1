package day4.annotation;

public class AnnotationTests {
    public static void main(String[] args) {
        test1();
    }

    // deprecation, all
    @SuppressWarnings("deprecation")// compiler한테 ~관련된 건 알려주지마 하면 경고 노란 박스 없어짐.
    private static void test1() {
        LegacyClass legacyClass = new LegacyClass();
        legacyClass.elderMethod();
    }
}
