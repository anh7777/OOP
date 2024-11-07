package hus.oop;

import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printArrayStars(in);
        in.close();
    }

    //4.1 PrintArrayInStars
    public static void printArrayStars(Scanner in) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEM = in.nextInt();
        int[] items = new int[NUM_ITEM];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separted bt space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }

        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
            System.out.println("(" + items[idx] + ")");
        }
    }
}
