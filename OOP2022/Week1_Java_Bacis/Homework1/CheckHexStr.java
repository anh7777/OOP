import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hex = sc.nextLine();
        String hex2 = hex.toUpperCase();
        sc.close();
        for (int i = 0; i < hex.length(); i++) {
            char c = hex2.charAt(i);
            if ((c < '0' || c > '9') && (c < 'A' || c > 'F')) {
                System.out.println(hex + " is NOT a hex string");
                return;
            }
        }
        System.out.println(hex + " is a hex string");

    }
}
