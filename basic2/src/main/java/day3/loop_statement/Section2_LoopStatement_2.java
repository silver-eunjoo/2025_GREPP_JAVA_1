package day3.loop_statement;

public class Section2_LoopStatement_2 {
    public static void main(String[] args) { // refactor rename -> shift + fn6
        //for
        for (int i=0; i <= 10; i++) {
            System.out.println("Hello world!");
        }

        int a =0;
        for(; a< 10; a++){
            System.out.println("A");
        }

        /*
        for (int i=0;i<=10;i++){
            for (int j=0;j<=10;j++){
                for (int k=0;k<=10;k++){

                }
            }
        }
        */

        for(int i=0,j=0;i<10;i++){
            System.out.println("i = " + i);

            if (i >4){
                j++;
            }

            System.out.println("j = " + j);
        }

        for (int i=10;i>0;i--){
            System.out.println("i = " + i);
        }
    }
}
