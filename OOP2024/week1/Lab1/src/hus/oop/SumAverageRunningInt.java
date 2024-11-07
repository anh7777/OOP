package hus.oop;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;


        // Print sum and average from 1 to 100
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = (double) sum / UPPERBOUND;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is: " + average);

        System.out.println("");


        /*1. Modify the program to use a "while-do" loop instead of "for" loop
        sum = 0;
        int num = LOWERBOUND;
        while (num == UPPERBOUND) {
            sum += num;
            ++num;
        }
        average = (double) sum / UPPERBOUND;
        System.out.println("The sum of square is: " + sum);
        System.out.println("The average is: " + average);*/


        /*2. Modify the program to use a "do-while" loop
        do {
            sum += num;
            ++num;
        } while (num <= UPPERBOUND);
        average = (double) sum / UPPERBOUND;
        System.out.println("The sum of square is: " + sum);
        System.out.println("The average is: " + average);*/


        //4. Modify the program to sum from 111 to 8899, and compute the average
        int count = 0;
        int sumfrom111to8899 = 0;

        for (int number = 111; number <= 8899; number++) {
            sumfrom111to8899 += number;
            ++count;
        }

        double averagefrom111to8899 = (double) sumfrom111to8899 / count;
        System.out.println("The sum of " + 111 + " to " + 8892 + " is: " + sumfrom111to8899);
        System.out.println("The average is: " + averagefrom111to8899);
        System.out.println("");


        //5. Modify the program to find the "sum of the quares" of all the numbers from 1 to 100
        int sumSquare = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sumSquare += (number * number);
        }
        System.out.println("The sum of square is: " + sumSquare);
        System.out.println("");


        //6. Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int number = LOWERBOUND; number < UPPERBOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);
        System.out.println("Absolute difference: " + absDiff);
    }
}
