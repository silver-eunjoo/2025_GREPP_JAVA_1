package lec2;

public class ConditionalOperator {
    public static void main(String[] args) {
        /*int a = true //논리 자료형 값 또는 식
                ? 10 // 조건절이 참일 때
                : 5; // 조건절이 거짓일 때 값*/

        boolean isFinishWork = true;
        String canIGoHome = isFinishWork
                ? "yes"
                : "no";

        System.out.println("canIGoHome = " + canIGoHome);

        int remainedWork = 10;
        String couldIGoHome = remainedWork < 10 ? "yes" : "no";

    }
}
