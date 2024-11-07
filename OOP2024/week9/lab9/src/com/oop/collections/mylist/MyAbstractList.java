package com.oop.collections.mylist;

public abstract class MyAbstractList implements MyList {

    void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            str.append(String.format("[%s]",get(i).toString()));
        }
        return str.toString();
    }
}