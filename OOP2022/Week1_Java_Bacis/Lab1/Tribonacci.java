import java.util.Scanner;

public class Tribonacci {
/* 1. Tribonacci numbers are a sequence of numbers T(n) similar
    except that a number is formed by adding the three previous numbers, 
    T(n) = T(n - 1) + T(n - 2) + T(n - 3)
    */
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int Tn;
        int TnMinus1 = 1;
        int TnMinus2 = 1;
        int TnMinus3 = 2;
        System.out.print("Enter number: ");
        int nMax = sc.nextInt(); 
        System.out.println("");
        
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