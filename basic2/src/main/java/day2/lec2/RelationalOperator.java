package day2.lec2;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // a Greater Than b
        boolean aGtb = a > b;
        System.out.println("aGtB = " + aGtb);

        // a Less Than b
        boolean aLtb = a < b;
        System.out.println("aLtb = " + aLtb);

        // a greater or equal than b
        boolean aGeb = a >= b;
        System.out.println("aGeb = " + aGeb);

        // a little or equal than b
        boolean aLeb = a <= b;
        System.out.println("aLeB = " + aLeb);

        // a equal b
        boolean aEqb = a == b;
        System.out.println("aEqb = " + aEqb);

        // a not equal b
        boolean aNeb = a != b;
        System.out.println("aNeb = " + aNeb);

    }
}
