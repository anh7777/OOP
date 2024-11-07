package hus.oop;
import java.util.*;
public class PrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        final int NUM_ITEMS = input.nextInt();
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = input.nextInt();
            }
        }
        for (int i = 0; i < items.length - 1; i++) {
            System.out.print((i==0) ?"The values are: [" + items[i] : items[i]);
            System.out.print(",");
        }
        System.out.println(items[items.length - 1] + "]");
        input.close();
    }
}
