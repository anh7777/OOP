package hus.oop;
import java.util.*;
import java.lang.*;

public class MethodExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        testExponent(sc);
        int magicSum = testMagicSum(sc);
        System.out.printf("The magic sum is: %d \n", magicSum);
        testPrint(sc);
        testArrayToString(sc);
        testContains(sc);
        testSearch(sc);
        testEquals(sc);
        testCopyOf(sc);
        testSwap(sc);
        testReverse(sc);
        sc.close();
    }

//3.1 exponent()
    public static int exponent(int base, int exp){
        int product = 1;
        for (int i = 1; i <= exp; i++){
            product *= base;
        }
        return product;
    }
    public static void testExponent(Scanner sc){
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + " raises to the power of "
            + exp + " is: " + exponent(base, exp));
    }

// 3.2 hasEight()
    public static boolean hasEight(int number){
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;

            if (digit == 8) {
                return true;
            }

            number /= 10;
        }

        return false;
    }
    public static int testMagicSum(Scanner sc){
        int sum = 0;
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int input = sc.nextInt();
        while (input != SENTINEL){
            if(hasEight(input)){
                sum += input;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            input = sc.nextInt();
        }
        return sum;
    }

// 3.3 print()
    public static void print(int[] array){
        if (array == null){
            System.out.print("IntArray is null");
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print((i == 0) ? ("[" + array[0]) : (", " + array[i]));
            }
            System.out.print(array[array.length - 1] + "]\n");
        }
    }
    public static void print(double[] array) {
        if (array == null){
            System.out.print("DoubleArray is null");
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print((i == 0) ? ("[" + array[0]) : (", " + array[i]));
            }
            System.out.print(array[array.length - 1] + "]\n");
        }
    }
    public static void print(float[] array) {
        if (array == null){
            System.out.print("FloatArray is null");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print((i == 0) ? ("[" + array[0]) : (", " + array[i]));
            }
            System.out.print("]\n");
        }
    }
    public static void testPrint (Scanner sc) {
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the value : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("The value are : ");
        print(array);
    }

// 3.4 arrayToString()
    public static String arrayToString(int[] array){
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }
    public static void testArrayToString(Scanner sc){
        System.out.print("Enter the number of items: ");
        final int NUM_ITEM = sc.nextInt();
        int[] items = new int[NUM_ITEM];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separted bt space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        System.out.println(arrayToString(items));
    }

//3.5 contains()
    public static boolean contains(int[] array, int key){
        for (int num : array){
            if (num == key){
                return true;
            }
        }
        return false;
    }
    public static void testContains(Scanner sc){
        System.out.println("Enter the number: ");
        int NUM_ITEM = sc.nextInt();
        int[] items = new int[NUM_ITEM];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separted bt space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        System.out.print("Enter the key value: ");
        int key = sc.nextInt();
        System.out.println("The value contain in array: " + contains(items, key));
    }

//3.6 search()
    public static int search(int[] array, int key){
        int idx = -1;
        if(array.length > 0){
            for (int i = 0; i < array.length; i++){
                if (array[i] == key){
                    idx = i;
                }
            }
        }
        return idx;
    }
    public static void testSearch(Scanner sc){
        System.out.print("Enter the number of array: ");
        int NUM = sc.nextInt();
        int[] array = new int[NUM];

        System.out.print("Enter the value of all items (separted bt space): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the key value: ");
        int key = sc.nextInt();
        System.out.println("The index contain in array: " + search(array, key));
    }

// 3.7 equals()
    public static boolean equals(int[]array1, int[] array2){
        if (null == array1 & null == array2) {
            return true;
        } else if (null == array1 || null == array2){
            return false;
        } else if(array1.length != array2.length){
            return false;
        }else {
            for (int i = 0; i < array1.length; i++){
                if (array1[i] != array2[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void testEquals(Scanner sc){
        System.out.print("Enter the number of array1: ");
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];

        System.out.print("Enter the value of all array1 (separted bt space): ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of array2: ");
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];

        System.out.print("Enter the value of all array2 (separted bt space): ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array1 equal to Array2: " + equals(arr1, arr2));
    }

//3.8 copyOf()
    public static int[] copyOf(int[] array){
        int[] copyArr = new int[array.length];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                copyArr[i] = array[i];
            }
        }
        return copyArr;
    }
    public static void testCopyOf(Scanner sc){
        System.out.print("Enter the number of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter the value of all array1 (separted bt space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the newLength of the copy of given array: ");
        int newLength = sc.nextInt();
        if (newLength == arr.length) {
            int[] copyArray = copyOf(arr);
            System.out.print("The copy of given array: ");
            for (int i : copyArray) {
                System.out.print(i + " ");
            }
        } else {
            int[] copyArray = copyOf(arr, newLength);
            System.out.print("The copy of given array: ");
            for (int i : copyArray) {
                System.out.print(i + " ");
            }
        }
    }
    public static int[] copyOf(int[] array, int newLength){
        int[] copyArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                copyArr[i] = array[i];
            }
        }
        return copyArr;
    }

//3.9 swap()
    public  static boolean swap(int[] array1, int[] array2){
        if (array1.length != array2.length) {
            return false;
        }
        int[] array = copyOf(array1);
        array1 = copyOf(array2);
        array2 = copyOf(array);
        return true;
    }
    public static void  testSwap(Scanner sc){
        System.out.print("Enter the number of array1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number of array2: ");
        int num2 = sc.nextInt();
        int[] arr1 = new int[num1];
        int[] arr2 = new int[num2];

        System.out.print("Enter the value of all array1 (separted bt space): ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the value of all array2 (separted bt space): ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Contents are successfully swapped?: " + swap(arr1, arr2));
    }

    // 3.10 reverse()
    public static void reverse(int[] array){
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--){
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
        arrayToString(array);
    }
    public static void testReverse(Scanner sc){
        System.out.print("Enter the number of array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("Enter the value of all array (separted bt space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
}
