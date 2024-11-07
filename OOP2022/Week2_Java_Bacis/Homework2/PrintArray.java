import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEM = sc.nextInt();
        int[] items = new int[NUM_ITEM];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separted bt space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                System.out.print(items[0]);
            } else {
                System.out.printf(", %d", items[i]);
            }
        }
        System.out.println("]");
        sc.close();
    }
}