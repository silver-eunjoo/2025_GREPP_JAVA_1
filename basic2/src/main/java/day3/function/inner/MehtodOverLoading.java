package day3.function.inner;

public class MehtodOverLoading {
    public static void main(String[] args) {
        int result1 = sum(1, 2);
        System.out.println("result1 = " + result1);
        int result2 = sum(1, 2, 3);
        System.out.println("result2 = " + result2);
        double result3 = sum(1, .2, 3);
        System.out.println("result3 = " + result3);
    }

    static int sum(int a, int b) {
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
    static double sum(int a, double b, int c) {
        return a+b+c;
    }
}
