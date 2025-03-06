package day3.loop_statement;

public class Section1_LoopStatement_1 {
    public static void main(String[] args) {
        /*
        while(true) {
            System.out.println("Hello World!");
        }*/

        int count = 0; // 초기식
        while (count <= 10) { // 조건식
            // 명령문
            System.out.println("Hello World!");
            count += 1;
        }

        int b = 1;
        while (b<10) b*=2;
        System.out.println("Hello world!");

        int c = 1;
        while (c <10)
            c*=2;
        System.out.println("Hello world!");


    }
}
