public class Fibonacci {
    public static int fibonacc(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacc(n - 1) + fibonacc(n - 2);
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(fibonacc(n));
    }
}
