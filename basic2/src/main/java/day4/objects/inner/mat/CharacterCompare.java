package day4.objects.inner.mat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CharacterCompare implements Comparable<CharacterCompare>{

    protected final String name;
    protected final int level;
    protected final int gold;
    protected final List<String> inventory = new ArrayList<>();

    public CharacterCompare(String name, int level, int gold, int itemAmount) {
        this.name = name;
        this.level = level;
        this.gold = gold;

        for (int i = 1;i <= itemAmount; i++){
            this.inventory.add("item_" + i);
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getGold() {
        return gold;
    }

    public List<String> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", gold=" + gold +
                ", inventory=" + inventory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCompare character = (CharacterCompare) o;
        return level == character.level && gold == character.gold && Objects.equals(name, character.name)
                && Objects.equals(inventory, character.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, gold, inventory);
    }

    @Override
    public int compareTo(CharacterCompare o) {

        //o1, o2
        // o1.compareTo(o2)
        // -> 양수  => 왼쪽이 더 큰 것
        // -> 음수 => 오른쪽이 더 큰 것
        // 0 => 같다
        // 왼쪽 숫자가 더 클 경우 -> 1
        // 왼쪽 숫자가 더 작을 경우 -> -1
        // 두 수가 같다면 -> 0
        return Integer.compare(this.level, o.level);
    }
}
