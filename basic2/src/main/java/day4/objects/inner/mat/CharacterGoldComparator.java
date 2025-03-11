package day4.objects.inner.mat;

import java.util.Comparator;

public class CharacterGoldComparator implements Comparator<Character> {

    // Integer
    // o1, o2
    // o1이 o2보다 더 크다면 1
    // o1이 o2보다 더 작다면 -1
    // o1이 o2와 같다면 0
    @Override
    public int compare(Character o1, Character o2) {
        return Integer.compare(o1.gold, o2.gold); // 오름차순
//        return Integer.compare(o2.gold, o1.gold); // 내림차순
    }

}
