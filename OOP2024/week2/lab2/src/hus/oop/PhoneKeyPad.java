package hus.oop;
import java.util.Scanner;

public class PhoneKeyPad {

    public static String phoneKeyPadIf(String inStr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char c = Character.toLowerCase(inStr.charAt(i));
            if (c >= 'a' && c <= 'c') {
                result.append("2");
            } else if (c >= 'd' && c <= 'f') {
                result.append("3");
            } else if (c >= 'g' && c <= 'i') {
                result.append("4");
            } else if (c >= 'j' && c <= 'l') {
                result.append("5");
            } else if (c >= 'm' && c <= 'o') {
                result.append("6");
            } else if (c >= 'p' && c <= 's') {
                result.append("7");
            } else if (c >= 't' && c <= 'v') {
                result.append("8");
            } else if (c >= 'w' && c <= 'z') {
                result.append("9");
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String phoneKeyPad(String inStr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char c = Character.toLowerCase(inStr.charAt(i));
            switch (c) {
                case 'a': case 'b': case 'c':
                    result.append("2");
                    break;
                case 'd': case 'e': case 'f':
                    result.append("3");
                    break;
                case 'g': case 'h': case 'i':
                    result.append("4");
                    break;
                case 'j': case 'k': case 'l':
                    result.append("5");
                    break;
                case 'm': case 'n': case 'o':
                    result.append("6");
                    break;
                case 'p': case 'q': case 'r': case 's':
                    result.append("7");
                    break;
                case 't': case 'u': case 'v':
                    result.append("8");
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    result.append("9");
                    break;
                default:
                    result.append(c);
                    break;
            }
        }

        return result.toString();
    }

    public static void testPhoneKeyPad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next().toLowerCase();
        System.out.println("Using nested if:");
        System.out.println("Input: " + input);
        System.out.println("Output: " + phoneKeyPadIf(input));

        System.out.println("Using switch-case-default:");
        System.out.println("Input: " + input);
        System.out.println("Output: " + phoneKeyPad(input));
    }

    public static void main(String[] args) {
        testPhoneKeyPad();
    }
}
