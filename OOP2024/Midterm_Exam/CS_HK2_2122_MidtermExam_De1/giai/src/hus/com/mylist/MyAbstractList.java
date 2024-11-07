package hus.com.mylist;

import java.util.Arrays;

public abstract class MyAbstractList<T> implements MyList<T> {
    protected int size = 0;

    protected void checkBoundaries(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Limit: " + limit);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(get(i)).append(i < size - 1 ? ", " : "");
        }
        return result.append("]").toString();
    }

    @Override
    public int size() {
        return size;
    }
}

