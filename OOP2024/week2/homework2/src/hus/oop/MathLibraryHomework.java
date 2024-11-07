package hus.oop;

import java.util.Scanner;

public class MathLibraryHomework {

    public static void main(String[] args) {
        testTrigonometric();
        System.out.println();
        testSpecialSeries();
        System.out.println();
        factorialInt();
        System.out.println();
        factorialLong();
        System.out.println();
        fibonacciInt();
        System.out.println();
        tribonacciInt();
        System.out.println();
        testNumberConversion();
    }

    //5.1 Trigonometric Series
    public static double sin(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i + 1));
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0D;
        for (int i = 0; i < numTerms; i++) {
            result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i));
        }
        return result;
    }

    public static double calculateTerm(double x, int numTerms) {
        double term = 1D;
        for (int i = numTerms; i > 0; i--) {
            term *= x / i;
        }
        return term;
    }

    public static void testTrigonometric() {
        Scanner sc = new Scanner(System.in);
        double[] x = {0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2};
        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();
        for (double v : x) {
            double sinValue = sin(v, numTerms);

            double cosValue = cos(v, numTerms);

            System.out.println("sin(" + v + ") = " + sinValue);
            System.out.println("cos(" + v + ") = " + cosValue);
            System.out.println("Using Math.sin(): " + Math.sin(v));
            System.out.println("Using Math.cos(): " + Math.cos(v));
            System.out.println();
        }
    }

    //5.2 Exponential Series
    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        double numerator = 1;
        double denominator = 2;

        for (int i = 1; i <= numTerms; i++) {
            result += (numerator / denominator) * Math.pow(x, i);
            numerator *= (2 * i - 1);
            denominator *= (2 * i);
        }
        return result;
    }

    public static void testSpecialSeries() {
        Scanner scanner = new Scanner(System.in);
        double x;
        while (true) {
            try {
                System.out.print("Enter the value of x: ");
                x = scanner.nextDouble();
                if (x >= -1D && x <= 1D) {
                    break;
                } else {
                    System.out.println("x value must be in the range [-1, 1]. Please try again...");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid numeric value for x...");
                scanner.next();
            }
        }

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        double sum = specialSeries(x, numTerms);
        System.out.println("Sum of the series: " + sum);
    }

    //5.3 FactorialInt (Handling Overflow)
    public static void factorialInt() {
        int n = 1;
        int fn = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d\n", n, fn);
            if (Integer.MAX_VALUE / fn < (n + 1)) {
                System.out.printf("The factorial of %d is out of range \n", (n + 1));
                break;
            }
            n++;
            fn *= n;
        }
    }

    public static void factorialLong() {
        int n = 1;
        long fn = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d\n", n, fn);
            if (Long.MAX_VALUE / fn < (n + 1)) {
                System.out.printf("The factorial of %d is out of range \n", (n + 1));
                break;
            }
            n++;
            fn *= n;
        }

    }

    //5.4 FibonacciInt (Handling Overflow)
    public static void fibonacciInt() {
        int fb1 = 1;
        int fb2 = 1;
        int fbn;
        int i = 1;

        System.out.printf("F(%1$d) = %2$d\n", 0, fb1);
        System.out.printf("F(%1$d) = %2$d\n", 1, fb2);
        while (true) {
            i++;
            fbn = fb1 + fb2;
            if (Integer.MAX_VALUE - fb1 > fb2) {
                System.out.printf("F(%1$d) = %2$d\n", i, fbn);
            } else {
                System.out.printf("F(%1$d) is out of the range of int\n", i);
                break;
            }
            fb2 = fb1;
            fb1 = fbn;
        }
    }

    public static void tribonacciInt() {
        int fb0 = 0;
        int fb1 = 1;
        int fb2 = 1;
        int fbn;

        System.out.printf("F(%1$d) = %2$d\n", 0, fb0);
        System.out.printf("F(%1$d) = %2$d\n", 1, fb1);
        System.out.printf("F(%1$d) = %2$d\n", 2, fb2);
        int i = 3;
        while (true) {
            fbn = fb0 + fb1 + fb2;
            if (Integer.MAX_VALUE - fb1 - fb2 > fb0) {
                System.out.printf("F(%1$d) = %2$d\n", i, fbn);
            } else {
                System.out.printf("F(%1$d) is out of the range of int\n", i);
                break;
            }
            fb0 = fb1;
            fb1 = fb2;
            fb2 = fbn;
            i++;
        }
    }

    //5.5 Number System Conversion
    public static int toInt(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += (int) (digit * Math.pow(inRadix, (in.length() - 1 - i)));
        }
        return result;
    }

    public static String toRadix(int number, int radix) {
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";
        StringBuilder result = new StringBuilder();
        if (radix == 0) {
            return result.toString();
        }

        while (number > 0) {
            result.insert(0, alphabet.charAt(number % radix));
            number /= radix;
        }
        return result.toString();
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }

    public static void testNumberConversion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String str = sc.nextLine();
        System.out.print("ENter the input radix: ");
        int inputRadix = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the output radix: ");
        int outputRadix = Integer.parseInt(sc.nextLine());

        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n"
                , str, inputRadix
                , toRadix(str, inputRadix, outputRadix), outputRadix);
    }
}
