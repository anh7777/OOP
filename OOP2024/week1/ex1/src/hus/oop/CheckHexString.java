package hus.oop;

import java.util.Scanner;
import java.util.*;

public class CheckHexString {
    public static void main(String[] args) {
        testHexString();
    }
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

    public static void testHexString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexStr = sc.nextLine();

        sc.close();
        if (isHexString(hexStr)){
            System.out.printf("\"%s\" is a hex string", hexStr);
        } else {
            System.out.printf("\"%s\" is NOT a hex string", hexStr);
        }
    }
}
