package com.oop.collections.mylist;

public class MyArrayList extends MyAbstractList {
    // Fields
    static final int INITIAL_SIZE = 16;
    int size;
    Object[] elements;

    // Constructor
    public MyArrayList() {
        size = 0;
        elements = new Object[INITIAL_SIZE];
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size >= elements.length - 1) {
            enlarge();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Nullify the last element
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    void enlarge() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
