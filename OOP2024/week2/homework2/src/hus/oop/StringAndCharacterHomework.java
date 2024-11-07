package hus.oop;

import java.util.*;
import java.lang.*;

public class StringAndCharacterHomework {
    public static void main(String[] args) {
        testExchangeCipher();
        testPalindromicWord();
        testPalindromicPhrase();
    }

    // 3.1 Exchange Cipher
    public static String exchangeCipher(String inStr) {
        String str = inStr.toLowerCase();
        StringBuilder reverse = new StringBuilder();
        char chIdx;
        int i = str.length() - 1;
        while (i >= 0) {
            chIdx = str.charAt(i);
            reverse.append(chIdx);
            i--;
        }
        return reverse.toString();
    }

    public static void testExchangeCipher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plantext string: ");
        String inStr = sc.next();

        String reverse = exchangeCipher(inStr);
        System.out.println("The ciphertext string is: " + reverse.toUpperCase());
    }

    //3.2 TestPalindromicWord and TestPalindromicPhrase
    public static boolean isPalindromicWord(String inStr) {
        String str = inStr.toLowerCase();
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString().equals(str);
    }

    public static void testPalindromicWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String inStr = sc.nextLine();
        if (!isPalindromicWord(inStr)) {
            System.out.println(inStr + " is not a palindrome word");
        } else {
            System.out.println(inStr + " is a palindrome word");
        }
    }

    public static boolean isPalindromicPhrase(String inStr) {
        /*
        inStr.toLowerCase();
        String str;
        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        StringBuilder strBuilder = new StringBuilder();
        while (fIdx <= bIdx) {
            if(Character.isLetter(inStr.charAt(fIdx))) {
                strBuilder.append(inStr.charAt(fIdx));
            }
            ++fIdx;
        }
        str = strBuilder.toString();
        */
        String str = inStr.toLowerCase().replaceAll("[^a-z]", "");
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString().equals(str);
    }

    public static void testPalindromicPhrase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String inStr = sc.nextLine();
        if (!isPalindromicPhrase(inStr)) {
            System.out.println(inStr + " is not a palindrome phrase");
        } else {
            System.out.println(inStr + " is a palindrome phrase");
        }
    }
}
