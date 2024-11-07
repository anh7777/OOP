package oop.pattern.iterator.exe3.cafe;

import java.util.ArrayList;
import java.util.List;

class PancakeHouseMenuIterator implements Iterator {
    private List<String> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public Object next() {
        String menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
