package day2.lec2;

public class AssignOperator {

    public static void main(String[] args) {
        int a;

        a = 10;
        System.out.println("a = " + a);

        a = 20;
        System.out.println("a = " + a);

        a = (short)1; // 명시적 형변환
        a = (byte) 1;

        a = 10;

        a += 1;
        System.out.println("a = " + a);

        a -= 1;
        System.out.println("a = " + a);

        a*=2;
        System.out.println("a = " + a);

        a/=2;
        System.out.println("a = " + a);

        a%=2;
        System.out.println("a = " + a);
    }
}
