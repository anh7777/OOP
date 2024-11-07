package oopmyvector;

import java.util.ArrayList;
import java.util.List;

class MyVector {
    private List<Integer> vector;

    public MyVector() {
        vector = new ArrayList<>();
    }

    public void add(int element) {
        vector.add(element);
    }

    public void remove(int element) {
        vector.remove(Integer.valueOf(element));
    }

    public int get(int index) {
        return vector.get(index);
    }

    public void display() {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



