package hus.oop;
import java.util.*;

public class Tribonacci {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        int Tn;
        int TnMinus1 = 1;
        int TnMinus2 = 1;
        int TnMinus3 = 2;
        System.out.print("Enter number: ");
        int nMax = sc.nextInt();

        int sum = TnMinus1 + TnMinus2 + TnMinus3;
        double average;

        int i = 4;
        System.out.println("The first " + nMax + " Tribonacci numbers are: ");
        System.out.print(TnMinus1 + " " + TnMinus2 + " " + TnMinus3 + " ");
        while ( i <= nMax) {
            sum = TnMinus1 + TnMinus2 + TnMinus3;
            Tn = sum;
            TnMinus1 = TnMinus2;
            TnMinus2 = TnMinus3;
            TnMinus3 = sum;
            System.out.print(Tn + " ");
            i++;
        }

        System.out.println();
        average = (double) sum / nMax;
        System.out.println("The average is " + average);
    }
}
