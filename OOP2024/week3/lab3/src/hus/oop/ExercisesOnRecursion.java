package hus.oop;

import java.util.*;
import java.lang.*;

public class ExercisesOnRecursion {

    public static void main(String[] args) {
//        testFactorial();
//        testFibonacci();
//        testLengthOfRunNumSequence();
        testGCD();
    }

    //1.1 Factorial Recusive
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void testFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.printf("factorial(%d) = %d", n, factorial);
    }

    //1.2 Fibonacci (Recursive)
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void testFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int fibonacci = fibonacci(n);
        System.out.printf("F(%d) = %d", n, fibonacci);
    }

    //1.3 Length of a Running Number Sequence (Recursive)
    public static String running(int n) {
        if (n == 1) {
            return "1";
        }
        return running(n - 1) + n;
    }

    public static int sumOfDigits(int n) {
        if (n == 1) {
            return 1;
        }
        return sumOfDigits(n - 1) + (n + "").length();
    }

    public static void testLengthOfRunNumSequence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(running(n));
        System.out.println(sumOfDigits(n));
    }

    //1.4 GCD (Recursive)

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void testGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
