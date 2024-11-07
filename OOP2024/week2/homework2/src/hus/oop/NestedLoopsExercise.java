package hus.oop;

import java.util.Scanner;

public class NestedLoopsExercise {

    public static void main(String[] args) {
        testSquarePattern();
        testCheckerPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPatternX();
    }

    //2.1 SquarePattern
    public static void squarePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        /* Rewrite the above program using nested while-do loops
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print("# ");
                col++;
            }
            System.out.println("");
            row++;
        }*/
    }

    public static void testSquarePattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        squarePattern(size);

    }

    //2.2 CheckerPattern
    public static void checkerPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n; col++) {
                if ((row % 2 == 1 && col % 2 == 1) || (row % 2 == 0 && col % 2 == 0)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        checkerPattern(size);
    }

    //2.3 TimeTable
    public static void timeTable(int n) {
        for (int i = -1; i <= n; i++) {
            if (i == -1) {
                System.out.print("\t|");
            } else if (i == 0) {
                System.out.print("------");
            } else if (i > 0) {
                System.out.printf("%1$d\t|", i);
            }

            for (int j = 1; j <= n; j++) {
                if (i == -1) {
                    System.out.printf("\t%1$d", j);
                    continue;
                } else if (i == 0) {
                    System.out.print("----");
                    continue;
                }

                System.out.printf("\t%1$d", i * j);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        timeTable(n);

    }

    //2.4 TriangularPattern
    public static void triangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print((row + col <= size + 1 ? "# " : "  "));
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print((col <= row ? "# " : "  "));
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= size; col++) {
                System.out.print((row + col >= size + 1 ? "# " : "  "));
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        triangularPatternA(size);
        System.out.println();
        triangularPatternB(size);
        System.out.println();
        triangularPatternC(size);
        System.out.println();
        triangularPatternD(size);
    }

    //2.5 BoxPattern
    public static void boxPatternA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i % size <= 1) || (j % size <= 1) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i % size <= 1) || (i == j) ? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int size) {
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

    public static void boxPatternD(int size) {
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

    public static void testBoxPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        boxPatternA(size);
        System.out.println();
        boxPatternB(size);
        System.out.println();
        boxPatternC(size);
        System.out.println();
        boxPatternD(size);
    }

    //2.6 HillPattern
    public static void hillPatternA(int size) {
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

    public static void hillPatternB(int size) {
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

    public static void hillPatternC(int size) {
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

    public static void hillPatternD(int size) {
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

    public static void testHillPatternX() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        hillPatternA(size);
        System.out.println();
        hillPatternB(size);
        System.out.println();
        hillPatternC(size);
        System.out.println();
        hillPatternD(size);
    }
}
