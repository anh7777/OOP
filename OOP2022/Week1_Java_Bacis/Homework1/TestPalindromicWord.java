import java.util.Scanner;

public class TestPalindromicWord {

    public static void isPalindrome(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (!str.equals(reverse)) {
            System.out.println(str + " is not a palindrome word");
        } else {
            System.out.println(str + " is a palindrome word");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.nextLine().toLowerCase();

        isPalindrome(str);
        sc.close();
    }
}
