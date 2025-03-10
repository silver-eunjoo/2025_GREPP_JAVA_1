package day2.lec1;

public class Lecture2 {
    //psvm
    public static void main(String[] args) {
        //-128 ~ 127
        //-2^7 ~ 2*7-1
        byte tinyNumber1 = 127;
        byte tinyNumber2 = -128;
        byte tinyNumber3 = 12;

        //-
        short cuteNumber1 = 32767;
        short cuteNumber2 = -32768;
//        short cuteNumber3 = 32768;

        int generalNumber1 = 2147483647;
        int generalNumber2 = -2147483648;
//        int generalNumber3 = 2147483648;

        int tenDecimal = 10;
        int tenBinary = 0b1010;
        int tenOctal = 012;
        int tenHexadecimal = 0xA; //oxa

        System.out.println("tenHexadecimal = " + tenHexadecimal);
        System.out.println("tenOctal = " + tenOctal);
        System.out.println("tenBinary = " + tenBinary);
        System.out.println("tenDecimal = " + tenDecimal);

        long hugeNumber1 = 9223372036854775807L;
        long hugeNumber2 = -9223372036854775808L;



    }
}
