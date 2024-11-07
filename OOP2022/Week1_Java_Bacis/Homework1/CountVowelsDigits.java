import java.util.Scanner;


public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next().toLowerCase();
        int n = str.length();
        int countDigits = 0, countVowels = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countVowels++;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                countDigits++;
            }
        }
        double perDigit = (double) countDigits / n * 100;
        double perVowel = (double) countVowels / n * 100;

        System.out.printf("Number of vowels: %d \u0028%.2f%%\u0029 \n", countVowels, perVowel);
        System.out.printf("Number of digits: %d \u0028%.2f%%\u0029", countDigits, perDigit);
        sc.close();
    }
}
