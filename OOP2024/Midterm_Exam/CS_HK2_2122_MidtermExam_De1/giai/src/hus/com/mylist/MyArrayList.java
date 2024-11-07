package hus.com.mylist;

import java.util.Arrays;

public class MyArrayList<T> extends MyAbstractList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public void add(T element) {
        if (size == array.length) {
            enlarge();
        }
        array[size++] = element;
    }

    @Override
    public T remove(int index) {
        checkBoundaries(index, size);
        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return removedElement;
    }

    @Override
    public T get(int index) {
        checkBoundaries(index, size);
        return array[index];
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }
}

