package day8.s1;

public class Calculator {

    public static void main(String[] args) {
        test("1", "2", "3", "4");
        PlusCalculator plusCalculator1 = new PlusCalculator() {
            @Override
            public Integer sum(int... values) {
                int result = 0;
                for (int value : values) {
                    result += value;
                }
                return result;
            }
        };

        Integer sum = plusCalculator1.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum = " + sum);

        PlusCalculator plusCalculator2 = (int... val) -> {
            int result = 0;
            for (int value : val) {
                result += value;
            }
            return result;
        };

        Integer sum1 = plusCalculator2.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("sum1 = " + sum1);

    }

    static interface PlusCalculator {
        Integer sum(int... values);
    }

    public static void test(String... a) { // 가변인자 ... 신기하다잉
        for (String s : a) {
            System.out.println("s = " + s);
        }
    }

}
