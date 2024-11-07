import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String inStr = in.next();

        in.close();

        int inStrLen = inStr.length();

        String reverse = "";
        char charIdx;
        for (int i = 0; i < inStrLen; i++) {
            charIdx = inStr.charAt(i);
            reverse = charIdx + reverse;
        }

        System.out.println("The reverse of the String '" + inStr + "' is '" + reverse + "'.");
    }
}
