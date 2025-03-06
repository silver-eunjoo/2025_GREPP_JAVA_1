package day3.function;

public class Section1_Method {

    public static void main(String[] args) {
        printTest1();
        printTest2();
        printTest3();
        printTest4();
    }

    public static void printTest1(){
        System.out.println("public");
    }
    static void printTest2(){ // default
        System.out.println("default");
    }
    protected static void printTest3(){
        System.out.println("protected");
    }
    private static void printTest4(){
        System.out.println("private");
    }
}
