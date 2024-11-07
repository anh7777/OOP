package oop.pattern.iterator.exe3.cafe;

class DinerMenuIterator implements Iterator {
    private String[] items;
    private int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public Object next() {
        String menuItem = items[position];
        position++;
        return menuItem;
    }
}