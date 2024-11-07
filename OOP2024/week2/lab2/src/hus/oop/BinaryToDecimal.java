package hus.oop;
import java.util.*;
public class BinaryToDecimal {
    // dung thuat toan horner
    public static void main(String[] args) {
        testBinaryToDecimal();
    }

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

    public static void testBinaryToDecimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String input = scanner.nextLine();
        int result = binaryToDecimal(input);

        if (result != -1) {
            System.out.println("The equivalent decimal number for binary \"" + input + "\" is: " + result);
        } else {
            System.out.println("error: Invalid binary string \"" + input + "\"");
        }
    }
}
