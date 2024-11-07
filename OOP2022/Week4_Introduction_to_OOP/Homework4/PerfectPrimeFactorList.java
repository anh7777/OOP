import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        System.out.print("Enter the upper bound (positive integer): ");
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            System.out.println("Upper bound not valid. Please try again.");
            return;
        }
        int upperBound = in.nextInt();


        System.out.println(isProductOfPrimeFactors(30));
        System.out.println(isProductOfPrimeFactors(20));

        printPerfectPrimeFactors(upperBound);
    }

    public static boolean isPrime(int aPosInt) {
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i != 0) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int prod = 1;
        for (int i = 2; i < aPosInt; i++) {
            prod *= isPrime(i) && (aPosInt % i == 0) ? i : 1;
        }
        return (prod == aPosInt);
    }

    public static void printPerfectPrimeFactors(int upperBound) {
        System.out.println("These numbers are equal to the product of prime factors: ");

        int countProductOfPrimeFactors = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!isProductOfPrimeFactors(i)) {
                continue;
            }
            System.out.printf("%1$d ", i);
            countProductOfPrimeFactors++;
        }
        System.out.printf("\n[%1$d numbers found (%2$.2f%%)]\n"
                , countProductOfPrimeFactors, ((double) 100 * countProductOfPrimeFactors / upperBound));
    }
}
