package hus.oop;
import java.util.*;
public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Enter " + (i + 1) + "st integer: ");
            number[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += number[i];
        }

        int product = 1;
        for (int i = 0; i < 5; i++){
            product *= number[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The max is: " + Math.max(Math.max(Math.max(Math.max(number[0], number[1]), number[2]), number[3]), number[4]));
        System.out.println("The min is: " + Math.min(Math.min(Math.min(Math.min(number[0], number[1]), number[2]), number[3]), number[4]));

    }
}
