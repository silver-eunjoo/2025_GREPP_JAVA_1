package day4.extends_example.final_keyword.s1;

public class FinalKeyword {

    public static void main(String[] args) {

        final String DATABASE_URL; // 선언 -> 대문자로 해야 하니까 snake case로 적는다.

        DATABASE_URL = "jdbc:mariadb://localhost:3306/test-db"; // 한 번은 할당이 가능함. 재할당은 불가능하다.
        System.out.println("DATABASE_URL = " + DATABASE_URL);

        final int A = 10; // 초기화


    }

}
