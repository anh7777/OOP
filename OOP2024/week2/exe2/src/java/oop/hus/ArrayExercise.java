package java.oop.hus;
import java.util.*;

public class ArrayExercise {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        createArray(in);
        simpleGradesStatistics(generateStudentGrades(in));
        testHexadecimalToBinary(in);
        testDecimalToHexadecimal(in);
        in.close();
    }

    //2.1 PrintArray
    public static void createArray(Scanner in){
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        for (int i = 0; i < items.length - 1; i++) {
            System.out.print((i==0) ?"The values are: [" + items[i] : items[i]);
            System.out.print(",");
        }
        System.out.println(items[items.length - 1] + "]");
    }

    // 2.2 GradesStatistics
    public static int[] generateStudentGrades(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        int[] grades = new int[numStudents];
        for (int i = 0; i < grades.length; i++){
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades[i] = in.nextInt();
        }
        return grades;
    }
    public static void simpleGradesStatistics(int[] grades){
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        double averageArray = (double) sum / grades.length;
        System.out.printf("The average is: %.2f\n", averageArray);

        int mim = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (mim > grades[i]){
                mim = grades[i];
            }
        }
        System.out.println("The minimum is: " + mim);

        int max = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (max < grades[i]){
                max = grades[i];
            }
        }
        System.out.println("The maximum is: " + max);
    }

    //2.3 HexadecimalToBinary
    public static String hexadecimalToBinary(String hexStr) {
        hexStr.toLowerCase();
        hexStr = hexStr.replaceAll("1", "0001");
        hexStr = hexStr.replaceAll("2", "0010");
        hexStr = hexStr.replaceAll("3", "0011");
        hexStr = hexStr.replaceAll("4", "0100");
        hexStr = hexStr.replaceAll("5", "0101");
        hexStr = hexStr.replaceAll("6", "0110");
        hexStr = hexStr.replaceAll("7", "0111");
        hexStr = hexStr.replaceAll("8", "1000");
        hexStr = hexStr.replaceAll("9", "1001");
        hexStr = hexStr.replaceAll("a", "1010");
        hexStr = hexStr.replaceAll("b", "1011");
        hexStr = hexStr.replaceAll("c", "1100");
        hexStr = hexStr.replaceAll("d", "1101");
        hexStr = hexStr.replaceAll("e", "1110");
        hexStr = hexStr.replaceAll("f", "1111");
        String str = "";
        int i = 0;
        while( i < hexStr.length()){
            str = str + hexStr.substring(i, i + 4) + " ";
            i += 4;
        }
        return str;
    }
    public static void testHexadecimalToBinary(Scanner in){
        in.nextLine();
        System.out.print("Enter a Hexadecimal string: ");
        String inString = in.nextLine();
        System.out.printf("The equivalent binary for hexadecimaml \"%s\" is: %s \n", inString, hexadecimalToBinary(inString));
    }

    //2.4 DecimalToHexadecimal
    public static String decimalToHexadecimal(int positiveInteger){
        StringBuilder hex = new StringBuilder();

        while (positiveInteger != 0) {
            int hexValue = positiveInteger % 16;
            char hexDigit = (0 <= hexValue && hexValue <= 9) ?
                    (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

            hex.append(hexDigit);
            positiveInteger = positiveInteger / 16;
        }
        return hex.toString();
    }
    public static void testDecimalToHexadecimal(Scanner in) {
        System.out.print("Enter a decimal number: ");
        int positiveInteger = in.nextInt();
        System.out.println("The hex number is " + decimalToHexadecimal(positiveInteger));
    }
}
