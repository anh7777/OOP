package hus.oop;

import java.util.*;
import java.lang.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String inStr = sc.nextLine();

        String reverse = "";
        char ch;

        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            reverse = ch + reverse;
        }

        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + reverse + "\".");
        sc.close();
    }
}
