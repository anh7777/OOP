package hus.oop;

public class ComputePI {
    public static void main(String[] args) {
        double pi;
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1 / (double) denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1 / (double) denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        pi = 4 * sum;
        System.out.println("PI = " + pi);

        Percent(pi);
    }

    /* 1... use the maximum number of terms (MAX_TERM) as the terminating condition
    public static void Terminate (int n){
        int MAX_TERM = n;
        double sum = 0.0;
        for (int term = 1; term < MAX_TERM; term++){
            if (term % 2 == 1){
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }

        double pi = 4 * sum;
        System.out.println("PI = " + pi);
    }*/

    //2. IDK maintains the value of ... Add a statement to compare the values obtained and the Math.PI, in percents of Math.PI
    public static void Percent(double piComputed){
        double result = (piComputed / Math.PI) * 100;
        System.out.println("Result of the compare (piComputed / Math.PI) = " + result);
    }
}
