package hus.oop;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
        }
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcdRecursive(a, b));
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static int gcd(int a, int b) {
        while (a >= b && b != 0) {
            int temp = b;
            b = a % temp;
            a = temp;
        }
        return a;
    }
}
