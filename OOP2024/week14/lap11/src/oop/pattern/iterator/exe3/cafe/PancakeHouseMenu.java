package oop.pattern.iterator.exe3.cafe;

import java.util.ArrayList;
import java.util.List;

class PancakeHouseMenu implements Menu {
    private List<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name) {
        menuItems.add(name);
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator((ArrayList<String>) menuItems);
    }
}