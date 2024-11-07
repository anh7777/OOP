public class GCD {
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static int gcd(int a, int b) {
        while (a >= b && b != 0) {
            int temp = b;
            b = a % temp;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 15, b = 5;
        System.out.println(gcd(a, b));
        System.out.println(gcdRecursive(a, b));
    }
}
