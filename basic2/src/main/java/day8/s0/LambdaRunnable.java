package day8.s0;

public class LambdaRunnable {

    public static void main(String[] args) {

        Runnable runner = () -> {
            System.out.println("Hello World!");
        };

        runner.run();

        Thread thread = new Thread(
                () -> {
                    System.out.println("Hello World!");
                }
        );

        thread.start();


    }
}
