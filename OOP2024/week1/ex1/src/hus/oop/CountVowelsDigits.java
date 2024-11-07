package hus.oop;
import java.util.*;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.next().toLowerCase();

        int Strlen = str.length();
        int countDigits = numDigits(str);
        int countVowels = numVoels(str);

        double perDigit = (double) countDigits / Strlen * 100;
        double perVowel = (double) countVowels / Strlen * 100;

        System.out.printf("Number of vowels: %d (%.2f%%) \n", countVowels, perVowel);
        System.out.printf("Number of digits: %d (%.2f%%) \n", countDigits, perDigit);
        in.close();
    }

    public static int numVoels(String str){
        int countVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countVowels++;
            }
        }
        return countVowels;
    }

    public static int numDigits(String str){
        int countDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                countDigits++;
            }
        }
        return countDigits;
    }
}
