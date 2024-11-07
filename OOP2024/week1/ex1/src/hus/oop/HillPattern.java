package hus.oop;
import java.util.*;

public class HillPattern {
    public static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= 2 * size - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size) {
        int n = 0;
        while (n <= 2 * size) {
            int row = Math.abs(size - n);
            if (row == 0) {
                n += 2;
                continue;
            }
            for (int col = 1; col <= 2 * size - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
            n++;
        }
    }

    public static void printPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row + col > size + 1) && (row > col - size + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= 2 * size - 1; col++) {
                if ((row < col - 1) && (row + col < 2 * size - 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
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
