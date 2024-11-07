package mylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void sort() {
        Collections.sort(list);
    }

    public void sort(Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    public T getSecondLargest() {
        if (list.size() < 2) {
            return null;
        }
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, Collections.reverseOrder());
        return sortedList.get(1);
    }

    public void print() {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
