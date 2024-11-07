package hus.oop;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAndSearching {
    public static void main (String[] args){
        testLinearSearch();
        testBinarySearch();
        testBubbleSort();

    }

    //2.1 Linear Search
    public static boolean linearSearch(int[] array, int key){
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int[] creatArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Enter the value of array[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void testLinearSearch(){
        Scanner sc = new Scanner(System.in);
        int[] arr = creatArray();
        System.out.print("Enter the search key: ");
        int key = sc.nextInt();
        if (linearSearch(arr, key)){
            System.out.println(linearSearchIndex(arr, key));
        } else {
            System.out.println("Key is not in array");
        }
    }

    //2.2 Recursive Binary Search
    public static boolean binarySearch(int[] a, int key, int fromIdx, int toIdx) {
        if (fromIdx > toIdx) {
            return false;
        }
        int middleIdx = (fromIdx + toIdx) / 2;
        if (key == a[middleIdx]) {
            return true;
        } else if (key > a[middleIdx]) {
            return binarySearch(a, key, middleIdx + 1, toIdx);
        } else {
            return binarySearch(a, key, fromIdx, middleIdx - 1);
        }
    }

    public static void testBinarySearch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int[] arr = creatArray();
        System.out.print("Enter the search key: ");
        int key = sc.nextInt();
        System.out.println(binarySearch(arr, key, 0, arr.length - 1));
    }


    //2.3 Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for(int i = 1; i < n; i++){
                if (array[i-1] > array[i]){
                    int term = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = term;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void testBubbleSort() {
        int[] array = creatArray();
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    //2.4 Selection Sort
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    //2.5 Insertion Sort
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
