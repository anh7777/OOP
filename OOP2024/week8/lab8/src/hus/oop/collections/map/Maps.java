package hus.oop.collections.map;

import java.util.*;

public class Maps {

    /**
     * Function to return the number of key-value mappings of a map
     */
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    /**
     * Function to remove all mappings from a map
     */
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    /**
     * Function to test if a map contains a mapping for the specified key
     */
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    /**
     * Function to test if a map contains a mapping for the specified key and if its value equals the specified value
     */
    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    /**
     * Function to return the key set of map
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    /**
     * Function to return the values of a map
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    /**
     * Function, internally using a map, returning "black", "white", or "red" depending on input value.
     * "black" = 0, "white" = 1, "red" = 2
     */
    public static String getColor(int value) {
        switch (value) {
            case 0:
                return "black";
            case 1:
                return "white";
            case 2:
                return "red";
            default:
                return "unknown";
        }
    }
}
