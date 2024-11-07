package hus.oop;
import java.util.*;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int row = -1; row <= n; row++) {
            if (row == -1) {
                System.out.print("*\t|");
            } else if (row == 0) {
                System.out.print("-------");
            } else if (row > 0) {
                System.out.printf("%1$d\t|", row);
            }

            for (int col = 1; col <= n; col++) {
                if (row == -1) {
                    System.out.printf("\t%1$d", col);
                    continue;
                } else if (row == 0) {
                    System.out.print("----");
                    continue;
                }

                System.out.printf("\t%1$d", row * col);
            }
            System.out.println();
        }
        sc.close();
    }
}
