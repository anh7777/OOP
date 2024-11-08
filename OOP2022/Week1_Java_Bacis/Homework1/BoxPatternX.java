import java.util.Scanner;

public class BoxPatternX {
    //a,
    public static void printPatternA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i % size <= 1) || (j % size <= 1) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void printPatternA2 (int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //b,
    public static void printPatternB(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i % size <= 1) || (i == j) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void printPatternB2 (int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == row){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //c,
    public static void printPatternC(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i % size <= 1) || (i + j == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    //d,
    public static void printPatternD(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i % size <= 1) || (i == j) || (i + j == size + 1)) {
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
