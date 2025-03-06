package day3.select_statement;

public class Section3_if_elseif_if {
    public static void main(String[] args) {
        if(false) {
            System.out.println(1);
        } else if(true) {
            System.out.println(2); // 2만 출력됨.
        } else if(true) {
            System.out.println(3);
        } else{
            System.out.println(4);
        }
    }
}
