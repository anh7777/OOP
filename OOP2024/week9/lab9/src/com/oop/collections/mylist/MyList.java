package com.oop.collections.mylist;

public interface MyList {
    void add(Object o);

    void add(Object o, int index);

    void remove(int index);

    int size();

    Object get(int index);
}
