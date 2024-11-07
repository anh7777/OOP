package hus.oop.collections.list;
import java.util.*;

public class Lists {
    /**
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
    }

    /**
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(List<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }
    }

    /**
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(List<Integer> list) {
        list.removeIf(element -> element == 666);
    }

    /**
     * Function returning a List<Integer> containing the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static List<Integer> generateSquare() {
        List<Integer> squareList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squareList.add(i * i);
        }
        return squareList;
    }

    /**
     * Function to verify if a list contains a certain value
     */
    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    /**
     * Function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before the copy
     */
    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for (int element : source) {
            target.add(element);
        }
    }

    /**
     * Function to reverse the elements of a list
     */
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    /**
     * Function to reverse the elements of a list (without using library functions)
     */
    public static void reverseManual(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }

    /**
     * Function to insert the same element both at the beginning and the end of the same LinkedList
     * Note well: you can use LinkedList specific methods
     */
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
