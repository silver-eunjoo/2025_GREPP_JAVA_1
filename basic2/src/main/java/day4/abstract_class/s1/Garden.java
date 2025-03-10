package day4.abstract_class.s1;

import day4.abstract_class.s1.inner.Animal;
import day4.abstract_class.s1.inner.Cat;
import day4.abstract_class.s1.inner.Dog;

public class Garden {

    public static void main(String[] args) {
        Dog happy = new Dog("멍해피");
        happy.eat();
        happy.drink();
        happy.sleep();
        happy.run(20);
        happy.hide("동굴");

        // Downcasting
        // Upcasting

        Cat cat = new Cat("냥해피");
//        Animal cat = new Cat("냥해피"); // upcasting
        cat.eat();
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.run(20);
        cat.hide("동굴");

        // upcasting 시, 실행 불가능하다.
        cat.play("레이저 포인터");
        cat.sayAge();

        Tower tower = new Tower();
        tower.service(happy);
    }
}
