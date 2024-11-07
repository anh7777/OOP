import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next().toLowerCase();
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    digit = 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    digit = 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    digit = 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    digit = 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    digit = 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    digit = 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    digit = 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    digit = 9;
                    break;
            }
            System.out.print(digit);
        }
        System.out.println();
        sc.close();
    }
}