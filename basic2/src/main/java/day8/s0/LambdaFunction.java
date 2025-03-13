package day8.s0;

import java.util.function.Function;

public class LambdaFunction {

    //java.util.function
    // 제네릭이 2개 (매개변수, 반환)

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {

        String helloWorld = "Hello, World!";

        // 문자열 -> 대문자로 변환 -> 문자열 반환

        Function<String, String> convertUpper1 = s -> {
            System.out.println("s = " + s);
            return s.toUpperCase();
        };

        String applied = convertUpper1.apply(helloWorld);
        System.out.println("applied = " + applied);

        Function<String, String> convertUpper2 = s -> s.toUpperCase();

        String mangoStr = "mango";
        String mango = convertUpper2.apply(mangoStr);
        System.out.println("mango = " + mango);

        Function<String, Integer> getSize = s -> s.length();

        Integer helloWorldSize = getSize.apply(helloWorld);
        Integer mangoSize = getSize.apply(mangoStr);

        System.out.println("helloWorldSize = " + helloWorldSize);
        System.out.println("mangoSize = " + mangoSize);

    }

}
