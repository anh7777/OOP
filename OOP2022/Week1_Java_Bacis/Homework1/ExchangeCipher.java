import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plantext string: ");
        String str = sc.next().toLowerCase();

        String reverse = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("The ciphertext string is: " + reverse.toUpperCase());
        sc.close();
    }
}
