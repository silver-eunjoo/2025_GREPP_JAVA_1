package day3.select_statement;

public class Section1_if {
    public static void main(String[] args) {
        if (true) {
            System.out.println("result : true");
        }
        if (false) {
            System.out.println("result : false");
        }

        if (!true) {
            System.out.println("result : not true");
        }
        if (!false) {
            System.out.println("result : not false");
        }

        if (false) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);

//        if (true) System.out.println("result:true");
        

    }
}
