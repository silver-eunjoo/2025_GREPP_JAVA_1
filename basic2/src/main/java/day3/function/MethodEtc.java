package day3.function;

public class MethodEtc {
    public static void main(String[] args) {
        // Q1. 숫자(정수) 하나를 매개변수로 받아서
        //그 숫자가 홀수인지 짝수인지를 출력하는 메서드를 정의해서
        //10을 인자로 부여해서 실행해주세요 !

        // solve(10);

        int value = 10;
        extracted(value);
    }

    // cmd + option + v (value)
    // cmd + option + m (method)
    // cmd + option + c (class)

    private static void extracted(int value) { // cmd + option + m 함수가 추출된다. (
        if (value %2 == 0 ){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
    }

    static void solve(int a) {
        if (a % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
