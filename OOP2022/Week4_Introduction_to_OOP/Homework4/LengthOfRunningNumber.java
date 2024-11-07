public class LengthOfRunningNumber {
    public static String run(int n) {
        if (n == 1) {
            return "1";
        }
        return run(n - 1) + n;
    }

    public static int sumOfDigits(int n) {
        if (n == 1) {
            return 1;
        }
        return sumOfDigits(n - 1) + (n + "").length();
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(run(n));
        System.out.println(sumOfDigits(n));
    }
}
