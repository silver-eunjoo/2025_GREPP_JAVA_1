package day4.abstract_class.s1;

import day4.abstract_class.s1.inner.Animal;

public class Tower {
    // Animal -> hide()
    private String place = "타워";

    public void service(Animal animal) {
        animal.hide(place);
    }

}
