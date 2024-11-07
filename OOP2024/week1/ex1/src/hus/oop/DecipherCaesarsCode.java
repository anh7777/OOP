package hus.oop;
import java.util.*;

public class DecipherCaesarsCode {
    public static String decipherCaesarCode(String inStr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                // Convert character to uppercase for simplicity
                c = Character.toUpperCase(c);
                // Apply Caesar's code reverse shift
                c = (char) ('A' + (c - 'A' - 3 + 26) % 26);
            }
            result.append(c);
        }

        return result.toString();
    }

    public static void testDecipherCaesarCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String input = scanner.nextLine().toUpperCase();
        String plaintext = decipherCaesarCode(input);
        System.out.println("The plaintext string is: " + plaintext);
    }

    public static void main(String[] args) {
        testDecipherCaesarCode();
    }
}
