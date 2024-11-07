package hus.oop;
import java.util.*;
import java.lang.*;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = new int[numStudents];
        for(int i = 0; i < grades.length; i++){
            System.out.printf("Enter the grade for student %d: ", i + 1);
            int input = sc.nextInt();
            if (input < 0 || input > 100) {
                System.out.println("The grade of each of the students is between 0 to 100.Please enter again...");
                i--;
                continue;
            }
            grades[i] = input;
        }
        System.out.printf("The average is: %.2f\n", averageArray(grades));
        System.out.println("The minimum is: " + mimArray(grades));
        System.out.println("The maximum is: " + maxArray(grades));
        sc.close();
    }

    public static double averageArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static int mimArray(int[] array){
        int mim = array[0];
        for (int i = 1; i < array.length; i++){
            if (mim > array[i]){
                mim = array[i];
            }
        }
        return mim;
    }

    public static int maxArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

}
