import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.printf("The equivalent decimal number \u0027%s\u0027 is: %s", s, Integer.parseInt(s, radix));
        sc.close();
    }
}
