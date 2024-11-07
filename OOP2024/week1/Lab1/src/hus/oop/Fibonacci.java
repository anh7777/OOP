package hus.oop;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;

        System.out.print("Enter the number of Fibonacci: ");
        int nMax = sc.nextInt();
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");
        while (n <= nMax) {
            sum = fnMinus1 + fnMinus2;
            fn = sum;
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;
            System.out.print(fn + " ");
            n++;
        }
        System.out.println();
        average = (double) sum / nMax;
        System.out.println("The average is " + average);

    }
}
