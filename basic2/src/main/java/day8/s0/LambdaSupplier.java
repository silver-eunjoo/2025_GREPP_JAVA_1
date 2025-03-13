package day8.s0;

import java.util.UUID;
import java.util.function.Supplier;

public class LambdaSupplier {

    // java.util.function 에 Supplier 있다.
    // Supplier는 뭔가를 반환해주는 애

    public static void main(String[] args) {

        Supplier<String> stringSupplier1 = () -> {
            return "Hello World!";
        };
        String secretValue1 = stringSupplier1.get();
        System.out.println("secretValue = " + secretValue1);

        Supplier<String> stringSupplier2 = () -> "Hello World!"; // 클래스의 return 인지, 메소드의 return인지 모호하게 된다.
        String secretValue2 = stringSupplier2.get();
        System.out.println("secretValue = " + secretValue2);

        Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);
        Integer randomNumber = randomIntSupplier.get();
        System.out.println("randomNumber = " + randomNumber);

        Supplier<String> stringSupplier3 = () -> UUID.randomUUID().toString();
        // UUID : 우주의 유일한 값
        Supplier<User> userSupplier = () -> new User(stringSupplier3.get(), randomIntSupplier.get());
        User createdUser = userSupplier.get();
        System.out.println("createdUser = " + createdUser);
    }

    static class User {
        public String name;
        public int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{"
                    + name + ", "
                    + age + "}";
        }
    }
}
