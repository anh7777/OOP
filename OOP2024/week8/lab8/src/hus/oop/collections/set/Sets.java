package hus.oop.collections.set;

import java.util.*;

public class Sets {

    /**
     * Function returning the intersection of two given sets (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int num : first) {
            if (second.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }

    /**
     * Function returning the union of two given sets (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    /**
     * Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    /**
     * Function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    /**
     * Function to transform a set into a list without duplicates
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    /**
     * Function to remove duplicates from a list
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    /**
     * Function to remove duplicates from a list without using constructor tricks seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<>(source);
        return new ArrayList<>(set);
    }

    /**
     * Function accepting a string and returning the first recurring character
     */
    public static char firstRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                return c;
            }
        }
        return '\0'; // If no recurring character found
    }

    /**
     * Function accepting a string and returning a set comprising all recurring characters
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> recurring = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                recurring.add(c);
            }
        }
        return recurring;
    }

    /**
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    /**
     * Function to return the first item from a TreeSet
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /**
     * Function to return the last item from a TreeSet
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /**
     * Function to get an element from a TreeSet which is strictly greater than a given element
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
