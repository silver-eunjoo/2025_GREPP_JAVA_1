package day3.loop_statement;

public class LoopQuiz {
    public static void main(String[] args) {
        // Q. 구구단 7단을 출력해주세요
        for (int i=1;i<=7;i++){
            System.out.printf("7 * %d = %d\n", i, 7*i);
        }

        //Q2. 5 *5 크기의 *로 구성된 직사각형을 출력해주세요
        for (int i= 0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Q3. 구구단을 2단부터 9단까지 각 단별로 공백을 구분으로 출력해주세요.
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }

        }
    }
}
