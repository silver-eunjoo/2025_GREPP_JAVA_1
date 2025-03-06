package lec2;

public class BitwiseOperator {
    public static void main(String[] args) {
        /*int a = 5; // 0101
        int b = 3; // 0011

        int result = a & b; // 0001
        System.out.println("result = " + result);*/

        int a = 0b0101;
        int b = 0b0011;

        int result = a & b;
        System.out.println("result = " + result);

        int c = 0b0101;
        int d = 0b0011;

        result = c | d; // 0111
        System.out.println("result = " + result);

        int e = 0b0101;
        int f = 0b0011;
        result = e ^ f; // 0110
        System.out.println("result = " + result);

        int g= 0b0101;
        result = ~g; //1010
        System.out.println("result = " + result);

        int h = 0b0101;
        result = h << 1;
        System.out.println("result = " + result);

        int i = 0b0101;
        result = i >> 1;
        System.out.println("result = " + result);

        int j = -20; // 1111 1111 1111 1111 1111 1111 1110 1100
        result = j >>> 2; // 0011 1111 1111 1111 1111 1111 1011
        System.out.println("result = " + result);

    }
}
