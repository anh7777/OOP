package java.oop.hus;
import java.util.*;
import java.lang.*;

public class StringAndCharacterExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testReverseString(sc);
        testCountVowelsDigits(sc);
        testPhoneKeyPad(sc);
        testCipherCaesarCode(sc);
        testDecipherCaesarCode(sc);
        testHexString(sc);
        testBinaryToDecimal(sc);
        testHexadecimalToDecimal(sc);
        testOctalToDecimal(sc);
        testRadixNToDecimal(sc);
        sc.close();
    }

    // 1.1 ReverseString
    public static String reverseString(String inStr){
        StringBuilder reverse = new StringBuilder();
        for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
            reverse.append(inStr.charAt(charIdx));
        }
        return reverse.toString();
    }
    public static void testReverseString(Scanner sc){
        System.out.print("Enter the String: ");
        String inStr = sc.nextLine();
        String reversedString = reverseString(inStr);
        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + reversedString + "\".");
    }

    // 1.2 CountVowelsDigits
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
    public static void testCountVowelsDigits(Scanner sc){
        System.out.print("Enter the String: ");
        String str = sc.next().toLowerCase();

        int Strlen = str.length();
        int countDigits = numDigits(str);
        int countVowels = numVoels(str);

        double perDigit = (double) countDigits / Strlen * 100;
        double perVowel = (double) countVowels / Strlen * 100;

        System.out.printf("Number of vowels: %d (%.2f%%) \n", countVowels, perVowel);
        System.out.printf("Number of digits: %d (%.2f%%) \n", countDigits, perDigit);
    }

    //1.3 PhoneKeyPad
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

    public static void testPhoneKeyPad(Scanner sc) {
        System.out.print("Enter a string: ");
        String input = sc.next().toLowerCase();
        System.out.println("Using nested if:");
        System.out.println("Input: " + input);
        System.out.println("Output: " + phoneKeyPadIf(input));

        System.out.println("Using switch-case-default:");
        System.out.println("Input: " + input);
        System.out.println("Output: " + phoneKeyPad(input));
    }

    //1.4 Caesar’s Code
    public static String cipherCaesarCode(String inStr) {
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char currentChar = inStr.charAt(i);

            if (Character.isLetter(currentChar)) {
                char upperCaseChar = Character.toUpperCase(currentChar);

                char shiftedChar = (char) (upperCaseChar + 3);

                if (shiftedChar > 'Z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }

                cipherText.append(shiftedChar);
            } else {
                cipherText.append(currentChar);
            }
        }

        return cipherText.toString();
    }
    public static void testCipherCaesarCode(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter a plaintext string consisting of mix-case letters only: ");
        String inputPlainText = sc.nextLine();
        String ciphertext = cipherCaesarCode(inputPlainText);
        System.out.println("The ciphertext string is: " + ciphertext.toUpperCase());
    }

    //1.5 Decipher Caesar’s Code
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
    public static void testDecipherCaesarCode(Scanner sc) {
        System.out.print("Enter a ciphertext string: ");
        String input = sc.nextLine().toUpperCase();
        String plaintext = decipherCaesarCode(input);
        System.out.println("The plaintext string is: " + plaintext);
    }

    // 1.6 CheckHexString
    public static boolean isHexString(String hexStr){
        String hex = hexStr.toUpperCase();
        boolean result = true;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if ((c < '0' || c > '9') && (c < 'A' || c > 'F')) {
                result = false;
            }
        }
        return result;
    }
    public static void testHexString(Scanner sc){
        System.out.print("Enter a hex string: ");
        String hexStr = sc.nextLine();
        if (isHexString(hexStr)){
            System.out.printf("\"%s\" is a hex string\n", hexStr);
        } else {
            System.out.printf("\"%s\" is NOT a hex string\n", hexStr);
        }
    }

    //1.7 BinaryToDecimal
    public static int binaryToDecimal(String binStr){
        int decimal = 0;

        for (int i = 0; i < binStr.length(); i++) {
            char c = binStr.charAt(i);

            if (c != '0' && c != '1') {
                return -1;
            }

            decimal = decimal * 2 + (c - '0');
        }

        return decimal;
    }
    public static void testBinaryToDecimal(Scanner sc){
        System.out.print("Enter a Binary string: ");
        String input = sc.nextLine();
        int result = binaryToDecimal(input);

        if (result != -1) {
            System.out.println("The equivalent decimal number for binary \"" + input + "\" is: " + result);
        } else {
            System.out.println("error: Invalid binary string \"" + input + "\"");
        }
    }

    //1.8 HexadecimalToDecimal
    public static int hexadecimalToDecimal(String hexStr) {
        hexStr = hexStr.toUpperCase();
        int decimal = 0;

        // Iterate over each character in the hexadecimal string
        for (int i = 0; i < hexStr.length(); i++) {
            char hexChar = hexStr.charAt(i);
            int digitValue;

            // If the character is a valid hexadecimal digit, convert it to decimal
            if (hexChar >= '0' && hexChar <= '9') {
                digitValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                digitValue = hexChar - 'A' + 10;
            } else {
                // If the character is not a valid hexadecimal digit, return -1 (error)
                return -1;
            }

            // Update the decimal value by multiplying by 16 and adding the digit value
            decimal = decimal * 16 + digitValue;
        }
        return decimal;
    }
    public static void testHexadecimalToDecimal(Scanner sc) {
        while (true) {
            System.out.print("Enter a Hexadecimal string: ");
            String inputHex = sc.nextLine();

            int decimalValue = hexadecimalToDecimal(inputHex);

            if (decimalValue != -1) {
                System.out.println("The equivalent decimal number for hexadecimal \"" + inputHex + "\" is: " + decimalValue);
            } else {
                System.out.println("error: Invalid hexadecimal string \"" + inputHex + "\"");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueOption = sc.nextLine().toLowerCase();
            if (!continueOption.equals("yes")) {
                break;
            }
        }
    }

    //1.9 OctalToDecimal
    public static int octalToDecimal(String octalStr) {
        int decimal = 0;

        // Iterate over each character in the octal string
        for (int i = 0; i < octalStr.length(); i++) {
            char octalChar = octalStr.charAt(i);

            if (octalChar < '0' || octalChar > '7') {
                return -1;
            }

            int digitValue = octalChar - '0';

            decimal = decimal * 8 + digitValue;
        }

        return decimal;
    }

    public static void testOctalToDecimal(Scanner sc) {
        while (true) {
            // Prompt user for input octal string
            System.out.print("Enter an Octal string: ");
            String inputOctal = sc.nextLine();

            // Convert the input octal string to decimal
            int decimalValue = octalToDecimal(inputOctal);

            // Check if conversion was successful
            if (decimalValue != -1) {
                System.out.println("The equivalent decimal number for octal \"" + inputOctal + "\" is: " + decimalValue);
            } else {
                System.out.println("error: Invalid octal string \"" + inputOctal + "\"");
            }

            // Ask user if they want to continue or exit
            System.out.print("Do you want to continue? (yes/no): ");
            String continueOption = sc.nextLine().toLowerCase();
            if (!continueOption.equals("yes")) {
                break;
            }
        }
    }

    // 1.10 RadixNToDecimal
    public static int radixNToDecimal(String radixNStr) {
        return Integer.parseInt(radixNStr, 16);
    }

    public static void testRadixNToDecimal(Scanner sc) {
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the string: ");
        String inputRadixN = sc.nextLine();
        int decimalValue = radixNToDecimal(inputRadixN);
        System.out.println("The equivalent decimal number \"" + inputRadixN + "\" is: " + decimalValue);

    }

}

