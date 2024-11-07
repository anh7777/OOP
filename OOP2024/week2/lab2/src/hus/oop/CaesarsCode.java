package hus.oop;
import java.util.Scanner;

public class CaesarsCode {

    public static String cipherCaesarCode(String inStr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                c = (char) ('A' + (c - 'A' + 3) % 26);
            }
            result.append(c);
        }

        return result.toString();
    }

    public static void testCipherCaesarCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String input = scanner.nextLine().toUpperCase();
        String ciphertext = cipherCaesarCode(input);
        System.out.println("The ciphertext string is: " + ciphertext);
    }

    public static void main(String[] args) {
        testCipherCaesarCode();
    }
}