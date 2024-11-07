package hus.oop;
import java.util.*;

public class BoxPattern {
    public static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print((row % size <= 1) || (col % size <= 1) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print((row % size <= 1) || (row == col) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % size <= 1) || (row + col == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % size <= 1) || (row == col) || (row + col == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        printPatternA(size);
        System.out.println();

        printPatternB(size);
        System.out.println();

        printPatternC(size);
        System.out.println();

        printPatternD(size);
        sc.close();
    }
}
