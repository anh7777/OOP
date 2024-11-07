import java.util.Scanner;
import java.lang.Math;

public class SumProductMinMax3 {
    public static void main(String[] args) {

        int number1;
        int number2;
        int number3;

        int sum;
        int product;
        int min;
        int max;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        number1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        number2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        number3 = sc.nextInt();
        sc.close();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        
        System.out.println("The sum is: " + (number1 + number2 + number3));
        System.out.println("The product is: " + (number1 * number2 * number3));
        System.out.println("The max is: " + Math.max(number1, Math.max(number2, number3)));
        System.out.println("The max is: " + Math.min(number1, Math.min(number2, number3)));
    }
}
