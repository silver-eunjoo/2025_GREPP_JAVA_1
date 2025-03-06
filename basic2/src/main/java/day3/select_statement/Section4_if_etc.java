package day3.select_statement;

public class Section4_if_etc {

    static int A = 10;
    static int B = 20;

    public static void main(String[] args) {
        fn1(); // JUnit
        fn2();
        fn3();
        fn4();
    }

    private static void fn4() {

        if(returnTrue() && returnTrue()) {
            System.out.println("[Case1] 평가 완료!");
        }

        System.out.println("------");

        if(returnFalse()&&returnFalse()){
            System.out.println("[Case2] 평가 완료!");
        }
        System.out.println("------");

        if(returnFalse() && returnTrue()) {
            System.out.println("[Case3] 평가 완료!");
        } // 숏서킷 문제 : 평가가 완료되기 전에 보나마나 거짓, 안될 것 같으면 (결과가 명확하면) 중단한다.

        System.out.println("------");
        if(returnTrue()||returnFalse()||returnTrue()){
            System.out.println("[Case4] 평가 완료!");

        }
        System.out.println("------");
        if(returnFalse()||returnFalse()||returnTrue()){
            System.out.println("[Case5] 평가 완료!");

        }
    }

    static boolean returnTrue() {
        System.out.println("A");
        return true;
    }

    static boolean returnFalse() {
        System.out.println("B");
        return false;
    }

    //Case 3
    private static void fn3() {
         if (1==0)
             if (1 == 1)
                 System.out.println("1");
         else
             System.out.println("2");

         // 아무것도 출력되지 않음. dangling else problem

        if (1==0){
            if (1 == 1){
                System.out.println("1");
            }
        }
        else{
            System.out.println("2");
        }
    }

    //Case 2
    static void fn2() {
        if (A>=10){
            if (B>=10){
                B=1;
            }else{
                B=-1;
            }
        }

        System.out.println("B = " + B);
    }

    // Case 1
    static void fn1() {

        if( (A >= 10) && (B>=0) ) {
            B = 1;
        }

        if ((A >= 10) && (B <0)) {
            B = -1;
        }

        System.out.println("B = " + B);
    }
}
