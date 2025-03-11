package day4.objects.inner.mat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Character {

    protected final String name;
    protected final int level;
    protected final int gold;
    protected final List<String> inventory = new ArrayList<>();

    public Character(String name, int level, int gold, int itemAmount) {
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
        Character character = (Character) o;
        return level == character.level && gold == character.gold && Objects.equals(name, character.name)
                && Objects.equals(inventory, character.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, gold, inventory);
    }
}
