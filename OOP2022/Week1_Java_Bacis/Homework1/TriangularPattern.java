import java.util.Scanner;

public class TriangularPattern {
    // a,
    public static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    // b,
    public static void printPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print((row + col <= size + 1 ? "# " : "  "));
            }
            System.out.println();
        }
    }
    // c,
    public static void printPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print((col <= row ? "# " : "  "));
            }
            System.out.println();
        }
    }
    //d,
    public static void printPatternD(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= size; col++) {
                System.out.print((row + col >= size + 1 ? "# " : "  "));
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
