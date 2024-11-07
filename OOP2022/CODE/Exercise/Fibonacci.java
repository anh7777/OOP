//import javax.swing.event.SwingPropertyChangeSupport;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
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

        Tribonacci(nMax);
    }

    /* 1. Tribonacci numbers are a sequence of numbers T(n) similar
    except that a number is formed by adding the three previous numbers, 
    T(n) = T(n - 1) + T(n - 2) + T(n - 3)
    */
    public static void Tribonacci (int n){
        int Tn;
        int TnMinus1 = 1;
        int TnMinus2 = 1;
        int TnMinus3 = 2;
        int nMax = n;

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